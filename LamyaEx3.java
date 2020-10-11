/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/4/2020
Section: 501

source credit: https://www.youtube.com/watch?v=VxahOPzA9S8
*/
import java.util.Scanner;
import java.lang.*;
class LamyaEx3 {
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    String myName = "Lamya";
    char bell = '\u0007';


    System.out.print("What is your name? ");
    String name = input.nextLine();
    String restName = name.substring(1); //name without the first letter

    if (name.equals(myName)){
      System.out.println("\nHey " + name + "! My name is Lamya too!"); //my name is Lamya too!
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + restName);
  		System.out.println("Banana fana fo f" + restName);
  		System.out.println("Fee fi fo m" + restName);
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.contains("itch") || name.contains("ucker")) { //code for names that give bad words in the verse
      System.out.println(bell); //bell sound
      System.out.println("Sorry, " + name + ". Your name gives a rhyme that isn't family friendly! Try again with another name.");
      System.exit(0); //exit
    }

    else if (name.substring(0,2).equals("th")||name.substring(0,2).equals("Th")||name.substring(0,2).equals("St")||name.substring(0,2).equals("st")||name.substring(0,2).equals("Ph") || name.substring(0,2).equals("ph")) {
      String restNameOne = name.substring(2);
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + restNameOne); //code for name with 2 consonants
  		System.out.println("Banana fana fo f" + restNameOne);
  		System.out.println("Fee fi fo m" + restNameOne);
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("e") || name.substring(0,1).equals("E")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + name.toLowerCase()); //code for names starting with E or e
  		System.out.println("Banana fana fo f" + name.toLowerCase());
  		System.out.println("Fee fi fo m" + name.toLowerCase());
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("f") || name.substring(0,1).equals("F")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + restName); //code for names starting with F or f
  		System.out.println("Banana fana fo-" + restName);
  		System.out.println("Fee fi fo m" + restName);
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("M") || name.substring(0,1).equals("m")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + restName); //code for names starting with M or m
  		System.out.println("Banana fana fo f" + restName);
  		System.out.println("Fee fi fo mo-" + restName);
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("B") || name.substring(0,1).equals("b")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo-" + restName); //code for names starting with B or b
  		System.out.println("Banana fana fo f" + restName);
  		System.out.println("Fee fi fo m" + restName);
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("I") || name.substring(0,1).equals("i")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + name.toLowerCase()); //code for names starting with vowels: i
  		System.out.println("Banana fana fo f" + name.toLowerCase());
  		System.out.println("Fee fi fo m" + name.toLowerCase());
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("O") || name.substring(0,1).equals("o")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + name.toLowerCase()); //code for names starting with vowels: o
  		System.out.println("Banana fana fo f" + name.toLowerCase());
  		System.out.println("Fee fi fo m" + name.toLowerCase());
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("U") || name.substring(0,1).equals("u")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + name.toLowerCase()); //code for names starting with vowels: u
  		System.out.println("Banana fana fo f" + name.toLowerCase());
  		System.out.println("Fee fi fo m" + name.toLowerCase());
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,2).equals("Aa") || name.substring(0,1).equals("aa")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + restName); //code for names starting with double a (two vowels)
  		System.out.println("Banana fana fo f" + restName);
  		System.out.println("Fee fi fo m" + restName);
  		System.out.println(name.toUpperCase() + "!");
    }

    else if (name.substring(0,1).equals("A") || name.substring(0,1).equals("a")) {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + name.toLowerCase()); //code for names starting with vowels: a
  		System.out.println("Banana fana fo f" + name.toLowerCase());
  		System.out.println("Fee fi fo m" + name.toLowerCase());
  		System.out.println(name.toUpperCase() + "!");
    }

    else {
      System.out.println("\nHey " + name + "!");
      System.out.println("Let's play a game!\nI betcha I could make a rhyme...\nOut of anybody's name.");
      System.out.println("");
      System.out.println(name + ", " + name + ", bo b" + restName);
  		System.out.println("Banana fana fo f" + restName); //default code
  		System.out.println("Fee fi fo m" + restName);
  		System.out.println(name.toUpperCase() + "!");
    }

    System.out.println("\nThank you for playing, " + name + "!");


  } // end main
} //end class
