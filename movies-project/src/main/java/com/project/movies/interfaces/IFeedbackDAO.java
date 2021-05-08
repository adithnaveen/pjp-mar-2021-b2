package com.project.movies.interfaces;

import java.util.List;

import com.project.movies.entity.Feedback;

public interface IFeedbackDAO {
	public boolean saveFeedbac(Feedback feedback);
	public Feedback getFeedback(int fId); 
	public List<Feedback> getAllFeedback(); 
}
