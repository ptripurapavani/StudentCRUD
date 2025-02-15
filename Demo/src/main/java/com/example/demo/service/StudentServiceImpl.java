package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;
	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
