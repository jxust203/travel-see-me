package com.jxust.controller;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.core.Controller;
import com.jxust.config.Constant;

public abstract class BaseController extends Controller
{
	protected int pageSize = Constant.pageSize;

	public abstract void index();

	public void render(String view)
	{
		this.setAttr("ctx", getRequest().getContextPath());
		super.render(view);
	}


	/**
	 * dwz上传文件Json
	 * @param id
	 * @param fileName
	 * @param attachmentPath
	 * @param attachmentSize
	 */
	public void toUploadJson(String id, String fileName, String attachmentPath, String attachmentSize)
	{
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("id", id);
		jsonMap.put("fileName", fileName);
		jsonMap.put("attachmentPath", attachmentPath);
		jsonMap.put("attachmentSize", attachmentSize);
		renderJson(jsonMap);
	}
}
