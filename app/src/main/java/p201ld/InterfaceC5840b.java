package p201ld;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ld/b.class
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ld.b */
/* loaded from: combined.jar:classes2.jar:ld/b.class */
public @interface InterfaceC5840b {
    boolean nullSafe() default true;

    Class<?> value();
}
