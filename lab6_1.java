import java.util.Scanner;
/*
Name:
UIN:
Date:
Assignment: Lab Work Week 6.1
*/

/*Instructions: Obtain a starting number from the user and an incrementer. The incrementor must
                be between 0 or 9. If it is not, make the incrementor 3 and inform
                the user of the change. Use the following print statement for that change:
                "Invalid incrementor, we have made the incrementor 3."
                Write a while loop that subtracts the incrementer value from the user's number.
                The while loop should stop when the number becomes negative. Use
                a print line to print out the starting number, and the new number
                in each iteration. Determine how many times the loop ran using the counter
                variable and display the final count in the following format.
                "The loop ran a total of XX times."
*/

class lab6_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int inc;
    int counter = 0;

    System.out.print("Please enter any integer greater than 0: ");
    num = input.nextInt();

    System.out.print("Please enter an integer from 1-9: ");
    inc = input.nextInt();

    if (inc >= 0 && inc <= 9) {
      while (num >= 0) {
        System.out.println(num);
        num = num - inc;
        counter++;
      }
    }

   else {
     System.out.println("Invalid incrementor, we have made the incrementor 3.");
     while (num >= 0) {
       System.out.println(num);
       num = num - 3;
       counter++;
     }
   }

    System.out.println("The loop ran a total of " + counter + " times.");



  } //end main
} //end class
