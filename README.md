# PerimeterOfRectangle

Explanation Line by Line:
Import Scanner Class:

java

    import java.util.Scanner;
This line imports the Scanner class from the java.util package, which is used to read input from the user.

Class Declaration:

java

    public class RectanglePerimeter {
This line declares a public class named RectanglePerimeter.

Main Method Declaration:

java

    public static void main(String[] args) {
This line starts the declaration of the main method, which is the entry point of the program.

Create Scanner Object:

java

    Scanner in = new Scanner(System.in);
This line creates a Scanner object named in to read input from the standard input (usually the keyboard).

Prompt User for Length:

java

    System.out.println("Enter the length of the rectangle:");
double length = in.nextDouble(); // Reads the input in double
These lines prompt the user to enter the length of the rectangle and read the input as a double.

Prompt User for Width:

java

      System.out.println("Enter the width of the rectangle:");
double width = in.nextDouble(); // Reads the input in double
These lines prompt the user to enter the width of the rectangle and read the input as a double.

Calculate Perimeter:

java

    double perimeter = calculatePerimeter(length, width);
This line calls the calculatePerimeter method with length and width as arguments and stores the returned value in a variable named perimeter.

Print the Result:

java

    System.out.println("The perimeter of the rectangle is: " + perimeter + " units");
This line prints the calculated perimeter to the console.

Close Scanner Object:

java

    in.close();
This line closes the Scanner object to free up resources.

End of Main Method:

java

}
This line marks the end of the main method.

Calculate Perimeter Method:

java

    private static double calculatePerimeter(double length, double width) {
This line declares a private static method named calculatePerimeter that takes two double parameters: length and width.

Perimeter Calculation:

java

    double perimeter = 2 * (length + width);
This line calculates the perimeter of the rectangle using the formula 

    2(l+w), where l is length and w is width.

Return the Perimeter:

java

return perimeter;
This line returns the calculated perimeter.
