package com.zookeeper;

import com.zookeeper1.Mammal;

public class Bat extends Mammal{
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("Flushhh flushhh *bat flying noise*");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("ÑAN ÑAN, TASTE LIKE CHIKEN");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("AAAAAAAAAAAAHHHHHHHHHHHH, The bats attack us!!");
		energyLevel -= 100;
	}
}
