public class Q07_AlphabeticPattern {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    /*

    Alphabetic Pattern

    A
    AB
    ABC
    ABCD
    ABCDE



     */
}
