package com.hyq.demo.controller;

import com.hyq.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloWorldController extends Base {
  @Autowired
  private UserMapper userMapper;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public Result welcome(HttpServletResponse response) {
    Result result = new Result();
    result.setMessage("welcome this project阿萨");

    List allUserList = userMapper.findAll();

    // 插入一条
    userMapper.addUser("测试" + allUserList.size(),1211111113);


    for (int i = 0; i < allUserList.size(); i++) {
      System.out.println(allUserList.get(i).toString());
    }
    result.setData(allUserList);
    return result;
  }

  @RequestMapping(value = "helloworld", method = RequestMethod.GET)
  @ResponseBody
  public Result helloWorld(HttpServletResponse response) {
    Result result = new Result();

    List datas = new ArrayList();
    for (int i = 0; i < 5; i++) {
      Map data = new HashMap();
      data.put(i, "a");
      datas.add(data);
    }
    result.setData(datas);

    Map attr = new HashMap();
    attr.put("isTest", true);
    attr.put("number", 1);
    result.setAttributes(attr);

    result.setState(5);

    result.setMessage("is ok");
    return result;
  }
}
