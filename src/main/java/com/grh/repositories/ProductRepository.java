package com.grh.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.grh.entities.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
