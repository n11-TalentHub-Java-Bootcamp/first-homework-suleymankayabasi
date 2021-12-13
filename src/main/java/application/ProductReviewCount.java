package application;

import dto.ProductReviewDetailDto;
import entityService.ProductReviewEntityService;
import java.util.List;

// This class was created to solve the 3rd problem.
public class ProductReviewCount {

    public static void main(String[] args) {


        ProductReviewEntityService productReviewEntityService = new ProductReviewEntityService();

        // If there is no comment for a product, the number of comments is displayed blank.
        // Sorted by the number of comments.
        List<ProductReviewDetailDto> productReviewDetailDtoList = productReviewEntityService.findReviewCount();

        for (ProductReviewDetailDto productReviewDetailDto:productReviewDetailDtoList){
            System.out.println(productReviewDetailDto.toString());
        }

    }
}
