import java.util.*;
class Product{
    String name;
    int price;
    double rating;
    Product(String name,int price,double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return name+" "+price+" "+rating;
    }
}
public class ComparatorTask{
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Product("a",1,2.9));
        products.add(new Product("i",9,9.3));
        products.add(new Product("d",4,1.7));
        products.add(new Product("l",2,5.3));
        products.add(new Product("k",7,8.6));
        Comparator<Product> byName=new Comparator<Product>(){
            public int compare(Product a,Product b){
                return a.name.compareTo(b.name);
            }
        };
        Comparator<Product> byPrice=new Comparator<Product>(){
            public int compare(Product a,Product b){
                return Integer.compare(a.price,b.price);
            }
        };
        Comparator<Product> byRating=new Comparator<Product>(){
            public int compare(Product a,Product b){
                return Double.compare(a.rating,b.rating);
            }
        };
        Collections.sort(products,byName);
        System.out.println("Sorted by Name: "+products);
        Collections.sort(products,byPrice);
        System.out.println("Sorted by Price: "+products);
        Collections.sort(products,byRating);
        System.out.println("Sorted by Rating: "+products);
    }
}