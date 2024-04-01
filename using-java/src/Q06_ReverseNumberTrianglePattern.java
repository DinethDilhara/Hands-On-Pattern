public class Q06_ReverseNumberTrianglePattern {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


/*
       Reverse Number Triangle Pattern

        12345
        1234
        123
        12
        1

        */

}
