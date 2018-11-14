package sprite;

import java.util.ArrayList;
import java.util.List;

import main.globals;
import processing.core.PApplet;
import processing.core.PImage;

public class sprite {
	globals global = globals.getInstance();
	int frameCount;
	int height;
	int width;
	PApplet canvas;
	String fname;
	ArrayList<PImage> frames=new ArrayList<PImage>();
	int curennt=0;
	
	
	public sprite(String fname,PApplet canvas){
		this.canvas=canvas;
		this.fname=fname;
		load();
		
	}
	
	public void load() {
		List<String> files=global.listfiles(fname,".png");
		System.out.println(files);
		for(String s :files) {
			PImage c=canvas.loadImage(s);
			frames.add(c);
		}
		frameCount=frames.size();
	}
	
	
	
	public void draw(int x,int y) {
		canvas.image(frames.get(curennt), x, y);
	}
	
	public void draw(float size,int x,int y) {
		PImage d=frames.get(curennt).copy();
		d.resize((int)(frames.get(curennt).width*size), (int)(frames.get(curennt).height*size));
		canvas.image(d, x, y);
		
	}
	
	public void update() {
		curennt++;
		if(curennt>frames.size()-1) {
			curennt=0;
		}
		
	}
}
