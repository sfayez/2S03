/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author susan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
  {
    int [] num = new int[5];
    
    System.out.println(num.length);
    
  }
  public static int f (int n){
    if ( n == 1 ){
      int num = 0;
      System.out.println(num);
      return num;
    }
    else{
      int num = 1 + f(n/2);
      System.out.println(num);
      return num;
      
    }
  }
    
}
