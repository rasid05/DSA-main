import java.util.Locale;

public class CapitalizeTitle {
    public static String capitalizeTitle(String title) {
        String ans = "";
        ans += Character.toUpperCase(title.charAt(0));
        int count = 0;
        for (int i = 1; i < title.length(); i++) {
            if(title.charAt(i-1)==' ')
                ans += Character.toUpperCase(title.charAt(i));
            else
                ans += Character.toLowerCase(title.charAt(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
    }
}
