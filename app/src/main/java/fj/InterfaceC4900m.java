package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.m */
/* loaded from: combined.jar:classes3.jar:fj/m.class */
public @interface InterfaceC4900m {
    String value() default "";
}
