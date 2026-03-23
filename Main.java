class Student{
    int rollNo;
    String name;
    int marks;
    Student(){
        System.out.println("from constructor");
    }
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    Student(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
}
public class Main{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student(44,"Student2");
        Student s3=new Student(44,"Student2",100);
        System.out.println(s2.name);
        System.out.println(s3.marks);
    }
}