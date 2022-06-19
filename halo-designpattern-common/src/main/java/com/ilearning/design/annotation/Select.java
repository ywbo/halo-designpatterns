package com.ilearning.design.annotation;

import java.lang.annotation.*;

/**
 * 查询注解
 *
 * @author yuwenbo
 * @date 2022/6/20 5:57
 **/
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface Select {
    String value() default "";
}
