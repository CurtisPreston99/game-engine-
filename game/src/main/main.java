package main;


import entitys.player;
import processing.core.PApplet;
import tiled.Ptmx;

public class main extends PApplet{
	player p = new player(10,10,10,10,this);
	float x,y;
	Keys keys;
	world world=new world(this);
	int f=0;
	globals global = new globals();
	public static void main(String[] args) {
		PApplet.main("main.main");
	}
	
    public void settings(){
    	keys=Keys.getInstance();
    	global.datapath=dataPath("");
//    	m=new Ptmx(this,"map.tmx");
//    	fullScreen();
    	size(700,700);
    }

    public void setup(){
    	
    }

    public void draw(){
    	background(200);
    	p.draw();
    	p.update();
//    	m.draw(x,y);
    	

    }
    
    public void keyPressed() {
    	keys.setKey(key, true);
    }
    
    public void keyReleased() {
    	keys.setKey(key, false);
    	}
    

}
