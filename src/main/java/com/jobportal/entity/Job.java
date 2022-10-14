package com.jobportal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	//private Skill skill;
	@OneToOne
	@JoinColumn(name = "recruiter_id", unique = true)
	private Recruiter postedBy;
	private LocalDate postedDate;
}


