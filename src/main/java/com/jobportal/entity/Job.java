package com.jobportal.entity;
import java.time.LocalDate;

import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Job {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id ;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "skill_id", unique = true)
private Skill skill;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "recruiter_id", unique = true)
private  Recruiter postedBy;
private  LocalDate postedDate;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "freelancer_id", unique = true)
private Freelancer awardedTo;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "job_id", unique = true)
private  List<JobApplication> jobApplications;

private Boolean active;

public Job() {
	super();
	
}


public Job(long id, Skill skill, Recruiter postedBy, LocalDate postedDate, Freelancer awardedTo,
		List<JobApplication> jobApplications, Boolean active) {
	super();
	this.id = id;
	this.skill = skill;
	this.postedBy = postedBy;
	this.postedDate = postedDate;
	this.awardedTo = awardedTo;
	this.jobApplications = jobApplications;
	this.active = active;
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
public Recruiter getPostedBy() {
	return postedBy;
}
public void setPostedBy(Recruiter postedBy) {
	this.postedBy = postedBy;
}

public List<JobApplication> getJobApplications() {
	return jobApplications;
}
public void setJobApplications(List<JobApplication> jobApplications) {
	this.jobApplications = jobApplications;
}
public Boolean getActive() {
	return active;
}
public void setActive(Boolean active) {
	this.active = active;
}


@Override
public String toString() {
	return "Job [id=" + id + ", skill=" + skill + ", postedBy=" + postedBy + ", postedDate=" + postedDate
			+ ", awardedTo=" + awardedTo + ", jobApplications=" + jobApplications + ", active=" + active + "]";
}

@Override
public int hashCode() {
	return Objects.hash(active, awardedTo, id, jobApplications, postedBy, postedDate, skill);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Job other = (Job) obj;
	return Objects.equals(active, other.active) && Objects.equals(awardedTo, other.awardedTo) && id == other.id
			&& Objects.equals(jobApplications, other.jobApplications) && Objects.equals(postedBy, other.postedBy)
			&& Objects.equals(postedDate, other.postedDate) && Objects.equals(skill, other.skill);
}


}



