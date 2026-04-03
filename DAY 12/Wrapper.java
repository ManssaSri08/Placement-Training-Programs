public class Wrapper{
    public static void main(String[] args){
        Integer b=Integer.valueOf("12345");//return type->object(Integer)
        Integer c=Integer.valueOf("0987");//return type->(int)
        int a=b.intValue();//unboxing
        Integer x=128;
        Integer y=128;
        Integer n=130;
        n=128;
        System.out.println(n);
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}