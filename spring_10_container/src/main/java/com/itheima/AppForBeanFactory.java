package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//初始化BeanFactory
public class AppForBeanFactory {
    public static void main(String[] args) {
        //BeanFactory创建完成后，所有的bean均为延迟加载
        Resource resources = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resources);
/*        BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.save();*/
    }
}
