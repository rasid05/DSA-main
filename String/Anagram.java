import java.util.Arrays;

public class Anagram {
    public static String isAnagram(String a,String b)
    {
        char a1[] = a.toCharArray();
        char a2[] = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1,a2))
            return "Yes";
        return "No";
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("latin","tinla"));
        System.out.println(isAnagram("latin","martin"));
    }
}
