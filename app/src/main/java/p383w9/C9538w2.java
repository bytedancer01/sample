package p383w9;

import com.google.android.gms.common.api.C2415b;
import java.util.Map;
import java.util.Set;
import p294r.C7928a;
import p350u9.C8804b;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/w2.class
 */
/* renamed from: w9.w2 */
/* loaded from: combined.jar:classes2.jar:w9/w2.class */
public final class C9538w2 {

    /* renamed from: a */
    public final C7928a<C9437b<?>, C8804b> f43478a;

    /* renamed from: b */
    public final C7928a<C9437b<?>, String> f43479b;

    /* renamed from: c */
    public final C10146j<Map<C9437b<?>, String>> f43480c;

    /* renamed from: d */
    public int f43481d;

    /* renamed from: e */
    public boolean f43482e;

    /* renamed from: a */
    public final Set<C9437b<?>> m40072a() {
        return this.f43478a.keySet();
    }

    /* renamed from: b */
    public final void m40073b(C9437b<?> c9437b, C8804b c8804b, String str) {
        this.f43478a.put(c9437b, c8804b);
        this.f43479b.put(c9437b, str);
        this.f43481d--;
        if (!c8804b.m37663T()) {
            this.f43482e = true;
        }
        if (this.f43481d == 0) {
            if (!this.f43482e) {
                this.f43480c.m42580c(this.f43479b);
            } else {
                this.f43480c.m42579b(new C2415b(this.f43478a));
            }
        }
    }
}
