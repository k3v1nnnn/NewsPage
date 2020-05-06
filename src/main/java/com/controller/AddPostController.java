package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Item;
import com.model.Posts;


@Controller
@RequestMapping("/addPost")
public class AddPostController {
	
	private Posts publicPosts;
		
	@Autowired
	public AddPostController(Posts nPosts) {
		this.publicPosts = nPosts;
	}
	@GetMapping
	public String CreatePost(Model model) {
		model.addAttribute("post", new Item());
		return "add_post";
	}
	
	@PostMapping
	public String AddPost(Item newPost) {
		this.publicPosts.addItem(newPost);
		return "redirect:";
	}
}
