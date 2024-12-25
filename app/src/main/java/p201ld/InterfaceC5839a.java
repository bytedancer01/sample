package p201ld;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ld/a.class
 */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ld.a */
/* loaded from: combined.jar:classes2.jar:ld/a.class */
public @interface InterfaceC5839a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
