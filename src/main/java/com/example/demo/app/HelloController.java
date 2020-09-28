package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.PhoneBookModel;
import com.example.demo.repository.PhoneBookRepository;

@Controller
public class HelloController {

	// PhoneBookRepositoryの実装クラスをDI
	@Autowired
	PhoneBookRepository phoneBookRepository;
	
	@GetMapping("/")
	public String hello(Model model) {
		PhoneBookModel phoneBookModel = phoneBookRepository.selectByPrimaryKey("1");
		model.addAttribute("phonebook",phoneBookModel);
		model.addAttribute("greeting", "Hello, World!");
		return "hello";
	}
}
