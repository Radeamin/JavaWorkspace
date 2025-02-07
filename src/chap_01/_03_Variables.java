package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        int hour = 15;

        name="나도코딩";


        System.out.println(name+ "나도코딩님, 배송이 시작됩니다. "+ hour + "15시에방문 예정입니다.");
        System.out.println(name+ "님, 나도코딩님, 배송이 완료되었습니다.");

        double score= 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name+ "님의 평균 점수는 " + score+ "점수 입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;

        System.out.println(d);
        System.out.println(f);

        Long l = 1000000000000000L;
        l = 1_000_000_000_000_000L;
        System.out.println(l);

     /*   int, long, float, double, char, String, boolean*/
    }
}
