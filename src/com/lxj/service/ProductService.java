package com.lxj.service;

import java.util.List;

import com.lxj.pojo.Product;

/**
 * ProductService
 */
public interface ProductService {
    List<Product> list(int page);
}