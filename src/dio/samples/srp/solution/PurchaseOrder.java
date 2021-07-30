package dio.samples.srp.solution;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) { products.add(product); }

    public void removeProduct(Product product) { products.remove(product); }

    public Double calculateTotal(){
        return products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
    }

    public List<PurchaseOrder> searchOrderList(){
        return new ArrayList<>();
    }

    public void saveOrderList(){

    }

    public void sendEmail(String email){

    }

    public void printPurchaseOrder(){

    }

}
