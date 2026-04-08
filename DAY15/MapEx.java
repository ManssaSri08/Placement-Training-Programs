import java.util.*;
public class MapEx{
    public static void main(String[] args){
        int[] nums={1,2,3,3,4,5};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        //System.out.println(map);
    }
}