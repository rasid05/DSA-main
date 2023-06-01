public class Basic {
    public static void main(String[] args) {
        // https://stackoverflow.com/questions/4904052/what-does-this-symbol-mean-in-intellij-red-circle-on-bottom-left-corner-of-fil


        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6); // Different = 1  , Same = 0

        System.out.println(~5);
        System.out.println(~0);

        System.out.println(5 << 2); // Left shift << : 101 --> 10100
        // a << b -> a * (2 ^ b)
        System.out.println(5 >> 2); // Right shift >> : 101 --> 1
        // a >> b -> a / (2 ^ b)


    }
}
