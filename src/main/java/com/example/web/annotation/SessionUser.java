package com.example.web.annotation;

import java.lang.annotation.*;

/**
 * Created by hp on 2018/2/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface SessionUser {
}
