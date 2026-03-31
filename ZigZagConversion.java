public class ZigZagConversion{
public static void main(String[] args)
{
    String str="PAYPALISHIRING";
    int N=3;
    if (N == 1) {
        System.out.print(str);
        return;
    }
    StringBuilder[] rows=new StringBuilder[N];
    for(int i=0;i<N;i++)
    {
        rows[i] = new StringBuilder();
    }
    boolean goingdown=false;
    int curr=0;
    for(char c:str.toCharArray())
    {
        rows[curr].append(c);
        if(curr == 0 || curr == N-1)
        {
            goingdown = !goingdown;
        }
        curr+=goingdown ? 1:-1;
    }
    StringBuilder res=new StringBuilder();
    for(StringBuilder row:rows)
    {
        res.append(row);
    }
    System.out.print(res.toString());
}    
}