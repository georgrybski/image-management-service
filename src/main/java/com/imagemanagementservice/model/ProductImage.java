package com.imagemanagementservice.model;

import lombok.Data;

@Data
public class ProductImage {
    private String id;
    private String name;
    private String contentType;
    private long size;
    private byte[] data;
}
