package br.com.alura.linguagensapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principasLinguagens")

public class Linguagem {
	
	@Id
	private String id;
	private String title;
	private String image;
	private int ranking;	
	
	public Linguagem(String title, String image, int ranking) {
		super();
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	
	public Linguagem() {
		
	}
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	public int getRanking() {
		return ranking;
	}
	

	
}
