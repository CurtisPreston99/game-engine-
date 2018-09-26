package main;

import processing.core.PApplet;

public abstract class entity {
	PApplet frame;
	
	entity(PApplet p){
	frame=p;
	}
	
	abstract void draw();
	
	abstract void update();
}
