package p200l9;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;
import p200l9.C5758e;
import p304r9.AbstractBinderC8031j;
import p304r9.C8015b;
import p304r9.C8017c;
import p304r9.C8021e;
import p304r9.C8034k0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/v0.class
 */
/* renamed from: l9.v0 */
/* loaded from: combined.jar:classes2.jar:l9/v0.class */
public final class BinderC5813v0 extends AbstractBinderC8031j {

    /* renamed from: b */
    public final C5816w0 f32416b;

    public BinderC5813v0(C5816w0 c5816w0) {
        this.f32416b = c5816w0;
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: E */
    public final void mo28361E(String str, long j10, int i10) {
        C5816w0.m28392n(this.f32416b, j10, i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: d0 */
    public final void mo28362d0(final int i10) {
        C5816w0.m28376F(this.f32416b).post(new Runnable(this, i10) { // from class: l9.u0

            /* renamed from: b */
            public final BinderC5813v0 f32414b;

            /* renamed from: c */
            public final int f32415c;

            {
                this.f32414b = this;
                this.f32415c = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List list2;
                List list3;
                List list4;
                BinderC5813v0 binderC5813v0 = this.f32414b;
                int i11 = this.f32415c;
                if (i11 != 0) {
                    binderC5813v0.f32416b.f32441y = 1;
                    list = binderC5813v0.f32416b.f32440x;
                    synchronized (list) {
                        list2 = binderC5813v0.f32416b.f32440x;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((C5745a2) it.next()).mo28145b(i11);
                        }
                    }
                    binderC5813v0.f32416b.m28396A();
                    return;
                }
                binderC5813v0.f32416b.f32441y = 2;
                binderC5813v0.f32416b.f32422f = true;
                binderC5813v0.f32416b.f32423g = true;
                list3 = binderC5813v0.f32416b.f32440x;
                synchronized (list3) {
                    list4 = binderC5813v0.f32416b.f32440x;
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        ((C5745a2) it2.next()).mo28144a();
                    }
                }
            }
        });
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: h0 */
    public final void mo28363h0(String str, double d10, boolean z10) {
        C8015b c8015b;
        c8015b = C5816w0.f32419z;
        c8015b.m34873a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: h1 */
    public final void mo28364h1(String str, long j10) {
        C5816w0.m28392n(this.f32416b, j10, 0);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: j0 */
    public final void mo28365j0(final C8017c c8017c) {
        C5816w0.m28376F(this.f32416b).post(new Runnable(this, c8017c) { // from class: l9.o0

            /* renamed from: b */
            public final BinderC5813v0 f32342b;

            /* renamed from: c */
            public final C8017c f32343c;

            {
                this.f32342b = this;
                this.f32343c = c8017c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC5813v0 binderC5813v0 = this.f32342b;
                C5816w0.m28387Q(binderC5813v0.f32416b, this.f32343c);
            }
        });
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: k0 */
    public final void mo28366k0(C5754d c5754d, String str, String str2, boolean z10) {
        this.f32416b.f32429m = c5754d;
        this.f32416b.f32430n = str;
        C5816w0.m28391m(this.f32416b, new C8034k0(new Status(0), c5754d, str, str2, z10));
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: m */
    public final void mo28367m(int i10) {
        C5816w0.m28393o(this.f32416b, i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: n */
    public final void mo28368n(int i10) {
        C5816w0.m28393o(this.f32416b, i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: p1 */
    public final void mo28369p1(final int i10) {
        C5816w0.m28376F(this.f32416b).post(new Runnable(this, i10) { // from class: l9.s0

            /* renamed from: b */
            public final BinderC5813v0 f32403b;

            /* renamed from: c */
            public final int f32404c;

            {
                this.f32403b = this;
                this.f32404c = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List list2;
                BinderC5813v0 binderC5813v0 = this.f32403b;
                int i11 = this.f32404c;
                binderC5813v0.f32416b.f32441y = 3;
                list = binderC5813v0.f32416b.f32440x;
                synchronized (list) {
                    list2 = binderC5813v0.f32416b.f32440x;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((C5745a2) it.next()).mo28146c(i11);
                    }
                }
            }
        });
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: s */
    public final void mo28370s(final int i10) {
        C5758e.d dVar;
        C5816w0.m28393o(this.f32416b, i10);
        C5816w0 c5816w0 = this.f32416b;
        dVar = c5816w0.f32439w;
        if (dVar != null) {
            C5816w0.m28376F(c5816w0).post(new Runnable(this, i10) { // from class: l9.p0

                /* renamed from: b */
                public final BinderC5813v0 f32352b;

                /* renamed from: c */
                public final int f32353c;

                {
                    this.f32352b = this;
                    this.f32353c = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5758e.d dVar2;
                    BinderC5813v0 binderC5813v0 = this.f32352b;
                    int i11 = this.f32353c;
                    dVar2 = binderC5813v0.f32416b.f32439w;
                    dVar2.mo28184b(i11);
                }
            });
        }
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: u */
    public final void mo28371u(int i10) {
        this.f32416b.m28398C(i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: u1 */
    public final void mo28372u1(final C8021e c8021e) {
        C5816w0.m28376F(this.f32416b).post(new Runnable(this, c8021e) { // from class: l9.q0

            /* renamed from: b */
            public final BinderC5813v0 f32381b;

            /* renamed from: c */
            public final C8021e f32382c;

            {
                this.f32381b = this;
                this.f32382c = c8021e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC5813v0 binderC5813v0 = this.f32381b;
                C5816w0.m28388b(binderC5813v0.f32416b, this.f32382c);
            }
        });
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: v1 */
    public final void mo28373v1(String str, byte[] bArr) {
        C8015b c8015b;
        c8015b = C5816w0.f32419z;
        c8015b.m34873a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: x */
    public final void mo28374x(final int i10) {
        C5816w0.m28376F(this.f32416b).post(new Runnable(this, i10) { // from class: l9.r0

            /* renamed from: b */
            public final BinderC5813v0 f32388b;

            /* renamed from: c */
            public final int f32389c;

            {
                this.f32388b = this;
                this.f32389c = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                List list;
                List list2;
                BinderC5813v0 binderC5813v0 = this.f32388b;
                int i11 = this.f32389c;
                C5816w0.m28386P(binderC5813v0.f32416b);
                binderC5813v0.f32416b.f32441y = 1;
                list = binderC5813v0.f32416b.f32440x;
                synchronized (list) {
                    list2 = binderC5813v0.f32416b.f32440x;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((C5745a2) it.next()).mo28147d(i11);
                    }
                }
                binderC5813v0.f32416b.m28396A();
                C5816w0 c5816w0 = binderC5813v0.f32416b;
                c5816w0.m28408y(c5816w0.f32420d);
            }
        });
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: y */
    public final void mo28375y(final String str, final String str2) {
        C8015b c8015b;
        c8015b = C5816w0.f32419z;
        c8015b.m34873a("Receive (type=text, ns=%s) %s", str, str2);
        C5816w0.m28376F(this.f32416b).post(new Runnable(this, str, str2) { // from class: l9.t0

            /* renamed from: b */
            public final BinderC5813v0 f32407b;

            /* renamed from: c */
            public final String f32408c;

            /* renamed from: d */
            public final String f32409d;

            {
                this.f32407b = this;
                this.f32408c = str;
                this.f32409d = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5758e.e eVar;
                C8015b c8015b2;
                CastDevice castDevice;
                BinderC5813v0 binderC5813v0 = this.f32407b;
                String str3 = this.f32408c;
                String str4 = this.f32409d;
                synchronized (binderC5813v0.f32416b.f32438v) {
                    eVar = (C5758e.e) binderC5813v0.f32416b.f32438v.get(str3);
                }
                if (eVar != null) {
                    castDevice = binderC5813v0.f32416b.f32436t;
                    eVar.mo28190a(castDevice, str3, str4);
                } else {
                    c8015b2 = C5816w0.f32419z;
                    c8015b2.m34873a("Discarded message for unknown namespace '%s'", str3);
                }
            }
        });
    }
}
