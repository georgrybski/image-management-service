package com.imagemanagementservice.repository;

import com.imagemanagementservice.model.ProductImage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductImageRepository extends MongoRepository<ProductImage, String> {
}
