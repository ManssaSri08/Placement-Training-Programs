public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String s="abcbad";
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
                System.out.print(ch);
                break;
            }
        }
    }
}