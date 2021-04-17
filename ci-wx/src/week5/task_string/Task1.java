package week5.task_string;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = reverse(in.next());
        try {
            int result = Integer.parseInt(str);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println('0');
            e.printStackTrace();
        }
        //怎么实现有符号整数的范围 [−2^31, 2^31 − 1]

    }

    public static String reverse(String str) {
        int len = str.length();
        char[] result = new char[len];
        int j = len - 1;//不减一就会报错ArrayIndexOutOfBoundsException: 4
        if (str.charAt(0) == '-') {
            result[0] = '-';
        } else {
            result[0] = str.charAt(0);
        }
        for (int i = 1; i < len; i++, j--) {
            result[j] = str.charAt(i);
        }
        return String.valueOf(result);
    }
}
