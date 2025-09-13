class Animal {
public void makeSound() {
    System.out.println("Some sound....");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {

        System.out.println("Woof");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}