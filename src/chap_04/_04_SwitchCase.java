package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        // 1등: 전액 장학금
        // 2등: 반액 장학금
        // 3등: 반액 장학금
        //그 외: 장학금 대상 아님
        
        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking = 4; //1등
        if(ranking == 1) {
            System.out.println("전액 장학금");
        }else if (ranking == 2 || ranking ==3) {
            System.out.println("반액 장학금");
        }
            else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 4;
        switch ( ranking ){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
              /*각각의 경우에 해당하지 않는 그 외의 경우를 디폴트라는 구문이 수행됨*/
        }
        System.out.println("조회 완료 #2");

        //case 2와 3을 통합
        ranking = 2;
        switch ( ranking ){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
            // break; 이거 없으면 3번까지 수행됨
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                /*각각의 경우에 해당하지 않는 그 외의 경우를 디폴트라는 구문이 수행됨*/
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정(1급: 최상 ,4급 : 최하)
        int grade = 3 ;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 " + price + "원");
        // 1등급 제품의 가격 : 10000원
        // 2등급 제품의 가격 : 9000원

        int score = 95;
        if (score >= 90)
            System.out.println("A");
        else if (score >=80)
            System.out.println("B");
    }
}
