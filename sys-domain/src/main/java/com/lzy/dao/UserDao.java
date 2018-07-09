package com.lzy.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.lzy.domain.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
  public User findByEmail(String email);
}  