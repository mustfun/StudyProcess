package com.dzy.hj;

import com.dzy.hj.annotation.Fruit;
import org.junit.Test;

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

    @Fruit(name = "apple")
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



    @Test
    public void testAnnotation(){
        Apple apple=new Apple();
        System.out.println(apple.getName());
    }
}
