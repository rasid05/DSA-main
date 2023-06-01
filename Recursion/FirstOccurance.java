import java.util.Scanner;

class FirstOccurance {
    public static void main(String args[]) {
        int array[] = {3, 4, 2, 4, 3, 1, 2, 3, 1, 3, 7, 8};
        System.out.print(isExist(array, 8));
    }

    private static int isExist(int[] array, int i) {
        int find = exist(array, i, 0);
        return find;
    }

    private static int exist(int[] array, int i, int n) {
        if (n == array.length)
            return -1;
        if (array[n] == i)
            return n;
        return exist(array, i, n + 1);
    }
}