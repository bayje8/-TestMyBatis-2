package com.example.demo.type.aliases;

public class Film {
	private int filmId;
	private String title;
	private String description;

	public Film() {
	}

	public Film(int filmId, String title, String description) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.description = description;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
