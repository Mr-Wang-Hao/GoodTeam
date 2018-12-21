package com.wh.pojo;
/*
 * 图书实体类
 */
import java.util.*;
public class Book {
	private int id;//id
	private String bookName;//书名
	private List<BookType> bookTypeList;
	
	
	public List<BookType> getBookTypeList() {
		return bookTypeList;
	}
	public void setBookTypeList(List<BookType> bookTypeList) {
		this.bookTypeList = bookTypeList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookTypeList=" + bookTypeList + "]";
	}
	
	
	
	
}
