package com.grysta.crud.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grysta.crud.bean.House;
import com.grysta.crud.dao.HouseMapper;
import com.grysta.crud.service.NewHouseService;

@Controller
public class NewHouse {
	
	@Autowired
	NewHouseService service;
	
	
	@RequestMapping("newHouse")
	public String toNewHouse() {
		return "newHouse";
	}
	
	@RequestMapping("createHouse")
	public String CreateHouse(@RequestParam String houseAddress, @RequestParam String houseType,@RequestParam int housePeople,@RequestParam int housePrice,@RequestParam int houseLandlordId){
		try {
			
			service.CreateHouse(new House(null,houseAddress,houseType,housePeople,housePrice,houseLandlordId,"0"));;
			
		} catch (Exception e) {
			return "error";
		}
		return "landlordHouse";
	}
}
