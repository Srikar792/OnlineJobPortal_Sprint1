package com.jobportal.service;

import java.util.List;

import com.jobportal.entity.BookmarkedFreelancer;
import com.jobportal.entity.Freelancer;
import com.jobportal.entity.Recruiter;
import com.jobportal.entity.Skill;

public interface BookmarkFreelancerService {
	
	public BookmarkedFreelancer bookmarkFreelancer(Freelancer freelancer,Skill skill,Recruiter recruiter) throws Exception;
	public List<BookmarkedFreelancer> findBookmarkedFreelancerBySkill(Skill skill,Recruiter recruiter)throws Exception;
	public void removeBookmarkedFreelancer(Freelancer freelancer,Skill skill,Recruiter recruiter) throws Exception;
	public BookmarkedFreelancer findById(long id) throws Exception;
}
