package me.aoa4eva.demo.repositories;

import me.aoa4eva.demo.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long>{
}
