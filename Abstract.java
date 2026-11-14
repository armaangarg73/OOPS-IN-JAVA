abstract class Employee {
    String name ;

    Employee(String name){
        this.name = name ;
    }

    abstract void work() ;
}

class Developer extends Employee {
    public Developer(String name){
        super(name) ;
    }

    @Override 
    void work(){
        System.out.println(name + " is writing code") ;
    }
}               


public class Abstract {
    public static void main(String[] args){
        // Developer dev = new Developer("Armaan") ;
        Employee dev = new Developer("Armaan") ; // both works
        dev.work() ;
    }
}
