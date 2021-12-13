package application;

import entity.Product;
import entityService.ProductEntityService;

import java.math.BigDecimal;
import java.util.List;

public class ProductFindAllPriceGeAndPriceLe {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        List<Product> productList = productEntityService.findAllProductPriceGeAndPriceLe(BigDecimal.valueOf(100),BigDecimal.valueOf(1000));

        for(Product product : productList){
            System.out.println(product);
        }
    }
}
