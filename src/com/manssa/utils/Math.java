package src.com.manssa.utils;
public class Math {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sqrt(int a){
        int i=1;
        while(i*i<=a){
            i++;
        }
        return i-1;
    }
}