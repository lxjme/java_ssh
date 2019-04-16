package com.lxj.action;

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

        product = new Product();
        product.setP_name("iphone888");

        return "show";
    }

    public Product getProduct() {
        return product;
    }
}