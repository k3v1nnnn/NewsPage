package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Posts {
	private List<Item> posts;
	private int amount;
	
	public Posts() {
		this.posts=new ArrayList<>();
		this.amount=0;
	}
	
	public void addItem(Item nItem) {
		this.amount=this.amount+1;
		nItem.setId(this.amount);
		this.posts.add(nItem);
	}
	
	public List<Item> allPosts(){
		return this.posts;
	}
	
	public void deleteItem(Item oItem) {
		this.posts.remove(oItem);
	}
	
	public Item getItemById(int id) {
		Item aux=null;
		for (Item post:this.posts) {
			if(post.getId()==id) {
				aux=post;
			}
		}
		return aux;
	}
}
