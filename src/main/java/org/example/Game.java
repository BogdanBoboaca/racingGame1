package org.example;

import java.util.Scanner;

public class Game {

    public void start() {
        System.out.println("Starting game...");

        int playersNumber = getPlayersNumber();
        System.out.println("number of players from user: " + playersNumber);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user: " + vehicleName);


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
