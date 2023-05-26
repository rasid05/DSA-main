class PairsInArray {
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,8,44,55,67,89,234,678};
        for(int i = 0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+", "+arr[j]+") ");
            }System.out.println();
        }
        // total pairs
        int n = arr.length;
        int tp = (n*(n-1))/2;
        System.out.print(tp);
    }
}
