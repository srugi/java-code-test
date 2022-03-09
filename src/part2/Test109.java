package part2;

import java.util.Scanner;

// 격자판 최대합 구하기
// 5
// 10 13 10 12 15
// 12 39 30 23 11
// 11 25 50 53 15
// 19 27 29 37 27
// 19 13 30 13 19
public class Test109 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < size; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < size; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            if (answer < sum1) {
                answer = sum1;
            }
            if (answer < sum2) {
                answer = sum2;
            }
        }
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][size - i - 1];
        }
        if (answer < sum1) {
            answer = sum1;
        }
        if (answer < sum2) {
            answer = sum2;
        }
        System.out.println(answer);
    }
}
