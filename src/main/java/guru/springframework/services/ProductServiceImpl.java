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
    /// 把 外面的传进来的repository， 保存到自己的变量里面

    @Override
    ///重写父类或者接口的方法
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }
    ///实现这个方法，

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
