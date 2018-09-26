package tiled;

import java.util.ArrayList;
import java.util.HashMap;

public class map {
	ArrayList<layer> layers=new ArrayList<layer>();
	map(){
	}
	
	void addlayer(layer l) {
		layers.add(l);
	}
	
	layer getlayer(int i) {
		if(i<layers.size()) {
			return layers.get(i);
		}
		return null;
		
	}
	
	layer getlayer(String i) {
		for(layer e: layers) {
			if(e.isName(i)) {
				return e;
			}
		}
		return null;
	}

}
