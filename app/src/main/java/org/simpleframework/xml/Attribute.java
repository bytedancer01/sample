package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/Attribute.class */
public @interface Attribute {
    String empty() default "";

    String name() default "";

    boolean required() default true;
}
