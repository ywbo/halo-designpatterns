package com.ilearning.design.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * DoDoor 自定义注解
 *
 * @author yuwenbo
 * @date 2022/6/16 6:22
 **/
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface DoDoor {

    String key() default "";

    String returnJson() default "";
}
