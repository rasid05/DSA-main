import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(39);
        arr.add(56);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(4);
        arr1.add(3);

        a.add(arr);
        a.add(arr1);

        System.out.println(a);
    }
}
