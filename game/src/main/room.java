package main;

import java.util.ArrayList;

import entitys.entity;
import processing.core.PApplet;
import tiled.Ptmx;

public class room {
	ArrayList<entity> entitys = new ArrayList<entity>();
	public Ptmx map;
	String mapname;
	PApplet c;
	int x;
	int y;
	int xOffset;
	int yOffset;
	
	
	room(String fname,int x,int y,PApplet p){
		mapname=fname;
		c=p;
		this.x=x;
		this.y=y;
		this.xOffset=x*3200;
		this.yOffset=y*3200;
	}
	
	void load() {
		map=new Ptmx(c, mapname);
	}
	
	
	void draw(int x, int y) {
		
		map.draw(x,y);
		
		for(entity e: entitys) {
			e.drawOffset(x,y);
		}	
	}
	
	
	
	void update(int x, int y) {
		for(entity e: entitys) {
			e.update(x,y);		
			}
	}
}
