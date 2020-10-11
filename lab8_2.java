import java.util.Scanner;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 10/7/2020
Assignment: Lab Work Week 8.2
*/

/*Instructions: Read the provided instructions.

*/

class lab8_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What number would you like to start your matrix with?");
    int startVal = sc.nextInt();
    int[][] matrix = new int[5][5];

    for (int i=0; i<matrix.length; i++ ) { //rows
      for (int j=0; j<matrix[i].length; j++) { //columns
        if(startVal%3 == 0){
          matrix[i][j] = 0;
        }
        else {
          matrix[i][j] = startVal;
        }
        startVal += 4;
      } //for loop bracket
    } //for loop bracket

    for(int i = matrix.length-1; i>=0; i--){ //rows
      for(int j = matrix[i].length-1; j>=0; j--){ //columns
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

  } //end main
} //end class
