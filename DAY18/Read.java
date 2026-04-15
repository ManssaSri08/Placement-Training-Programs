import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Read{
    public static void main(String[] args){
        try{
            //FileReader fr=new FileReader("test.txt");
            BufferedReader fr=new BufferedReader(new FileReader("test.txt"));
            //int character;
            String line;
            //while((character=fr.read())!=-1){
            //    System.out.print((char)character);
            //}
            while((line=fr.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}