package org.example;

public class Vehicle {

    static int totalCount;

    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;



    public Vehicle() {
        totalCount++;
    }

    public double accelerate (double speed){
        return accelerate(speed, 1);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
