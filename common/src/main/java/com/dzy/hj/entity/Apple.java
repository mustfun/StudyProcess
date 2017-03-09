package com.dzy.hj.entity;

import com.dzy.hj.annotation.Fruit;

/**
 * Created by dengzhiyuan on 2017/3/9.
 */
public class Apple {


    private String name;
    private String num;
    private String area;

    public void setArea(String area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }




    public void testAnnotation(){



    }
}
