/*
Susan Fayez
001404420
fayezs

November 7, 2016

This is a program that generates a matrix from user input of row and column numbers, then 
transforms that matrix by pushing rows with an even idex up and columns with an even index
to the left. 
 */
package matrixconverter;

import java.util.Scanner;

class MatrixConverter {
  
 public static void main(String args[]) {

    int rows, columns;
    Matrix input, output;
    Scanner keyboard = new Scanner(System.in); // Input scanner.

    // Print welcome message.

    System.out.println("Welcome to The Matrix Converter");
    System.out.println("-------------------------------");

    // Prompt user for input.

    System.out.print("Please input the number of rows: ");
    rows = keyboard.nextInt();
    System.out.print("Please input the number of columns: ");
    columns = keyboard.nextInt();

    // Generate a matrix
    input = new Matrix(rows, columns);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        input.setElement(i, j, i * 10 + j);
      }
    }

    // Print the generated matrix

    System.out.println("The original matrix");
    input.print();


    // Print the converted matrix

    output = convert(input);
    System.out.println("The converted matrix");
    output.print();

  }
 /*
   * =========================================================================
   *  Method convert(): converts matrix input by pushing even-indexed rows 
   *    and columns up / left, odd-indexed ones down / right.
   *
   *  Input  : Matrix input -- the matrix to be converted
   *  Output : Matrix -- the converted matrix
   * =========================================================================
   
 */
  public static Matrix convert (Matrix input) {
      //initializing the convert method
      
      int columns = input.getColumnsNum();
      int rows = input.getRowsNum();
      //Setting up column and row number variables from the given matrix
      
      Matrix stepOne = new Matrix(rows, columns);
      Matrix stepTwo = new Matrix(rows, columns);
      //Initializing the matrix variables for the two conversion steps
      
      
      for(int i = 0; i < columns ; i++){
          //for loop through the columns of the given matrix
          
          int x = 0;
          //setting up variable for first step row placement
          
          for(int j = 0; j < rows ; j ++){
              //for loop through each row of the given matrix
              
              if (j % 2 == 0){
                  //condition runs if row number is even
                  
                  int current = input.getElement(j,i);
                  //retreiving original matrix element
                  
                  x = j/2;
                  stepOne.setElement(x, i, current);
                  //placing the matrix element in it's transformed row
                  
                  
          }
              
        }
      }
      
      for(int i = 0; i < columns ; i++){
          //for loop through columns of original matrix
          
          int x = rows / 2 + (rows % 2);
          //setting up variable for odd row number placement
          
          for(int j = 0; j < rows ; j ++){
              //for loop through rows of original matrix
              
              if (j % 2 != 0){
                  //condition runs if row number is odd
                  
                  int current = input.getElement(j,i);
                  //retreiving original matrix element
                  
                  stepOne.setElement(x, i, current);
                  x++;
                  //placing element in it's tranformed row postion, incrementing placement variable
                  
          }
        }
      }
      
      for(int i = 0; i < rows ; i++){
          //for loop through rows of original matrix
          
          int x = 0;
          //starting variable for column placement
          
          for(int j = 0; j < columns ; j ++){
              //for loop through columns of original matrix
              
              if (j % 2 == 0){
                  //condition if column number is even
                  
                  int current = stepOne.getElement(i,j);
                  //retreiving step one matrix element
                  
                  x = j/2;
                  stepTwo.setElement(i, x, current);
                  //placing element in new column position
                  
          }
              
        }
      }
      
      for(int i = 0; i < rows ; i++){
          //for loop through rows of original matrix
          
          int x = columns / 2 + (columns % 2);
          //starting variable for odd column number placement
          
          for(int j = 0; j < columns ; j ++){
              //for loop through columns of original matrix
              
              if (j % 2 != 0){
                  //condition runs when column number is odd
                  
                  int current = stepOne.getElement(i,j);
                  //retreiving step one matrix element
                  
                  stepTwo.setElement(i, x, current);
                  x++;
                  //placing element in new column position
                  
          }
        }
      }
      
      return stepTwo;
      //returning the converted matrix

  }

}
