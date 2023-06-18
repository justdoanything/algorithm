import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Temp {

    public static void main(String[] args) {
        String str = "A";
        int strInt = str.charAt(0);
        System.out.println(strInt);

        String strIntStr = String.valueOf((char) strInt);
        System.out.println(strIntStr);

        // String 숫자 - '0' ==> int 숫자
        System.out.println("4".charAt(0)-'0');
        // String 소문자 - 'a' ==> int 숫자 (알파벳 순서)
        System.out.println("c".charAt(0)-'a');
        // String 대문자 - 'A' ==> int 숫자 (알파벳 순서)
        System.out.println("C".charAt(0)-'A');
    }
}
