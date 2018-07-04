package com.grysta.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grysta.crud.bean.Landlord;
import com.grysta.crud.service.LandlordLoginService;


@Controller
public class LandlordLoginController {
	
	
	
	@Autowired
	LandlordLoginService landlordLoginService;
	
	@RequestMapping("/doLandlordLogin")
	public String doLogin(@RequestParam String username, @RequestParam String password,Model model){
		
		Integer code[] = {0};
		String codename[]= {"0"};
			
			if (landlordLoginService.doLandlordLogin(username, password,code,codename)) {
				model.addAttribute("userid", code[0]);
				model.addAttribute("landlordname", codename[0]);
				System.out.println("第二部"+code[0]);
				return "landlordHome";
			}else {
				return "landlord";
			}
		
	}
	
	@RequestMapping("/landlordLogout")
	public String landlordLogout() {
		return "landlord";
	}
	
	@RequestMapping("/landlordRegistPage")
	public String tolandlordRegistPage() {
		return "landlordRegist";
	}
	
	@RequestMapping("/landlordRegist")
	public String regist(@RequestParam String landlordName, @RequestParam String landlordUsername,

			@RequestParam String landlordPassword, @RequestParam String landlordAddress,

			@RequestParam String landlordPhone)

	{

		Landlord s = new Landlord();

		try

		{

			s.setLandlordAddress(landlordAddress);

			s.setLandlordName(landlordName);

			s.setLandlordPassword(landlordPassword);

			s.setLandlordPhone(landlordPhone);

			s.setLandlordUsername(landlordUsername);

			landlordLoginService.insert(s);

		}

		catch (Exception e)

		{

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return "landlordLogin";

	}
}
