package part1;

import java.util.Scanner;

// 주어진 문자열의 알파벳만 뒤집고 특수문자는 그대로 출력
public class Test005 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        char[] strCharArr = str.toCharArray();

        int lt = 0;
        int rt = strCharArr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(strCharArr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(strCharArr[rt])) {
                rt--;
            } else {
                char tmp = strCharArr[lt];
                strCharArr[lt] = strCharArr[rt];
                strCharArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(strCharArr));
    }
}
