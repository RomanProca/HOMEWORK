package Classwork;

abstract class Car {
    String name;

    abstract void drive();

    void lock() {
        System.out.println("Car.lock");
    }

    void unlock() {
        System.out.println("Car.unlock");
    }
}
