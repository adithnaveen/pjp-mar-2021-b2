package com.project.movies.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.movies.dao.FeedbackDao;
import com.project.movies.entity.Feedback;
import com.project.movies.interfaces.IFeedbackDAO;


// http://localhost:8080/api 

@RestController
@RequestMapping("/api")
public class FeedbackController {

	IFeedbackDAO dao = new FeedbackDao(); 
	
	
	@GetMapping("/health")
	public String health() {
		return "Service is UP.... " ; 
	}
	
	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedbacks() {
		return dao.getAllFeedback(); 
	}
	
	@GetMapping("/feedback/{fId}")
	public Feedback getFeedback( @PathVariable int fId) {
		return dao.getFeedback(fId); 
	}
	
	@PostMapping("/feedback")
	public String insertFeedback(@RequestBody Feedback feedback) {
		return dao.saveFeedbac(feedback) ? "inserted" :"Sorry not inserted";
		
	}
	
}
