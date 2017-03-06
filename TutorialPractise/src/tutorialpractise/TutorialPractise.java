package tutorialpractise;

import java.util.Scanner;

public class TutorialPractise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(i != 1){
            
            try{
                System.out.println("Please enter a number");
                
                String numOne = in.next();
                
                System.out.println("Please enter another number");
                
                String numTwo = in.next();
                
                double result = Double.parseDouble(numOne) / Double.parseDouble(numTwo);
                i = 1;
                System.out.println(numOne + " divided by " + numTwo +  " is " + result);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic error, please try again");
            }
        }
    }
    
}
