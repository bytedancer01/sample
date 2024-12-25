package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.h */
/* loaded from: combined.jar:classes3.jar:fj/h.class */
public @interface InterfaceC4895h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
