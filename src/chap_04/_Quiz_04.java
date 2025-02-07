package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //조건문 활용 주차 요금 정산 프로그램 작성
        //조건: 주차요금 시간당 4000원 (일일 최대 요금은 30000원)
        //경차 또는 장애인 차량은 최종요금에서 50% 할인

        //예시
        //일반차량 5시간 주차 시 20000원
        //경차 5시간 주차 시 10000원
        //장애인 차량 주차시 15000원
        
        int _carFee = 4000; //시간당 4천원
        int _01_normalCF = 20000; //  일반 차량 5시간 주차요금(4천원 곱하기 5)
        int _02_compactCF = 10000; //  경차 5시간 주차 요금 최종 요금에서 50%할인된 금액
                                   //  4천원 곱하기 5 해서 2만원인데 최종요금에서 50퍼센트 할인 따라서 1만원
        int _03_handicappedCF; // 장애인 차량 5시간 주차 요금 최종 요금에서 50%할인된 금액
                                       // 4천원 곱하기 10을 해서 40000원인데 일일 최대 요금이 30000원이어서 50퍼센트 할인한 1만 5천원
        int maxCF = 30000; //최대치 하루 주차요금

        if(_carFee*5 == _01_normalCF){
            System.out.println("일반 차량 주차 요금은 "+ _01_normalCF +"원 입니다.");
        }
        if((_carFee*5*0.5) ==_02_compactCF){
            System.out.println("경차 주차 요금은 " + _02_compactCF +"원 입니다.");
        }

        if((_carFee*10>30000) == true){
            _03_handicappedCF = (int)(30000 * 0.5);
            System.out.println("장애인 차량 주차요금은 "+ _03_handicappedCF + "원 입니다.");
        }
    }
}
