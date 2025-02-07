package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/Element.class */
public @interface Element {
    boolean data() default false;

    String name() default "";

    boolean required() default true;

    Class type() default void.class;
}
