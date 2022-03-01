
public class Objeto {
	public static void main(String[] args) {
		Dog    dog1 = new Dog();
		Animal dog2 = new Dog();
		
		System.out.println(dog1 instanceof Dog);
		System.out.println(dog2 instanceof Animal);
		System.out.println(dog2 instanceof Dog);
		System.out.println(dog2 instanceof Cat);
	}
}

class Animal {};
class Dog extends Animal {};
class Cat extends Animal {};
