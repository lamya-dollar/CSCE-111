// Imports are not allowed in this exercise.

//READ ALL COMMENTS BEFORE BEGINNING

/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	You can run this file by compiling TestMethods1.java
	It will call this program and run it, validating the test you choose.

	Example inputs with output are provided in the comments before each method.
	At a minimum, your solutions must pass these tests. My version of TestMethods1
	contains more than the examples given or those cases in your version of
	TestMethods1.  Therefore, hardcoding the answers will not pass.

	By Robert Lightfoot and Ariana Morris
	in the style of Bruce Gooch.

	@author Lamya Dollar
	930008477
	@version 9/29/2020
**/

//imports are not allowed in this exercise.

public class ExerciseMethods1{

	/**
		Boolean function returns true if the given string ends with the same letter
		it begins with, regardless of case.

		firstLastEqual("Robert") returns false
		firstLastEqual("Ariana") returns true
		firstLastEqual("Taco cat") returns true
		firstLastEqual("42") returns false
		firstLastEqual("") returns false
		firstLastEqual("Goodness, clean up that dog") returns true
  	firstLastEqual("HoHOho")) returns false
		@param original String,
		@return true if (ignoring case) the first letter is the same as the last
		letter (Not just last character). False otherwise.
	*/
	public static boolean firstLastEqual(String original)
	{

		if (original == ""){
			return false;
		}
		original = original.toLowerCase();
		char firstLetter = original.charAt(0);
		char lastLetter = original.charAt(original.length()-1);

		//Your answer here. Edit the return statement as necessary
    return firstLetter == lastLetter;
	}//end firstLastEqual

	/**
		boolean function that returns true if the string has punctuation [.!?].

		hasPunctuation("The total will be 12.50") returns true
		hasPunctuation("Today is the best ever! I wish you were here to enjoy it") returns true
		hasPunctuation("I had so much work today") returns false
		hasPunctuation("I'd love to get ice cream with you") returns false
		hasPunctuation("") returns false
		hasPunctuation("8675309") returns false
		hasPunctuation("Where are you from?")) returns true
		@param original String,
		@return true if an exclamation point, period, or question mark is contained. False otherwise.
	*/
   public static boolean hasPunctuation(String original)
   {
		 boolean punctuation = false;
		 String period = ".";
		 String exclamation = "!";
		 String question = "?";


		 if (original.contains(period) || original.contains(exclamation) || original.contains(question)) {
			 punctuation = true;
		 }
		 //Your answer here. Edit the return statement as necessary
		 return punctuation;
   }// end hasPunctuation

	/**
		isDouble function returns true if the string is a double. false otherwise

		isDouble("12564") returns false
		isDouble("-567") returns false
    isDouble("") returns false
		isDouble("23.9") returns true
		isDouble("twenty two") returns false
    isDouble("-78.13") returns true

		@param firstString String
		@return true only if the input string only contains digits 0-9 with a
		decimal and/or a leading "-".
	*/
   public static boolean isDouble(String firstString)
   {

		 boolean punctuation = false;
		 String period = ".";
		 String point = "point";

		 if (firstString.contains("0") || firstString.contains("1") || firstString.contains("2") || firstString.contains("3") || firstString.contains("4") ||
		 firstString.contains("5") || firstString.contains("6") || firstString.contains("7") || firstString.contains("8") || firstString.contains("9")) {
			 if (firstString.contains(period))
			 	punctuation = true;
		 }

		 else if (firstString.contains(point)) {
			 punctuation = true;
		 }
		 //Your answer here. Edit the return statement as necessary
		 return punctuation;
   }// end isDouble

	 /**
		 isWords function returns true if the string is only made of letters,
		 possibly with punctuation

		 isWords("Hello World") returns true
		 isWords("what's up") returns true
		 isWords("23.9") returns false
		 isWords("Platform 9 and 3/4") returns false
		 isWords("Platform Nine and Three-Quarters") returns true
     isWords("") returns false
		 isWords("87") returns false
		 @param firstString String,
		 @return true only if the input string only contains letters of the
		 alphabet and possibly punctuation.
	 */
		 public static boolean isWords(String firstString)
		 {
			 boolean letterString = true;

			 if (firstString == ""){
				 letterString = false;
			 }
			 if (firstString.contains("0") || firstString.contains("1") || firstString.contains("2") || firstString.contains("3") || firstString.contains("4") ||
			 firstString.contains("5") || firstString.contains("6") || firstString.contains("7") || firstString.contains("8") || firstString.contains("9")) {
				 	letterString = false;
			 }

			 //Your answer here. Edit the return statement as necessary
			 return letterString;
		 }// end isWords

		 /**
	 		If the number is contained in the text, return how many times it is there.
			Otherwise return 0.

	 		countNum(1, "I love CSCE111") returns 3
	 		countNum(12, "The bill is $12.97") returns 1
	 		countNum(33, "333 bananas for 33 monkeys.") returns 2
	 		countNum(333, "My number is (333)-333-3333") returns 3
			countNum(87, "I can't believe Aragorn is 83 years old. 83!") returns 0
	 		countNum(41, "41414141") returns 4
			countNum(0, "") returns 0
	 		@param num integer,
	 		@param text String,
	 		@return counts the number of times a number is found in a string
	 	*/
   public static int countNum(int num, String text)
   {
		 //Your answer here. Edit the assignment and return statement as necessary
		 int index = text.indexOf(Integer.toString(num));
     int count = 0;
     while (index != -1) {
      count++;
      text = text.substring(index + Integer.toString(num).length());
      index = text.indexOf(Integer.toString(num));
  }
     return count;
   }//end countNum

