package com.imagemanagementservice.service;

import com.imagemanagementservice.model.ProductImage;
import com.imagemanagementservice.repository.ProductImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductImageService {

    private ProductImageRepository productImageRepository;

    public ProductImageService(ProductImageRepository productImageRepository) {
        this.productImageRepository = productImageRepository;
    }

    public byte[] getProductImage(String productId) {
        return productImageRepository.findById(productId).get().getData();
    }

    public String saveProductImage(byte[] data) {
        ProductImage image = new ProductImage();
        image.setName("image");
        image.setContentType("image/png");
        image.setSize(data.length);
        image.setData(data);
        productImageRepository.save(image);
        return image.getId();
    }

    public void deleteProductImage(String productId) {
        productImageRepository.deleteById(productId);
    }
}
