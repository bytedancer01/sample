package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: fj.r */
/* loaded from: combined.jar:classes3.jar:fj/r.class */
public @interface InterfaceC4905r {
    String encoding() default "binary";
}
