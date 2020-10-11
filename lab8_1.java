import java.util.Scanner;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 10/6/2020
Assignment: Lab Work Week 8.1
*/

/*Instructions: Refer to the instructions on Canvas.
*/

class lab8_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Hello! Welcome to the grocery store list generator!\n");
    System.out.print("How many items would you like to put in your grocery list? ");
    int num = input.nextInt();
    input.nextLine();
    String[] groceryList = new String[num];
    System.out.println("");

    for (int i=0; i<num; i++) {
      System.out.print("Please enter item " + (i+1) + " on the grocery list: ");
      groceryList[i] = input.nextLine();
      System.out.println("");
    }

    System.out.println("Here are the items in your grocery list:");
    for (int j=0; j<groceryList.length; j++){
      System.out.println(groceryList[j]);
    }

  } //end main
} //end class
