package part2;

import java.util.Scanner;

/* n개의 입력받은 점수의 등수 구하기 */
public class Test108 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] scoreArr = new int[size];
        for (int i = 0; i < size; i++) {
            scoreArr[i] = in.nextInt();
        }

        int[] rankArr = new int[size];
        for (int i = 0; i < size; i++) {
            int myScore = scoreArr[i];
            int myrank = 1;
            for (int score : scoreArr) {
                if (myScore < score) {
                    myrank++;
                }
            }
            rankArr[i] = myrank;
        }
        for (int x = 0; x < rankArr.length; x++) {
            System.out.print(rankArr[x] + " ");
        }
    }
}
