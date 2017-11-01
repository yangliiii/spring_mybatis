package com.yanglies.springmybatis.test;

import com.yanglies.springmybatis.mapper.CateogryMapper;
import com.yanglies.springmybatis.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 9:50.
 * @ProjectName spring_mybatis
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringMybatis {

    @Autowired
    private CateogryMapper cateogryMapper;

    @Test
    public void add(){
        System.out.println(cateogryMapper);
        Category category = new Category();
        category.setName("SpringMybatis add data");
        cateogryMapper.add(category);
        System.out.println("SpringMybatis add data successfully!!!");
    }

    @Test
    public void list(){
        System.out.println(cateogryMapper);
        List<Category> categories = cateogryMapper.list();

        for (Category c :
                categories) {
            System.out.println(c);
        }
    }
}
