package com.hyq.demo.mapper;

import com.hyq.demo.entity.UserDto;

import java.util.List;

public interface UserMapper {
  public List<UserDto> findAll();
}
