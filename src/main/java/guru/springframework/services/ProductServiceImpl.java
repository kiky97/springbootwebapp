package guru.springframework.services;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
///负责调用ProductRepository去操作product
@Service

///业务层的组件，请帮我创建它的对象
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
///implements ProductService 实现了接口：ProductService
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
