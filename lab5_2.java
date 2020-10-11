import java.util.Scanner;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/16/20
Assignment: Lab Work Week 5.2
*/

/*Instructions: Use Scanner to obtain radius and height values for a cone.
                Assign coneRadius and coneHeight with the respective inputs.
                Using the provided piValue and inputed coneRadius and coneHeight,
                    calculate the surface area of the cone and assign to coneArea.
                **Surface Area of a Cone = πr(r+sqrt(h^2+r^2))
Use conditional statements to check if the resulting coneArea is
    less than or equal to 100,
    or
    greater than 100 and less than or equal to 200,
    or
    greater than 200 and less than or equal to 300,
    or
    greater than 300
If surface area is less than or equal to 100, print out the surface area with 0 decimal values using printf,
if surface area is greater than 100 and less than or equal to 200, print out the surface area with 1 decimal value using printf,
if surface area is greater than 200 and less than or equal to 300, print out the surface area with 2 decimal value using printf and,
if surface area is greater than 300 , print out the surface area with 3 decimal value using printf.

Using printf, print the output in the following format: "The surface area of the cone is around: ___!"
*/

class lab5_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double piValue = 3.14159;
    double coneRadius;
    double coneHeight;
    double coneArea;

    System.out.println("What is the cone's radius?");
    coneRadius = input.nextDouble();

    System.out.println("What is the cone's height?");
    coneHeight = input.nextDouble();

    coneArea = piValue * coneRadius * (coneRadius + Math.sqrt(Math.pow(coneHeight,2) +  Math.pow(coneRadius,2)));


    if (coneArea <= 100){
      System.out.printf("The surface area of the cone is around: ");
      System.out.printf("%.00f! %n" , coneArea);
    }

    else if (coneArea > 100 && coneArea <=200){
      System.out.printf("The surface area of the cone is around: ");
      System.out.printf("%.01f! %n" , coneArea);
    }

    else if (coneArea > 200 && coneArea <=300){
      System.out.printf("The surface area of the cone is around: ");
      System.out.printf("%.02f! %n" , coneArea);
    }

    else if (coneArea > 300){
      System.out.printf("The surface area of the cone is around: ");
      System.out.printf("%.03f! %n" , coneArea);
    }
  } //end main
} //end class
