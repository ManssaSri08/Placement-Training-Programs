public class WaveForm {
    public static void main(String[] args){
        String s="VIRATKOHLI";
        StringBuilder odd=new StringBuilder();
        StringBuilder even=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0) odd.append(s.charAt(i));
            else if(i%2==1) even.append(s.charAt(i));
        }
        odd.append(even);
        System.out.println(odd.toString());
    }
}
