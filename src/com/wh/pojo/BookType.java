package com.wh.pojo;
/*
 * 图书类别类
 */
public class BookType {
	
	private int id;//id
	private String typeName;//类别名称
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
	@Override
	public String toString() {
		return "BookType [id=" + id + ", typeName=" + typeName + "]";
	}
	
}
