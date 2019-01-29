package com.hyq.demo.controller;

import java.util.List;

public class Base {

  // 默认输出格式
  public class Result {
    private String message = "ok";
    private List data = null;
    private int state = 0;

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

    public int getState() {
      return state;
    }

    public void setState(int state) {
      this.state = state;
    }
  }
}
