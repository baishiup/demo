package com.hyq.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exception {
    // 404
  	@RequestMapping("ExceptionNotFound")
    @ResponseBody
  	public String ExceptionNotFound(){
  	    return "ExceptionNotFound";
    }

    // 500
    @RequestMapping("ExceptionSystemError")
    @ResponseBody
    public String ExceptionSystemError(){
  	    return "ExceptionSystemError";
    }
}
