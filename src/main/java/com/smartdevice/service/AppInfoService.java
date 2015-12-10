package com.smartdevice.service;

import java.util.List;
import java.util.Map;

import com.smartdevice.model.AppInfo;

public interface AppInfoService {
	public boolean addAppInfo(AppInfo appInfo);
	public List<Map<String, Object>> listAppInfo();
}
