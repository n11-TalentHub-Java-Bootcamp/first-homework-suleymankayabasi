package dao;

import base.BaseDao;

import dto.UserProductReviewDetailDto;
import entity.Product;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao {

    String sql;
    Query query;

    // This method is the solution of the 4th problem.
    public List<UserProductReviewDetailDto> findAllUserReviewById(Long id){

        sql = "select" +
                " new dto.UserProductReviewDetailDto(user.id,user.name,productReview.productId.name,productReview.review,productReview.reviewDate)" +
                "from User user " +
                "left join ProductReview productReview on productReview.userId.id = user.id " +
                "where productReview.userId.id = :id";

        query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }
}
