package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.q */
/* loaded from: combined.jar:classes3.jar:fj/q.class */
public @interface InterfaceC4904q {
    String encoding() default "binary";

    String value() default "";
}
