package main;

import processing.core.PApplet;

public class world {
	int size=3;
	globals global;
	String[][] fnames=new String[size][size];
	room[][] rooms=new room[size][size];
	PApplet c;
	
	world(PApplet c) {
		global = globals.getInstance();
		this.c=c;
		for(int i=0;i<fnames.length;i++) {
			for(int e=0;e<fnames[i].length;e++) {
				String fname="world/"+i+"_"+e+".tmx";
				room x=new room(fname,i,e,c);
				x.load();
				
				rooms[i][e]=x;
				fnames[i][e]=fname;
			}
			
		}
	}
	
	public void draw() {
		for(int i=0;i<rooms.length;i++) {
			for(int e=0;e<rooms[i].length;e++) {
				
				int x=i*3200;
				int y=e*3200;
				
				rooms[i][e].draw(x+global.x,y+global.y);
				
			}
		}
	
	}


public void update() {
	for(int i=0;i<rooms.length;i++) {
		for(int e=0;e<rooms[i].length;e++) {

			int x=i*3200;
			int y=e*3200;
			
			rooms[i][e].update(x+global.x,y+global.y);
		}
	}

}
}
