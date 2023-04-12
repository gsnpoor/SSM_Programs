package itheima1;

import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

public class App2 {
    public static void main(String[] args) {
        //获取IOC容器，加载配置文件得到上下文对象，也就是容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取资源
        /*BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();*/

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();


    }
}
