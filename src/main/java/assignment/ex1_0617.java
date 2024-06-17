package assignment;

public class ex1_0617 {
    public static void main(String[] args) {
        계산기1.더한결과를_화면에_출력(10, 20);
        // 출력 => 결과 : 30

        계산기1.더한결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 70

        계산기1.뺀결과를_화면에_출력(50, 20);
        // 출력 => 결과 : 30

        계산기1.뺀결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 3

        계산기1.곱한결과를_화면에_출력(5, 2);
        // 출력 => 결과 : 10
    }
}

class 계산기1 {
    static void 더한결과를_화면에_출력(int n, int m) {
        System.out.println(n + m);
    }

    static void 뺀결과를_화면에_출력(int n, int m) {
        System.out.println(n - m);
    }

    static void 곱한결과를_화면에_출력(int n, int m) {
        System.out.println(n * m);
    }

}
