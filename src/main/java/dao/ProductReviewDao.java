package dao;

import base.BaseDao;
import dto.ProductReviewDetailDto;
import dto.ProductUserReviewDetailDto;
import org.hibernate.query.Query;

import java.util.List;

public class ProductReviewDao extends BaseDao {

    String sql;
    Query query;

    // This method is the solution of the 2nd problem.
    public List<ProductUserReviewDetailDto> findAllUserReviewById(Long id) {

        sql = "select" +
                " new dto.ProductUserReviewDetailDto(product.name,product.category.name,product.price," +
                " user.name,user.lastName,user.email,user.phoneNumber," +
                " productReview.review,productReview.reviewDate)" +
                " from ProductReview as productReview " +
                " left join User as user on user.id = productReview.userId.id" +
                " left join Product as product on product.id = productReview.productId.id " +
                " where  product.id = : id ";

        query = getCurrentSession().createQuery(sql);
        query.setParameter("id",id);

        return query.list();
    }

    // This method is the solution of the 3rd problem.
    public List<ProductReviewDetailDto> findReviewCount(){

            sql = "select" +
                    " new dto.ProductReviewDetailDto(product.id,product.name,product.price, count( productReview.productId.id )) " +
                    " from Product product" +
                    " left join ProductReview productReview on product.id = productReview.productId.id" +
                    " group by product.id" +
                    " order by count( productReview.productId.id )";

            query = getCurrentSession().createQuery(sql);

        return query.list();
    }
}

