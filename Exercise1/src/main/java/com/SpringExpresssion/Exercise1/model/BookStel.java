package com.SpringExpresssion.Exercise1.model;

import java.util.List;

public class BookStel {
private List<Book> allBooks;
private Book getFirstBook;
public List<Book> getAllBooks()
{
	return allBooks;
}

public Book getGetFirstBook() {
	return getFirstBook;
}

public void setGetFirstBook(Book getFirstBook) {
	this.getFirstBook = getFirstBook;
}
public void setAllBooks(List<Book> allBooks) {
	this.allBooks = allBooks;
}

}
