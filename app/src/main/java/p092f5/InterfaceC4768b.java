package p092f5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f5/b.class
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: f5.b */
/* loaded from: combined.jar:classes1.jar:f5/b.class */
public @interface InterfaceC4768b {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f5/b$a.class
     */
    @Deprecated
    /* renamed from: f5.b$a */
    /* loaded from: combined.jar:classes1.jar:f5/b$a.class */
    public enum a {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f5/b$b.class
     */
    /* renamed from: f5.b$b */
    /* loaded from: combined.jar:classes1.jar:f5/b$b.class */
    public enum b {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }
}
