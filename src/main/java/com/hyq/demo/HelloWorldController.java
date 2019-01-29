package com.hyq.demo;

import com.hyq.demo.controller.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController extends Base {

  @RequestMapping(value = "helloworld")
  @ResponseBody
  public Result helloWorld() {
    List<Result> list = new ArrayList<>();
    list.add(new Result());
    list.add(new Result());
    list.add(new Result());
    list.add(new Result());
    Result res = new Result();
    res.setData(list);
    return res;
  }
}
