abstract class Document{
    private String name;
    Document(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    abstract void open();
    abstract void save();
    abstract void close();
}
class TextDocument extends Document{
    TextDocument(String name){
        super(name);
    }
    void open(){
        System.out.println("Opening text document: "+getName());
    }
    void save(){
        System.out.println("Saving text document");
    }
    void close(){
        System.out.println("Closing text document");
    }
}
class ImageDocument extends Document{
    ImageDocument(String name){
        super(name);
    }
    void open(){
        System.out.println("Rendering image: "+getName());
    }
    void save(){
        System.out.println("Saving image");
    }
    void close(){
        System.out.println("Closing image");
    }
}
class SpreadsheetDocument extends Document{
    SpreadsheetDocument(String name){
        super(name);
    }
    void open(){
        System.out.println("Calculating spreadsheet: "+getName());
    }
    void save(){
        System.out.println("Saving spreadsheet");
    }
    void close(){
        System.out.println("Closing spreadsheet");
    }
}
public class DocumentEditor {
    public static void main(String[] args) {
        Document doc1 = new TextDocument("Notes.txt");
        Document doc2 = new ImageDocument("Photo.png");
        Document doc3 = new SpreadsheetDocument("Data.xlsx");
        doc1.open();
        doc1.save();
        doc1.close();
        doc2.open();
        doc2.save();
        doc2.close();
        doc3.open();
        doc3.save();
        doc3.close();
    }
}
