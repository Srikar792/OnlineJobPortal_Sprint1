package com.jobportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookmarkedFreelancer {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	private Skill skill;
	private Freelancer freelancer;
	//Is there any relation to be add here?
	private Recruiter bookmarkedBy;
	
	public BookmarkedFreelancer(long id, Skill skill, Freelancer freelancer, Recruiter bookmarkedBy) {
		super();
		this.id = id;
		this.skill = skill;
		this.freelancer = freelancer;
		this.bookmarkedBy = bookmarkedBy;
	}
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
		return "BookmarkedFreelancer [id=" + id + ", skill=" + skill + ", freelancer=" + freelancer + ", bookmarkedBy="
				+ bookmarkedBy + "]";
	}

}
