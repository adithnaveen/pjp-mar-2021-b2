package com.sapient.interfaces;

import java.util.List;

import com.sapient.entity.Feedback;

public interface IFeedbackDAO {
	public boolean saveFeedbac(Feedback feedback);
	public Feedback getFeedback(int fId); 
	public List<Feedback> getAllFeedback(); 
}
