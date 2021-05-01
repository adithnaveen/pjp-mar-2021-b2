package com.feedback.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sapient.dao.FeedbackDao;
import com.sapient.entity.Feedback;
import com.sapient.interfaces.IFeedbackDAO;

public class FeedbackTest {

	
	IFeedbackDAO dao ; 
	Feedback fd = null;  
	@Before
	public void setUp() {
		fd = new Feedback();
		dao = new FeedbackDao(); 
		
		fd.setfId(102); 
		fd.setType("Regard");
		fd.setComment("Your website is good" );
		fd.setStatus("Y" );		
	}
	
	@Test
	public void saveFeedbackTest() {
		// expect with actual 
		assertEquals(true, dao.saveFeedbac(fd));
		
	}

}
