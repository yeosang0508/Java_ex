package org.example;

public class Ex1 {
    public static void main(String[] args) {
// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용
        System.out.println("=== While 문 ===");
        int i = 1;

        while(i <= 10){
            int j = 1;
            while(j <= 3){
                System.out.println(j);
                j++;
            }
            i++;
        }
        System.out.println();
        System.out.println("=== for 문 ===");

        for(int a = 1; a <= 10; a++){
            for(int b = 1; b <= 3; b++){
                System.out.println(b);
            }
        }
    }
}
