package com.revature.driver;

import com.revature.animals.*;

public class Driver {
	
	public static void main(String[] args) {
		
		Dog Opie = new Dog("Opie", "Dragon");
		Squirrel Nutty = new Squirrel("brown");
		
		System.out.println(Opie);
		System.out.println(Nutty);
		//petra's branch change
		System.out.println("When Opie sees a squirrel eating, " + Squirrel.getFood() +
				" he says " + Dog.getSpeak());
		
		
	}

}
