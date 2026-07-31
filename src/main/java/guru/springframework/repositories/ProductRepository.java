package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository 
  extends CrudRepository<Product, Integer>{
}
///数据访问
操作product表格，id的类型是integer，
  <实体类，主键类型>
  
