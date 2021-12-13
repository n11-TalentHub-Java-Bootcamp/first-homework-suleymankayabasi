package dto;

import java.math.BigDecimal;

// This data transfer object was created to solve the 3rd problem.
public class ProductReviewDetailDto {

    private Long id;
    private String productName;
    private BigDecimal price;
    private Long reviewCount;

    public ProductReviewDetailDto(){
    }

    public ProductReviewDetailDto(Long id, String productName, BigDecimal price, Long reviewCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.reviewCount = reviewCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getReviewCount() {
        return reviewCount;
    }

    public String getReviewCountZeroOrMore(){
        String zeroReviewCount;

        if(reviewCount == 0){

            return zeroReviewCount = "" ;
        }
        return zeroReviewCount = Long.toString(reviewCount);
    }

    public void setReviewCount(Long reviewCount) {
        this.reviewCount = reviewCount;
    }

    @Override
    public String toString() {
        return "ProductReviewDetailDto{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", reviewCount=" + getReviewCountZeroOrMore() +
                '}';
    }
}
