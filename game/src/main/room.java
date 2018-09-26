package main;

import java.util.ArrayList;

public class room {
	ArrayList<entity> entitys = new ArrayList<entity>();
//	background
	
	
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
