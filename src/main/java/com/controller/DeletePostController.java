package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Item;
import com.model.Posts;

@Controller
@RequestMapping("/delete")
public class DeletePostController {
	
	private Posts publicPosts;
	@Autowired
	public DeletePostController(Posts nPosts) {
		this.publicPosts = nPosts;
	}
	
	@PostMapping
	public void DeletePost(Item oItem) {
		this.publicPosts.deleteItem(oItem);
	}
	
}
