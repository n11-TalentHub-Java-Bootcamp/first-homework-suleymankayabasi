package application;

import entity.Product;
import entityService.ProductEntityService;

public class ProductFindById {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        Product product = productEntityService.findById(7L);

        System.out.println(product.toString());
    }
}
