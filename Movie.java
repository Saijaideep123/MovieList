package com.design.app;

import java.io.Serializable;

public class Movie implements Serializable{
	private int id;
	private String name;
	private int year;
	private String genere;
	public Movie(int id, String name, int year, String genere) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.genere = genere;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", genere=" + genere + "]";
	}
	

}
