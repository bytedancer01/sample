package p367v8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p059d9.C4401z0;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v8/h.class
 */
/* renamed from: v8.h */
/* loaded from: combined.jar:classes2.jar:v8/h.class */
public final class C9314h implements InterfaceC6923e {

    /* renamed from: b */
    public final C9310d f42509b;

    /* renamed from: c */
    public final long[] f42510c;

    /* renamed from: d */
    public final Map<String, C9313g> f42511d;

    /* renamed from: e */
    public final Map<String, C9311e> f42512e;

    /* renamed from: f */
    public final Map<String, String> f42513f;

    public C9314h(C9310d c9310d, Map<String, C9313g> map, Map<String, C9311e> map2, Map<String, String> map3) {
        this.f42509b = c9310d;
        this.f42512e = map2;
        this.f42513f = map3;
        this.f42511d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f42510c = c9310d.m39264j();
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        int m22377e = C4401z0.m22377e(this.f42510c, j10, false, false);
        if (m22377e >= this.f42510c.length) {
            m22377e = -1;
        }
        return m22377e;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        return this.f42509b.m39262h(j10, this.f42511d, this.f42512e, this.f42513f);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: c */
    public long mo31885c(int i10) {
        return this.f42510c[i10];
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: d */
    public int mo31886d() {
        return this.f42510c.length;
    }
}
