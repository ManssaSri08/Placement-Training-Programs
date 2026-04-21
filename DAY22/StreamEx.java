import java.util.*;
class  Employee {
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    } 
    public String getName(){return name;}
    public int getSalary(){return salary;}
    public String toString(){return name+" "+salary;}
}
public class StreamEx {
    public static void main(String[] args) {
        //map
        List<Integer> numbs = List.of(2,3,4,5,6);
        List<Integer> mulby2 = numbs.stream().map((i)-> i*2).toList();
        System.out.println(mulby2);
        List<Integer> even = numbs.stream().filter((i) -> i%2==0).toList();
        System.out.println(even);
        int total=even.stream().reduce(1,(a,b)-> a+b);
        System.out.println(total);
        List<Employee> emp=List.of(new Employee("Emp 1",3000),new Employee("Emp 2",4000000));
        List<String> empNames = emp.stream().map((i) -> i.getName()).toList();
        List<Employee> sal=emp.stream().filter((i) -> i.getSalary()>300000).toList();
        System.out.println(empNames);
        System.out.println("After filter"+sal.toString());
    }
}