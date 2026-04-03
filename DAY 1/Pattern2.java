import java.util.*;
public class Pattern2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=p;j++){
                System.out.print("* ");
            }
            System.out.println();
            p+=2;
        }
    }
}