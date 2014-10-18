package com.jxust.controller;

import com.jfinal.ext.route.ControllerBind;

@ControllerBind(controllerKey = "/login")
public class LoginController extends BaseController
{

	public void index()
	{
		render("index.html");
	}

}
