import java.util.Scanner;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/23/2020
Assignment: Lab Work Week 6.2
*/

/*Instructions: Write a for loop that prints out every odd number between 1-100 in a new line,
                but it cannot print out multiples of 7.
*/

class lab6_2 {
  public static void main(String[] args) {


    for (int i = 0; i<=100; i++){
      if (i%2 != 0) {
        if (i%7 !=0){
          System.out.println(i);
        }
      }

    }




  } //end main
} //end class
