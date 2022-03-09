package part1;

import java.util.Scanner;

// 문자열에서 숫자만 출력하기
public class Test009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArr = str.toCharArray();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(charArr[i])) {
                answer += String.valueOf(charArr[i]);
            }
        }
        System.out.println(Integer.parseInt(answer));
    }
}
