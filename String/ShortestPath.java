public class ShortestPath {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String s = "WNEENESENNN";
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                x--;
            } else if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        System.out.print(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
}
