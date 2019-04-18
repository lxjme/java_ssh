package com.lxj.service.impl;

import java.util.List;

import com.lxj.dao.ProductDao;
import com.lxj.pojo.Product;
import com.lxj.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ProductServiceImpl
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public List<Product> list(int page) {
        List<Product> ps = productDao.pList(page);
        return ps;
    }

    @Override
    public int getTotal() {
        return productDao.getTotal();
    }

}