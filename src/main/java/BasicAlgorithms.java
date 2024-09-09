import java.util.Scanner;

public class BasicAlgorithms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String name = input.nextLine();
        System.out.println("Welcome, " + name);

        boolean validAge = false;
        while(!validAge){
            System.out.println("Please enter your age: ");
            if (input.hasNextInt()){
                int age = input.nextInt();
                System.out.println("Wow, " + age + "? You're old!");
                validAge = true;
            }else{
                System.out.println("Please enter a number next time!");
                input.nextLine();
            }
        }

    }
}
