package com.hyq.demo;

import com.hyq.demo.controller.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController extends Base {

  @RequestMapping("helloworld")
  @ResponseBody
  public Result helloWorld() {
    Result res = new Result();
    return res;
  }
}
