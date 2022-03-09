package part1;

import java.util.Scanner;

// 문자열 거꾸로 출력하기
public class Test006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] checkArr = new int[str.length()];

        char[] charArr = str.toCharArray();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (answer.indexOf(String.valueOf(charArr[i])) < 0) {
                answer += String.valueOf(charArr[i]);
            }
        }
        System.out.println(answer);
    }
}
