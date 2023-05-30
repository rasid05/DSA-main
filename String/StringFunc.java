import java.util.ArrayList;

public class StringFunc {
    public static void main(String[] args) {

        // Comparison
//        String s1 = "Hello";
//        String s2 = new String("Hello");
//        String s3 = "Hello";
//        System.out.println("s1 == s2: " + (s1 == s2)); // false
//        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
//        System.out.println("s1 == s3: " + (s1 == s3)); // true
//        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true

        // Substring
//        String s = "HelloWorld";
//        System.out.println(s.substring(3,5));
//        System.out.println(s.substring(0,3));


        // compareTo()
        // It checks 2 string if equal then it returns 0
        //                 or if 1st one is < 2nd one then it return -1
        //                 or return 1
//        ArrayList<String> s = new ArrayList<>();
//        s.add("mango");
//        s.add("guava");
//        s.add("Grapes");
//        s.add("banana");
//        String ans = s.get(0);
//        for (int i =1;i<s.size();i++){
//            if (ans.compareTo(s.get(i)) < 0)
//                ans = s.get(i);
//        }
//        System.out.println(ans);


        // Uppercase Lowercase Ignore case
//        System.out.println("apple" == "Apple");
//        System.out.println("apple".equals("Apple"));
//        System.out.println("apple".equalsIgnoreCase("Apple"));

        // replace
        System.out.println("College".replace('l','r'));

    }
}
