public class Q20_PascalTriangle {
    public static void main(String[] args) {
        int numRows = 7;
        int[][] pascal = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1; // First element of each row is always 1
            pascal[i][i] = 1; // Last element of each row is always 1


            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            for (int k = numRows; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*

 Q20_PascalTriangle

           1
          1 1
         1 2 1
        1 3 3 1
       1 4 6 4 1
      1 5 10 10 5 1
     1 6 15 20 15 6 1

 */

