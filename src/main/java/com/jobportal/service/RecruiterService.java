package com.jobportal.service;

import com.jobportal.dto.RecruiterDTO;
import com.jobportal.entity.Recruiter;

public interface RecruiterService {
	
	public Recruiter save(Recruiter recruiter) throws Exception;
	public Recruiter findBy(long id) throws Exception;
	public Recruiter update(Recruiter recruiter) throws Exception;
	

}
