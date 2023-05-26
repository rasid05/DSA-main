class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {1,4,6,4};
        int n = arr.length;
        for(int i =0;i < arr.length; i++){
            for(int j = i;j < arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }System.out.println();
            }
        }
        
        // Total Subarray : Sum of n
        System.out.print(n*(n+1)/2);
    }
}
