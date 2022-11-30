package com.example.demo07;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 帅气的景天老师
 * @create 2022/6/6 16:52
 */
@Repository
public interface UserDao {

    int addUser(User user);

    List<User> selectUser();
}
