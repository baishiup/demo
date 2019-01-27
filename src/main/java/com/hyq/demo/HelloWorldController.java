package com.hyq.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
  @RequestMapping(value = "helloworld.do", method = RequestMethod.GET)
  @ResponseBody
  public String helloWorld() {

    User u = new User();

    return "{index:400}";
  }

  @RequestMapping("notFound")
  @ResponseBody
  public String notFound() {
    return "404";
  }

  public class User {
    private String name;
    private int age;

    public User() {
      this.name = "asd";
    }
  }
}
