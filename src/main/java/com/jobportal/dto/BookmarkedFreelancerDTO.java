package com.jobportal.dto;

import com.jobportal.entity.Freelancer;
import com.jobportal.entity.Recruiter;
import com.jobportal.entity.Skill;

public class BookmarkedFreelancerDTO {
	private long id;
	private Skill skill;
	private Freelancer freelancer;
	private Recruiter bookmarkedBy;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	public Recruiter getBookmarkedBy() {
		return bookmarkedBy;
	}
	public void setBookmarkedBy(Recruiter bookmarkedBy) {
		this.bookmarkedBy = bookmarkedBy;
	}
	
	
	@Override
	public String toString() {
		return "BookmarkedFreelancerDTO [id=" + id + ", skill=" + skill + ", freelancer=" + freelancer
				+ ", bookmarkedBy=" + bookmarkedBy + "]";
	}
	
	
	

}
