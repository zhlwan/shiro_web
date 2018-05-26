package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10.
 */
public interface BaseDao<T> {

    public List<T> selectAll();

    public void insert(T t);

    public T selectOne(Integer id);

    public Integer selectCount();

    public List<T> selectAllEntity(@Param("begin") Integer begin, @Param("rows") Integer rows);

    public T selectStringOne(String name);

    public void delete(String id);

    public void update(T t);

}