	 /**
		If the number is contained in the text  and is repeated, return the sum of
		the number for each time it is repeated.
		Otherwise return 0.

    sumRepeat(1, "I love CSCE111") returns 3
    sumRepeat(12, "The bill is $12.97") returns 0
    sumRepeat(33, "333 bananas for 33 monkeys.") returns 66
    sumRepeat(333, "My number is (333)-333-3333") returns 999
    sumRepeat(87, "I can't believe Aragorn is 83 years old. 83!") returns 0
    sumRepeat(41, "41414141") returns 164
    sumRepeat(0, "") returns 0
		@param num integer,
		@param text String,
		@return returns the sum of any repeated numbers.
		*/
		 public static int sumRepeat(int num, String text)
		 {
			 //Your answer here. Edit the assignment and return statement as necessary

			 int sum = 0;
			 int index = text.indexOf(Integer.toString(num));
	     int count = 0;
	     while (index != -1) {
	      count++;
	      text = text.substring(index + Integer.toString(num).length());
	      index = text.indexOf(Integer.toString(num));
	  }
		if(count >= 2){
			sum = num * count;
		}
			 return sum;
		 }//end sumRepeat

	/**
		Given three integers, return a string based on whichever is closer to the
		winning number. In the event of a tie, return that neither number is closer
		to the winning number.
		Note that Math.abs(n) returns the absolute value of a number.

		whoWins(8, 13, 21) returns "My number was closer to 21"
		whoWins(45, 35, 42) returns "Your number was closer to 42"
		whoWins(13, 7, 10) returns "Neither number was closer to 10"
    whoWins(100, 28, 35) returns "My number was closer to 35"
		whoWins(35, -44, 4) returns "Your number was closer to 4"
		whoWins(25, 55, 40) returns "Neither number was closer to 40"
		@param yourNumber int number,
		@param myNumber int number,
		@param winningNumber int number,
		@return a string saying "Your number" or "My number" or "Neither" was closer to the winning number
	*/
   public static String whoWins(int yourNumber, int myNumber, int winningNumber)
   {

		 String whoWon = "";
		 int distanceFromMine = Math.abs(winningNumber - myNumber);
		 int distanceFromYours = Math.abs(winningNumber - yourNumber);

		 if (distanceFromMine > distanceFromYours){
			 whoWon = "Your number was closer to " +  winningNumber;
		 }

		 else if (distanceFromMine < distanceFromYours) {
			 whoWon = "My number was closer to " + winningNumber;
		 }

		 else if (distanceFromMine == distanceFromYours) {
			 whoWon = "Neither number was closer to " + winningNumber;
		 }

		 //Your answer here. Edit the return statement as necessary
		 return whoWon;
   }//end whoWins

	/**
		Method topBottomSum returns the sum of the largest number and
		smallest number of the two numbers sent.

		topBottomSum(3, 3, 3, 3) returns 6
		topBottomSum(1, 10, 45, 2) returns 46
		topBottomSum(-6, 2, -45, -8) returns -43
		topBottomSum(3, 113, 2, 200) returns 202
		@param firstNumber int number,
		@param secondNumber int number,
		@param thirdNumber int number,
		@param fourthNumber int number,
		@return the sum of the largest two numbers sent.
	*/
   public static int topBottomSum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber )
   {
		 int largestNumber = Math.max(firstNumber, Math.max(secondNumber, Math.max(thirdNumber, fourthNumber)));
		 int smallestNumber = Math.min(firstNumber, Math.min(secondNumber, Math.min(thirdNumber, fourthNumber)));

		 int sum = largestNumber + smallestNumber;
		 //Your answer here. Edit the return statement as necessary
		 return sum;
   }// end topBottomSum

	/**
		Method sumOfSquares returns the sum of all numbers squared between
		the first number and the second number inclusive. Works in either direction.

		sumOfSquares(3, 3) returns 18
		sumOfSquares(1, 10) returns 385
		sumOfSquares(-6, 1) returns 92
		sumOfSquares(5, 3) returns 50
		@param firstNumber int number,
		@param secondNumber int number,
		@return the sum of the numbers from the first to the second.
	*/
	public static int sumOfSquares(int firstNumber, int secondNumber)
	{
		//Your answer here. Edit the return statement as necessary
		int sum = 0;
		if (firstNumber > secondNumber){
			for (int i = secondNumber; i<=firstNumber; i++)
			{
				int squared = i*i;
				sum = sum + squared;
			}
		}

		else if (firstNumber == secondNumber){
			sum = (firstNumber * firstNumber) + (secondNumber * secondNumber);

		}
		else {
		for (int i = firstNumber; i<=secondNumber; i++)
		{
			int squared = i*i;
			sum = sum + squared;
		}
	}
		return sum;
	}//end sumOfSquares

	/**
		Method changeDue returns the amount of change due to a person who paid a
		given amount. If what was paid does not cover the total, tell the user how
		much they owe. If they pay in exact change, tell them "No change due."

		changeDue(16.38, 20.38) returns "$4.00"
		changeDue(82.46, 100) returns "$17.54"
		changeDue(44.57, 35.75) returns "You owe $8.82"
		changeDue(30.55, 30.55) returns "No change due."
		@param total double number,
		@param paid double number,
		@return the amount of change owed.
	*/
	public static String changeDue(double total, double paid)
	{
		//Your answer here. Edit the assignment and return statement as necessary
		String due = "";
		double change = Math.abs(total - paid);

		if (total > paid){
			due = String.format("You owe $%.2f", change);
		}
		else if (total < paid){
			due = String.format("$%.2f", change);
		}
		else {
			due = "No change due.";
		}
	  return due;
	}//end changeDue

}//end ExerciseMethods1
