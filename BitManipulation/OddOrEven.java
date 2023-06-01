public class OddOrEven {
    public static void main(String[] args) {
        int a = 34;
        int bitMask = 1;
        if ((a & bitMask) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
