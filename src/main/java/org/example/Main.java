package org.example;

public class Main {
    public static void main(String[] args) {
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
        int dan = 8;
        int i = 1;

        System.out.println("=== While 문 ===");

        while(i <= 1000){
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }

        System.out.println();

        System.out.println("=== for문 ===");

        for(int k =1; k <= 1000; k++) {
            System.out.println(dan + " * " + k + " = " + dan * k);
        }



        // 1부터 5까지의 합을 더한 결과를 출력해주세요.
        int a = 1;
        int sum = 0;

        System.out.println("=== While 문 ===");
        while(a <= 5){
            System.out.println(a);
            sum += a;
            a++;
        }
            System.out.println("sum : " + sum);


        System.out.println();

        System.out.println("=== for문 ===");

        int sum1 = 0;

        for(int b = 1; b <= 5; b++){
            System.out.println(b);
            sum1 += b;
        }
        System.out.println("sum1 : " + sum1);
    }
}
