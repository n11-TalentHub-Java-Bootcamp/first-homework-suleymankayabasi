package application;

import dto.ProductDetailDto;
import entityService.ProductEntityService;

import java.util.List;

public class ProductDetailDtoFindAllByCategoryBreakDown {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        List<ProductDetailDto> productDetailDtoList = productEntityService.findAllProductDetailDtoByCategoryBreakDown(3L);

        for(ProductDetailDto productDetailDto:productDetailDtoList){
            System.out.println(productDetailDto);
        }
    }
}
