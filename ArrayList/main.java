import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(34);
        arr.add(39);
        arr.add(56);
        arr.add(68);
        arr.add(5);
        System.out.println(arr);

        System.out.println(arr.get(4));
        System.out.println(arr.get(0));
//        System.out.println(arr.get(10)); // error

        arr.remove(3);
        System.out.println(arr);

        arr.set(1,55);
        System.out.println(arr);

        System.out.println(arr.contains(34));
        System.out.println(arr.contains(3));

        // Reverse
        for (int i = arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }


    }
}
