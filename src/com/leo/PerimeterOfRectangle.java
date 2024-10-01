package com.leo;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = in.nextDouble(); // reads the input as double

        // prompt the user to input the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = in.nextDouble(); // prompt the user to enter the width of the rectangle

        // call the calculatePerimeter method to compute the perimeter
        double perimeter = calculatePerimeter(length, width);
        //print the calculated perimeter
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    private static double calculatePerimeter (double length, double width) {
        // formula for perimeter = 2(length + width)
        double perimeter = 2 * (length + width);

        return perimeter;
    }
}
