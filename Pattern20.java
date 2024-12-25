// 1
// 1 2
// 1   3
// 1     4
// 1 2 3 4 5


public class Pattern20 {
   public static void main(String[] args) {
      for (int i = 1; i <6; i++) {
         for (int j = 1; j <=i; j++) {
            if (i==5||j==1||j==i) {
               System.out.print(j+" ");
               
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }
}
