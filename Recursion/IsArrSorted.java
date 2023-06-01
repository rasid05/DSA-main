public class IsArrSorted {
    public static void main(String[] args) {
        int arr[]={4,5,6,8,8};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int i) {
        if(i== arr.length-1)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        return isSorted(arr,i+1);
    }
}
