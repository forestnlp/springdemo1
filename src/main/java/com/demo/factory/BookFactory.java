package com.demo.factory;

import com.demo.entity.Book;
import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book=new Book();
        book.setBname("JAVA");
        book.setAuthor("马士兵");
        return book;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
