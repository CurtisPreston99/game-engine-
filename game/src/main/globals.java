package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;

public class globals {
	
	private static globals single_instance = null; 
	public PImage keyim;
	public String datapath;
	public Boolean canWalk=true;
	public int x=0;
	public PApplet canvas;
	public int y=0;
	public int px;
	public int py;
	public Keys keys = Keys.getInstance();
	public static globals getInstance(){ 
        if (single_instance == null) {
            single_instance = new globals(); 
        }
        
        return single_instance; 
    }
	
	public List<String> listfiles(String directory,String extention) {
		  List<String> textFiles = new ArrayList<String>();
		  File dir = new File(this.datapath+"/"+directory);

		  for (File file : dir.listFiles()) {
		    if (file.getName().endsWith((extention))) {
		      textFiles.add(this.datapath+"/"+directory+"/"+file.getName());
		    }
		  }
		  return textFiles;
		}
	

	public float disToPlayer(float x1, float y1) {
			
		return dis(x1,y1,px,py);
	}
	
	public float dis(float x1,float y1,float x2,float y2) {
		float d=(float)Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

//		System.out.println(d);
		return d;
	}
}
