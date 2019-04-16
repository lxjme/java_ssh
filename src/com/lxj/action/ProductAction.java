package com.lxj.action;

import java.util.List;

import com.lxj.dao.ProductDao;
import com.lxj.pojo.Product;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * ProductAction
 */

@Namespace("/")
@ParentPackage("struts-default")
@Results({ @Result(name = "show", location = "/template/show.jsp") })
public class ProductAction {
    private Product product;

    @Action("showProduct")
    public String show() {

        List<Product> ps = new ProductDao().pList();

        product = new Product();
        product.setP_name("iphone888");
        product.setPs(ps);

        System.out.println(product.getPs());
        return "show";
    }

    public Product getProduct() {
        return product;
    }
}