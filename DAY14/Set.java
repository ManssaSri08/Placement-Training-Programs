import java.util.*;
public class Set{
    public static void main(String[] args){
        Set<Integer> LinkedSet=new LinkedHashSet<>();
        Set<Integer> HSet=new HashSet<>();
        int[] arr={2,4,5,4,6,7};
        for(int i:arr){
            LikedSet.add(i);
            HSet.add(i);
        }
        System.out.println(LinkedSet);
        System.out.println(HSet);
    }
}