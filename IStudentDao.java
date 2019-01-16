package com.lti.dao;

import java.util.List;

import com.lti.pojo.Student;

public interface IStudentDao {

	List<Student> getList();

	void setList(Student student);
}
