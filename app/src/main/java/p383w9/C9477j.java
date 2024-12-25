package p383w9;

import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/j.class
 */
/* renamed from: w9.j */
/* loaded from: combined.jar:classes2.jar:w9/j.class */
public class C9477j {

    /* renamed from: a */
    public final Set<C9472i<?>> f43299a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static <L> C9472i<L> m39929a(L l10, Looper looper, String str) {
        C9935o.m41851k(l10, "Listener must not be null");
        C9935o.m41851k(looper, "Looper must not be null");
        C9935o.m41851k(str, "Listener type must not be null");
        return new C9472i<>(looper, l10, str);
    }

    /* renamed from: b */
    public final void m39930b() {
        Iterator<C9472i<?>> it = this.f43299a.iterator();
        while (it.hasNext()) {
            it.next().m39922a();
        }
        this.f43299a.clear();
    }
}
