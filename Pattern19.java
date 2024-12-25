
// *  
// * * 
// *   *
// *     *
// * * * * *

public class Pattern19 {
   public static void main(String[] args) {
      int n = 5; // Number of rows
        
      for (int i = 1; i <= n; i++) { // Outer loop for rows
          for (int j = 1; j <= i; j++) { // Inner loop for columns
              // Print '*' for the first or last column in the row
              // or for the last row (when i == n)
              if (j == 1 || j == i || i == n) {
                  System.out.print("* ");
              } else {
                  System.out.print("  "); // Print space for other positions
              }
          }
          System.out.println(); // Move to the next line
      }
   }
}
