import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
      // It is only possible for a N*N matrix
      
      
        int a[][] = {
            {5,4,3,2},
            {4,5,7,3},
            {4,5,7,3},
            {4,5,7,3}
            };
      
      // O(N^2)
//         int sum = 0;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 if (i == j)
//                     sum += a[i][j];
//                 else if (i + j == a[i].length - 1)
//                     sum += a[i][j];
//             }
//         }
      
      
      int sum = 0;
      for (int i = 0; i < a.length; i++) {
      sum += a[i][i];
        // In case of odd value of n , Middle element apper in both diagonal so to avoid adding it twice we use this if condition 
      if (i != a.length - 1 - i) 
          sum += a[i][a.length - 1 - i];
      }
      
     
      
      
        System.out.print(sum);
    }
}
