public class StringBuilder {
    public static void main(String[] args) {

        // Supposes we need add 1 to 10 in a string one by one

//        String str="";
//        for (int i =1;i<11;i++)
//            str += i;
//        System.out.println(str);

        // We all know String is immutable
        // So here in every iteration compiler create new location and paste all value to that
        // Time complexity practically become O(n^2)



        // So We use string builder
        // It is not actually a string type but using .toSting() we can change it to string
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (char ch = 'a';ch<='z';ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
