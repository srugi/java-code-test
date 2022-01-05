package part1;
import java.util.Scanner;

public class Test003 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();

        String result = "";
        int maxLen = 0;

        String[] strArray = inStr.split(" ");

        for(String str : strArray ) {
            int length = str.length();
            if (length > maxLen) {
                result = str;
                maxLen = length;
            }
        }
        System.out.println(result);
        return ;
      }
    
}
