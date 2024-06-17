package assignment;

public class ex2_0617 {
    public static void main(String[] args) {
        int 결과;

        결과 = 계산기2.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기2.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기2.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기2.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기2.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21
    }
}

class 계산기2 {

    static int 합(int n, int m) {
        return n + m;
    }
    static int 차(int n, int m) {
        return n - m;
    }
    static int 곱(int n, int m) {
        return n * m;
    }

}