package org.example;

public class Vehicle {

    static int totalCount;

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;


    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier = 1;

        System.out.println(name + " is accelerating with " + speed + " for " + durationInHours + "h.");

        if (speed > maxSpeed){
            System.out.println("Sorry, maximum speed exceeded.");
            return 0;
        }

        if (fuelLevel <= 0) {
            System.out.println("You don't have enough fuel");
            return 0;
        }

        if (speed > 120) {
            System.out.println("Going fast, you're using more fuel.");
            mileageMultiplier = speed / 100;
        }

        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
        System.out.println("Total traveled distance " + traveledDistance);

        double usedFuelWithStandardMileage = distance * mileage / 100;
        System.out.println("Used fuel with standard mileage: " + usedFuelWithStandardMileage);

        double usedFuelWithCurrentMileage = usedFuelWithStandardMileage * mileageMultiplier;
        System.out.println("Used fuel with current mileage: " + usedFuelWithCurrentMileage);

        fuelLevel = fuelLevel - usedFuelWithCurrentMileage;

        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;
    }

}
