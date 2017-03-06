/*
Susan Fayez
fayezs
001404420
October 14, 2016

This is a program that generates a sequence given a positive integer less than 100
*/




import java.util.Scanner;
//Scanner class imported to take user input later

public class SequenceGenerator {

    public static void main(String[] args) {
        //class and main function defined
        
        System.out.println("Welcome to the Sequence Generator");
        System.out.println("----------------------------------");
        //displaying the initial greeting message of the program
        
        Scanner posInt = new Scanner(System.in);
        //creating a scanner to take input from the user
        
        System.out.print("Please Enter a positive integer no more than 100: ");
        int ci = posInt.nextInt();
        //prompting and storing the user input integer
        
        if (ci > 0 && ci < 101){
            //checking if the input is within range
            
            int i = 0;
            //setting up a counter for the number of elements in the sequence
            
            while (ci >= 2){
                //setting the loop to end when specified
                
                if (i >= 20 && i % 20 == 0){
                    System.out.print("\n");
                    //making sure the elements are printed in a new line every 20 elements
                    
                }
                int n = ci % 2;
                //checking if the current element is divisible by 2
                
                if(n == 0){
                    //condition if element is divisible by 2
                    
                    System.out.printf("[%d]", ci);
                    ci = ci / 2;
                    //printing the current element and calculating the next
                }
                if(n == 1){
                    //condition if element is not divisible by 2
                    
                    System.out.printf("(%d)", ci);
                    ci = 6 * ci + 2;
                    //printing the current element and calculating the next
                }
                
                i += 1;
                //incrementing the element counter
            }
        }
        else{
            System.out.println("Number entered is out of range");
            
            //message printed if the input number is out of range
        }
    }
    
}
