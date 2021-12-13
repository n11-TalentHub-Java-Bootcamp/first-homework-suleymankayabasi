package entityService;

import dao.ProductReviewDao;
import dto.ProductReviewDetailDto;
import dto.ProductUserReviewDetailDto;

import java.util.List;

// This entity service was created for the solution of 2 and 3 problems.
public class ProductReviewEntityService {

    private ProductReviewDao productReviewDao;

    public ProductReviewEntityService(){
        productReviewDao = new ProductReviewDao();
    }

    public List<ProductUserReviewDetailDto> findAllUserReviewById(Long id){
        return productReviewDao.findAllUserReviewById(id);
    }

    public List<ProductReviewDetailDto> findReviewCount(){
        return productReviewDao.findReviewCount();
    }
}
