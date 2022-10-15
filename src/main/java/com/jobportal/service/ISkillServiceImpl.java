//package com.jobportal.service;
//
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jobportal.DTO.SkillDTO;
//import com.jobportal.entity.Skill;
//
//
//@Service(value="iSkillService")
//@Transactional
//public class ISkillServiceImpl implements ISkillService{
//	
//	
//	@Autowired
//	ISkillDAO iSkillDAO;
//	
//	@Override
//	public SkillDTO save(SkillDTO skillDTO) throws Exception {
//		
//		Skill skill = null;
//		skill.setName(skillDTO.getName());
//		skill.setDescription(skillDTO.getDescription());	
//		iSkillDAO.save(skill);
//		return skillDTO;
//	}
//	
//	
//	@Override
//	public SkillDTO update(SkillDTO skillDTO) throws Exception{
//		Optional<Skill> optional = iSkillDAO.findById(skillDTO.getId());
//		Skill skill1 = optional.orElseThrow(() -> new Exception("Service.ADMIN_NOT_FOUND"));
//		skill1.setName(skillDTO.getName());
//		skill1.setDescription(skillDTO.getDescription());
//		return skillDTO;
//	}
//	
//	@Override
//	public void remove(SkillDTO skillDTO) throws Exception{
//		Optional<Skill> optional = iSkillDAO.findById(skillDTO.getId());
//		Skill skill2 = optional.orElseThrow(() -> new Exception("Service.ADMIN_NOT_FOUND"));
//		iSkillDAO.delete(skill2);
//	}
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
//	@Override
//	public SkillDTO findById(int Id) throws Exception{
//		Optional<Admin> optional = iAdminDao.findById(Id);
//		Admin admin = optional.orElseThrow(() -> new Exception("Service.ADMIN_NOT_FOUND"));
//		AdminDTO adminDTO = null;
//		adminDTO.setId(admin.getId());
//		adminDTO.setFirstName(admin.getFirstName());
//		adminDTO.setLastName(admin.getLastName());
//		adminDTO.setPassword(admin.getPassword());
//		return adminDTO;
	}