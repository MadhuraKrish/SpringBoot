package com.Maddie.SpringbootDay4.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Maddie.SpringbootDay4.Model.StudentDetails;
import com.Maddie.SpringbootDay4.Service.StudentDetailsService;

@RestController
public class StudentController {
	@Autowired
	StudentDetailsService studentservice;
	
	@PostMapping("save")
	public StudentDetails add(@RequestBody StudentDetails detail)
	{
		return studentservice.saveTheInfo(detail);
	}
	
	@GetMapping("Display")
	public List<StudentDetails> showMe()
	{
		return studentservice.showTheInfo();
	}
		
	@PutMapping("update/{id}")
	public String modifyById(@PathVariable int id, @RequestBody StudentDetails detail)
	{
		return studentservice.changeInfoById(id, detail);
	}
	
	@DeleteMapping("delete/{id}")
	public void deletebyid(@PathVariable int id)
	{
		studentservice.deleteById(id);
	}
}
