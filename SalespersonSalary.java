/*
Susan Fayez
fayezs
001404420
*/
import java.util.Scanner;
//Importing Scanner library for taking inputs
 
public class SalespersonSalary {

    public static void main(String[] args) {
        
        Scanner sales = new Scanner(System.in);
        int numProductA, numProductB, numProductC, numProductD;
        int comissionInt;
        //Defining a scanner to take inputs and variables to store the inputs
        
        System.out.println("Salesman’s salary calculation");
        //Printing headline, according to example output dialogue
        
        System.out.print("Enter units sold of Product A [integer]:");
        numProductA = sales.nextInt();
        System.out.print("Enter units sold of Product B [integer]:");
        numProductB = sales.nextInt();
        System.out.print("Enter units sold of Product C [integer]:");
        numProductC = sales.nextInt();
        System.out.print("Enter units sold of Product D [integer]:");
        numProductD = sales.nextInt();
        //Prompting and storing sales numbers inputs
        
        System.out.print("Enter provision rate in percent [integer]:");
        comissionInt = sales.nextInt();
        double comissionDecimal = comissionInt * 0.01;
        //Prompting and storing the comission rate, converting it to a decimal
        
        System.out.println("\n" + "Salary slip \n");
        //Printing headline, according to example output dialogue
        
        double costProductA = numProductA * 239.99;
        double costProductB = numProductB * 129.75;
        double costProductC = numProductC * 99.95;
        double costProductD = numProductD * 350.89;
        //Calculating and sorting the profit of each product
        
        System.out.printf("Product A: \t%d\t units * $239.99 \t = $ \t %.2f", numProductA, costProductA);
        System.out.printf("\nProduct B: \t%d\t units * $129.75 \t = $ \t %.2f", numProductB, costProductB);
        System.out.printf("\nProduct C: \t%d\t units * $99.95 \t = $ \t %.2f", numProductC, costProductC);
        System.out.printf("\nProduct D: \t%d\t units * $350.89 \t = $ \t %.2f", numProductD, costProductD);
        //Displaying the number of each product sold and the profit of each rounded to two decimal places, accodring to example output dialogue
        
        System.out.println("\n\t \t \t \t \t \t-------------------");
        //Printing a line separating the units from the total, according to example output dialogue
        
        double totalSales = costProductA + costProductB + costProductC + costProductD;
        //Calcualting and storing the total sales
        
        System.out.printf("\t \tTotal sales \t \t \t = $ \t %.2f", totalSales );
        //Displaying the total sales
        
        double provision = totalSales * comissionDecimal;
        //Calculating and storing the portion salary made from commission 
        
        System.out.println("\n \nFixed part of salary \t \t \t \t = $ \t 200.00");
        System.out.printf("Provision (%d%% of sales) \t \t \t = $ \t %.2f", comissionInt, provision);
        //Displaying the breakdown of earnings from the fixed salary and commission
        
        System.out.println("\n\t \t \t \t \t \t-------------------");
        //Printing a line separating the units from the total, according to example output dialogue
        
        double salary = provision + 200;
        System.out.printf("\t \tTotal salary \t \t \t = $ \t %.2f", salary );
        //Calculating, storing, and displaying the total salary
    }
    
    /*
SOURCES:  https://www.youtube.com/watch?v=cCq5LqFXVyU
    http://stackoverflow.com/questions/1860159/how-to-escape-the-sign-in-cs-printf
*/
 
}
