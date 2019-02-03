package com.hyq.demo.mapper;

import com.hyq.demo.entity.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
  public List<Object> findAll();
//  @Param("startDate")String startDate,
  public void addUser(@Param("name")String name,@Param("age")int age);
}


