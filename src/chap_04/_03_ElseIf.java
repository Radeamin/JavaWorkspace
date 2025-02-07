package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIF

        //한라봉 에이드가 있다면 +1
        //또는 망고 주스가 있가면 +1
        //또는 아이스 아메리카노 +1

        boolean hallabongAde = true;
        boolean mangoJuice = false;
        // 한라봉 // 망고 주스
//한라봉 에이드 있으면 한라봉 에이드 줘 근데 없으면 망고 주스 + 1줘
        if (hallabongAde) {
            System.out.println("한라봉 에이드 + 1");
        }else if(mangoJuice) {
            System.out.println("망고 주스 + 1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //else if는 여러번 수행 가능

        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 + 1");
        }else if(mangoJuice) {
            System.out.println("망고 주스 + 1");
        }else if (orangeJuice){
            System.out.println("오렌지 주스 +1");
        }else  {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else는 없어도 수행 가능
        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallabongAde) {
            System.out.println("한라봉 에이드");
        }else if(mangoJuice) {
            System.out.println("망고 주스 + 1");
        }else if (orangeJuice){
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("커피 주문 완료 #3");
        //필요 없는 경우에도  else 를 쓰지 않아도 된다.
    }

}
