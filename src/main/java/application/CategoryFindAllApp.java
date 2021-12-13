package application;

import dao.CategoryDao;
import entity.Category;
import entityService.CategoryEntityService;

import java.util.List;

public class CategoryFindAllApp {

    public static void main(String[] args) {

        CategoryEntityService categoryEntityService = new CategoryEntityService();

        List<Category> categoryList = categoryEntityService.findAll();

        for (Category category: categoryList) {
            System.out.println(category.getName());
        }
    }
}
