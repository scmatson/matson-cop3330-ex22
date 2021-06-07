package base;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Scott Matson
 */
/*
Exercise 22 - Comparing Numbers

Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
-Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
-Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
-Modify the program so that it asks for ten numbers instead of three.
-Modify the program so that it asks for an unlimited number of numbers.
 */
public class App {
    static Scanner ui = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the first number: ");
        double a = isNum();
        System.out.print("Enter the second number: ");
        double b = isNum();

        if(a==b)
        {
            while(a==b)
            {
                System.out.print("Enter a different second number: ");
                b = isNum();
            }
        }

        System.out.print("Enter the third number: ");
        double c = isNum();
        if(a==c || b==c)
        {
            while(a==c || (a==c && b==c) || b==c)
            {
                System.out.print("Enter a different third number: ");
                c = isNum();
            }
        }

        double max;

        if(a > b)
        {
            if(a > c)
            {
                max = a;
                System.out.println("The largest number is " + max + ".");
            }
            else if(c > a)
            {
                max = c;
                System.out.println("The largest number is " + max + ".");
            }
        }

        if(b > a)
        {
            if(b > c)
            {
                max = b;
                System.out.println("The largest number is " + max + ".");
            }
            else if(c > b)
            {
                max = c;
                System.out.println("The largest number is " + max + ".");
            }
        }



    }

    public static double isNum()
    {
        while (true)
        {
            try
            {
                return ui.nextDouble();
            }
            catch (InputMismatchException e)
            {
                ui.next();
                System.out.print("Sorry, please enter a number: ");
            }
        }
    }
}