package com.lxj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lxj.pojo.Product;
import com.lxj.service.ProductService;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ProductAction
 */

@Namespace("/")
@ParentPackage("struts-default")
@Results({ @Result(name = "list_product", location = "/template/list_product.jsp") })
public class ProductAction {

    private List<Product> products;

    @Autowired
    private ProductService productService;

    @Action("listProduct")
    public String listProduct() {

        HttpServletRequest req = ServletActionContext.getRequest();
        String page = req.getParameter("page");
        System.out.println(page);

        products = productService.list(Integer.parseInt(page));
        return "list_product";
    }

    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return the productService
     */
    public ProductService getProductService() {
        return productService;
    }

    /**
     * @param productService the productService to set
     */
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

}