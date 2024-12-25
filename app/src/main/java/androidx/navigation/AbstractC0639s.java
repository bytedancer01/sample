package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C0631k;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/s.class
 */
/* renamed from: androidx.navigation.s */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/s.class */
public abstract class AbstractC0639s<D extends C0631k> {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/s$a.class
     */
    /* renamed from: androidx.navigation.s$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/s$a.class */
    public interface a {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/s$b.class
     */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.s$b */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/s$b.class */
    public @interface b {
        String value();
    }

    /* renamed from: a */
    public abstract D mo3464a();

    /* renamed from: b */
    public abstract C0631k mo3465b(D d10, Bundle bundle, C0636p c0636p, a aVar);

    /* renamed from: c */
    public void mo3511c(Bundle bundle) {
    }

    /* renamed from: d */
    public Bundle mo3512d() {
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo3466e();
}
