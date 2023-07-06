package com.eduit;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase esta pensada para representar un libro.
 * 
 *
 */
public class Book {
	
	public static final String INDEX_PAGE = "IND";
	
	public static final String PROLOG_PAGE = "P";
	
	public static final String THANKS_PAGE = "T";
	
	public static final String DATE_PATTERN = "YYYY-MM-DD";
	

	/**
	 * The Book name attribute.
	 */
	private String name;
	/**
	 * The Book publish date attribute.
	 */
	private Date publishDate;
	/**
	 * The Book pages attribute which reprents the amount of pages.
	 */
	private Integer pages;
	
	private String sinopsis;
	
	private List<Author> author;
	
	private Map<String, String> content = new HashMap<>();
	
	public Book() {
	}	
		


	
	public Book(String name, Date publishDate, Integer pages, String sinopsis, List<Author> author,
			Map<String, String> content) {
		super();
		this.name = name;
		this.publishDate = publishDate;
		this.pages = pages;
		this.sinopsis = sinopsis;
		this.author = author;
		this.content = content;
	}




	public void setName(String theName) {
		this.name = theName;
	}
	
	public String getName() {
		return this.name;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public Map<String, String> getContent() {
		return content;
	}
	public void setContent(Map<String, String> content) {
		this.content = content;
	}
	
}
