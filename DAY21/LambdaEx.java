@FunctionalInterface
interface Math{
    int add(int a,int b);
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}
public class LambdaEx {
    public static void main(String[] args){
        Math obj=(a,b) -> {
            System.out.println("Adding two numbers...");
            return a+b;
        };
        Exercise ex=() -> System.out.println("Hello");
        System.out.println(obj.add(11,22));
        ex.sayHello();
        /*Math obj=new Math(){
            @Override
            public int add(int a,int b){
                return a+b;
            }
        };*/
    }
}