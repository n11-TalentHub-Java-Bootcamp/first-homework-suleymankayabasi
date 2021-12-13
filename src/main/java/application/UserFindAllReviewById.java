package application;

import dto.UserProductReviewDetailDto;
import entityService.UserEntityService;
import java.util.List;

// This class was created to solve the 4th problem.
public class UserFindAllReviewById {

    public static void main(String[] args) {


        UserEntityService userEntityService = new UserEntityService();

        // User who wrote many comments
        List<UserProductReviewDetailDto> userProductReviewDetailDtoList = userEntityService.findAllUserReviewById(7L);

        for(UserProductReviewDetailDto userProductReviewDetailDto : userProductReviewDetailDtoList){
            System.out.println(userProductReviewDetailDto.toString());
        }

        // User who wrote never comments
        List<UserProductReviewDetailDto> userProductReviewDetailDtoList1 = userEntityService.findAllUserReviewById(2L);

        for ( UserProductReviewDetailDto userProductReviewDetailDto: userProductReviewDetailDtoList1){
            System.out.println(userProductReviewDetailDto.toString());
        }
    }

}
