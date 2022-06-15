package com.aulapratica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("CALCULATOR MENU \n" +
                "TYPE WICH OPERATION WOULD YOU LIKE TO DO: \n" +
                "1 - SUM \n" +
                "2 - SUBTRACTION \n" +
                "3 - DIVISION \n" +
                "4 - MULTIPLICATION \n");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        float value1, value2;

        switch (option) {
            case 1:
                System.out.println("TYPE THE VALUES WOULD YOU LIKE TO SUM: ");
                value1 = scanner.nextFloat();
                value2 = scanner.nextFloat();
                System.out.println(sum(value1, value2));
                break;
            case 2:
                System.out.println("TYPE THE VALUES WOULD YOU LIKE TO SUBTRACT: ");
                value1 = scanner.nextFloat();
                value2 = scanner.nextFloat();
                System.out.println(subtract(value1, value2));
                break;
            case 3:
                System.out.println("TYPE THE VALUES WOULD YOU LIKE TO DIVIDE: ");
                value1 = scanner.nextFloat();
                value2 = scanner.nextFloat();
                System.out.println(divide(value1, value2));
                break;
            case 4:
                System.out.println("TYPE THE VALUES WOULD YOU LIKE TO MULTIPLICATE: ");
                value1 = scanner.nextFloat();
                value2 = scanner.nextFloat();
                System.out.println(multiplicate(value1, value2));
                break;
            default:
                System.out.println("INVALID OPERATION.");
                break;
        }

        scanner.close();
    }

    public static float multiplicate(float value1, float value2) {
        return value1 * value2;
    }

    public static float divide(float value1, float value2) {
        return value1 / value2;
    }

    public static float subtract(float value1, float value2) {
        return value1 - value2;
    }

    public static float sum(float value1, float value2) {
        return value1 + value2;
    }
}
