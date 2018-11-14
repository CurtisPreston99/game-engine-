package player;

import entitys.entity;
import main.Keys;
import main.globals;
import processing.core.PApplet;
import sprite.sprite;

public class player extends entity{
	globals global;
	Keys buttons;
	int dy=0;//y speed
	int dx=0;//x speed
	int speed=32;//max speed
	int acceleration=1;//acceleration of player
	int deceleration=3;//deceleration of player
	sprite s;
	public player(int x, int y, int width, int height, PApplet c) {
		super(x, y, width, height, c);
		buttons = Keys.getInstance();
		global = globals.getInstance();
		s=new sprite("player/ford",c);
		s.load();
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawOffset(0,0);
		
//		System.out.println(String.valueOf(x)+String.valueOf(y));
	}

	@Override
	public void update() {
		if(global.canWalk) {
		updateDy();
		updateDx();
		updatePos();
		}
		

	}
	private void updateDx() {
		if(buttons.getKey('a')) {
			if(dx>-speed) {
			dx-=acceleration;
			}
		}
		if(buttons.getKey('d')) {
			if(dx<speed) {
			dx+=acceleration;
			}
		}
		
		if(!buttons.getKey('d')&&!buttons.getKey('a')) {
			if(dx>0) {
				dx-=deceleration;
			}
			if(dx<0) {
				dx+=deceleration;
			}
			if(dx<deceleration && dx>-deceleration) {
				dx=0;
			}
		}
	}
	
	
	private void updateDy() { // for moving players y axis
		if(buttons.getKey('w')||buttons.getKey('W')) {//if user is pressing w
			if(dy>-speed) {
				dy-=acceleration;
			}
		}
		if(buttons.getKey('s')||buttons.getKey('S')) {//if user is pressing s
			if(dy<speed) {
				dy+=acceleration;
			}
		}
		
		if(!buttons.getKey('w')&&!buttons.getKey('s')) {
			if(dy>0) {
				dy-=deceleration;
			}
			if(dy<0) {
				dy+=deceleration;
			}
			if(dy==1||dy==-1) {
				dy=0;
			}
		}
		
	}
	
	private void updatePos() {
		
		x=x+dx;
		y=y+dy;
		global.x=x;
		global.y=y;
		
	}

	@Override
	public Boolean colide(entity e) {
		
		
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawOffset(int x, int y) {
		canvas.fill(255);
		canvas.rect(canvas.width/2+x,canvas.height/2+y,width,height);
		s.draw(2,canvas.width/2+x,canvas.height/2+y);
		s.update();
		
	}


	@Override
	public void update(int xoff, int yoff) {
		update();		
	}
	

}
