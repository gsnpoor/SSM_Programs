package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;

/*@Controller：用于表现层bean定义
@Service：用于业务层bean定义
@Repository：用于数据层bean定义*/

//@Component定义bean
//@Component("bookDao")
//@Repository：@Component衍生注解
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}
