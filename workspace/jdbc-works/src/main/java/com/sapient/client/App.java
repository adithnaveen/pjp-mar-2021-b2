package com.sapient.client;

import com.sapient.dao.FeedbackDao;
import com.sapient.entity.Feedback;
import com.sapient.interfaces.IFeedbackDAO;

public class App {
	public static void main(String[] args) {
		Feedback fd = new Feedback(); 
		
		fd.setfId(101); 
		fd.setType("Complaint");
		fd.setComment("there is some complaint" );
		fd.setStatus("Y" );
		
		
		IFeedbackDAO dao = new FeedbackDao(); 
		
//		System.out.println(dao.saveFeedbac(fd) ?"Inserted" :"Not Inserted");
		
//		System.out.println(dao.getFeedback(101));
		
		for(Feedback f : dao.getAllFeedback()) {
			
			System.out.println(f);
		}
		
		
	}
}
