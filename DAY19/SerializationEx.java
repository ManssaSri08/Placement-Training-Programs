// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream objStream) throws IOException{
        super(objStream);
    }
    @Override
    protected void writeStreamHeader() throws IOException{

    }
}
public class SerializationEx {
    public static void main(String[] args) throws IOException{
        Student s=new Student("3rd obj",33);
        File file=new File("student.txt");
        //FileOutputStream fo=new FileOutputStream("student.txt"); //open file
        FileOutputStream fo=new FileOutputStream("student.txt",true); //connect file
        //ObjectOutputStream objStream=new ObjectOutputStream(fo); //obj to byte stream
        ObjectOutputStream objStream;
        if(file.length()==0){
            objStream=new ObjectOutputStream(fo); //first time serializing
        }
        else{
            objStream=new CustomObjectOutputStream(fo); //append to the existing serialization file
        }
        objStream.writeObject(s); //writing on files
        objStream.close();
        fo.close();
    }
}