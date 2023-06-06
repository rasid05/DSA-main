import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(39);
        arr.add(56);
        arr.add(68);
        arr.add(5);
//        Collections.sort(arr); // Ascending Order
        Collections.sort(arr, Collections.reverseOrder()); // Descending order
        System.out.println(arr);
    }
}
