import java.util.*;

public class Main {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        startProgram();
    }
    
    public static void startProgram() {
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.print("\nChoose action from the following: " + "\n(0) Exit" + "\n(1) Sum of the number" + "\n(2) Factorial of the number" + "\nEnter a number: ");
        int choice = in.nextInt();
        
        if (choice == 0) System.out.print("---- END ----");
        if(choice == 1) computeSum(number);
        else if (choice == 2) computeFactorial(number);
    }
    
    public static void computeSum(int number) {
        int sum = 0;
        
        for(int i = 1; i <= number; i++) sum += i;
        System.out.println("\nThe sum of numbers between 1 to " + number + " is " + sum);
    }
    
    public static void computeFactorial(int number) {
        int factorial = 1;
        
        for(int i = 1; i <= number; i++) factorial *= i;
        System.out.println("\nFactorial of " + number + " is " + factorial);
    }
}