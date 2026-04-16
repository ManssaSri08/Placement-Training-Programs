import java.io.*;
public class DeSerialization{
    public static void main(String[] args) throws Exception{
        FileInputStream fi=new FileInputStream("student.txt");
        ObjectInputStream objStream=new ObjectInputStream(fi);
        while(true){
            try{
                Student s=(Student)objStream.readObject();
                System.out.println(s.name+" "+s.mark);
            }
            catch(EOFException e){
                break;
            }
        }
        fi.close();
        objStream.close();
    }
}