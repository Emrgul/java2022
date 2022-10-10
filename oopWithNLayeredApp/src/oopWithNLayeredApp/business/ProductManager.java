package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    //Buna dependency injection denir.

    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao , List<Logger> loggers ) {
        this.productDao = productDao;
        this.loggers = loggers;

    }

    // ProductService
    // ProductServiceImpl olarak da adlandıralabilir.

    public void add(Product product) throws Exception {
        // iş kuralları yazılır

        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }


    //    ProductDao productDao = new JdbcProductDao();

        productDao.add(product);

        for (Logger logger:loggers){

            logger.log(product.getName());

        }
    }
}
