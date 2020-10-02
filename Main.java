import java.util.Scanner;
/**
 * prompts user for a #, adds the sum of all the numbers between that # and 1. tells user the sum
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner
    Scanner input = new Scanner(System.in);

    //initialize variables
    int sum = 0; //holds current sum
    int counter = 1; //counts how many times to repeat the loop

    //ask user for integer
    System.out.println("Please enter an integer to count down to");
    int number = input.nextInt();

    //create loop to count up to provided number
    while(counter <= number){
      sum = sum + counter; //add the current count to the sum variable
      counter = counter + 1; //increase counter by 1
    }

    //tell the user the total sum
    System.out.println("The sum from 1-" + number + " is " + sum);
    
  }
}
