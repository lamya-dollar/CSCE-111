import javax.swing.JOptionPane;
import java.util.Random;
/*
Name: Lamya Dollar
UIN: 930008477
Date: 9/25/2020
Section: 501
Platform: PC
*/

class LamyaEx5{

  public static String welcomeMessage(String name) {
      String welcome = "Welcome, " + name + "! Let us take you on a journey today!";
      return welcome;
     }

  public static String goodbyeMessage (String name) {
    String goodbye = "I hope you had fun " + name + ".\nGoodbye for now.\nHope to see you again!";
    return goodbye;
  }


  public static void main(String[] args) {
    String input = "";


    input = JOptionPane.showInputDialog("Enter your name: ");
    String userName = input;
    JOptionPane.showMessageDialog(null, welcomeMessage(userName));

    JOptionPane.showMessageDialog(null, "You're suddenly woken up from your sleep!","LOUD NOISE!", JOptionPane.WARNING_MESSAGE);
    Object[] options = {"Go downstairs","Sleep in"};
    int a = JOptionPane.showOptionDialog(null,"Do you want to go downstairs to check on the noise or sleep in?", "Decision", JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

    if (a == JOptionPane.NO_OPTION) {
      JOptionPane.showMessageDialog(null, "You close your eyes for 5 more minutes until you hear the loud noise again.");
      JOptionPane.showMessageDialog(null, "You sigh, defeatedly, and decide to just wake up for the day.");
    }

    if (a == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null, "You go downstairs to see a cup of milk on the kitchen island with a note on the side. You pick up the note.");
      JOptionPane.showMessageDialog(null, "It's a note from mom and it reads:\n\"Hi sweetheart! There's a worker fixing the insulation in the attic. Don't go in there. I'll be back soon.\nLove you honey!\"");
    }

    Object[] options2 = {"Do homework", "Go outside for a walk"};
    a = JOptionPane.showOptionDialog(null,"What would you like to do now?", "Decision", JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);

    if (a == JOptionPane.NO_OPTION) {
      JOptionPane.showMessageDialog(null, "You put on your sneakers, take your keys, and head outside.");
      JOptionPane.showMessageDialog(null, "You start walking towards the east. You see a little puddle on the ground and decide to jump over it.\nThen, you look down.");
      String dialogue = "Your feet haven't reached the ground!\n\"Woah! Am I flying?,\" you ask yourself.";
      JOptionPane.showMessageDialog(null, dialogue, "YOU'RE FLOATING!", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "You walk around some more and you start going even higher above the ground.");
      JOptionPane.showMessageDialog(null, "You decide to take advantage of the sudden powers you've gotten and plan to go to the theme park nearby.");

      Object[] options3 = {"Roller coaster", "Ferris Wheel"};
      int b = JOptionPane.showOptionDialog(null,"Which ride do you want to go to?", "Decision", JOptionPane.YES_NO_OPTION,
      JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]);

      switch (b) { //choice for ferris wheel or roller coaster
        case JOptionPane.NO_OPTION: JOptionPane.showMessageDialog(null, "You fly on top of ferris wheel and to your surprise, nobody notices.");
        break;

        case JOptionPane.YES_OPTION: JOptionPane.showMessageDialog(null, "You fly to the top and sit in the roller coaster and to your surprise, nobody notices.");
        break;
      }

      JOptionPane.showMessageDialog(null, "After enjoying the ride, you feel like using your flying powers and going somewhere else too.");
      JOptionPane.showMessageDialog(null, "Please enter your 3 favorite places. I will select randomly where to take you.");
      String placeOne = JOptionPane.showInputDialog(null, "Place number 1:");
      String placeTwo = JOptionPane.showInputDialog(null, "Place number 2:");
      String placeThree = JOptionPane.showInputDialog(null, "Place number 3:");

      Random rand = new Random();
      int randomNumber = rand.nextInt(3) + 1; //random number between 1-3

      switch (randomNumber) { //random generator selects place
        case 1: JOptionPane.showMessageDialog(null, "Lets go to " + placeOne + "!"); break;
        case 2: JOptionPane.showMessageDialog(null, "Lets go to " + placeTwo + "!"); break;
        case 3: JOptionPane.showMessageDialog(null, "Lets go to " + placeThree + "!"); break;
      }

      JOptionPane.showMessageDialog(null, "You fly to your favorite place and admire the beauty there.\nYou bask in the sun for a bit, \nuntil you start hear your phone ring.");
      JOptionPane.showMessageDialog(null, "\"Where are you, " + userName + "?\"", "MOM IS CALLING!", JOptionPane.WARNING_MESSAGE);
      JOptionPane.showMessageDialog(null, "You pick up the phone and respond:\n\"Sorry mom, I went out for a walk. I'm on my way!\"");
      JOptionPane.showMessageDialog(null, "You quickly fly back to your house and stop in front of the house.\nYou take off your sneakers and step in.");
      String dialog4 = String.format("\"Hi " + userName + ", can you please help me unbag the groceries?\"");
      JOptionPane.showMessageDialog(null, dialog4);
      JOptionPane.showMessageDialog(null, "You help your mom with the groceries, while looking back on the day you've had.\nTHE END!");
      JOptionPane.showMessageDialog(null, goodbyeMessage(userName)); //first ending

    }

