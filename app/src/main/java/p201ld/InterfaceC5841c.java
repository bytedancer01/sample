package p201ld;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ld/c.class
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ld.c */
/* loaded from: combined.jar:classes2.jar:ld/c.class */
public @interface InterfaceC5841c {
    String[] alternate() default {};

    String value();
}
