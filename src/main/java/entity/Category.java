package entity;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @SequenceGenerator(name = "generator",sequenceName = "CATEGORY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID",nullable = false)
    private Long id;

    @Column(name = "NAME",nullable = false, length = 50)
    private String name;

    @Column(name = "BREAKDOWN")
    private Long breakDown;


    // A Top-Category can have many Categories
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TOP_CATEGORY")
    private Category topCategoryId;

    public Category getTopCategoryId() {
        return topCategoryId;
    }

    public void setTopCategoryId(Category topCategoryId) {
        this.topCategoryId = topCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBreakDown() {
        return breakDown;
    }

    public void setBreakDown(Long breakDown) {
        this.breakDown = breakDown;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breakDown=" + breakDown +
                ", topCategoryId=" + topCategoryId +
                '}';
    }
}
