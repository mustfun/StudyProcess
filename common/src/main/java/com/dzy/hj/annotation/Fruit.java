package com.dzy.hj.annotation;

import java.lang.annotation.*;

/**
 * Created by dengzhiyuan on 2017/3/9.
 */

@Documented
@Target(ElementType.METHOD)//代表只能放在方法上面
@Retention(RetentionPolicy.RUNTIME)//RUNTIME代表运行时级别，注解存在源码，字节码与Java虚拟机
public @interface Fruit {

    public String name() default "";  //注解的一些属性，居然有括号。。。注意
    String size() default "";
    long expire() default 0l;
}
