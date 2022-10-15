//package com.jobportal.service;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jobportal.DTO.FreelancerDTO;
//import com.jobportal.DTO.SkillDTO;
//import com.jobportal.DTO.SkillExperienceDTO;
//import com.jobportal.entity.Skill;
//import com.jobportal.repository.ISkillExperienceDAO;
//
//@Service
//@Transactional
//public class ISkillExperienceServiceImpl implements ISkillExperienceService{
//
//		@Autowired
//		ISkillExperienceDAO iSkillExperienceDAO;
//		
//		@Override
//		public SkillExperienceDTO addSkill(SkillDTO skillDTO, FreelancerDTO freelancerDTO, int ExperienceYears) throws Exception{
//			Skill skill = null;
//			skill.setSkill(jobDTO.getSKill());
//			skill.setRecruiter(jobDTO.getRecruiter());
//			skill.setPostedDate(jobDTO.getPostedDate());
//			skill.setAwardedTo(jobDTO.getAwarderTo());
//			skill.setJobApplicationsList(jobDTO.getApplicationsList());
//			skill.setActive(jobDTO.getActive());
//			
//			List<JobApplication> applications = freelancerDTO.getAppliedJobs();
//			int idAppliedJob;
//			int count = 0;
//			for(JobApplication jobApp : applications) {
//				
//				if(jobApp.getJob() == job) {
//					count++;
//					idAppliedJob = jobApp.getId();
//					break;
//				}
//			}
//			if(count > 0) {
//				throw new Exception("Service.ALREADY_APPLIED");
//			}
//			
//			JobApplication jobApplication = null;
//			jobApplication.setCoverLetter(coverletter);
//			jobApplication.setJob(job);
//			jobApplication.setAppliedDate(LocalDateTime.now());
//			iJobApplicationDao.save(jobApplication);
//			
//			JobApplicationDTO jobApplicationDTO = null;
//			jobApplicationDTO.setId(jobApplication.getId());
//			jobApplicationDTO.setCoverLetter(coverletter);
//			jobApplicationDTO.setJob(job);
//			jobApplicationDTO.setAppliedDate(jobApplication.getAppliedDate());
//			
//			return jobApplicationDTO;
//			
//			
//			
//			
//		}
//		@Override
//		public JobApplicationDTO updateJobApplication(JobDTO jobDTO, String coverLetter, FreelancerDTO freelancerDTO) throws Exception{
//			Job job = null;
//			job.setSkill(jobDTO.getSKill());
//			job.setRecruiter(jobDTO.getRecruiter());
//			job.setPostedDate(jobDTO.getPostedDate());
//			job.setAwardedTo(jobDTO.getAwarderTo());
//			job.setJobApplicationsList(jobDTO.getApplicationsList());
//			job.setActive(jobDTO.getActive());
//			
//			List<JobApplication> applications = freelancerDTO.getAppliedJobs();
//			int idAppliedJob;
//			int count = 0;
//			for(JobApplication jobApp : applications) {
//				
//				if(jobApp.getJob() == job) {
//					count++;
//					idAppliedJob = jobApp.getId();
//					break;
//				}
//			}
//			if(count == 0) {
//				throw new Exception("Service.NOT_APPLIED");
//			}
//			
//			Optional<JobApplication> optional = iJobApplicationDao.findById(idAppliedJob);
//			JobApplication jobApplication = optional.orElseThrow(() -> new Exception());
//			jobApplication.setCoverLetter(coverLetter);
//			
//			JobApplicationDTO jobApplicationDTO = null;
//			jobApplicationDTO.setId(jobApplication.getId());
//			jobApplicationDTO.setCoverLetter(jobApplication.getCoverLetter());
//			jobApplicationDTO.setJob(job);
//			jobApplicationDTO.setAppliedDate(jobApplication.getAppliedDate());
//			return jobApplicationDTO;
//		}
//
//	
//	
//	
//	
//}
