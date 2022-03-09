package part1;

import java.util.Scanner;

// 유효한 팰린드롬
// 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
// 알파벳 이외의 문자들의 무시합니다.
public class Test008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean answer = true;
        char[] charStr = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(charStr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charStr[rt])) {
                rt--;
            } else {
                if (Character.toUpperCase(charStr[lt]) != Character.toUpperCase(charStr[rt])) {
                    answer = false;
                    break;
                }
                lt++;
                rt--;
            }
        }
        System.out.println(answer ? "YES" : "NO");
    }
}
