/*
Susan Fayez
fayezs
001404420
October 14, 2016

This is a program that does simple arithmetic and states the result in English
*/


import java.util.Scanner;
//imposrting scanner class so input can be taken from the user


public class EnglishLanguageCalculator {

    public static void main(String[] args) {
        //defining the class and the main function
        
        run();
        //calling the run function, created so recursion can be used
    }
    
    public static void run(){
        //defining the run function
        
        Scanner in = new Scanner(System.in);
        //defining a scanner so input can be taken from the user
        
        System.out.print("Enter first number: ");
        int firstNum = in.nextInt();
        //promting and storing the first number
        
        System.out.print("Enter operation: ");
        String operation = in.next();
        //prompting and storing the operator
        
        System.out.print("Enter second number: ");
        int secNum = in.nextInt();
        //prompting and storing the second number
        
        if(firstNum < 0 || secNum < 0 || firstNum > 9 || secNum > 9){
            System.out.println("Invalid number");
            continuePrompt();
        }
        //making sure numbers are within range, displaying error otherwise
        
        String firstNumOut = null;
        String secNumOut = null;
        //defining variables to store numbers as words
        
         if (firstNum == 0){
            firstNumOut = "Zero";
        }
         if (secNum == 0){
            secNumOut = "zero";
        }
         if (firstNum == 1){
            firstNumOut = "One";
        }
         if (secNum == 1){
            secNumOut = "one";
        }
         if (firstNum == 2){
            firstNumOut = "Two";
        }
         if (secNum == 2){
            secNumOut = "two";
        }
         if (firstNum == 3){
            firstNumOut = "Three";
        }
         if (secNum == 3){
            secNumOut = "three";
        }
         if (firstNum == 4){
            firstNumOut = "Four";
        }
         if (secNum == 4){
            secNumOut = "four";
        }
         if (firstNum == 5){
            firstNumOut = "Five";
        }
         if (secNum == 5){
            secNumOut = "five";
        }
         if (firstNum == 6){
            firstNumOut = "Six";
        }
         if (secNum == 6){
            secNumOut = "six";
        }
         if (firstNum == 7){
            firstNumOut = "Seven";
        }
         if (secNum == 7){
            secNumOut = "seven";
        }
         if (firstNum == 8){
            firstNumOut = "Eight";
        }
         if (secNum == 8){
            secNumOut = "eight";
        }
         if (firstNum == 9){
            firstNumOut = "Nine";
        }
         if (secNum == 9){
            secNumOut = "nine";
        }
         
         //converting integers to words for output
        
        
        if(operation.equals("*")){
            //condition of operation is multiplication
            
            int value = firstNum * secNum;
            //calculating the result
            
            System.out.println(firstNumOut + " times " + secNumOut + " is " + value);
            
            continuePrompt();
            return;
            
            //printing the result and calling the continue prompt function
            
        }
        if(operation.equals("/")){
            //condition if operation is division
            
            if (secNum == 0){
                System.out.println("Division by zero is not allowed");
            }
            //catching and displaying error message if division by zero is attempted
            
            double value;
            value = firstNum / (secNum * 1.0);
            //calculating result
            
            System.out.println(firstNumOut + " divided by " + secNumOut + " is " + value); 
            
            continuePrompt();
            return;
            //printing result and calling continue prompt function
        }
        if(operation.equals("+")){
            //condition if operation is addition
            
            int value = firstNum + secNum;
            //calculating result
            
            System.out.println(firstNumOut + " plus " + secNumOut + " is " + value);
            
            continuePrompt();
            return;
            //printing result and calling continue prompt function
        }
        if(operation.equals("-")){
            //condition if operation is subtraction
            
            int value = firstNum - secNum;
            //calculating result
            
            System.out.println(firstNumOut + " minus " + secNumOut + " is " + value);
            
            continuePrompt();
            return;
            //printing result and calling continue prompt function
        }
        if(operation.equals("^")){
            //condition if operation is exponent
            
            int value = (int) Math.pow(firstNum, secNum);
            //calculating the result
            
            System.out.println(firstNumOut + " to the power of " + secNumOut + " is " + value);
            
            continuePrompt();
            return;
            //printing the result and calling the continue prompt function
        }
        else{
            //condition to catch if any other operator is input
            
            System.out.println("Invalid operation");
            continuePrompt();
            //displaying error mesaage
            }
        }
    
    public static void continuePrompt(){
        //defining function to ask user if they wish to continue
        
        Scanner in = new Scanner(System.in);
        //defining a scanner to take user input
        
        System.out.println("Do you want to continue? (Y/N) ");
        //displaying message, prompting input
        
            String answer = in.next();
            //storing user input
            
            answer = answer.toLowerCase();
            //changing the input answer to lowercase so input is case insensitive
            
            switch(answer) {
                //using a switch to determine action based on the input
                
                case("y"):      run();
                                break;
                    //calling the run function if the input is y
                    
                case("yes"):    run();
                                break;
                    //calling the run function if the input is yes
                    
                case("n"):      System.out.print("");
                                break;
                    //printing null to end the program if answer is n
                    
                case("no"):     System.out.print("");
                                break;
                    //printing null to end the program if answer is no
                    
                default:        System.out.println("Invalid input");
                                continuePrompt();
                                break;
                    //printing invaild input and rerunning continue prompt if input is anything else
            }
            
            
    }
    }


    
   
/*
SOURCES

http://stackoverflow.com/questions/19180797/case-insensitive-matching-in-java-switch-case-statement
*/
