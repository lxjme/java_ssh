package com.lxj.dao;

import java.util.List;

import com.lxj.pojo.Product;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * ProductDao
 */
public class ProductDao {

    /**
     * 获取产品列表
     * 
     * @return
     */
    public List<Product> pList() {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        // 获取前5条数据
        Query q = s.createQuery("from Product p order by p.id desc");
        q.setFirstResult(0);
        q.setMaxResults(5);
        List<Product> ps = q.list();

        s.getTransaction().commit();
        s.close();
        sf.close();

        return ps;
    }

}