package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.t */
/* loaded from: combined.jar:classes3.jar:fj/t.class */
public @interface InterfaceC4907t {
    boolean encoded() default false;

    String value();
}
