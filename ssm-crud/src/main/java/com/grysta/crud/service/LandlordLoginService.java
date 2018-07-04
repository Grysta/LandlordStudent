package com.grysta.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.grysta.crud.bean.Landlord;
import com.grysta.crud.bean.LandlordExample;
import com.grysta.crud.bean.LandlordExample.Criteria;
import com.grysta.crud.bean.Student;
import com.grysta.crud.dao.LandlordMapper;
import com.grysta.crud.dao.StudentMapper;


@Service
public class LandlordLoginService {

	@Autowired
	LandlordMapper landlordMapper;
	
	public void insert(Landlord record)

	{

		landlordMapper.insert(record);	

	}

	
	public boolean doLandlordLogin(String username, String password,Integer[] code,String[] codename) {
		try {
			LandlordExample example = new LandlordExample();
			Criteria criteria = example.createCriteria();
			criteria.andLandlordUsernameEqualTo(username);
			criteria.andLandlordPasswordEqualTo(password);
			List<Landlord>list = landlordMapper.selectByExample(example);
			
			
			if (list.get(0)!=null) {
				code[0]=list.get(0).getLandlordId();
				codename[0]=list.get(0).getLandlordName();
				System.out.println("第一步"+code[0]);
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
