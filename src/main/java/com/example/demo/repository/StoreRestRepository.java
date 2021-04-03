package com.example.demo.repository;

import com.example.demo.entity.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stores", path = "stores")
public interface StoreRestRepository extends CrudRepository<Store, Long> {

}
