/*
Susan Fayez
fayezs
001404420
*/
import java.util.Scanner;
//Importing the scanner to take inputs

public class ComputeCubeVolume {

    public static void main(String[] args) {
        
        Scanner cubeDimension = new Scanner(System.in);
        double lengthOfTheCube, widthOfTheCube, heightOfTheCube;
        //Defining a scanner to take inputs and the variables to store the inputs
        
        System.out.println("Please enter the length of the cube.");
        lengthOfTheCube = cubeDimension.nextDouble();
        //Prompting and storing the first input (length)
        
        System.out.println("Please enter the width of the cube.");
        widthOfTheCube = cubeDimension.nextDouble();
        //Prompting and storing the second input (width)
        
        System.out.println("Please enter the height of the cube.");
        heightOfTheCube = cubeDimension.nextDouble();
        //Prompting and sotring the third input (height)
        
        double volumeOfTheCube = lengthOfTheCube * widthOfTheCube * heightOfTheCube;
        //Declaring and computing the volume variable
        
        System.out.printf("The volume of the cube is: %f" , volumeOfTheCube);
        //Printing the result
    }
    
}
/*SOURCES: https://thenewboston.com/videos.php?cat=31&video=17971
https://thenewboston.com/videos.php?cat=31&video=17972

*/