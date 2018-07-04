package com.grysta.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grysta.crud.bean.House;
import com.grysta.crud.dao.HouseMapper;

@Service
public class NewHouseService {
	
	@Autowired
	HouseMapper houseMapper;
	
	public void CreateHouse(House house) {
		houseMapper.insertSelective(house);
	}
}
