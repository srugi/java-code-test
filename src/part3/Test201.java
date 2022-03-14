package part3;

import java.util.Arrays;
import java.util.Scanner;

public class Test201 {
    // 입력받은 배열은 기본적으로 오름차순 정렬되어 있다.
    // 입력받은 두 배열을 하나의 배열로 만들어라
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
