package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import items.gun;
import player.inventory;

public class inventoryTesting {

	@Test
	public void sizeTest() {
		inventory inv = new inventory(20);
		
		assert(20==inv.getSize());
	}
	
	
	@Test
	public void addingItem() {
		inventory inv = new inventory(20);
		inv.add(new gun());
		assert(1==inv.getItems().size());
	}
	
	
	@Test
	public void addingItemWeight() {
		inventory inv = new inventory(20);
		inv.add(new gun());
		assert(new gun().getWeight()==inv.getTotalWeight());
	}
	
	@Test
	public void addingItems() {
		inventory inv = new inventory(20);
		for(int i=0;i<10000000;i++) {
			inv.add(new gun());
		}
		assert(20==inv.getItems().size());
	}
	
	@Test
	public void addingWeights() {
		inventory inv = new inventory(20);
		for(int i=0;i<10000000;i++) {
			inv.add(new gun());
		}
		assert(new gun().getWeight()*20==inv.getTotalWeight());
	}
	
	
}
