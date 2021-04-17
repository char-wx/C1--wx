package week10;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String str = "0100110001010001";
        HashMap map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
               String temp = str.substring(i,j);
                map.put(temp,1);
            }
        }
        System.out.println(map.size());
    }
}
