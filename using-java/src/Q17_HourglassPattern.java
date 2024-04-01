public class Q17_HourglassPattern {

    /*
    Hourglass Pattern

        *********
         *******
          *****
           ***
            *
           ***
          *****
         *******
        *********

     */

    public static void main(String[] args) {
        int rows = 5;
        // Upper half
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 2; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
