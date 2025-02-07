package chap_02;

public class P_Quiz_02 {
    public static void main(String[] args) {
        int height = 121;
        String result = (height > 120) ? "탑승 가능합니다" : "탑승 불가능합니다.";
        System.out.println("키가" + height + "cm 이므로" + result +"\n");

        int amen = 1;
        String _00result =  (amen < 100) ? ("0+1=100") : ("100-1=0") ;

        String _01result =  (amen > 100) ? ("0+1=100") : ("100-1=0") ;

        System.out.print("하나님이 나와 함께 계셔주신다면 " + _00result + "이고 ");
        System.out.println("그렇지 않다면");
        System.out.println("즉 하나님이 나와 함께 계셔주시지 않는다면 " + _01result +" 이다.");

    }

}
