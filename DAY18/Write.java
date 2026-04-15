import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class Write{
    public static void main(String[] args){
        try{
            //FileWriter writer=new FileWriter("test.txt");
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWriter1");
            writer.newLine();
            writer.write("Write using FileWriter2");
            writer.newLine();
            writer.write("Write using FileWriter3");
            writer.newLine();
            writer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}