package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRestRepository extends CrudRepository<Product, Long> {

}
