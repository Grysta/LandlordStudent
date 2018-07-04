package com.grysta.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grysta.crud.bean.House;
import com.grysta.crud.bean.HouseExample;
import com.grysta.crud.bean.HouseExample.Criteria;
import com.grysta.crud.dao.HouseMapper;
import com.grysta.crud.dao.LandlordMapper;

@Service
public class LandlordHouseService {

	
	@Autowired
	HouseMapper houseMapper;
	
	@Autowired
	LandlordMapper landlordMapper;
	
	public List<House> getAll(int userid) {
		
		HouseExample example = new HouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouseLandlordIdEqualTo(userid);
		List<House>list=houseMapper.selectByExampleWithLandlord(example);
		System.out.println("listsize---->"+list.size());
		return list;
	}
}
