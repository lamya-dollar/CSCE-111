import java.util.Scanner;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/2/2020
Assignment: Lab Work Week 3.1
*/

/*Instructions: Finish the program that asks for a user's first and last name
                as well as their hometown. Be sure to use the Scanner to obtain
                this information.

  Using the name Robert Lightfoot who is from College Station, Texas the final
  output should be structured like this:

  Hello Lightfoot, Robert.
  College Station, Texas seems like a fun place!
*/

class lab3_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String firstName;
    String lastName;
    String hometown;

    System.out.println("What is your first name?");

    firstName = input.nextLine();

    System.out.println("What is your last name?");

    lastName = input.nextLine();

    System.out.println("What is your hometown?");

    hometown = input.nextLine();

    System.out.println("Hello " + lastName + ", " + firstName + ".");
    System.out.println(hometown + " seems like a fun place!");

  } //end main
} //end class
