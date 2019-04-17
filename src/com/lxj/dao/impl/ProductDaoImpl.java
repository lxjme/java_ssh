package com.lxj.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import com.lxj.dao.ProductDao;
import com.lxj.pojo.Product;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * ProductDaoImpl
 */
@Repository("productDao")
public class ProductDaoImpl extends HibernateTemplate implements ProductDao {

    @Resource(name = "sf")
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    };

    /**
     * 获取产品列表
     * 
     * @return
     */
    @Override
    public List<Product> pList(int page) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        // 获取前5条数据
        Query q = s.createQuery("from Product p order by p.id desc");
        q.setFirstResult((page - 1) * 5);
        q.setMaxResults(5);
        List<Product> ps = q.list();

        s.getTransaction().commit();
        s.close();
        sf.close();

        return ps;
    }
}