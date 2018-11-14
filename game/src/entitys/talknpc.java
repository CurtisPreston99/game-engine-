package entitys;

import main.globals;
import processing.core.PApplet;

public class talknpc extends entity {
	globals global;
	Boolean overhead=false;
	Boolean talking=false;
	char key='e';
	String[] dialog= {"so agdg are pretty neat","what are you doing in these parts anyway?"};
	dialogsystem talk;
	public talknpc(int x, int y, int width, int height, PApplet c) {
		super(x, y, width, height, c);
		talk=new dialogsystem(dialog,c);
		global=globals.getInstance();
	}

	@Override
	public void draw() {
		drawOffset(0,0);
	}

	@Override
	public void drawOffset(int x, int y) {
		canvas.fill(255);
		canvas.rect(this.x-x,this.y-y,width,height);
		if(overhead) {
			
			canvas.rect(this.x-x+(width/2)-10,this.y-y-height/2,20,20);
			canvas.fill(0);
			canvas.text(key, this.x-x+(width/2), this.y-y-height/2+10);
		}
		if(talking) {
			talk.draw();
			
		}

	}

	@Override
	public void update(int xoff, int yoff) {
		if(global.disToPlayer(this.x-xoff+width/2,this.y-yoff+height/2)<200) {
			overhead=true;
			}else {
				overhead=false;
				
			}
		if(global.keys.getKey(key) && overhead) {
			talk=new dialogsystem(dialog,canvas);
			global.canWalk=false;
			talking=true;
			talk.reset();
			}
		if(global.keys.getKey('t') && talking) {
			global.canWalk=false;
			global.keys.setKey('t', false);
			talk.next();
			if(talk.isFinished()) {
				global.canWalk=true;
				talking=false;
			}
			}
	}

	@Override
	public Boolean colide(entity e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
