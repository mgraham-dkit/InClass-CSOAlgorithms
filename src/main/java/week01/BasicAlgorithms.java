package week01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicAlgorithms {
    // Create a method that takes in no parameters and returns a number
    public static int getValidAge(){
        // Create a Scanner to read from the command line
        Scanner input = new Scanner(System.in);
        // Create a boolean to track if we have a valid age yet
        boolean validAge = false;
        // Create the age variable (so we can still access it after the loop ends)
        // If we create it within the loop, it will only exist within the loop's scope
        int age = 0;
        // While we haven't gotten a valid age
        while(!validAge){
            System.out.println("Please enter your age: ");
            // Check if the user provided a number
            if (input.hasNextInt()){
                // If they did, take it in and store it
                age = input.nextInt();
                // Change flag to show we have a real age value
                validAge = true;
            }else{
                // Inform the user that they need to enter a number
                System.out.println("Please enter a number next time!");
                // Clear the scanner of previous (invalid) input
                // Without this we can't take in new information - infinite loop!
                input.nextLine();
            }
        }

        // Return the age
        return age;
    }

    // Create a method that takes in no parameters and returns a number
    public static int getValidAgeUsingExceptionHandling(){
        Scanner input = new Scanner(System.in);
        boolean validAge = false;
        int age = 0;
        while(!validAge){
            // Try to take in a number and store it
            try{
                System.out.println("Please enter your age: ");
                age = input.nextInt();
                // If we get to this line, it means no exception occurred and we got a number
                validAge = true;
            }// Catch the specific type of exception that occurs when we request a number but get something else
            catch(InputMismatchException e){
                System.out.println("Please enter a number next time!");
                input.nextLine();
            }
        }

        return age;
    }

    public static void main(String[] args) {
        // Create a Scanner object to let us read from the command line (System.in)
        Scanner input = new Scanner(System.in);
        // Repeat the logic 5 times
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter your username: ");
            // Use nextLine() to read in text
            String name = input.nextLine();
            System.out.println("Welcome, " + name);

            int age = getValidAge();
            System.out.println("Wow, " + age + "? You're old!");
        }
    }

    public static int getValidInt(String prompt){
        // Create a Scanner to read from the command line
        Scanner input = new Scanner(System.in);
        // Create a boolean to track if we have a valid age yet
        boolean validInt = false;
        // Create the age variable (so we can still access it after the loop ends)
        // If we create it within the loop, it will only exist within the loop's scope
        int num = 0;
        // While we haven't gotten a valid age
        while(!validInt){
            System.out.println(prompt);
            // Check if the user provided a number
            if (input.hasNextInt()){
                // If they did, take it in and store it
                num = input.nextInt();
                // Change flag to show we have a real age value
                validInt = true;
            }else{
                // Inform the user that they need to enter a number
                System.out.println("Please enter a number next time!");
                // Clear the scanner of previous (invalid) input
                // Without this we can't take in new information - infinite loop!
                input.nextLine();
            }
        }

        // Return the num
        return num;
    }

    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
