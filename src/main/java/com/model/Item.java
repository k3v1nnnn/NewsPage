package com.model;

import java.time.LocalDate;

public class Item {
	private String title;
	private String resume;
	private LocalDate date;
	
	public Item() {
		this.date=LocalDate.now();
	}
	public Item(String nTitle,String nResume ) {
		this.title=nTitle;
		this.resume=nResume;
		this.date=LocalDate.now();
	}
	
	public String getTitle() {return this.title;}
	public String getResume() {return this.resume;}
	public LocalDate getDate() {return this.date;}
	public void setTitle(String title) {this.title=title;}
	public void setResume(String resume) {this.resume=resume;}
	public void setDate(LocalDate date) {this.date=date;}
}
