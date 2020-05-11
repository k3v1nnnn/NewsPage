package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Item;
import com.model.Posts;

@Controller
@RequestMapping("/post")
public class InfoPostController {
	private Posts publicPosts;
	
	@Autowired
	public InfoPostController(Posts nPosts) {
		this.publicPosts = nPosts;
	}
	@GetMapping
	public String InfoPost(@RequestParam("id") int id,Model model) {
		Item aux=this.publicPosts.getItemById(id);
		aux.addVisits();
		model.addAttribute("post",aux);
		return "info_post";
	}
}
