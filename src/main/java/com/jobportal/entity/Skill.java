package com.jobportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	
	public Skill() {
		super();
	}
	
	public Skill(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name, description);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Skill other = (Skill) obj;
//		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
//				&& Objects.equals(description, other.description);
//	}

	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
//		return result;
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Skill other = (Skill) obj;
//		if (this.getId() == null) {
//			if (other.getId() != null)
//				return false;
//		}else if (!this.getId().equals(other.getId()))
//			return false;
//		return true;
//	}
//	public SkillDTO getskillExperience() {
//		
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
