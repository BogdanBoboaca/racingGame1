package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        initializeCompetitors();

        for (Vehicle vehicle : competitors) {
            System.out.println("It's " + vehicle.getName() + "'s turn.");

        }
    }

    private void initializeCompetitors() {

        int playersNumber = getPlayersNumber();
        System.out.println("Number of players from user: " + playersNumber);

        for (int i = 1; i <= playersNumber; i++){
            System.out.println("Adding player " + i);

            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6, 15));
            vehicle.setMaxSpeed(ThreadLocalRandom.current().nextDouble(170, 300));

            System.out.println("Vehicle for Player " + i + ": " + vehicle.getName() + " - Mileage: "
                    + vehicle.getMileage());

            competitors.add(vehicle);

        }
    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLength(4.2);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Transylvania");
        track2.setLength(250.5);

        tracks[1] = track2;
    }

    private void displayTracks() {
        System.out.println("Available Tracks: ");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i+1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength() + "km");
            }
        }
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter Vehicle Name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getPlayersNumber() {
        System.out.println("please enter the Number of Players");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
