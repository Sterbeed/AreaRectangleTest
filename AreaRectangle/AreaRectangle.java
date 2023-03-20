/**
 You must complete this program so it calculates and displays the area of a rectangle formatted with 2 decimal places.   Do not use jOptionPane in this solution.

 This will involve programming and updating documentation for the following four methods.
 - getLength - This method should ask the user to enter the rectangle's length, confirm the input is a positive value and return the value as a double.
 - getWidth - This method should ask the user to enter the rectangle's width, confirm the input is a positive value and return the value as a double.
 - getArea - This method will accept the rectangle length and width as arguments, caluclate the area (length X width) and return the answer as a double.
 - displayData - This method will accept the rectangle length, width and area as arguments and display a report to the user.  Display all values with 2 decimal places.

 Programmer Name: Mohamed Mohamed
 Date Created: 3/19/2023
 Program Description:

 Specifications Met (Y/N): Y

 Pseudocode:
 1.  Call method to get length of rectangle.   Method should reprompt the user for a value until a positive number is entered.
 2.  Call method to get width of rectangle.   Method should reprompt the user for a value until a positive number is entered.
 3.  Call method to calculate the area of the rectangle (area = length X width).
 4.  Call method to display the legnth, width and area of the rectangle.    Output should be well organized and numbers formatted with 2 decimal places

 */

// Insert any necessary import statements here.
import java.util.Scanner;
import java.text.DecimalFormat;
public class AreaRectangle
{
    //Format Decimals to the second decimal place with the
    public static DecimalFormat formatter = new DecimalFormat("#0.00");
    // Do not add or modify any code in the main method.   All work must be completed by creating additional methods.
    public static void main(String[] args)
    {
        // Declare variables
        double length,    // The rectangle's length
                width,     // The rectangle's width
                area;      // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);
    }
    public static double getLength()
    {
        //Declaring Length
        double length;

        //Setting up Scanner
        Scanner keyboard = new Scanner(System.in);

        //asking user for length
        System.out.print("What is your length?: ");
        length = keyboard.nextDouble();

        //If user put a invalid input ask the question again
        while (length < 0)
        {
            System.out.print("That is not a valid length! Make sure your length is positive.");
            System.out.print("What is your length?: ");
            length = keyboard.nextDouble();
        }

        //Return result
        return length;

    }

    //Method to get width
    public static double getWidth()
    {
        //Declaring width
        double width;

        //Setting up Scanner
        Scanner keyboard = new Scanner(System.in);

        //asking user for width
        System.out.print("What is your width?: ");
        width = keyboard.nextDouble();

        //If user put a invalid input ask the question again
        while (width < 0)
        {
            System.out.print("That is not a valid width! Make sure your width is positive.");
            System.out.print("What is your width?: ");
            width = keyboard.nextDouble();
        }

        //Return result
        return width;

    }

    //Method to get area
    public static double getArea(double length, double width)
    {
        //Declaring area then multiplying Length and width to get area
        return length * width;
    }

    //Method to display results of previous Methods
    public static void displayData(double length, double width, double area)
    {

        System.out.print("Your length is: " + formatter.format(length) + "\n" +
                "Your width is " + formatter.format(width) + "\n" +
                "Your area is " + formatter.format(area));
    }

}

// Write the four methods below --- getLength, getWidth, getArea and displayData
// Be sure each method has:
//       * Comments at the top of the method (see sample for getLenth) and comments throughout the method code
//       * All parameter values should be explained with @parm and return values should be explained with @return (see Code Listing 5-12)
//       * Correct indents and proper line spacing so the code is easy to read
//       * Meaningful variable names declared at the top of method or in the method heading
//       * The two get methods should check for valid data -- i.e. a positive length and width
//       * The display method should output the data with two decimal places.
//

/*
      The getLength mMethod will prompt for the rectangle length and return a positive value.
      If an invalid entry is supplied, display an error message and prompt for the value again.
      @return length of rectangle
*/
