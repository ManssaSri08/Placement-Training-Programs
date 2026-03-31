import java.util.*;
import java.lang.Math;
public class LongestMountainSubarray{
    public static int[] longestMountain(int[] arr){
        int n=arr.length;
        int maxLen=0,start=-1;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int l=0,r=0; //left,right steps
                int left=i,right=i;
                while(left>0 && arr[left]>arr[left-1]){
                    left--; l++;
                }
                while(right<n-1 && arr[right]>arr[right+1]){
                    right++; r++;
                }
                int k=Math.min(l,r);
                if(k>0){
                    int len=2*k+1;
                    if(len>maxLen){
                        maxLen=len; start=i-k;
                    }
                }
            }
        }
        if(maxLen<3) return new int[0];
        int[] res=new int[maxLen];
        for(int i=0;i<maxLen;i++){
            res[i]=arr[start+i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,1,2,3,4,7,5,4,3,6,5};
        System.out.println(Arrays.toString(longestMountain(arr)));
    }
}