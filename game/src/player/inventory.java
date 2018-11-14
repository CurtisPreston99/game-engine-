package player;

import java.util.ArrayList;

import items.item;

public class inventory {
	int size=20;
	int totalWeight=0;
	
	
	


	ArrayList<item> items=new ArrayList<>();
	
	public Boolean add(item x) {
		if(items.size()<size) {
			items.add(x);
			totalWeight+=x.getWeight();
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public ArrayList<item> getItems() {
		return items;
	}


	public void setItems(ArrayList<item> items) {
		this.items = items;
	}


	public inventory(int size) {
		this.size=size;
	}
	
	
	
	
	
	

}
