package com.shinhan.ch13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})//어노테이션을 적용할 부위
@Retention(RetentionPolicy.RUNTIME)//실행시 적용하겟다.
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 7;
	String man() default "yeah";
	 
	
}
