package com.revature.animals;

public class Dog {
	
	private String name;
	static String speak = "Woof!";
	static int paws = 4;
	private String favoriteToy;
	
	public Dog(String name, String favoriteToy) {
		this.name=name;
		this.favoriteToy=favoriteToy;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getSpeak() {
		return speak;
	}
	public static void setSpeak(String speak) {
		Dog.speak = speak;
	}
	public static int getPaws() {
		return paws;
	}
	public static void setPaws(int paws) {
		Dog.paws = paws;
	}
	public String getFavoriteToy() {
		return favoriteToy;
	}
	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", favoriteToy=" + favoriteToy + ", speak=" + speak + ", number of paws=" + paws + "]";
	}
	
	

}
