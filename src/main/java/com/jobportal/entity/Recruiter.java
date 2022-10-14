package com.jobportal.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Recruiter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="recruiter_id")
	private List<Job> postedJobs;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="recruiter_id")
	private List<Feedback> Feedbacks;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="recruiter_id")
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
//	public List<BookmarkedFreelancer> getFreelancers() {
//		return freelancers;
//	}
//	public void setFreelancers(List<BookmarkedFreelancer> freelancers) {
//		this.freelancers = freelancers;
//	}
	@Override
	public String toString() {
		return "Recruiter [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Feedbacks="
				+ Feedbacks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Feedbacks, firstName, id, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recruiter other = (Recruiter) obj;
		return Objects.equals(Feedbacks, other.Feedbacks) && Objects.equals(firstName, other.firstName)
				&& id == other.id && Objects.equals(lastName, other.lastName);
	}
	
	
	

}
