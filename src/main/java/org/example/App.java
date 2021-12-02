package org.example;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );

        Car carReference = new Car();
        carReference.name = "BMW";
        carReference.color = "Red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount= 2;

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        carReference.engine = carEngine;

        System.out.println("Engine Details... ");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        Car car2 = new Car();
        car2.name = "Audi";
        car2.mileage = 14;

        System.out.println("First car name: " + carReference.name);
        System.out.println("Color - " + carReference.color);
        System.out.println("Mileage - " + carReference.mileage);
        System.out.println("Fuel Level - " + carReference.fuelLevel);
        System.out.println("Max Speed - " + carReference.maxSpeed);
        System.out.println("Is the car running? - " + carReference.running);
        System.out.println("Number of doors - " + carReference.doorCount);



        System.out.println("Second car name: " + car2.name);
        System.out.println("Mileage - " + car2.mileage);
    }
}
