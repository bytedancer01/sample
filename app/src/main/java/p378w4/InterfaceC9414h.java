package p378w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w4/h.class
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: w4.h */
/* loaded from: combined.jar:classes1.jar:w4/h.class */
public @interface InterfaceC9414h {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w4/h$a.class
     */
    /* renamed from: w4.h$a */
    /* loaded from: combined.jar:classes1.jar:w4/h$a.class */
    public enum a {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }
}
