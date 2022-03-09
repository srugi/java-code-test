package part1;

import java.util.Scanner;

public class Test012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordCnt = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String answer = "";
        for (int i = 0; i < wordCnt; i++) {
            String word = str.substring(0, 7);
            String word2 = word.replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(word2, 2);
            // System.out.println(num);
            answer += (char) num;
            str = str.substring(7);
        }
        System.out.println(answer);
    }
}
