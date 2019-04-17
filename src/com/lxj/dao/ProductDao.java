package com.lxj.dao;

import java.util.List;

import com.lxj.pojo.Product;

/**
 * ProductDao
 */
public interface ProductDao {
    public List<Product> pList(int page);
}