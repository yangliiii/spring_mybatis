package com.yanglies.springmybatis.mapper;

import com.yanglies.springmybatis.pojo.Category;

import java.util.List;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 9:22.
 * @ProjectName spring_mybatis
 */
public interface CateogryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();

    public int count();
}
