package butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:butterknife/OnItemSelected.class
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: combined.jar:classes1.jar:butterknife/OnItemSelected.class */
public @interface OnItemSelected {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:butterknife/OnItemSelected$Callback.class
     */
    /* loaded from: combined.jar:classes1.jar:butterknife/OnItemSelected$Callback.class */
    public enum Callback {
        ITEM_SELECTED,
        NOTHING_SELECTED
    }
}
