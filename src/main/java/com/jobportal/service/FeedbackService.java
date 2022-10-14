package com.jobportal.service;

import java.util.List;

import com.jobportal.dto.FeedbackDTO;
import com.jobportal.entity.Feedback;
import com.jobportal.entity.Freelancer;
import com.jobportal.entity.Recruiter;

public interface FeedbackService {
	
	public Feedback createFeedback(Recruiter recruiter,Freelancer freelancer,int rating,String review) throws Exception;
	public int averageRating(Freelancer freelancer) throws Exception;
	public List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer) throws Exception;

}
