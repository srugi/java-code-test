package part1;
import java.util.Scanner;

public class Test002 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inStr = in.next();

        String result = "";
        for(char c : inStr.toCharArray() ) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }

        }
        System.out.println(result);
        return ;
      }
    
}
