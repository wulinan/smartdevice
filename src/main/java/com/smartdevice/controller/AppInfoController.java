package com.smartdevice.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartdevice.model.AppInfo;
import com.smartdevice.service.AppInfoService;

@Controller
@RequestMapping("/app")
public class AppInfoController {

	private static Log log = LogFactory.getLog(AppInfoController.class);
	
	@Resource
	private AppInfoService appInfoService;
	
	@ResponseBody
	@RequestMapping("/add_appinfo")
	public String addApp(@ModelAttribute("appInfo") AppInfo appInfo){
		
		log.info("app_add controller in");
	//	AppInfo appInfo = new AppInfo();
		appInfo.setAppname("smartcar");
		appInfo.setDescription("test");
		appInfo.setDeviceType("car");
		appInfo.setPath("E:\test");
		appInfo.setPicture("E:\test");
		appInfo.setPublisher("zhai");
		
		Date current = new Date();
		appInfo.setpubTime(current);
		log.info("app add success");
		appInfoService.addAppInfo(appInfo);
		return "success";
	}
	
	@ResponseBody
	@RequestMapping("list_appinfo")
	public String listAppInfo(){
		
		
		return "success";
	}
	
}
