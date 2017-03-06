/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixconverter;

/**
 *
 * @author susan
 */
class Matrix {
    static final int MAX_VALUE = 999; // maximum element value

  private int[][] elements; // two-dimensional array of elements
  private int rowsNum, columnsNum; // numbers of rows and columns

  /*
   * =========================================================================
   *  Method Matrix(): constructor, initializes the matrix with numbers of 
   *    rows and columns.
   *
   *  Input  : int rows -- the number of rows
   *           int columns -- the number of columns
   * =========================================================================
   */

  public Matrix(int rows, int columns) {

    if (rows > 0 && columns > 0) {
      this.rowsNum = rows;
      this.columnsNum = columns;
      // initialize the two-dimensional array
      this.elements = new int[this.rowsNum][];
      for (int i = 0; i < this.rowsNum; i++) {
        this.elements[i] = new int[this.columnsNum];
      }
    }
    else {
      this.rowsNum = -1;
      this.columnsNum = -1;
      System.err.println("Numbers of rows and columns illegal!");
    }

  }

  /*
   * =========================================================================
   *  Method getRowsNum(): returns the number of rows.
   *
   *  Output : int -- the number of rows
   * =========================================================================
   */

  public int getRowsNum() {
    return this.rowsNum;
  }

  /*
   * =========================================================================
   *  Method getColumnsNum(): returns the number of columns.
   *
   *  Output : int -- the number of columns
   * =========================================================================
   */

  public int getColumnsNum() {
    return this.columnsNum;
  }

  /*
   * =========================================================================
   *  Method inBounds(): checks if the indices are in bounds.
   *
   *  Input  : int row -- the row index
   *         : int column -- the column index
   *  Output : Boolean -- if the indices are in bounds
   * =========================================================================
   */

  public Boolean inBounds(int row, int column) {
    return (0 <= row && row < this.rowsNum && 
      0 <= column && column < this.columnsNum);
  }

  /*
   * =========================================================================
   *  Method inBounds(): checks if the value is in range.
   *
   *  Input  : int value -- the value
   *  Output : Boolean -- if the the value is in range
   * =========================================================================
   */

  public static Boolean inValueRange(int value) {
    return (0 <= value && value <= MAX_VALUE);
  }

  /*
   * =========================================================================
   *  Method getElement(): returns the value of the given position.
   *
   *  Input  : int row -- the row index
   *         : int column -- the column index
   *  Output : int -- the value of the given position
   * =========================================================================
   */

  public int getElement(int row, int column) {

    if (inBounds(row, column)) {
      return this.elements[row][column];
    }
    else {
      System.err.println("Indices out of bounds!");
      return 0;
    }

  }

  /*
   * =========================================================================
   *  Method setElement(): assigns the value to the given position.
   *
   *  Input  : int row -- the row index
   *         : int column -- the column index
   *         : int value -- the value
   * =========================================================================
   */

  public void setElement(int row, int column, int value) {

    if (inBounds(row, column)) {
      if (inValueRange(value)) {
        this.elements[row][column] = value;
      }
      else {
        System.err.println("Value out of range!");
      }
    }
    else {
      System.err.println("Indices out of bounds!");
    }

  }

  /*
   * =========================================================================
   *  Method print(): outputs the matrix.
   * =========================================================================
   */

  public void print() {

    for (int i = 0; i < this.rowsNum; i++){
      for (int j = 0; j < this.columnsNum; j++){
        System.out.printf("%4d", this.elements[i][j]);
      }
      System.out.println();
    }

  }
}
