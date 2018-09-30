package main;

import processing.core.PApplet;

public class world {
	int size=10;
	String[][] fnames=new String[size][size];
	room[][] rooms=new room[size][size];
	PApplet c;
	
	world(PApplet c) {
		this.c=c;
		for(int i=0;i<fnames.length;i++) {
			for(int e=0;e<fnames[i].length;e++) {
				String fname=i+"_"+e+".tmx";
				room x=new room(fname,c);
				
				rooms[i][e]=x;
				fnames[i][e]=fname;
			}
			
		}
	}
}