    else if (a == JOptionPane.YES_OPTION) { //what happens if you stay at home and do your hw?
      JOptionPane.showMessageDialog(null, "You open up your laptop to start on your homework.");
      String computerWelcome = "The computer greets you.\n\"Hello my favorite user, "+ userName + "! Just who I was waiting for.\"";
      JOptionPane.showMessageDialog(null, computerWelcome, "COMPUTER STARTS SPEAKING?!", JOptionPane.WARNING_MESSAGE); //sudden change, computer starts speaking?

      JOptionPane.showMessageDialog(null, "\"I want to show you something amazing. Please click on the icon in the middle of the screen.\"");
      JOptionPane.showMessageDialog(null, "You click the icon in the middle.\nA blank screen appears.");
      input = JOptionPane.showInputDialog("\"What is your favorite color?\"");
      String favColor = input;
      String dialog2 = String.format("Your computer theme changes.\nIt fills up with " + favColor + " stars and " + favColor + " stripes.\nYou are in awe.");
      JOptionPane.showMessageDialog(null, dialog2);
      JOptionPane.showMessageDialog(null, "\"What else can you do, \" you ask.");
      Object[] options4 = {"Go into the attic", "Ignore it and focus on the laptop"};
      int c = JOptionPane.showOptionDialog(null,"Suddenly you hear a bunch of THUD noises coming from the attic!", "NOISES!", JOptionPane.YES_NO_OPTION,
      JOptionPane.WARNING_MESSAGE, null, options4, options4[0]); //option to switch to different story ending.


        if (c == JOptionPane.NO_OPTION) { //what hapens if you ignore the attic noises?
        JOptionPane.showMessageDialog(null, "\"I can do a lot of things. I can check your homework for you too!\"");
        JOptionPane.showMessageDialog(null, "The computer starts reading your math homework.");
        input = JOptionPane.showInputDialog(null, "\"Hmm... This question right here asks what the slope of this equation is.\"\n2y=3x+5\n\"What do you think?\"");
        String slope = input;

          switch (slope){ //answer for the slope of 2y=3x+5
              case "3/2": JOptionPane.showMessageDialog(null, "\"You already know this stuff!\nYou don't even need my help\""); break;
              case "1.5": JOptionPane.showMessageDialog(null, "\"You already know this stuff!\nYou don't even need my help\""); break;
              default: JOptionPane.showMessageDialog(null, "\"Hmm... It is actually 3/2 or 1.5! You divide by 2 on both sides to get the slope!"); break;
          }
        JOptionPane.showMessageDialog(null, "\"Hi sweetie! I'm back!\nWho are you talking to?\"");
        JOptionPane.showMessageDialog(null, "You turn around to see your mom!\n\"Nobody mom, just myself, \" you say.", "MOM'S HERE!", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your mom plants a kiss on your forehead and unbags the groceries.");
        JOptionPane.showMessageDialog(null, "\"Alright " + userName + "! I gotta go. Hope we talk again soon!\nA bell sound chimes and the laptop goes back to its original form.\n\tTHE END!");

        JOptionPane.showMessageDialog(null, goodbyeMessage(userName)); //second ending

      }


        else if (c == JOptionPane.YES_OPTION) { //what happens if you decide to go into the attic?
        JOptionPane.showMessageDialog(null, "You open the attic door and fall into a lake of chocolate!", "WHAT IS GOING ON!", JOptionPane.WARNING_MESSAGE); //different storyline, you are in Willy Wonka's chocolate factory.
        JOptionPane.showMessageDialog(null, "You walk around to see that you're in the...");
        JOptionPane.showMessageDialog(null, "\"Yes, you're in the Willy Wonka's Chocolate Factory.\"", "IT'S WILLY WONKA HIMSELF!", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "\"But... how did you get here?\nWell, it doesn't matter. I need a worker, so come here quick!\"");
        Object[] options5 = {"Testing the bubblegum", "Feeding the monkeys"};
        int e = JOptionPane.showOptionDialog(null,"What would you like to help Mr. Wonka with?", "Decision", JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, options5, options5[0]);

        switch (e){
          case JOptionPane.NO_OPTION: JOptionPane.showMessageDialog(null, "Mr. Wonka hands you rainbow bananas and you throw them to the monkeys.\nThey all start clapping and turn purple."); break;
          case JOptionPane.YES_OPTION: JOptionPane.showMessageDialog(null, "Mr. Wonka hands you the bubblegum and you chew it.\nYou start to change colors."); break;
        }
          JOptionPane.showMessageDialog(null, "\"Oh boy! I need to fix that, but we will do that later.\"");
          JOptionPane.showMessageDialog(null, "\"Come with me, I will show you something for being a good worker of mine.\"");
          input = JOptionPane.showInputDialog(null, "\"What is your favorite candy?\"");
          String favCandy = input;
          String dialog3 = String.format("Mr. Wonka takes you to a room and opens the door to reveal HUGE " + favCandy + "!\nHe motions for you to go closer if you'd like.");
          JOptionPane.showMessageDialog(null, dialog3);
          JOptionPane.showMessageDialog(null, "You climb onto the " + favCandy + " and are busy eating it, until you hear your phone ring.");
          JOptionPane.showMessageDialog(null, "\"Where are you, " + userName + "?\"", "MOM IS CALLING!", JOptionPane.WARNING_MESSAGE);
          JOptionPane.showMessageDialog(null, "\"Mr. Wonka, can you please take me back to where I entered from, \" you ask hurriedly.");
          JOptionPane.showMessageDialog(null, "\"Just close your eyes, my fellow worker. Your mind will take you where you desire.\"");
          JOptionPane.showMessageDialog(null, "You close your eyes and open them again to see you are back in your room.\nYou go downstairs to say hi to your mom and tell her you were sleeping.\n\tTHE END!");

          JOptionPane.showMessageDialog(null, goodbyeMessage(userName)); //last ending
        }




    }


  }
}
