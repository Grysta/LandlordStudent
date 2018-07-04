package com.grysta.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grysta.crud.bean.House;
import com.grysta.crud.service.HouseService;

/**
 * 处理房子增删改查
 * @author Grysta
 *
 */
@Controller
public class HouseController {
	
	@Autowired
	HouseService houseService;
	
	/**
	 * 查询员工数据
	 * @return
	 */
	@RequestMapping("/houses")
	public String getHouses(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		
		PageHelper.startPage(pn, 5);
		List<House> houses = houseService.getAll();
		PageInfo page = new PageInfo(houses,5);
		model.addAttribute("pageInfo", page);
		return "list";
	}
	
	@ResponseBody
	public PageInfo getHousesWithJson() {
		return null;
	}
	
}
