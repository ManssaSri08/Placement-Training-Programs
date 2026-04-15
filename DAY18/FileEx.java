import java.io.File;
import java.io.IOException;
public class FileEx {
    public static void main(String[] args) throws IOException{
        // File newFile=new File("test.txt");
        // if(newFile.createNewFile()){
        //     System.out.println("File created: "+newFile.getName());
        // }
        // else{
        //     System.out.println("Not able to create file");
        // }
        File newFile=new File("deletetest.txt");
        if(newFile.delete()){
            System.out.println("File deleted: "+newFile.getName());
        } 
        else{
            System.out.println("File not found or cannot be deleted");
        }
    }
}