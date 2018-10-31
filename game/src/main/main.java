package main;


import entitys.player;
import entitys.talknpc;
import processing.core.PApplet;
import sprite.sprite;

public class main extends PApplet{
	player p;
	float x,y;
	Keys keys;
	world world;
	int f=0;
	globals global;
	public static void main(String[] args) {
		PApplet.main("main.main");
	}
	
    public void settings(){
    	
    	world=new world(this);
    	keys=Keys.getInstance();
    	global=globals.getInstance();
    	global.datapath=dataPath("");
    	global.canvas=this;
    	size(700,700);
    	world.rooms[1][1].entitys.add(new talknpc(1000,1000,100,100,this));
    	p = new player(width/2,height/2,10,10,this);
    	global.px=width/2;
    	global.py=height/2;
    	global.keyim=loadImage("keyback.png");

    }

    public void setup(){
    	
    }

    public void draw(){
    	
    	surface.setTitle("gamename");

    	background(200);

    	world.draw();
    	p.draw();
    	p.update();
    	world.update();
    }
    
    public void keyPressed() {
    	keys.setKey(key, true);
    }
    
    public void keyReleased() {
    	keys.setKey(key, false);
    	}
    

}
