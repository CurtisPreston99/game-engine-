package entitys;

import processing.core.PApplet;

public abstract class entity {
	PApplet canvas;
	int x,y;
	int width,height;
	
	entity(int x,int y,int width,int height,PApplet c){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.canvas=c;
	}
	
	void setPos(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	abstract public void draw();
	
	abstract public void drawOffset(int x,int y);
	
	abstract public void update();
	
	
	public Boolean mouseOver() {
		return on(canvas.mouseX,canvas.mouseY);
		
	}
	
	
	public Boolean on(int x, int y) {
		if(x>this.x && x<this.x+this.width && y>this.y &&y<this.y+this.width) {
			return true;
			
		}
		return false;
		
	}
	
	abstract public Boolean colide(entity e);
	
	
	
}
