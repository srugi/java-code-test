package part1;

import java.util.Scanner;

// 회문문자열 확인
public class Test007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] charStr = str.toCharArray();

        String checkStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            checkStr += String.valueOf(charStr[i]);
        }

        if (str.toUpperCase().equals(checkStr.toUpperCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
