package com.example.lnsgr.Dto;

public class ProductDto {
	private int id;
	private int categoryId;
	
	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", categoryId=" + categoryId + ", title=" + title + ", content=" + content
				+ "]";
	}
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDto(int categoryId, String title, String content) {
		super();
		this.categoryId = categoryId;
		this.title = title;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String title;
	private String content;

}
