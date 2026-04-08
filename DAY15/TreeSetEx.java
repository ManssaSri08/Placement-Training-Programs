import java.util.*;
public class TreeSetEx {
    public static int closest(int[] nums,int target){
        TreeSet<Integer> set=new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }
        //set.remove(target);
        //Integer ceil=set.ceiling(target); 
        Integer high=set.higher(target);
        //Integer floor=set.floor(target); 
        Integer low=set.lower(target);
        //if(ceil==null) return floor;
        if(high==null) return low;
        //if(floor==null) return ceil;
        if(low==null) return high;
        //if(target-floor <= ceil-target)  
        if(target-low <= high-target)
            //return floor;
            return low;
        else
            //return ceil;
            return high;
    }
    public static void main(String[] args){
        int[] nums={15,3,9,1,7,2};
        System.out.println(closest(nums,9));
    }
}