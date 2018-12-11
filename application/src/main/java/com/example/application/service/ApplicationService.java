package com.example.application.service;



import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.example.application.bean.Student;

@Service
public class ApplicationService {

	@Transactional
	public Student getStudent() {

		return new Student(1, "Srinivas");
	}

	public Object getException() {

		if(0/0==0)
			System.out.println();
		return null;
	}
}
