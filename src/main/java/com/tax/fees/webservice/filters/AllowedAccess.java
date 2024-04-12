package com.tax.fees.webservice.filters;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface AllowedAccess {
    public static final String OPT = "*";
    public static final String APP = "APP";

    String[] value() default {};

    String property() default "";
}
