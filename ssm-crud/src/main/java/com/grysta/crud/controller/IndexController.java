package com.grysta.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grysta.crud.bean.House;
import com.grysta.crud.service.HouseService;
import com.grysta.crud.service.LandlordHouseService;

@Controller
public class IndexController {

	@Autowired
	HouseService houseService;
	
	@Autowired
	LandlordHouseService landlordHouseService;
	
	@RequestMapping("/landlord")
	public String toLandlord() {
		return "landlord";
	}
	
	@RequestMapping("/error")
	public String toError() {
		return "error";
	}
	

	@RequestMapping("/student")
	public String toStudent() {
		return "student";
	}

	@RequestMapping("/landlordLogin")
	public String toLandlordLogin() {
		return "landlordLogin";
	}

	@RequestMapping("/studentLogin")
	public String toStudentLogin() {
		return "studentLogin";
	}

	@RequestMapping("/studentHouse")
	public String toStudentHouse(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {

		PageHelper.startPage(pn, 5);
		List<House> houses = houseService.getAll();
		PageInfo page = new PageInfo(houses, 5);
		model.addAttribute("pageInfo", page);
		PageHelper.startPage(pn,5);
		return "studentHouse";
	}
	
	@RequestMapping("/landlordHouse")
	public String toLandlordHouse(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam(value="userid") int userid,Model model) {
		
		
		List<House> houses = landlordHouseService.getAll(userid);
		PageInfo page = new PageInfo(houses,5);
		
		model.addAttribute("pageInfo", page);
		
		PageHelper.startPage(pn,5);
		
		return "landlordHouse";
	}
	

	
}
