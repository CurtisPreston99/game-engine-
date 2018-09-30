package entitys;

import main.Keys;
import processing.core.PApplet;

public class player extends entity{
	Keys buttons;
	public player(int x, int y, int width, int height, PApplet c) {
		super(x, y, width, height, c);
		buttons = Keys.getInstance();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		canvas.rect(x,y,width,height);
		
	}

	@Override
	public void update() {
		if(buttons.getKey('w')) {
			y-=10;
		}
		if(buttons.getKey('s')) {
			y+=10;
		}
		if(buttons.getKey('a')) {
			x-=10;
		}
		if(buttons.getKey('d')) {
			x+=10;
		}
	}


	@Override
	public Boolean colide(entity e) {
		
		
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawOffset(int x, int y) {
		canvas.rect(this.x+x,this.y+y,width,height);
		
	}
	

}
