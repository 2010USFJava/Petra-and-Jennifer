package com.revature.animals;

public class Squirrel {
	
	private String color;
	static String food = "nuts";
	static String speak = "chchchchch";
	
	public Squirrel(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static String getFood() {
		return food;
	}
	public static void setFood(String food) {
		Squirrel.food = food;
	}
	public static String getSpeak() {
		return speak;
	}
	public static void setSpeak(String speak) {
		Squirrel.speak = speak;
	}
	@Override
	public String toString() {
		return "Squirrel [color=" + color + ", food=" + food + ", speak=" + speak + "]";
	}
	
	

}
