package com.zjy.dao;

import com.zjy.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhaojingyu
 * @create 2021-02-26 4:07 下午
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
