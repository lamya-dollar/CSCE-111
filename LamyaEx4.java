import javax.swing.JOptionPane;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/4/2020
Section: 501
Platform: PC
*/

class LamyaEx4 {
  public static void main(String[] args) {

    String input;
    double grade = 0.0;
    double totalScore = 0.0;
    boolean response = true;
    int answer;
    String letterGrade;
    double average = 0.0;
    String averageMessage;

    do {
      totalScore = 0.0;
      String message = "Welcome! This program will help you get the average of your scores.";
      JOptionPane.showMessageDialog(null, message);

      input = JOptionPane.showInputDialog("How many quizzes do you need the average of?");
      int quiz = Integer.parseInt(input); //changes string to int

      for (int i = 1; i <= quiz; i++) {

        input = JOptionPane.showInputDialog(i + ". Enter your grade: ");
        grade = Double.parseDouble(input);
        totalScore += grade;
      }

      average = (totalScore / quiz);
      if (average <= 100 && average >= 90)
        letterGrade = "A";
      else if (average <= 90 && average >= 80)
          letterGrade = "B";
      else if (average <= 80 && average >= 70) //number grade to letter grade
              letterGrade = "C";
      else if (average <= 70 && average >= 60)
                  letterGrade = "D";
      else
        letterGrade = "F";


      averageMessage = String.format("Your average is %.2f and your letter grade is " + letterGrade + ".", average);
      JOptionPane.showMessageDialog(null, averageMessage);

      answer = JOptionPane.showConfirmDialog(null, "Would you like to calculate another average?", "Question", JOptionPane.YES_NO_OPTION);


        if (answer == JOptionPane.YES_OPTION) {
          response = true;
        } //end if statement
        else {
          JOptionPane.showMessageDialog(null, "Remember grades don't determine your worth and you can always do better next time. Have a good day!  ");
          response = false;
        }// end else statement
      } //end do statement
      while (response);

  } //end main
} //end class
