import java.util.*;
public class LeaderInArray{
    public static int[] findLeader(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int index=0;
        int maxRight=arr[n-1];
        temp[index++]=maxRight;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxRight){
                maxRight=arr[i];
                temp[index++]=arr[i];
            }
        }
        int[] result=new int[index];
        for(int i=0;i<index;i++){
            result[i]=temp[index-1-i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={16,17,4,3,5,2};
        System.out.println(Arrays.toString(findLeader(arr)));
    }
}