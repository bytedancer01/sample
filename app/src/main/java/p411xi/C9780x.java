package p411xi;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p383w9.C9436a3;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/x.class
 */
/* renamed from: xi.x */
/* loaded from: combined.jar:classes2.jar:xi/x.class */
public final class C9780x {

    /* renamed from: c */
    public static final int f44575c;

    /* renamed from: d */
    public static final AtomicReference<C9779w>[] f44576d;

    /* renamed from: e */
    public static final C9780x f44577e = new C9780x();

    /* renamed from: a */
    public static final int f44573a = 65536;

    /* renamed from: b */
    public static final C9779w f44574b = new C9779w(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f44575c = highestOneBit;
        AtomicReference<C9779w>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f44576d = atomicReferenceArr;
    }

    /* renamed from: b */
    public static final void m41273b(@NotNull C9779w c9779w) {
        AtomicReference<C9779w> m41275a;
        C9779w c9779w2;
        C9367f.m39526e(c9779w, "segment");
        if (!(c9779w.f44571f == null && c9779w.f44572g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c9779w.f44569d || (c9779w2 = (m41275a = f44577e.m41275a()).get()) == f44574b) {
            return;
        }
        int i10 = c9779w2 != null ? c9779w2.f44568c : 0;
        if (i10 >= f44573a) {
            return;
        }
        c9779w.f44571f = c9779w2;
        c9779w.f44567b = 0;
        c9779w.f44568c = i10 + NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
        if (C9436a3.m39798a(m41275a, c9779w2, c9779w)) {
            return;
        }
        c9779w.f44571f = null;
    }

    @NotNull
    /* renamed from: c */
    public static final C9779w m41274c() {
        AtomicReference<C9779w> m41275a = f44577e.m41275a();
        C9779w c9779w = f44574b;
        C9779w andSet = m41275a.getAndSet(c9779w);
        if (andSet == c9779w) {
            return new C9779w();
        }
        if (andSet == null) {
            m41275a.set(null);
            return new C9779w();
        }
        m41275a.set(andSet.f44571f);
        andSet.f44571f = null;
        andSet.f44568c = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<C9779w> m41275a() {
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        return f44576d[(int) (currentThread.getId() & (f44575c - 1))];
    }
}
