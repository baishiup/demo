package com.hyq.demo;

import com.hyq.demo.controller.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloWorldController extends Base {

  @RequestMapping(value = "helloworld")
  @ResponseBody
  public Result helloWorld() {
//    Result res = new Result();
//    String[] arr = {"这是数组","1"};
//    res.setArr(arr);
//
//
//    List<Map> data = new ArrayList();
//
//    for (int i = 0; i < 5; i++) {
//      Map<String,String> oneData = new HashMap<String, String>();
//      oneData.put(Integer.toString(i),"this is list->map data,"+i);
//      data.add(oneData);
//    }
//
//    res.setData(data);
//
//    res.setHasError(true);
    Result res = new Result();

    List datas = new ArrayList();
    for (int i = 0; i < 5; i++) {
      Map data = new HashMap();
      data.put(i,"a");
      datas.add(data);
    }
    res.setData(datas);

    Map attr = new HashMap();
    attr.put("isTest",true);
    attr.put("number",1);
    res.setAttributes(attr);

    return res;
  }
}
