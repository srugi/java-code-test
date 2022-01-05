package part1;
import java.util.Scanner;

public class Test001 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inStr = in.next();
        char inChar = in.next().charAt(0);

        
        System.out.println(inStr + " / " + inChar);

        inStr = inStr.toUpperCase();
        inChar = Character.toUpperCase(inChar);

        System.out.println(inStr + " / " + inChar);

        int result = 0;

        for (char t : inStr.toCharArray() ) {
            if ( t == inChar) {
                result++;
            }
        }

        System.out.println(result);
        return;
      }
    
}
