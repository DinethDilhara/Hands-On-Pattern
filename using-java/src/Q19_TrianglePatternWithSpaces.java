public class Q19_TrianglePatternWithSpaces {

    /*
    Triangle Pattern With Spaces

            1
           212
          32123
         4321234
        543212345

     */

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in  order
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print numbers in ascending order
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
