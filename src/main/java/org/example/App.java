package org.example;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );

        Game game = new Game();
        game.start();


        Engine carEngine = new Engine();
        carEngine.manufacturer = "Bavaria Motors";
        carEngine.capacity = 1.9;

        Car carReference = new Car(carEngine);
        carReference.setName("BMW");
        carReference.setColor("Red");
        carReference.setMileage(9.8);
        carReference.setFuelLevel(60);
        carReference.setMaxSpeed(200);
        carReference.setRunning(false);

        carReference.doorCount= 2;


        System.out.println("Engine Details... ");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelerationDistance = carReference.accelerate(150, 1);
        double accelerationDistance1 = carReference.accelerate(60);

        System.out.println("Acceleration distance: " + accelerationDistance);
        System.out.println("Acceleration distance1: " + accelerationDistance1);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total traveled distance after repair " + carReference.getTraveledDistance());


        System.out.println("First car name: " + carReference.getName());
        System.out.println("Color - " + carReference.getColor());
        System.out.println("Mileage - " + carReference.getMileage());
        System.out.println("Fuel Level - " + carReference.getFuelLevel());
        System.out.println("Max Speed - " + carReference.getMaxSpeed());
        System.out.println("Is the car running? - " + carReference.isRunning());
        System.out.println("Number of doors - " + carReference.doorCount);

    }
}
