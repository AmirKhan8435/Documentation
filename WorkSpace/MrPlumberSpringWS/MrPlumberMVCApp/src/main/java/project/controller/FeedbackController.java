package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import project.dao.FeedbackDAO;
import project.entities.FeedbackTbl;


@Controller
public class FeedbackController {

	@Autowired
	FeedbackDAO feedbackDao;
	
	@RequestMapping("/addfeedback")
	public String feedback()
	{
		System.out.println("in feedback");
		return "addfeedback";
	}
	
	@PostMapping("/addFeedback")
	public String addFeedback(@RequestBody FeedbackTbl feedback)
	{
		System.out.println("in ajax");
		feedbackDao.addFeedback(feedback);
		return "zalre";	
	}
	
	
	
}
