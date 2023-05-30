import java.util.Arrays;

public class StringCompression {

    public static String compression(String s) {

        String ans = "";
        ans += s.charAt(0);

        int count = 1;
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (count > 1)
                    ans += count;
                count = 1;
                ans += s.charAt(i);
            } else
                count++;
            i++;
        }
        if (count > 1)
            ans += count;
        return ans;
    }

    public static void main(String[] args) {
        String s = "xxxxx";
        System.out.println(compression(s));
    }
}
