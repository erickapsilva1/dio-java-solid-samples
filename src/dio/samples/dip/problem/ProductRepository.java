package dio.samples.dip.problem;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private MySqlConnection mySqlConnection;

    public ProductRepository(){
        this.mySqlConnection = new MySqlConnection();
    }

    public List<Product> searchProducts(){
        return new ArrayList<>();
    }

    public void saveProduct(Product product){

    }

}
