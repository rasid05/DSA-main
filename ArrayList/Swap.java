import java.util.ArrayList;
import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(34);
        arr.add(39);
        arr.add(56);
        arr.add(68);
        arr.add(5);

        System.out.println(arr);
//        swap(arr,2,4); //In build method to swap
        swaping(arr,2,4);
        System.out.println(arr);
    }
    private static void swaping(ArrayList<Integer> arr, int i, int i1) {
        int temp = arr.get(i);
        arr.set(i, arr.get(i1));
        arr.set(i1, temp);
    }
}
