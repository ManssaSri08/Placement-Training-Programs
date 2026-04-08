import java.util.*;
public class MergeIntervals{
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last=list.get(list.size()-1);
            int[] curr=intervals[i];
            if(last[1]>=curr[0])
                last[1]=Math.max(last[1],curr[1]);
            else
                list.add(curr);
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int[][]  intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] res=merge(intervals);
        System.out.print("[");
        for(int i=0;i<res.length;i++){
            System.out.print("["+res[i][0]+" "+res[i][1]+"]");
            if (i!=res.length-1)
                System.out.print(",");
        }
        System.out.print("]");
    }
}