package com.jobportal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	private Skill skill;
	private Recruiter postedBy;
	private LocalDate postedDate;

}
