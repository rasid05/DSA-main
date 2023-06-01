import java.util.Scanner;

class LastOccurrence {
    private static int isExist(int[] array, int i) {
        int find = exist(array, i, 0);
        return find;
    }

    private static int exist(int[] array, int i, int n) {
        if (n == array.length)
            return -1;
        int isFound = exist(array, i, n + 1);
        if (isFound == -1 && array[n] == i)
            return n;
        return isFound;
    }
    public static void main(String args[]) {

        // Write code here
        int array[] = {3, 4, 2, 4, 3, 1, 2, 3, 1, 3, 7, 8};
        System.out.print(isExist(array, 3));
    }
}