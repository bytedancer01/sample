package p230n9;

import android.util.LruCache;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/e1.class
 */
/* renamed from: n9.e1 */
/* loaded from: combined.jar:classes2.jar:n9/e1.class */
public final class C6712e1 extends LruCache {

    /* renamed from: a */
    public final C6707d f35095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6712e1(C6707d c6707d, int i10) {
        super(i10);
        this.f35095a = c6707d;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z10) {
            C9935o.m41850j(this.f35095a.f35081g);
            this.f35095a.f35081g.add(num);
        }
    }
}
