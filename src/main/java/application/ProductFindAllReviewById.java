package application;

import dto.ProductUserReviewDetailDto;
import entityService.ProductReviewEntityService;
import java.util.List;

// This class was created to solve the 1st problem.
public class ProductFindAllReviewById {

    public static void main(String[] args) {

        ProductReviewEntityService productReviewEntityService =  new ProductReviewEntityService();

        // If there is no comment for the product
        List<ProductUserReviewDetailDto> productUserReviewDetailDtoList = productReviewEntityService.findAllUserReviewById(2L);

        for(ProductUserReviewDetailDto productUserReviewDetailDto:productUserReviewDetailDtoList){
            System.out.println(productUserReviewDetailDto.toString());
        }

        // If there is more than one comment on the product
        List<ProductUserReviewDetailDto> productUserReviewDetailDtoList1 = productReviewEntityService.findAllUserReviewById(7l);

        for(ProductUserReviewDetailDto productUserReviewDetailDto: productUserReviewDetailDtoList1){
            System.out.println(productUserReviewDetailDto.toString());
        }

    }
}
