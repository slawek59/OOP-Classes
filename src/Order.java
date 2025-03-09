import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Product> listOfProducts = new LinkedList<Product>();

    public void addProduct(Product product){
        listOfProducts.add(product);
    }

    public double getTotalPrice(){
        double totalPrice = 0;

        for (Product product : listOfProducts){
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
