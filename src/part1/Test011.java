package part1;

import java.util.Scanner;

// 문자열 압축
public class Test011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String answer = "";
        String check = str.substring(0, 1);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String target = str.substring(i, i + 1);
            if (target.equals(check)) {
                count++;
            } else {
                answer += check;
                if (count > 1) {
                    answer += String.valueOf(count);
                }
                check = target;
                count = 1;
            }
        }
        answer += check;
        if (count > 1) {
            answer += String.valueOf(count);
        }
        System.out.println(answer);
    }
}
