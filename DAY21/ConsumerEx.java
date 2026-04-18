import java.util.function.Consumer;
import java.util.*;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class ConsumerEx {
    public static void main(String[] args){
        Consumer<String> printString=(s)->System.out.println(s);
        Consumer<Student> printName=(s)->System.out.println(s.name);
        printName.accept(new Student("test1"));
        printString.accept("From consumer");
        List<String> names=List.of("abc","def","ghi");
        names.forEach(name->System.out.println(name));
        //shortcut for lambda function
        names.forEach(System.out::println);
    }
}