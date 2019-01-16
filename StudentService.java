package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IStudentDao;
import com.lti.pojo.Student;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentDao dao;

	@Override
	public void saveStudent(int roll, String name) {
		Student student = new Student(roll, name);
		dao.getList();
		dao.setList(student);
	}

	@Override
	public void display() {
		System.out.println(dao.getList());
	}
}
