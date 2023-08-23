package com.Maddie.SpringbootDay4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Maddie.SpringbootDay4.Model.StudentDetails;
import com.Maddie.SpringbootDay4.repository.StudentDetailsRepo;

@Service
public class StudentDetailsService {
	@Autowired
	StudentDetailsRepo studentrepository;
	
	public StudentDetails saveTheInfo(StudentDetails detail)
	{
		return studentrepository.save(detail);
	}
	public List<StudentDetails> showTheInfo()
	{
		return studentrepository.findAll();
	}
	public Optional<StudentDetails> showInfoById(int id)
	{
		return studentrepository.findById(id);
	}
	public String changeInfoById(int id, StudentDetails detail)
	{
		studentrepository.saveAndFlush(detail);
		if(studentrepository.existsById(id))
		{
			return "The values are Updated";
		}
		else
		{
			return "Please Enter the Valid Id";
		}
	}
	public void deleteById(int id)
	{
		studentrepository.deleteById(id);
	}
}
