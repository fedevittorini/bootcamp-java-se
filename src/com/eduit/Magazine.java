package com.eduit;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.otro.CustomEx;
import com.otro.CustomEx2;

public class Magazine extends Book {

	public Magazine() {
	}	
	
	public Magazine(String name, Date publishDate, Integer pages, List<Author> author,
			Map<String, String> content, PublicationStage stage) {
		super(name, publishDate, pages, "", author, content, stage);
	}
	
	@Override
	public String getSinopsis() throws Exception {
		throw new RuntimeException("Accesing to getSinopsis is not allowed on Magazine struct");
	}

	@Override
	public void setSinopsis(String sinopsis) throws Exception {
		throw new RuntimeException("Writing to setSinopsis is not allowed on Magazine struct");
	}
	
	public void write(String data) {
		
		File f = new File("file.txt");
		InputStream i = null;
		try {
			i = new FileInputStream(f);
			ByteArrayInputStream b = new ByteArrayInputStream(i.readAllBytes());
			b = null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (i != null) {
				try {
					i.close();
				} catch (IOException e) {

				}
			}
		}
		i = null;
	}
	
	public void read() {
		try {
			line("a");
		} catch (CustomEx | CustomEx2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		throw new RuntimeException("Writing to setSinopsis is not allowed on Magazine struct");
	}
	
	
	private String line(String s) throws CustomEx, CustomEx2, IOException {
		if (s != null && s.startsWith("H")) {
			throw new CustomEx2("No me gustan las H al comienzo");			
		}
		if (s != null && s.startsWith("T")) {
			throw new IOException("No me gustan las T al comienzo");			
		}
		return "Line";
	}
	
}
