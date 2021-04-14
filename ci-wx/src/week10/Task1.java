package week10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(); //输入一个整数 n 表示数组长度
        int[] array = new int[n];
        for(int i=0;i<n;i++){ //输入 n 个数表示序号 a[i]
            array[i]=in.nextInt();
        }
        int result = method(array,n);
        System.out.println(result);

    }

    public static int method(int[] array,int n){
        int count=0,winner=0;
        for(int i=0;i<array.length && winner<n/2;i++){
            if(sqrt(array[i]) || sqrt(array[i]+1) || sqrt(array[i]-1)){
                winner+=1;
            }
            if(!(sqrt(array[i]))& (sqrt(array[i]+1) || sqrt(array[i]-1))){
                count+=1;
            }
        }
        return count;
    }

    public static boolean sqrt(int num){
        for(int i=0;i<=num;i++){
            if(i*i==num) {
                return true;
            }
        }
        return false;
    }
}
