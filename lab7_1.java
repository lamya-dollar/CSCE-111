import java.util.Scanner;
/*
Name: LAmya Dollar
UIN: 930008477
Date: 9/28/2020
Assignment: Lab Work Week 7.1
*/

/*Instructions: Refer to the instructions on Canvas.
*/

class lab7_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    welcome();
    System.out.print("What is your dog's name? ");
    String doggieName = input.nextLine();
    System.out.println(dogName(doggieName));
    System.out.print("Let's convert " + doggieName + "\'s age into dog years! ");
    System.out.print("How old is " + doggieName + "? ");
    int doggieAge = input.nextInt();
    System.out.println(dogYears(doggieAge));
    exit();
  } //end main

  public static void welcome(){

    System.out.println("Hello! Welcome to the program.\n");
  }//end welcome

  public static String dogName(String name){

    return "Your dog's name is " + name + ". That is so cute!\n";
  }//end dogName

  public static String dogYears(int dogAge){

    int dogIntoHumanYears = dogAge * 7;
    return "Your dog is " + dogIntoHumanYears + " years old in human years!\n";

  }//end dogYears

  public static void exit(){

    System.out.println("Thanks for stopping by!");
  }//end exit
} //end class
