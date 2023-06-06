import java.util.ArrayList;

public class ConatinsMostWater {
    public static int maxArea(ArrayList<Integer> arr) {
        int ans = 0;
        int f = 0, l= arr.size()-1;
        while(f<l){
            int min_h = Math.min(arr.get(f),arr.get(l));
            if (min_h<0)
                min_h = -1*min_h;
            ans = Math.max(ans, min_h*(l-f));
            if (arr.get(f)<arr.get(l))
                f++;
            else
                l--;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(39);
        arr.add(56);
        arr.add(68);
        arr.add(5);

        System.out.println(maxArea(arr));
    }
}
