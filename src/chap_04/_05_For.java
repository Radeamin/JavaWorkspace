package chap_04;

public class _05_For {

    public static void main(String[] args) {
        //반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        //또 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 코나입니다.");
        System.out.println("어서오세요. 코나입니다.");
        System.out.println("어서오세요. 코나입니다.");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        //매장 이름이 바뀜
        //. 나코 -> 코나
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");

        System.out.println("----반복문 사용----");
        // 반복문 사용 for.
        for (int i = 0; i < 10; i++) {
           // System.out.println("어서오세요 나코입니다. " + i);
           // System.out.println("환영합니다. 나코입니다. " + i);
            System.out.println("환영합니다. 코나입니다." + i);
        }

        //짝수만 출력 (for i만 적고 엔터)
        // 0. 2. 4 .6 .8
        System.out.println("짝수만 출력");
        for (int i = 0; i < 10; i+=2){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("홀수만 출력");
        for ( int i=1; i < 10; i+=2){
            System.out.print(i + " ");
        }
    int warrant = 10;
        System.out.println(warrant++); //10
        System.out.println(warrant++); //11
        System.out.println(warrant++); //12
        System.out.println(warrant++); //13
        System.out.println(warrant++); //14
        System.out.println(" ");

        System.out.println("5부터 1까지 내림차순");

        for (int i = 5; i > 0; i--) {
            System.out.print(i);
         }

        System.out.println();

        //1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum +=i;
            /*System.out.println("현재까지 총합은 " + sum + "입니다.");*/
         }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
