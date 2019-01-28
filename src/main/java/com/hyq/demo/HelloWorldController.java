package com.hyq.demo;

import com.hyq.demo.controller.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController extends Base {

  @RequestMapping(value="helloworld")
  @ResponseBody
  public User helloWorld() {
//    Result res = new Result();

    User res = new User();
    return res;
  }

  public class User{
    String name = "asdasd";
  }
}
