public class Q13_CrossPattern {

    /*
        Cross Pattern

         *     *
          *   *
           * *
            *
           * *
          *   *
         *     *

         */

    public static void main(String[] args) {
        int size = 7;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == i || j == size - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}


