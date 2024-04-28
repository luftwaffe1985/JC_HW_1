package main.java.org.example;

import java.util.Scanner;

public class Dialog {

    Scanner scanner;

    // Console method, returns Integer

    public int enterNum() {
        System.out.print("Enter an integer: ");
        int num = 0;
        scanner = new Scanner(System.in);
        try {
            num = Integer.parseInt(scanner.nextLine());

        } catch (Exception e) {
            System.out.println("Incorrect entry!");
        }

        return num;
    }

    // Console method, returns String

    public String enterAction() {
        String strAct = "";
        System.out.print("Enter math action (+, -, *, /): ");
        scanner = new Scanner(System.in, "cp866");
        try {

            strAct = scanner.nextLine();

        } catch (Exception e) {
            System.out.println("");
        }

        return strAct;
    }

    public void closeScan() {
        scanner.close();
    }
}