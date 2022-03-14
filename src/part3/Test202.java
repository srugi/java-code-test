package part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통원소 구하기
// 입력받은 배열은 정렬되어 있지 않다.
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
