package com.querydsl.jpa;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
public @interface NoHibernate {

    com.querydsl.core.Target[] value() default {};
}
