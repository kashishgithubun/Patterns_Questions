//         1
//       1 1
//     1 * 1
//   1 * * 1
// 1 1 1 1 1


public class Pattern22 {
   public static void main(String[] args) {
      for (int i = 1; i <=5; i++) {
         for (int j = 5; j > i; j--) {
            System.out.print("  ");
         }
         
         for (int j = 1; j <=i; j++) {
            if (j==1||j==i||i==5) {
               int k=1;
               System.out.print(k+" ");
               
            } else {
               System.out.print("* ");
            }
         }
         System.out.println();

      }
   }
}
