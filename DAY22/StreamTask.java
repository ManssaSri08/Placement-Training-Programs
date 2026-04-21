import java.util.*;

class Employee {
    String name;
    int salary;
    String dept;
    int age;

    Employee(String name, int salary, String dept, int age) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.age = age;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }

    public String toString() {
        return name + " " + salary;
    }
}

public class StreamTask {
    public static void main(String[] args) {

        List<String> depts = List.of("Dev", "HR", "Support");

        List<String> devDept = depts.stream()
                                   .filter(i -> i.equals("Dev"))
                                   .toList();

        List<Employee> emp = List.of(
            new Employee("Emp 1", 3000, "Dev", 18),
            new Employee("Emp 2", 4000000, "HR", 35),
            new Employee("Emp 3", 600000, "Support", 33)
        );
        List<String> empNames = emp.stream()
                                  .map(i -> i.getName())
                                  .toList();

        List<Employee> highSalary = emp.stream()
                                      .filter(i -> i.getSalary() > 50000)
                                      .toList();

        int sum = emp.stream()
                     .mapToInt(i -> i.getSalary())
                     .sum();

        double avg = emp.stream()
                        .mapToInt(i -> i.getSalary())
                        .average()
                        .orElse(0);

        long count = emp.stream().count();

        System.out.println("Dev Dept: " + devDept);
        System.out.println("Employee Names: " + empNames);
        System.out.println("High Salary: " + highSalary);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Count: " + count);
    }
}