package org.example;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Bavaria Motors";
        carEngine.capacity = 1.9;

        Car carReference = new Car(carEngine);
        carReference.name = "BMW";
        carReference.color = "Red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount= 2;


        System.out.println("Engine Details... ");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelerationDistance = carReference.accelerate(60, 1);

        System.out.println("Acceleration distance: " + accelerationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total traveled distance after repair " + carReference.traveledDistance);


        System.out.println("First car name: " + carReference.name);
        System.out.println("Color - " + carReference.color);
        System.out.println("Mileage - " + carReference.mileage);
        System.out.println("Fuel Level - " + carReference.fuelLevel);
        System.out.println("Max Speed - " + carReference.maxSpeed);
        System.out.println("Is the car running? - " + carReference.running);
        System.out.println("Number of doors - " + carReference.doorCount);

    }
}
