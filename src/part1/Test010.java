package part1;

import java.util.Scanner;

// 가장 짧은 문자거리
public class Test010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);

        int[] arr1 = new int[str.length()];

        int point = 100;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                point = 0;
            } else {
                point += 1;
            }
            arr1[i] = point;
        }

        int[] arr2 = new int[str.length()];
        point = 100;
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) == target) {
                point = 0;
            } else {
                point += 1;
            }
            arr2[j] = point;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]) {
                System.out.print(arr1[i] + " ");
            } else {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
