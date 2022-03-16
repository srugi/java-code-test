package part3;

import java.util.Arrays;
import java.util.Scanner;

// 1. 두 배열 합치기
// 설명
// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

// 입력
// 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
// 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
// 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
// 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
// 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

// 출력
// 오름차순으로 정렬된 배열을 출력합니다.

// 예시 입력
// 3
// 1 3 5
// 5
// 2 3 6 7 9

// 예시 출력
// 1 2 3 3 5 6 7 9

public class Test201 {
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

        // solution
        int p_arrA = 0;
        int p_arrB = 0;
        int[] ans_arr = new int[arrA_len + arrB_len];
        int p_answer = 0;
        while (p_arrA < arrA_len || p_arrB < arrB_len) {
            if (p_arrA == arrA_len) {
                ans_arr[p_answer] = arrB[p_arrB];
                p_arrB++;
            } else if (p_arrB == arrB_len) {
                ans_arr[p_answer] = arrA[p_arrA];
                p_arrA++;
            } else if (arrA[p_arrA] > arrB[p_arrB]) {
                ans_arr[p_answer] = arrB[p_arrB];
                p_arrB++;
            } else {
                ans_arr[p_answer] = arrA[p_arrA];
                p_arrA++;
            }
            p_answer++;
        }
        for (int i : ans_arr) {
            System.out.print(i + " ");
        }
    }
}
