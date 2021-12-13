package entityService;

import dao.ProductDao;
import dto.ProductDetailDto;
import entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService(){
        productDao =  new ProductDao();
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(Long  id){
        return  productDao.findById(id);
    }

    public List<Product> findAllProductPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllProductPriceGeAndPriceLe(priceGe,priceLe);
    }

    public List<Product> findAllProductPriceGeBetweenPriceLe(BigDecimal priceGe,BigDecimal priceLe) {
        return productDao.findAllProductPriceGeAndPriceLe(priceGe, priceLe);
    }

    public List<Product> findAllProductByCategoryBreakDown(Long breakDown){
        return productDao.findAllProductByCategoryBreakDown(breakDown);
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryBreakDown(Long breakDown){
        return productDao.findAllProductDetailDtoByCategoryBreakDown(breakDown);
    }
}
