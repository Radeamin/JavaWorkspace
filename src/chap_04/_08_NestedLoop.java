package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        //별 (*) 사각형 만들기

        /*
           *****
           *****
           *****
           *****
           *****

         */
        for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
        System.out.println("------------");
//           * 5
//           ** 4
//           *** 3
//           **** 2
//           ***** 1
//        별 (*)왼쪽 삼각형 만들기
        char a = '*';
        for (int i = 0; i < 5 ; i++) {
           for (int j = 0; j < i+1; j++) {
               System.out.print("*");
            }
            System.out.println();
        }

        /*
             *
            **
           ***
          ****
         *****
        */
                /*0 5 1*/
                /*5 5 5*/

                /*1 4 2*/
                /*4 4 3*/

                /*2 3 3*/
                /*3 3 2*/

                /*3 4 4*/
                /*2 2 1*/
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}