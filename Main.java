 import java.util.Scanner;  //we need to import the class from the java.util package.
 import java.io.*;// so we can read in files

// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) {
    System.out.println("main");
    double[][] array = {{1, 0, 0},{1, 0, 0},{1, 0, 0}, {1, 0, 0}};
    int rows = 4;  // double checked this
    int cols = 3;  // double checked this
    
    // prints 2d array
    // we've double checked this and think it works
    System.out.println("print array");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("print array done");
    System.out.println("");
    
    // loops through rows 
    double sum = 0;
    for (int i = 0; i < rows; i++) {
      // loops through columns 
      for (int j = 0; j < cols; j++) {
        //System.out.println("i " + i + " j " + j);
        sum += array[i][j]; // fixed this line; same as above where it works
        System.out.print("i: " + i + " j: " + j + " rows: " + rows + " cols: " + cols);
      }
      System.out.printf("sum : %.2f\n", sum);
      sum = sum / cols;
      System.out.printf("average of row: %.2f\n", sum);
      sum = 0;
    }
     

  }
} // class Main
