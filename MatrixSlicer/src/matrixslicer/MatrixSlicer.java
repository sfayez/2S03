/*
Susan Fayez
001404420
fayezs

November 7, 2016

This is a program that generates a matrix from user input row and column numbers then outputs row,
column, and diagonal slices based on user input row and column indices
 */
package matrixslicer;

import java.util.Scanner;
import java.util.Arrays;

class MatrixSlicer {
 public static void main(String args[]) {

    int rows, columns, row, column;
    Matrix input;
    Scanner keyboard = new Scanner(System.in); // Input scanner.

    // Print welcome message.

    System.out.println("Welcome to The Matrix Slicer");
    System.out.println("----------------------------");

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

    // Prompt user for input.

    System.out.print("Please input the row index (starting from 0): ");
    row = keyboard.nextInt();
    System.out.print("Please input the column index (starting from 0): ");
    column = keyboard.nextInt();

    // Print the lines

    System.out.println("The row slice:");
    System.out.println(Arrays.toString(getRow(input, row)));
    System.out.println("The column slice:");
    System.out.println(Arrays.toString(getColumn(input, column)));
    System.out.println("The diagonal slice:");
    System.out.println(Arrays.toString(getDiagonal(input, row, column)));

  }
  /*
   * =========================================================================
   *  Method getRow(): gets the row of the index.
   *
   *  Input  : Matrix matrix -- the matrix
   *           int row -- the row index
   *  Output : int[] -- the row
   * =========================================================================
   */

  public static int[] getRow(Matrix matrix, int row) {
      //initializing the getRow method
      
      int rowSize = matrix.getColumnsNum();
      //storing the size of the rows in the matrix
      
      int[] outRow = new int[rowSize];
      //intializing the output array
      
      for(int i = 0; i < rowSize; i++){
          //for loop to go through the row
          
          int current = matrix.getElement(row, i);
          outRow[i] = current;
          //getting each element of the row and storing it in the matrix
      }
      
      return outRow;
      //returing the row slice array
  }

  /*
   * =========================================================================
   *  Method getColumn(): gets the column of the index.
   *
   *  Input  : Matrix matrix -- the matrix
   *         : int column -- the column index
   *  Output : int[] -- the column
   * =========================================================================
   */

  public static int[] getColumn(Matrix matrix, int column) {
      //initializing the getColumn method
      
      int columnSize = matrix.getRowsNum();
      //storing the column size as a variable
      
      int[] outColumn = new int[columnSize];
      //initializing the column slice array
      
      for(int i = 0; i < columnSize; i++){
          //for loop that goes through the columns of the matrix
          
          int current = matrix.getElement(i, column);
          outColumn[i] = current;
          //getting the column element and storing it in the slice array
      }
      
      return outColumn;
      //returing the slice array
  }

  /*
   * =========================================================================
   *  Method getDiagonal(): gets the diagonal that contains the element of the 
   *    position specified by the indices.
   *
   *  Input  : Matrix matrix -- the matrix
   *         : int row -- the row index
   *         : int column -- the column index
   *  Output : int[] -- the diagonal
   * =========================================================================
   */

  public static int[] getDiagonal(Matrix matrix, int row, int column) {
      //initializing the getDiagonal method
      
      int columnsNum = matrix.getColumnsNum();
      int rowsNum = matrix.getRowsNum();
      //creating variables to store the column and row size of the original matrix
      
      if (rowsNum < columnsNum){
          //condition to use rowsNum as  the diagonal slice size if it is the smaller number
          //to minimize potential empty space in the array
          
          int[] outDiag = new int[rowsNum];
          //initializing the diagonal slice array
          
           while(row > 0 && column > 0){
          row--;
          column--;
          
      }
           //while loop to start the row and column indices at the first diagonal element 
      
      try{
          //try catch to avoid array index out of bounds errors
          
          if (rowsNum < columnsNum){
              
              for(int i = 0; i < rowsNum; i++){
              //using rowsNum if it is smaller to minimize the chance of array index out of bounds
                  
                  int current = matrix.getElement(row, column);
                  if(current == 0 && (row != 0 && column != 0)){
                      return outDiag;
                  }
                  else{
                       outDiag[i] = current;
                       row++;
                       column++;
                        //getting the current element and puting it into the diagonal slice array
                        //incrementing row and column indices
                  }
                 
              }
          }
          else{
              
              for(int i = 0; i < columnsNum; i++){
                  //using columnsNum if it is smaller or equal to rowsNum to minimize chance of array index out of bounds
                  
                  int current = matrix.getElement(row, column);
                  outDiag[i] = current;
                  row++;
                  column++;
                  //getting the current element and puting it into the diagonal slice array
                  //incrementing row and column indices
              }
          }
      }
      catch(ArrayIndexOutOfBoundsException e){
          
          return outDiag;
          //returning the diagonal slice array if array out of bounds error is reached in the try statement
      }
      return outDiag;
      //returning the diagonal slice array
      }
      else{
          
          int[] outDiag = new int[columnsNum];
          //using the columnsNum for the diagonal slice array size if columnsNum is smaller or equal to
          //rowsNum to minimize potential empty space in the array
          
           while(row > 0 && column > 0){
          row--;
          column--;
          
      }
           //while loop to start the row and column indices at the first diagonal element 
      
      try{
          //try catch to avoid array index out of bounds errors
          
          if (rowsNum < columnsNum){
              //using rowsNum if it is smaller to minimize the chance of array index out of bounds
              
              for(int i = 0; i < rowsNum; i++){
                  int current = matrix.getElement(row, column);
                  outDiag[i] = current;
                  row++;
                  column++;
              }
              //getting the current element and puting it into the diagonal slice array
              //incrementing row and column indices
          }
          else{
              for(int i = 0; i < columnsNum; i++){
                  //using columnsNum if it is smaller or equal to rowsNum to minimize chance of array index out of bounds
                  
                  int current = matrix.getElement(row, column);
                  outDiag[i] = current;
                  row++;
                  column++;
                  //getting the current element and puting it into the diagonal slice array
                  //incrementing row and column indices
              }
          }
      }
      catch(ArrayIndexOutOfBoundsException e){
          
          return outDiag;
          //returning the diagonal slice array if array out of bounds error is reached in the try statement
          
      }
      return outDiag;
      //returning the diagonal slice array
      }
      
     
  }

 

}
