package entitys;

import processing.core.PApplet;

public class dialogsystem {
	String[] speach;
	String[] options;
	PApplet canvas;
	Boolean done=false;
	int upto=0;
	dialogsystem(String[] speach,String[] options, PApplet canvas){
		this.speach=speach;
		this.options=options;
		this.canvas=canvas;
	}
	
	dialogsystem(String[] speach,PApplet canvas){
		this.speach=speach;
		this.options=new String[0];
		this.canvas=canvas;
		
	}
	
	void draw() {
		System.out.println(upto);

		canvas.fill(255,255,255);
		canvas.rect(0,canvas.height-100,canvas.width,canvas.height);
		if(upto<speach.length) {
			
			canvas.fill(0);
			canvas.text(speach[upto],0,canvas.height-90);
		}
	}
	
	Boolean isFinished() {
		return done;
	}
	
	void reset() {
		upto=0;	
	}
	
	void next() {
		upto++;
		if(upto>speach.length-1) {
			done=true;
		}
	}
	
}
