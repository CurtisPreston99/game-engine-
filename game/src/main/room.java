package main;

import java.util.ArrayList;

import processing.core.PApplet;
import tiled.Ptmx;

public class room {
	ArrayList<entity> entitys = new ArrayList<entity>();
	Ptmx map;
	String mapname;
	PApplet c;
	
	
	room(String fname,PApplet p){
		mapname=fname;
		c=p;
	}
	
	void load() {
		map=new Ptmx(c, mapname);
		
	}
	
	void draw() {
		for(entity e: entitys) {
			e.draw();
		}	
	}
	
	
	
	void update() {
		for(entity e: entitys) {
			e.update();		
			}
	}
}
