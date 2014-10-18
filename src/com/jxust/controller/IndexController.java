package com.jxust.controller;

import com.jfinal.ext.route.ControllerBind;

@ControllerBind(controllerKey = "/")
public class IndexController extends BaseController
{
	public void index()
	{	
		render("index.html");
	}
}
