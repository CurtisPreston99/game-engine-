package items;

import processing.core.PImage;

public abstract class item {
	
	int weight=0;
	int id;
	String Description="";
	String Name="";
	PImage Icon;
	
	
	
	public PImage getIcon() {
		return Icon;
	}


	public void setIcon(PImage icon) {
		Icon = icon;
	}


	abstract String onClick();
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	

}
