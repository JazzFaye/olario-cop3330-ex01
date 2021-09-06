/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static void main(String[] args) {
        // main method begins execution of Java application
        Scanner Name = new Scanner(System.in);  //Scanner to obtain input
        System.out.println("What is your name? ");
        String name = Name.nextLine(); //Reads the name from the user

        System.out.printf("Hello,%s, nice to meet you!", name); //display the name store in object name
    }
}
