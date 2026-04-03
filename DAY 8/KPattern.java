import java.util.*;
public class KPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int N=s.length();
        int mid=N/2;
        int last=N-1;
        for(int i=0;i<N;i++){
            System.out.print(s.charAt(i));
            if(i<=mid){
                for(int j=0;j<(mid-i);j++){
                    System.out.print(" ");
                }
            }
            else{
                for(int j=0;j<(i-mid);j++){
                    System.out.print(" ");
                }
            }
            System.out.print(s.charAt(last)); last--;
            System.out.println();
        }
        sc.close();
    }
}