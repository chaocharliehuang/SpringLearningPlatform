package com.chaocharliehuang.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller("/")
public class Fortran {

	@GetMapping("")
	public String index() {
		return "index";
	}
	
	@GetMapping("m/{chapter}/0553/{lessonNumber}")
	public String lesson(
			@PathVariable("chapter") String chapter, 
			@PathVariable("lessonNumber") String lessonNumber, 
			Model model) {
		String content = "";
		if (lessonNumber.equals("0733")) {
			content = "Setting Up Your Servers";
		} else if (lessonNumber.equals("0342")) {
			content = "Punch Cards";
		} else if (lessonNumber.equals("0348")) {
			content = "Advanced Fortran Intro";
		}
		model.addAttribute("content", content);
		return "lesson";
	}
	
	@GetMapping("m/{chapter}/0483/{assignmentNumber}")
	public String assignment(
			@PathVariable("chapter") String chapter, 
			@PathVariable("assignmentNumber") String assignmentNumber, 
			Model model) {
		String content = "";
		if (assignmentNumber.equals("0345")) {
			content = "Coding Forms";
		} else if (assignmentNumber.equals("2342")) {
			content = "Fortran to Binary";
		}
		model.addAttribute("content", content);
		return "assignment";
	}
}
