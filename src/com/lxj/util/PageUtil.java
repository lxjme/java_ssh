package com.lxj.util;

import org.springframework.stereotype.Component;

/**
 * PageUtil
 */
public class PageUtil {
    private int total; // 总条数
    private int count; // 每页个数
    private int crt_page; // 当前页
    private int total_page;

    public PageUtil() {
        this.count = 5; // 默认每页条数
    }

    public PageUtil(int count) {
        this.count = count;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the crt_page
     */
    public int getCrt_page() {
        return crt_page;
    }

    /**
     * @param crt_page the crt_page to set
     */
    public void setCrt_page(int crt_page) {
        this.crt_page = crt_page;
    }

    public int getTotal_page() {
        return (int) Math.ceil(total / count);

    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @param total_page the total_page to set
     */
    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }

}