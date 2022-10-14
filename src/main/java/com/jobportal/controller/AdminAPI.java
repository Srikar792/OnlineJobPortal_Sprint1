/*
package com.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.dto.AdminDTO;

@RestController
@RequestMapping("value=/admin")
public class AdminAPI {
	@Autowired
	private IAdminService iAdminService;
	
	@Autowired
	Environment environment;
	
	@PostMapping(value="/save")
	public ResponseEntity<String> save(@RequestBody AdminDTO adminDTO) throws Exception{
		AdminDTO addedAdmin = iAdminService.save(adminDTO);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}

	@PostMapping(value="/update")
	public ResponseEntity<String> update(@RequestBody AdminDTO adminDTO) throws Exception{
		AdminDTO updatedAdmin = iAdminService.update(adminDTO);
		String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
	
	@GetMapping(value="/findbyid/{adminId}")
	public ResponseEntity<AdminDTO> findById(@PathVariable Integer adminId, @RequestBody AdminDTO adminDTO) throws Exception{
		AdminDTO admin = iAdminService.findById(adminId);
		return new ResponseEntity<>(admin, HttpStatus.OK);
	}
	
}
*/