package main;

import processing.core.PApplet;
import tiled.Ptmx;

public class main extends PApplet{
	Ptmx m;
	public static void main(String[] args) {
		PApplet.main("main.main");
		

	}
	
    public void settings(){
    	m=new Ptmx(this,".data/desert.tmx");
    	size(200,200);
    }

    public void setup(){
    	
    }

    public void draw(){

    }

}
