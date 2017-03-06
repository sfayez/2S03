/*
Susan Fayez
fayezs
001404420
October 14, 2016

This is a program that verifies a password, giving the user 3 attempts
*/


import java.util.Scanner;
//importing the scanner class to take input from the user


public class PasswordVerifier {
    public static void main(String[] args) {
        //defining the class and the main function
        
        
        System.out.println("Welcome to the Password Verifier");
        System.out.println("----------------------------------");
        //printing the intial greetings of the program
        
        run(3);   
        //calling the run function, defined later, with three attempts
    }
    public static void run(int attempts){
        //defining the run function
        
        Scanner passIn = new Scanner(System.in);
        //creating a scanner to take input from the user
       
        
       if (attempts > 0){
           //making sure the user still has attempts left
           
            System.out.printf("Please Enter the password (%d attempt (s) left): ", attempts);
            //prompting input of a password and warning the number of attempts left
        
            String input = passIn.next();
            attempts -= 1;
            //stroing the password attempt and decreasing the number of attempts left
            
            if(input.equals("admin")){
                //condition if the user inputs the administrator password
                
                System.out.println("Verified as administrator!");
                return;
                //printing the verification message and ending the program
            }
            if(input.equals("guest")){
                //condition if the user inputs the guest password
                
                System.out.println("Verified as guest!");
                return;
                //printing the verification message and ending the program
            }
            else{
                //condition if the user doesn't enter either password
                System.out.println("Verification failed!");
                run(attempts);
                //failure message displayed and the run function is called again with the new number of attempts
            }
       }
       else{
           System.out.println("All verification attempts failed!");
           //last failure message displayed if all attempts are used
       }
       
    }
}
