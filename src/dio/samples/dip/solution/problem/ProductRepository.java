package dio.samples.dip.solution.problem;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private DbConnection dbConnection;

    public ProductRepository(DbConnection dbConnection){

        this.dbConnection = dbConnection;

    }

    public List<Product> searchProducts(){
        return new ArrayList<>();
    }

    public void saveProduct(Product product){

    }

}
