package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/20.
 */
public class StudentMap implements Serializable {
    //如果想从原始对象抽取一些属性，可以创建一个新的对象，在Maaper中起别名，给属性重新命名
    private String name;
    private Integer value;

    public StudentMap(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public StudentMap() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StudentMap{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
