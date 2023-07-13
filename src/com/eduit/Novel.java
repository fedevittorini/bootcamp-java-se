package com.eduit;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Novel extends Book {
	
	private String edition;

	public Novel() {
	}	
		
	public Novel(String name, Date publishDate, Integer pages, String sinopsis, List<Author> author,
			Map<String, String> content, PublicationStage stage, String edition) {
		super(name, publishDate, pages, sinopsis, author, content, stage);
		this.edition = edition;
	}
}
