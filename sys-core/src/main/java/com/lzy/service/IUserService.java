package com.lzy.service;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.lzy.domain.User;

public interface IUserService  {
  public User findByEmail(String email);
  public User save(User user);
} 