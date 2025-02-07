package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 121, y = 115, z = 120;

        int _pass_01 = (x > z) ? x : z;

        int _pass_02 = (z > y) ? y : z;

        String ride = "cm 이므로 탑승 가능합니다.";
        String noneRide = "cm 이므로 탑승 불가능합니다";

        System.out.println("키가 " + _pass_02 + noneRide);
        System.out.println("키가 " + _pass_01 + ride);

        int height = 115;
//        String result = (조건) ? (참) : (거짓);
        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로" + result);
    }
}
