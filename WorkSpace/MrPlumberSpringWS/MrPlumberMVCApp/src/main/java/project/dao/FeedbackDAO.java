package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entities.FeedbackTbl;
import project.repository.FeedbackRepo;

@Service
public class FeedbackDAO {

	@Autowired
	FeedbackRepo feedbackRepo;
	
	
	public void addFeedback(FeedbackTbl feedback)
	{
		System.out.println("in feedbackDAO class");
		feedbackRepo.save(feedback);
	}
	
	
}
