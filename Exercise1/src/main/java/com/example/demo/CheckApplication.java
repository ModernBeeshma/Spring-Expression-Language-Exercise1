//1.	Refer to other beans by id attribute
//2.	Refer to the properties and invoke methods defined in other beans.
package com.example.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringExpresssion.Exercise1.model.Book;
import com.SpringExpresssion.Exercise1.model.BookStel;

public class CheckApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Bean.xml");
        BookStel bs=(BookStel) ctx.getBean("bookStel",BookStel.class);
        List<Book> b=bs.getAllBooks();
        Book first=bs.getGetFirstBook();
        for(Book bo:b)
        {
        	System.out.println(bo.getBookId());
        	System.out.println(bo.getBookName());
        }
        System.out.println("----------------------------------");
        System.out.println(first.getBookId());
        System.out.println(first.getBookName());
    }
	}

