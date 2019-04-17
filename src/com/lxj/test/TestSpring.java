package com.lxj.test;

import java.util.List;

import com.lxj.pojo.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestSpring
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

        // Product p = (Product) context.getBean("p");
        // System.out.println(p.getP_name());

        // ProductDao pd = (ProductDao) context.getBean("p_dao");
        // List<Product> ps = pd.find(" from Product p order by p.id desc limit 0,5");

        // List<Product> ps = pd.pList();

        // for (Product p : ps) {
        // System.out.println("产品的名称是:---" + p.getP_name());
        // }
    }
}