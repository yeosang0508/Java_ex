package org.example;

public class Ex2 {
    public static void main(String[] args) {
        int n = 6;

        for(int k = 0; k <= n; k++){
            for(int i = 0; i <= k; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// i가 1일때 k 가 i값 까지 출력이므로 (i 1증가) *가 한번 출력,  작은 for문을 나오게 된 뒤 println으로 줄바꿈 발생 큰 for문으로 이동
// i가 2일 때 (i 1증가) k가 i값까지 출력이므로 k가 1일때  *가 한번 출력, k가 1 증가하고 * 한번 더 출력되는데,
// print로 쓰여져 줄바꿈은 일어나지 않는다. 이렇게 i가 rows 값까지 출력이고 rows값이 5이므로
// *가 위에서부터 한개부터 다섯개까지 출력되는 것을 볼 수 있다.
