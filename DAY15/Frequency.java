import java.util.*;
public class Frequency {    
    public static void main(String[] args){
        int[] nums={1,2,3,1,1,1,2,4,3};
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            // if(map.containsKey(n)) map.put(n,map.get(n)+1);
            // else map.put(n,1);
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" existed "+entry.getValue()+" times");
        }
    }
}