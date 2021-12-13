package dto;

import java.util.Date;

// This data transfer object was created to solve the 4th problem.
public class UserProductReviewDetailDto {

    private Long id;
    private String userName;
    private String productName;
    private String review;
    private Date reviewDate;

    public UserProductReviewDetailDto(){
    }

    public UserProductReviewDetailDto(Long id, String userName, String productName, String review, Date reviewDate) {
        this.id = id;
        this.userName = userName;
        this.productName = productName;
        this.review = review;
        this.reviewDate = reviewDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "UserProductReviewDetailDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", review='" + review + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }
}
