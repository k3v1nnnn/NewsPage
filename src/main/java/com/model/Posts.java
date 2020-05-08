package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Posts {
	private List<Item> posts;
	
	public Posts() {
		this.posts=new ArrayList<>();
	}
	
	public void addItem(Item nItem) {
		this.posts.add(nItem);
	}
	
	public List<Item> allPosts(){
		return this.posts;
	}
	
	public void deleteItem(Item oItem) {
		this.posts.remove(oItem);
	}
}
