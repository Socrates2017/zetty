package com.zrzhen.zetty.core.mvc.anno;


import com.zrzhen.zetty.core.mvc.ContentTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ContentType {
    ContentTypeEnum value() default ContentTypeEnum.TEXT;
}

