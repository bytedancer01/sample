package ua;

import java.util.ArrayList;
import java.util.List;
import p305ra.C8301q1;
import p305ra.C8421y1;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/w9.class
 */
/* renamed from: ua.w9 */
/* loaded from: combined.jar:classes2.jar:ua/w9.class */
public final class C9112w9 {

    /* renamed from: a */
    public C8421y1 f41734a;

    /* renamed from: b */
    public List<Long> f41735b;

    /* renamed from: c */
    public List<C8301q1> f41736c;

    /* renamed from: d */
    public long f41737d;

    /* renamed from: e */
    public final C9123x9 f41738e;

    public /* synthetic */ C9112w9(C9123x9 c9123x9, RunnableC9042q9 runnableC9042q9) {
        this.f41738e = c9123x9;
    }

    /* renamed from: b */
    public static final long m38331b(C8301q1 c8301q1) {
        return ((c8301q1.m35705F() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m38332a(long j10, C8301q1 c8301q1) {
        C9935o.m41850j(c8301q1);
        if (this.f41736c == null) {
            this.f41736c = new ArrayList();
        }
        if (this.f41735b == null) {
            this.f41735b = new ArrayList();
        }
        if (this.f41736c.size() > 0 && m38331b(this.f41736c.get(0)) != m38331b(c8301q1)) {
            return false;
        }
        long mo35586g = this.f41737d + c8301q1.mo35586g();
        this.f41738e.m38360W();
        if (mo35586g >= Math.max(0, C8988m3.f41369j.m38108b(null).intValue())) {
            return false;
        }
        this.f41737d = mo35586g;
        this.f41736c.add(c8301q1);
        this.f41735b.add(Long.valueOf(j10));
        int size = this.f41736c.size();
        this.f41738e.m38360W();
        return size < Math.max(1, C8988m3.f41371k.m38108b(null).intValue());
    }
}
