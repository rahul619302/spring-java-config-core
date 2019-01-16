package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.services.IStudentService;

@Controller
public class StudentController {

	@Autowired
	private IStudentService service;

	public void saveStudent(int roll, String name) {
		service.saveStudent(roll, name);
	}

	public void displayStudent() {
		service.display();
	}

}
