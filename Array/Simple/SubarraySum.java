public class SubarraySum {

    public static void main(String []args) {
        System.out.println("Hello, World!");
        int arr[] = {1,4,6,4};
        int n = arr.length;
      
        // Using 3 Loops
        // for(int i =0; i < arr.length; i++) {
        //     for(int j = i; j < arr.length; j++) {
        //         int sum = 0;
        //         for(int k=i; k<=j; k++) {
        //             sum+=arr[k];
        //         }
        //         System.out.println(sum);
        //     }
        // }

        // Using 2 loops
        for(int i =0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum+=arr[j];
                System.out.println(sum);
            }
        }
    }
}
