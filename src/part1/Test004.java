package part1;
import java.util.Scanner;

public class Test004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArray = new String[n];
        String[] strResult = new String[n];
        for(int i = 0 ; i < n ; i ++){
            strArray[i] = sc.next();
        }

        int setIndex = 0;
        for(String str: strArray) {
            int lastIndex = str.length();
            String answer = "";
            char[] targer = str.toCharArray();
            for(int j = lastIndex; j > 0; j--) {
                answer += targer[j-1]; 
            }
            strResult[setIndex] = answer;
            setIndex++;
        }
        
        for(String str: strResult) {
            System.out.println(str);
        }
    }
    
}
