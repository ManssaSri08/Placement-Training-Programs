import java.lang.Math;
class ProductOutOfStockException extends Exception{
    ProductOutOfStockException(String msg){
        super(msg);
    }
}
class PaymentFailedException extends Exception{
    PaymentFailedException(String msg){
        super(msg);
    }
}
class OrderProcessingFailedException extends Exception{
    OrderProcessingFailedException(String msg){
        super(msg);
    }
}
class InvalidAddressException extends Exception{
    InvalidAddressException(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price){
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product,User user,int quantity){
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService{
    public static void PlaceOrder(Order order) throws ProductOutOfStockException, PaymentFailedException, OrderProcessingFailedException, InvalidAddressException{
        if(order.product.stock<=0 || order.product.stock<order.quantity){
            throw new ProductOutOfStockException("Product out of Stock");
        }
        if(Math.random()<0.4){
            throw new PaymentFailedException("Payment Failed");
        }
        if(Math.random()<0.2){
            throw new OrderProcessingFailedException("Order Processing Failed");
        }
        if(order.user.address==null){
            throw new InvalidAddressException("Invalid Address");
        }
        order.product.stock-=order.quantity;
        System.out.println("Order placed successfully for "+order.user.name);
    }
}
public class ECommerceOrderSystem {
    public static void main(String[] args){
        Product p=new Product("Laptop",50,1708.0);
        User u=new User("Manssa","OMR, Chennai");
        Order o=new Order(p,u,51);
        OrderService os=new OrderService();
        try{
            os.PlaceOrder(o);
        }
        catch(ProductOutOfStockException e){
            System.out.println(e.getMessage());
        }
        catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        }
        catch(OrderProcessingFailedException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidAddressException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Order Attempt Completed");
        }
    }
}
