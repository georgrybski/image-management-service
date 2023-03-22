package com.imagemanagementservice.controller;

import com.imagemanagementservice.service.ProductImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productImage")
public class ProductImageController {

    private ProductImageService productImageService;

    public ProductImageController(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    @GetMapping(value = "/{productId}", produces = {MediaType.IMAGE_PNG_VALUE})
    public ResponseEntity<byte[]> getProductImage(@PathVariable String productId) {
        return ResponseEntity.ok(productImageService.getProductImage(productId));
    }

    @PostMapping(consumes = {MediaType.IMAGE_PNG_VALUE})
    public ResponseEntity<String> saveProductImage(@RequestBody byte[] data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productImageService.saveProductImage(data));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProductImage(@PathVariable String productId) {
        productImageService.deleteProductImage(productId);
        return ResponseEntity.noContent().build();
    }
}
