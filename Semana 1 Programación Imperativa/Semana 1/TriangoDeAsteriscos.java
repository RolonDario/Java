public class TriangoDeAsteriscos {
    public static void main(String args[]) {
        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                System.out.println("*");
            } else if (i == 2) {
                System.out.println("**");
            } else if (i == 3) {
                System.out.println("***");
            } else {
                System.out.println("****");
            }
        }
    }
}
