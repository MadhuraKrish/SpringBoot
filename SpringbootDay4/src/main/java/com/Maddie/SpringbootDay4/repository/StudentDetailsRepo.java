package com.Maddie.SpringbootDay4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Maddie.SpringbootDay4.Model.StudentDetails;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Integer>{

}
