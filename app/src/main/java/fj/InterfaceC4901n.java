package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.n */
/* loaded from: combined.jar:classes3.jar:fj/n.class */
public @interface InterfaceC4901n {
    String value() default "";
}