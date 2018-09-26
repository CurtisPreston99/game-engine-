package tiled;

import java.util.ArrayList;
import java.util.List;

public class layer {
	String name="";
	List<List<Integer>> listOfLists = new ArrayList<List<Integer>>(); 
	
	
	void setName(String i){
		name=i;
	}
	
	String getname() {
		return name;
	}
	Boolean isName(String i) {
		return i.equals(name);
	}
}
