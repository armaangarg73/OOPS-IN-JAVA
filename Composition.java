class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car{
    Engine engine = new Engine() ; // composition
    void startCar() {
        engine.start() ;
        System.out.println("Car started");
    }
}


public class Composition {
    public static void main(String[] args) {
        Car car = new Car() ;
        car.startCar() ;
    }
}
