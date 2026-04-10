import java.util.*;
public class SortCharactersByFrequency {
    /*public static List<Character> sort(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        Comparator<Character> comp=new Comparator<Character>(){
            public int compare(Character a,Character b){
                int fa=map.get(a);
                int fb=map.get(b);
                if(fa==fb) return b-a;
                return fa-fb;
            }
        };
        Collections.sort(list,comp);
        return list;
    }*/
   public static List<Character> sort(String s){
        HashMap<Character,Integer> freq=new HashMap<>();
        //1.frequency
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        //2.stored in list
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(freq.entrySet());
        //3.sort
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b){
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue()-a.getValue();
                }
                return a.getKey()-b.getKey();
            }
        });
        List<Character> result=new ArrayList<>();
        //list(map entries) -> list(characters)
        for(Map.Entry<Character,Integer> i:list){
            result.add(i.getKey());
        }
        return result;
    }
    public static void main(String[] args){
        String s="tree";
        System.out.println(sort(s));
    }
}