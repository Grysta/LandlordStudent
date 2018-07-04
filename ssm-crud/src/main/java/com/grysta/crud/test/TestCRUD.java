package com.grysta.crud.test;


import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.grysta.crud.bean.House;
import com.grysta.crud.bean.HouseExample;
import com.grysta.crud.bean.HouseExample.Criteria;
import com.grysta.crud.bean.Landlord;
import com.grysta.crud.bean.Student;
import com.grysta.crud.bean.StudentExample;
import com.grysta.crud.dao.HouseMapper;
import com.grysta.crud.dao.LandlordMapper;
import com.grysta.crud.dao.StudentMapper;
import com.mysql.fabric.xmlrpc.base.Data;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestCRUD {
	
	@Autowired
	LandlordMapper landlordMapper;
	
	@Autowired
	HouseMapper houseMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	StudentMapper studentMapper;
	
	
	@Test
	public void testCRUD(){
		//houseMapper.insertSelective(new House(null,"XiamenJimeiHuaqiaodaxue","0",5,3000,11,"0"));
		/*HouseMapper mapper=sqlSession.getMapper(HouseMapper.class);
		for (int i = 0; i < 1000; i++) {
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new House(null, uid, "0", i, i, 9, "0"));
		}
		System.out.println("成功");*/
		
		/*List<House> list = houseMapper.selectByExampleWithLandlord(null);
		
		System.out.println(list.get(1).getLandlord().getLandlordName());*/
		
		
		/*StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStudentUsernameEqualTo("cuihua");
		criteria.andStudentPasswordEqualTo("cuihua");
		//example.setOrderByClause("username asc,email desc");
		List<Student>list = studentMapper.selectByExample(example);
		
		System.out.println(list.get(0).getStudentName());
		//相当于：select * from user where username = 'wyw' and  username is null order by username asc,email desc
		*/
		
		/*HouseExample example = new HouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andHouseLandlordIdEqualTo(9);
		List<House>list=houseMapper.selectByExampleWithLandlord(example);
		System.out.println("listsize"+list.size());*/
		
	}
}
