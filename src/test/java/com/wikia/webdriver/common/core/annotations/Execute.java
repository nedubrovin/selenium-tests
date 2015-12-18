package com.wikia.webdriver.common.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface Execute {

  User asUser() default User.ANONYMOUS;

  String onWikia() default "";

  String onDevice() default "";

  String disableFlash() default "";

  String browserSize() default "";

  String browser() default "";
}
