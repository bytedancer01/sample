package p420y7;

import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import p039c9.C1033c;
import p059d9.C4349a;
import p059d9.C4401z0;
import p095f8.C4776a;
import p126h8.C5042a;
import p229n8.C6697a;
import p267p6.C7561b1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/d.class
 */
/* renamed from: y7.d */
/* loaded from: combined.jar:classes2.jar:y7/d.class */
public class C9847d implements InterfaceC9846c0 {

    /* renamed from: c */
    public static final SparseArray<Constructor<? extends InterfaceC9844b0>> f45179c = m41398c();

    /* renamed from: a */
    public final C1033c.c f45180a;

    /* renamed from: b */
    public final Executor f45181b;

    public C9847d(C1033c.c cVar, Executor executor) {
        this.f45180a = (C1033c.c) C4349a.m21882e(cVar);
        this.f45181b = (Executor) C4349a.m21882e(executor);
    }

    /* renamed from: c */
    public static SparseArray<Constructor<? extends InterfaceC9844b0>> m41398c() {
        SparseArray<Constructor<? extends InterfaceC9844b0>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, m41399d(C4776a.class));
        } catch (ClassNotFoundException e10) {
        }
        try {
            sparseArray.put(2, m41399d(C5042a.class));
        } catch (ClassNotFoundException e11) {
        }
        try {
            sparseArray.put(1, m41399d(C6697a.class));
        } catch (ClassNotFoundException e12) {
        }
        return sparseArray;
    }

    /* renamed from: d */
    public static Constructor<? extends InterfaceC9844b0> m41399d(Class<?> cls) {
        try {
            return cls.asSubclass(InterfaceC9844b0.class).getConstructor(C7561b1.class, C1033c.c.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    @Override // p420y7.InterfaceC9846c0
    /* renamed from: a */
    public InterfaceC9844b0 mo41397a(C9874x c9874x) {
        int m22404p0 = C4401z0.m22404p0(c9874x.f45310c, c9874x.f45311d);
        if (m22404p0 == 0 || m22404p0 == 1 || m22404p0 == 2) {
            return m41400b(c9874x, m22404p0);
        }
        if (m22404p0 == 4) {
            return new C9854g0(new C7561b1.c().m32348B(c9874x.f45310c).m32356g(c9874x.f45314g).m32350a(), this.f45180a, this.f45181b);
        }
        throw new IllegalArgumentException("Unsupported type: " + m22404p0);
    }

    /* renamed from: b */
    public final InterfaceC9844b0 m41400b(C9874x c9874x, int i10) {
        Constructor<? extends InterfaceC9844b0> constructor = f45179c.get(i10);
        if (constructor == null) {
            throw new IllegalStateException("Module missing for content type " + i10);
        }
        try {
            return constructor.newInstance(new C7561b1.c().m32348B(c9874x.f45310c).m32374y(c9874x.f45312e).m32356g(c9874x.f45314g).m32358i(c9874x.f45313f).m32350a(), this.f45180a, this.f45181b);
        } catch (Exception e10) {
            throw new IllegalStateException("Failed to instantiate downloader for content type " + i10);
        }
    }
}
