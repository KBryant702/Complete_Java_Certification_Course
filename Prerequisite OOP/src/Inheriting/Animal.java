package Inheriting;

public class Animal {
 String animalName;
 int age;
 int weight;
 char gender;
 
public Animal(String animalName, int age, int weight, char gender) {
	this.animalName = animalName;
	this.age = age;
	this.weight = weight;
	this.gender = gender;
}
public void speak() {
	System.out.println("Hello, I am a " + animalName);
	System.out.println("I am " + age + " years old");
	System.out.println("My weight is " + weight + "lbs" );
	System.out.println("I am a "+ gender);
}

public void eat() {
	System.out.println("I am eating...");	
}
public void walk() {
	System.out.println("I'm walking here...");
}
public void sleep() {
	System.out.println("Sleeping...");
}
 
}
