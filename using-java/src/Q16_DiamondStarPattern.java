public class Q16_DiamondStarPattern {

    /*

    Diamond Star Pattern

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */

    public static void main(String[] args) {
        int size = 6; // Number of rows for the upper part of the pattern

        // Upper part
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
