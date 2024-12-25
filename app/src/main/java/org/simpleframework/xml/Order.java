package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/Order.class */
public @interface Order {
    String[] attributes() default {};

    String[] elements() default {};
}
