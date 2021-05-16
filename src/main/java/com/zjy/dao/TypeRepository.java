package com.zjy.dao;

import com.zjy.pojo.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author zhaojingy
 * @create 2021-02-27 9:07 下午
 */

public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    @Query(value = "select t from t_type t")
    List<Type> findTop(Pageable pageable);
}
