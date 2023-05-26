import java.util.*;
public class SubarryMaxSum {

    public static void main(String []args) {
        int arr[] = {4,1,-4,6,2, -1};
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
      
        // Using 2 Loop - o(n^2)
//         for(int i =0; i < arr.length; i++) {
//             int sum = 0;
//             for(int j = i; j < arr.length; j++) {
//                 sum+=arr[j];
//                 // System.out.println(sum);
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         System.out.print("Maximum Sum = "+maxi);
           
      
      // Kadane's Algo  -  O(N)
        int sum = 0;
        for(int i =0; i < arr.length; i++) {
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            maxi = Math.max(maxi, sum);
        }
      // It will give 0 for all negative number so don't forget to check it using a loop
        System.out.print("Maximum Sum = "+maxi);
    }
}
