package main;

import java.util.BitSet;

import processing.core.PApplet;
import tiled.Ptmx;

public class main extends PApplet{
	float x,y;
	Keys keys=new Keys();
	Ptmx m;
	world world=new world();
	int f=0;
	globals global = new globals();
	public static void main(String[] args) {
		PApplet.main("main.main");
	}
	
    public void settings(){

    	global.datapath=dataPath("");
    	m=new Ptmx(this,"map.tmx");
//    	fullScreen();
    	size(700,700);
    }

    public void setup(){
    	
    }

    public void draw(){
    	
    	m.draw(x,y);

    	if(keys.getKey('w')) {
    		y=y+1;
    	}
    	if(keys.getKey('s')) {
    		y=y-1;
    	}
    	if(keys.getKey('a')) {
    		x=x+1;
    	}
    	if(keys.getKey('d')) {
    		x=x-1;
    	}
    }
    
    public void keyPressed() {
    	keys.setKey(key, true);
    }
    public void keyReleased() {
    	keys.setKey(key, false);
    	}
    

}
