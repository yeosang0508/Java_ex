package org.example;

public class Ex3 {
    public static void main(String[] args){
        int n = 10;

        for(int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//i가 1일 때 j가 1 조건은 <n이므로 1부터 9까지 9번 빈칸 출력
//
//j가 1이고 조건은 1개만 * 출력
//println 줄바꿈 실행
//
//i가 2일 때 j가 2인 조건으로 2부터 9까지 8번 빈칸 출력
//조건은 3개만 * 출력
//
//이렇게 10번 반복한다.
//
//
//i가 n-1로 9이고 조건은 1보다 크거나 같을 때까지 작은 for문으로 넘어가서 j가 10이고, 조건은 j > i로
//10부터 9까지 1번 print 할수있기에 " " 빈칸 한번 출력
//
//아래 j가 1이고 j는 17보다 작거나 같을 때까지 17번 * 를 출력 한다.