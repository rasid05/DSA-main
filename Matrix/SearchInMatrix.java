public class SearchInMatrix {

    public static boolean Search(int a[][], int key) {

        // Solution 1 : Using 2 for loop - O(n^2)
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j] == key)
//                    return true;
//            }
//        }
//        return false;

        // Solution 2
        int temp = -1;
        for (int i = 0; i < a.length; i++) {
            if (key < a[i][0])
                break;
            temp++;
        }
        if (temp == -1)
            return false;
        for (int i = 0; i < a[0].length; i++) {
            if (key == a[temp][i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        int target = 67;
        System.out.println(Search(a, target));
    }
}
