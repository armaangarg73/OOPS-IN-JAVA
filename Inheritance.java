class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

    // void eat() {
    //     System.out.println("Animal is eating");
    // }

    // Animal(String name) {
    //     System.out.println("Animal constructor called for: " + name);
    // }
}

class Dog extends Animal {
    // void sound() {
    //     super.sound(); // accessing the parent class method
    //     System.out.println("Dog barks");
    // }

    // Dog() {
    //     super("Dog"); // calling the parent class constructor  
    // }

    @Override 
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override 
    void sound() {
        System.out.println("Cat meows");
    } 
}

public class Inheritance {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Dog dog = new Dog();
        // dog.eat();
        // dog.sound();
        // animal1.sound(); // dog barks
        // animal2.sound(); // cat meows 

        // Polymorphism

        Animal[] animals = { 
            new Dog(),
            new Cat()
        };

        for(Animal animal: animals) {
            animal.sound();
        }
    }
}
