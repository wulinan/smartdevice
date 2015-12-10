package com.smartdevice.mapper;

import java.util.List;
import java.util.Map;

import com.smartdevice.model.AppInfo;

public interface AppInfoMapper {
	int addAppInfo(AppInfo appInfo);
	List<Map<String, Object>> listAppInfo();
}
