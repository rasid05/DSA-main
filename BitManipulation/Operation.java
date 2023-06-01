public class Operation {
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((bitMask & n) == 0)
            return 0;
        else
            return 1;
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return bitMask | n;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return bitMask & n;
    }

    public static int updateIthBit(int n, int i, int newBit){
//        if(newBit==0)
//            return clearIthBit(n,i);
//        else
//            return setIthBit(n,i);

        n = clearIthBit(n,i);
        int bitMask = newBit << i;
        return bitMask | n;
    }

    public static int clearIBits(int n, int i){
        int bitMask = (~0) << i;
        return bitMask & n;
    }
    public static void main(String[] args) {
        // Get Bit
        System.out.println(getIthBit(15,2));
        System.out.println(getIthBit(10,2));

        // Set Bit
        System.out.println(setIthBit(5,1));

        // Clear BIt
        System.out.println(clearIthBit(14, 2));

        // Update Bit
        System.out.println(updateIthBit(10,2,1));

        // Clear last i digit
        System.out.println(clearIBits(15,2));
    }
}
