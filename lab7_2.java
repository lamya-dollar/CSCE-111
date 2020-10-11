import java.util.Scanner;
/*
Name:
UIN:
Date:
Assignment: Lab Work Week 7.2
*/

/*Instructions: Take in two lines of input. The first line can take in "difference", "sum", or "product"
                and save it into type. The second line of input can take in any two digit string ("12","47", etc.),
                and save it into digits.
                Assume, that the user will always put in "difference", "sum", or "product" in the first line of
                input, and that the user will always put in a two digit value in the second input.

                Use methods to do the math of the requested type.
                - "sum" should take the sum of the two digits in the string
                - "product" should take the product of the two digits in the string
                - "difference" should take the difference between the product and sum
                  of the digits (product - sum)
*/

class lab7_2 {

  public static int sum (int digit1, int digit2){

    int sum = digit1 + digit2;
    return sum;
  }// create method that calculates the sum of two digits in a string here


  public static int product (int digit1, int digit2){

    int product = digit1 * digit2;
    return product;
  }// create method that calculates the product of two digits in a string here


  public static int difference (int digit1, int digit2){

    int difference = (digit1 * digit2) - (digit1 + digit2);
    return difference;
  }// (can) create method that calculates the difference between the product and sum of two digits in a string here

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What type of math would you like to do?");
    String type = sc.nextLine(); // difference, sum, product

    System.out.println("What digits would you like to do the math on?");
    String digits = sc.nextLine();

    int digitOne = Integer.parseInt(digits.substring(0,1));
    int digitTwo = Integer.parseInt(digits.substring(1));

    switch (type){
      case "sum": System.out.println("The sum of the 2 digits is: " + sum(digitOne, digitTwo)); break;
      case "Sum": System.out.println("The sum of the 2 digits is: " + sum(digitOne, digitTwo)); break;
      case "Product": System.out.println("The product of the 2 digits is: " + product(digitOne, digitTwo)); break;
      case "product": System.out.println("The product of the 2 digits is: " + product(digitOne, digitTwo)); break;
      case "difference": System.out.println("The difference between the product and sum is: " + difference(digitOne, digitTwo)); break;
      case "Difference": System.out.println("The difference between the product and sum is: " + difference(digitOne, digitTwo)); break;
    }



    // Check the type inputted and do the corresponding math with String digits here.

  } //end main
} //end class
