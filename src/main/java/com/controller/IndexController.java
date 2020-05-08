package com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Item;
import com.model.Posts;

@Controller
@RequestMapping("/")
public class IndexController {
	private Posts publicPosts;
	@Autowired
	public IndexController( Posts nPosts) {
		this.publicPosts = nPosts;
		this.publicPosts.addItem(new Item("Hi","firts time !!!","text"));
		this.publicPosts.addItem(new Item("Hi_1","firts time !!!","text"));
		this.publicPosts.addItem(new Item("Hi_2","firts time !!!","text"));
		this.publicPosts.addItem(new Item("Hi_3","firts time !!!","text"));
	}
	
	@GetMapping
	public String Index(Model model) {
		model.addAttribute("posts", this.publicPosts.allPosts());
		return "index";
	}
}
