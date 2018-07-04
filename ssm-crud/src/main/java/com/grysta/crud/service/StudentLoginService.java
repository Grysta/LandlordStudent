package com.grysta.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grysta.crud.bean.Student;
import com.grysta.crud.bean.StudentExample;
import com.grysta.crud.bean.StudentExample.Criteria;
import com.grysta.crud.dao.StudentMapper;



@Service
public class StudentLoginService {

	@Autowired
	StudentMapper studentMapper;
	
	public void insert(Student record)

	{

		studentMapper.insert(record);	

	}

	
	public boolean dostudentLogin(String username, String password,String []codename) {
		try {
			StudentExample example = new StudentExample();
			Criteria criteria = example.createCriteria();
			criteria.andStudentUsernameEqualTo(username);
			criteria.andStudentPasswordEqualTo(password);
			List<Student>list = studentMapper.selectByExample(example);
			
			if (list.get(0)!=null) {
				codename[0]=list.get(0).getStudentName();
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
