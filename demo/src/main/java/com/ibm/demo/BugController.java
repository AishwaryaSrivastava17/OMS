package com.ibm.demo;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class BugController {
	@PostMapping("/Bug")
	String createBug() {
		return "Bug";
	}
	@GetMapping("/Bug")
	String getBug() {
		return "Bug created";
	}
	@PutMapping("/Bug/{id}")
	String updateBug(@PathVariable("id")int BugId) {
		System.out.println(BugId);
		return "Bug updated";

	}
	@DeleteMapping("/Bug/{id}")
	String deleteBug(@PathVariable("id")int BugId,HttpRequest httprequest) {
	System.out.println(httprequest.getHeaders());
		System.out.println(BugId);
		return "Bug deleted";
	}
	}

