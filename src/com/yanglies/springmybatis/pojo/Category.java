package com.yanglies.springmybatis.pojo;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 9:18.
 * @ProjectName spring_mybatis
 */
public class Category {
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
