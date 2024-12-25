package butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:butterknife/OnTextChanged.class
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: combined.jar:classes1.jar:butterknife/OnTextChanged.class */
public @interface OnTextChanged {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:butterknife/OnTextChanged$Callback.class
     */
    /* loaded from: combined.jar:classes1.jar:butterknife/OnTextChanged$Callback.class */
    public enum Callback {
        TEXT_CHANGED,
        BEFORE_TEXT_CHANGED,
        AFTER_TEXT_CHANGED
    }
}
