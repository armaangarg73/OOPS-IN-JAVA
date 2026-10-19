public class demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Car car1 = new Car();
        // Car car2 = new Car();
        // Car car3 = new Car();

        // car1.brand = "Ferrari";
        // car1.color = "Red"; 
        // car1.drive();

        // car2.brand = "BMW";
        // car2.color = "Black";
        // car2.drive();

        // car3.brand = "Mercedes";
        // car3.color = "White"; 
        // car3.drive();

        Student s1 = new Student("Armaan", 20);
        Student s2 = new Student("Alice", 22);

        // s1.name = "Armaan";
        // s1.age = 20;
        // System.out.println("Student 1: " + s1.name + ", Age: " + s1.age + ", ID: " + s1.id);

        // s2.name = "Alice";
        // s2.age = 22;
        // System.out.println("Student 2: " + s2.name + ", Age: " + s2.age + ", ID: " + s2.id);

        // s1.study();
        // s2.study();

        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);
    }
}

class Student {
    String name ;
    int age ;

    // static int count ;
    // final int id = 101 ;

    Student(String name , int age) {
        this.name = name ;
        this.age = age ;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

// class Car {
//     String brand ;
//     String color ;

//     void drive() {
//         System.out.println("The " + color + " " + brand + " is driving.");
//     }
// }

// car -> car class hai
// brand and color -> properties hai
// drive() -> method 