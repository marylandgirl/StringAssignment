import java.util.Scanner;

/*
* This program accepts user name as input from the keyboard and displays it
*   to the console.
*/
public class StringAssignment {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);
      
      String name = "";

      //Prompt user to enter name
      System.out.print("Please enter your name: ");
      name = keyboard.nextLine();

      //Print greeting to user
      System.out.print("Hello " + name + " it's very nice to meet you.");
   }
}
