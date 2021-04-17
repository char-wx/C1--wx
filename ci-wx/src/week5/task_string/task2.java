package week5.task_string;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("请输入台阶阶数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >0) {
            int res=fibna(n);
            System.out.println(res);
        }
        else {
            System.out.println("请输入正确的台阶阶数！");
        }

    }

    public static int fibna(int n){
        int result=0;
        if(n<=1&&n>=0){
            result= result+1;
        }
        else {
            result=result+fibna(n-1)+fibna(n-2);
        }
        return  result;
    }
}
