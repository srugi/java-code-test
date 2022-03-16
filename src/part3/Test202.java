package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 2. 공통원소 구하기
// 설명
// A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

// 입력
// 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
// 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
// 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
// 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
// 각 집합의 원소는 1,000,000,000이하의 자연수입니다.

// 출력
// 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

// 예시 입력
// 5
// 1 3 9 5 2
// 5
// 3 2 5 7 8

// 예시 출력
// 2 3 5

public class Test202 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrA_len = in.nextInt();
        int[] arrA = new int[arrA_len];
        for (int i = 0; i < arrA_len; i++) {
            arrA[i] = in.nextInt();
        }
        int arrB_len = in.nextInt();
        int[] arrB = new int[arrB_len];
        for (int i = 0; i < arrB_len; i++) {
            arrB[i] = in.nextInt();
        }

        // 배열 A 오름차순 정렬하기
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        // 공통원소 구하기
        int p_arrA = 0;
        int p_arrB = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        while (p_arrA < arrA_len && p_arrB < arrB_len) {
            if (arrA[p_arrA] == arrB[p_arrB]) {
                answer.add(arrA[p_arrA]);
                p_arrA++;
                p_arrB++;
            } else if (arrA[p_arrA] < arrB[p_arrB]) {
                p_arrA++;
            } else {
                p_arrB++;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
