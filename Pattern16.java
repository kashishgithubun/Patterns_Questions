// a
// bc
// def
// ghij
// klmno

public class Pattern16 {
   public static void main(String[] args) {
      int k=97;
      for (int i = 1; i <6; i++) {
         for (int j = 1; j <=i; j++) {
            System.out.print((char)k);
            k++;
         }
         System.out.println();
      }
   }
}
