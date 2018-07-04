package com.grysta.crud.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grysta.crud.bean.Student;
import com.grysta.crud.service.StudentLoginService;

@Controller
public class StudentLoginController {

	@Autowired
	StudentLoginService studentLoginService;

	@RequestMapping("/dostudentLogin")
	public String doLogin(@RequestParam String username, @RequestParam String password,Model model) {

		String codename[] = { "0" };
		if (studentLoginService.dostudentLogin(username, password,codename)) {
			model.addAttribute("studentname", codename[0]);
			return "studentHome";
		} else {
			return "student";
		}

	}

	@RequestMapping("/studentLogout")
	public String studentLogout() {
		return "student";
	}

	@RequestMapping("/studentRegistPage")
	public String toStudentRegistPage() {
		return "studentRegist";
	}

	@RequestMapping("/studentRegist")
	public String regist(@RequestParam String studentName, @RequestParam String studentUsername,

			@RequestParam String studentPassword, @RequestParam String studentAddress,

			@RequestParam String studentPhone, @RequestParam String studentGender, @RequestParam String studentBirthday)

	{

		Student s = new Student();

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

		try

		{

			s.setStudentAddress(studentAddress);

			s.setStudentBirthday(f.parse(studentBirthday));

			s.setStudentGender(studentGender);

			s.setStudentName(studentName);

			s.setStudentPassword(studentPassword);

			s.setStudentPhone(studentPhone);

			s.setStudentUsername(studentUsername);

			studentLoginService.insert(s);

		}

		catch (ParseException e)

		{

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return "studentLogin";

	}

}
