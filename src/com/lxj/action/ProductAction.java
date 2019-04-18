package com.lxj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lxj.pojo.Product;
import com.lxj.service.ProductService;
import com.lxj.util.PageUtil;

import org.apache.commons.lang.xwork.StringUtils;
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

    private PageUtil pageUtil;

    @Autowired
    private ProductService productService;

    @Action("listProduct")
    public String listProduct() {

        HttpServletRequest req = ServletActionContext.getRequest();

        // String page = req.getParameter("page");

        // if (StringUtils.isNotEmpty(req.getParameter("page"))) {
        // page = Integer.parseInt(req.getParameter("page"));
        // }
        String page = req.getParameter("page");
        if (org.apache.commons.lang.StringUtils.isEmpty(page)) {
            page = "1";
        }

        int crt_page = Integer.parseInt(page);
        if (crt_page <= 1) {
            crt_page = 1;
        }

        System.out.println(page);

        pageUtil = new PageUtil();

        // System.out.println(page);
        pageUtil.setCrt_page(crt_page);

        products = productService.list(pageUtil.getCrt_page());

        pageUtil.setTotal(productService.getTotal());

        // req.setAttribute("pageUtil", pageUtil);

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
     * @return the pageUtil
     */
    public PageUtil getPageUtil() {
        return pageUtil;
    }

    /**
     * @param pageUtil the pageUtil to set
     */
    public void setPageUtil(PageUtil pageUtil) {
        this.pageUtil = pageUtil;
    }

}