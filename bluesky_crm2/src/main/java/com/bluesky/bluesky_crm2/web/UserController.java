package com.bluesky.bluesky_crm2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bluesky.bluesky_crm2.model.Users;
import com.bluesky.bluesky_crm2.service.UserService;

/**
 * �û����������
 * @author ������ 
 * @date 2016��7��2��
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginCheck(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "pwd") String pwd,
			Model model){
		String view = null;
		System.out.println("����LoginCheck"+name+"��"+pwd);
		Users user =userService.loging(name, pwd);
		if(user.getUlevel()==3){
			view="admin";
		}else if(user.getUlevel()==2){
			view="areaManager";
		}else if(user.getUlevel()==1){
			view="storeManager";
		}else if(user.getUlevel()==0){
			view="index";
		} 
		return view;
	}
}
