package com.hyq.demo.entity;

public class UserDto {
  private String name;

  @Override
  public String toString() {
    return "UserDto{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
