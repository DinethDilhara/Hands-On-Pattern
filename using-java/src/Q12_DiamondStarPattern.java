public class Q12_DiamondStarPattern {

    /*
    Diamond Star Pattern

             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *
     */

    public static void main(String[] args) {
        int rows = 5;
        // Upper half
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
