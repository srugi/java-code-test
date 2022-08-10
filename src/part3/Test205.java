package part3;

import java.util.Scanner;

// 5. 연속된 자연수의 합
// 설명
// N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
// 만약 N=15이면
// 7+8=15
// 4+5+6=15
// 1+2+3+4+5=15
// 와 같이 총 3가지의 경우가 존재한다.

// 입력
// 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

// 출력
// 첫 줄에 총 경우수를 출력합니다.

// 예시 입력
// 15

// 예시 출력
// 3

public class Test205 {

    public void solution(int targetNum) {
        int answer = 0;
        // 내풀이 방법
        // int sum = 0;
        // int k = 0;
        // for (int i = 1; i <= (targetNum / 2); i++) {
        //     sum = 0;
        //     k = 0;
        //     while (sum < targetNum) {
        //         sum += (i + k);
        //         k++;
        //         // System.out.println(sum);
        //     }
        //     // System.out.println("===" + sum);
        //     if (sum == targetNum) {
        //         answer++;
        //     }
        // }
        // 강사님 풀이방법
        int cnt = 1;
        targetNum = targetNum -1;
        while(targetNum > 0) {
            cnt++;
            targetNum = targetNum - cnt;
            if (targetNum % cnt == 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int targetNum = in.nextInt();

        Test205 test = new Test205();
        test.solution(targetNum);
        return;
    }
}
