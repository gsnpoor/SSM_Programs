package service;

import dao.BookDao;
import dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    public void save(){
        System.out.println("book service sava");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
