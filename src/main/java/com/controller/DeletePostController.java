package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String DeletePost(@RequestParam("id") int id) {
		this.publicPosts.deleteItemById(id);
		return "redirect:";
	}
	
}
