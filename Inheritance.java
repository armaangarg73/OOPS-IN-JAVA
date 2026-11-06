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

public class Inheritance {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Animal animal = new Dog();
        System.out.println("Animal object created: " + animal);
        animal.sound();

        // Dog dog = new Dog();
        // dog.eat();
        // dog.sound();
    }
}
