package com.example.lnsgr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Blogpost {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
		
	@Override
	public String toString() {
		return "Blogpost [id=" + id + ", title=" + title + ", content=" + content + ", category=" + category + "]";
	}
	public Blogpost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Blogpost(int id, String title, String content, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Column(length =1000000000)
	private String title;
	@Column(length = 1000000000)
	private String content;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id" ,referencedColumnName= "category_id")
	private Category category;

}
