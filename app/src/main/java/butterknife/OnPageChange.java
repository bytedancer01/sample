package butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:butterknife/OnPageChange.class
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: combined.jar:classes1.jar:butterknife/OnPageChange.class */
public @interface OnPageChange {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:butterknife/OnPageChange$Callback.class
     */
    /* loaded from: combined.jar:classes1.jar:butterknife/OnPageChange$Callback.class */
    public enum Callback {
        PAGE_SELECTED,
        PAGE_SCROLLED,
        PAGE_SCROLL_STATE_CHANGED
    }
}
