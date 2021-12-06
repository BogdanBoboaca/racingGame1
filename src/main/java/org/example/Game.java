package org.example;

import java.util.Scanner;

public class Game {

    private Track[] tracks = new Track[3];



    public void start() {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        int playersNumber = getPlayersNumber();
        System.out.println("Number of players from user: " + playersNumber);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user: " + vehicleName);


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
