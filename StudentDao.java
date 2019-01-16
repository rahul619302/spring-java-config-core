package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.pojo.Student;

@Repository
public class StudentDao implements IStudentDao {

	private List<Student> list;

	@Override
	public List<Student> getList() {
		if (list == null)
			list = new ArrayList<>();
		return list;
	}

	@Override
	public void setList(Student student) {
		this.list.add(student);
	}

}
