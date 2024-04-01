public class Q18_RhombusPattern {

    /*

    Rhombus Pattern

         *****
        *****
       *****
      *****
     *****
      *****
       *****
        *****
         *****

     */

    public static void main(String[] args) {
        int rows = 5;
        // Upper half
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
