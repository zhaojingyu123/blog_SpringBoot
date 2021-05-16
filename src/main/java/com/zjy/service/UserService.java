package com.zjy.service;

import com.zjy.pojo.User;

/**
 * @author zhaojingy
 * @create 2021-02-26 4:08 下午
 */
public interface UserService {

    User checkUser(String username, String password);
}
