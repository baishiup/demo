package com.hyq.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class Exception extends Base {
	// 404
	@RequestMapping("ExceptionNotFound")
	@ResponseBody
	public Result ExceptionNotFound(HttpServletResponse response) {
		response.setStatus(404);
		Result res = new Result();
		res.setMessage("瞅啥呢?");
		res.setState(404);
		return res;
	}

	// 500
	@RequestMapping("ExceptionSystemError")
	@ResponseBody
	public Result ExceptionSystemError(HttpServletResponse response) {
		response.setStatus(500);
		Result res = new Result();
		res.setMessage("出bug了!");
		res.setState(500);
		return res;
	}
}
