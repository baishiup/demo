package com.hyq.demo.controller;

import java.util.List;
import java.util.Map;

public class Base {

  // 默认输出格式
  public class Result {
    private int state = 0;
    private String message = "";

    private List data;
    private Map attributes;

    public Map getAttributes() {
      return attributes;
    }

    public void setAttributes(Map attributes) {
      this.attributes = attributes;
    }

    public int getState() {
      return state;
    }

    public void setState(int state) {
      this.state = state;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }

    public List getData() {
      return data;
    }

    public void setData(List data) {
      this.data = data;
    }
  }
}
