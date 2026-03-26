class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}//compile time polymorphism
public class Math {
    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.add(10,20.0));
    }
}