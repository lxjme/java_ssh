package com.lxj.pojo;

import java.util.List;

/**
 * Product
 */
public class Product {
    private int id;
    private String p_name;
    private String price;
    private List<Product> ps;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the p_name
     */
    public String getP_name() {
        return p_name;
    }

    /**
     * @param p_name the p_name to set
     */
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the ps
     */
    public List<Product> getPs() {
        return ps;
    }

    /**
     * @param ps the ps to set
     */
    public void setPs(List<Product> ps) {
        this.ps = ps;
    }

}