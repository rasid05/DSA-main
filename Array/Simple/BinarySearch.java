class BinarySearch {
    public static int bs(int arr[], int key){
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid] < key){
                start = mid + 1;
                
            }else{
               end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,8,44,55,67,89,234,678};
        int key = 678;
        int ans = bs(arr, key);
        if(ans == -1){
            System.out.println("Not Available");
        }else{
            System.out.println("Element found at index "+ans+" which is "+arr[ans]);
        }
    }
}
