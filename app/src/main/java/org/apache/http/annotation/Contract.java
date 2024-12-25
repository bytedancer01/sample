package org.apache.http.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/annotation/Contract.class
 */
@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: combined.jar:classes1.jar:org/apache/http/annotation/Contract.class */
public @interface Contract {
    ThreadingBehavior threading() default ThreadingBehavior.UNSAFE;
}
