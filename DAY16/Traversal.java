import java.util.*;
public class Traversal{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        // for(int i:list){
        //     if(i==4){
        //         list.remove(i);
        //     }
        //     System.out.print(i);
        // }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            int current=it.next();
            if(current==4){
                it.remove();
            }
            System.out.print(current+" ");
        }
        System.out.println();
        ListIterator<Integer> lit=list.listIterator(list.size());
        while(lit.hasPrevious()){
            int prev=lit.previous();
            System.out.print(prev+" ");
        }
        System.out.println();
        System.out.println(list);
    }
}