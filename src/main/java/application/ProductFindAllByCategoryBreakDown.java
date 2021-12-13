package application;

import entity.Product;
import entityService.ProductEntityService;

import java.util.List;

public class ProductFindAllByCategoryBreakDown {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        List<Product> productList = productEntityService.findAllProductByCategoryBreakDown(3L);

        for(Product product: productList){
            System.out.println(product);
        }
    }
}
