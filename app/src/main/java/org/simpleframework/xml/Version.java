package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/Version.class */
public @interface Version {
    String name() default "";

    boolean required() default false;

    double revision() default 1.0d;
}
