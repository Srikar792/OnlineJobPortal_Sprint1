package com.jobportal.dto;

import java.util.List;

import com.jobportal.entity.BookmarkedFreelancer;
import com.jobportal.entity.Feedback;
import com.jobportal.entity.Job;

public class RecruiterDTO {
	private long id;
	private String firstName;
	private String lastName;
	private List<Job> postedJobs;
	private List<Feedback> Feedbacks;
	private List<BookmarkedFreelancer> freelancers;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Job> getPostedJobs() {
		return postedJobs;
	}
	public void setPostedJobs(List<Job> postedJobs) {
		this.postedJobs = postedJobs;
	}
	public List<Feedback> getFeedbacks() {
		return Feedbacks;
	}
	public void setFeedbacks(List<Feedback> feedbacks) {
		Feedbacks = feedbacks;
	}
	public List<BookmarkedFreelancer> getFreelancers() {
		return freelancers;
	}
	public void setFreelancers(List<BookmarkedFreelancer> freelancers) {
		this.freelancers = freelancers;
	}
	@Override
	public String toString() {
		return "RecruiterDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", postedJobs="
				+ postedJobs + ", Feedbacks=" + Feedbacks + ", freelancers=" + freelancers + "]";
	}
	
	

}
