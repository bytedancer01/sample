package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.c */
/* loaded from: combined.jar:classes3.jar:fj/c.class */
public @interface InterfaceC4890c {
    boolean encoded() default false;

    String value();
}
