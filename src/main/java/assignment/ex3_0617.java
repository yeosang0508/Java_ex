package assignment;

public class ex3_0617 {
    public static void main(String[] args) {
        // 예시 시작
        int c = 20 + Math2.더하기(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math2.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2= Math2.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}
class Math2 {
    static int 더하기(int a, int b) {
        int c = a + b;
        return c;
    }

    static int oneToSum(int n){
        int sum = 0;

        for(int i = 1; i <= n ; i++){
            sum += i;
        }
        return sum;
    }
}