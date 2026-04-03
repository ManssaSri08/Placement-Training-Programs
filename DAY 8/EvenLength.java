public class EvenLength {
    public static void main(String[] args){
        String s="words with even length";
        StringBuilder sb=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                word.append(ch);
            }
            if(ch==' '){
                if(word.length()%2==0){
                    sb.append(word).append(" ");
                }
                word.setLength(0);
            }
        }
        if(word.length()%2==0){
            sb.append(word);
        }
        System.out.println(sb.toString());
    }
}
/*String s="words with even length";
StringBuilder sb=new StringBuilder();
int start=0,len=0;
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(ch!=' '){
        len++;
    }
    if(ch==' '){
        if(len%2==0){
            for(int j=start;j<=i;j++){
                sb.append(s.charAt(j));
            }
        }
        start=i+1;
        len=0;
    }
}
if(len%2==0){
    for(int j=start;j<s.length();j++){
        sb.append(s.charAt(j));
    }
}
System.out.println(sb.toString());*/