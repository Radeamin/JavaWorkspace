package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //구구단
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i +" * "+ j +" = "+ i*j);
            }
                System.out.println();
        }

/*        for (int i = 2; i < 10; i++) {
            int j = 1;
            System.out.println(i + " * " + j + " = " + (i * j));
            j++;        // 2 * 1 = 2;
            System.out.println(i + " * " + j + " = " + (i * j));
            j++;        // 2 * 2 = 4;
            System.out.println(i + " * " + j + " = " + (i * j));
                        // 2 * 3 = 6;
            System.out.println();
        }*/
    }
}
