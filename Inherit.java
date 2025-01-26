class Animal{
	Animal(){
	  System.out.println("Animal Constructor");
}
}

class Mammal extends Animal{
	Mammal(){
	  System.out.println("Mammal constructor");
}
}

class Dog extends Mammal{
	Dog(){
	  System.lout.prinln("Dog construstor");
}
}
public class Main{
	public static void main(Strind[] args){
	  Dog myDog = new Dog();
		myDog.Animal();
		myDog.Mammal();
		myDog.Dog();
}
}
