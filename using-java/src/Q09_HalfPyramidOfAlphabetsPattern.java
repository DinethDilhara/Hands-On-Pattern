public class Q09_HalfPyramidOfAlphabetsPattern {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*

    Half Pyramid Of Alphabets Pattern

    A
    BB
    CCC
    DDDD
    EEEEE


     */


}
