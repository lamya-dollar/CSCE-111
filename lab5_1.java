import java.util.Scanner;
import java.util.Random;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/16/20
Assignment: Lab Work Week 5.1
*/

/*Instructions:
                Step 1: Obtain any word from the user.
                Step 2: Generate a random number (of type integer) between 0 and 1 less than the length
                        of that word. For example, if the word is "bananas", generate a random number
                        between 0 - 6. If the word is "iphone", generate a random number between 0 - 5.
                Step 3: Print out the random value generated in a print line. The output should
                        look like this (without the quotes and the random value replacing the XX):
                        "The random value is: XX"
                Step 4: Use the random value to check the character of the word the user entered.
                        If the character at that value is a vowel, print out that word from that
                        specific character to the end of the word in all lowercase. If the character
                        is NOT a vowel, print out the size of the word using just a print statement.
                        The output is shown below:
                        "The length of the word is: X"
                    **Hint 1: A user can enter upper and lower case letters. Account for that.**
  Please read the instruction documents for example outputs and where to look in zybooks for
  random number generators!
*/

class lab5_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();
    rnd.setSeed(1000);

    System.out.print("Please enter any word: ");
    String word = input.nextLine();
    int x = word.length();
    int randomNum = rnd.nextInt(x);
    char letterOne = word.charAt(randomNum);
    String letter = String.valueOf(letterOne);

    System.out.println("The random value is: " + randomNum);

    if (letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E") || letter.equals("i") || letter.equals("I") || letter.equals("o") || letter.equals("O") || letter.equals("u") || letter.equals("U")) {
      String restWord = word.substring(randomNum);
      System.out.println(restWord.toLowerCase());
    }

    else {
    System.out.print("The length of the word is: " + x);

    }
    //DO NOT CHANGE ANY OF THE LINES ABOVE THIS ONE.
    //SOLUTION GOES BELOW
    //Develop the random number generator as shown in zybooks

  } //end main
} //end class
