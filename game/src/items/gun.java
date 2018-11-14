package items;

import main.globals;
import processing.core.PImage;

public class gun extends item{
	
	globals global=globals.getInstance();
	int id = 0;
	PImage Icon;
	int weight=20;

	@Override
	String onClick() {
		return "equip";
	}
	
}
