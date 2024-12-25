package p420y7;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p027b9.C0843g0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p039c9.C1033c;
import p039c9.C1041k;
import p039c9.InterfaceC1031a;
import p039c9.InterfaceC1039i;
import p059d9.AbstractRunnableFutureC4371k0;
import p059d9.C4349a;
import p059d9.C4365h0;
import p059d9.C4401z0;
import p267p6.C7561b1;
import p420y7.InterfaceC9844b0;
import p420y7.InterfaceC9848d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/h0.class
 */
/* renamed from: y7.h0 */
/* loaded from: combined.jar:classes2.jar:y7/h0.class */
public abstract class AbstractC9856h0<M extends InterfaceC9848d0<M>> implements InterfaceC9844b0 {

    /* renamed from: a */
    public final C0858p f45202a;

    /* renamed from: b */
    public final C0843g0.a<M> f45203b;

    /* renamed from: c */
    public final ArrayList<C9858i0> f45204c;

    /* renamed from: d */
    public final C1033c.c f45205d;

    /* renamed from: e */
    public final InterfaceC1031a f45206e;

    /* renamed from: f */
    public final InterfaceC1039i f45207f;

    /* renamed from: g */
    public final C4365h0 f45208g;

    /* renamed from: h */
    public final Executor f45209h;

    /* renamed from: i */
    public final ArrayList<AbstractRunnableFutureC4371k0<?, ?>> f45210i;

    /* renamed from: j */
    public volatile boolean f45211j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/h0$a.class
     */
    /* renamed from: y7.h0$a */
    /* loaded from: combined.jar:classes2.jar:y7/h0$a.class */
    public class a extends AbstractRunnableFutureC4371k0<M, IOException> {

        /* renamed from: i */
        public final InterfaceC0854m f45212i;

        /* renamed from: j */
        public final C0858p f45213j;

        /* renamed from: k */
        public final AbstractC9856h0 f45214k;

        public a(AbstractC9856h0 abstractC9856h0, InterfaceC0854m interfaceC0854m, C0858p c0858p) {
            this.f45214k = abstractC9856h0;
            this.f45212i = interfaceC0854m;
            this.f45213j = c0858p;
        }

        @Override // p059d9.AbstractRunnableFutureC4371k0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public M mo22057e() {
            return (M) C0843g0.m5357g(this.f45212i, this.f45214k.f45203b, this.f45213j, 4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/h0$b.class
     */
    /* renamed from: y7.h0$b */
    /* loaded from: combined.jar:classes2.jar:y7/h0$b.class */
    public static final class b implements C1041k.a {

        /* renamed from: a */
        public final InterfaceC9844b0.a f45215a;

        /* renamed from: b */
        public final long f45216b;

        /* renamed from: c */
        public final int f45217c;

        /* renamed from: d */
        public long f45218d;

        /* renamed from: e */
        public int f45219e;

        public b(InterfaceC9844b0.a aVar, long j10, int i10, long j11, int i11) {
            this.f45215a = aVar;
            this.f45216b = j10;
            this.f45217c = i10;
            this.f45218d = j11;
            this.f45219e = i11;
        }

        @Override // p039c9.C1041k.a
        /* renamed from: a */
        public void mo6121a(long j10, long j11, long j12) {
            long j13 = this.f45218d + j12;
            this.f45218d = j13;
            this.f45215a.mo41376a(this.f45216b, j13, m41420b());
        }

        /* renamed from: b */
        public final float m41420b() {
            long j10 = this.f45216b;
            if (j10 != -1 && j10 != 0) {
                return (this.f45218d * 100.0f) / j10;
            }
            int i10 = this.f45217c;
            if (i10 != 0) {
                return (this.f45219e * 100.0f) / i10;
            }
            return -1.0f;
        }

        /* renamed from: c */
        public void m41421c() {
            this.f45219e++;
            this.f45215a.mo41376a(this.f45216b, this.f45218d, m41420b());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/h0$c.class
     */
    /* renamed from: y7.h0$c */
    /* loaded from: combined.jar:classes2.jar:y7/h0$c.class */
    public static class c implements Comparable<c> {

        /* renamed from: b */
        public final long f45220b;

        /* renamed from: c */
        public final C0858p f45221c;

        public c(long j10, C0858p c0858p) {
            this.f45220b = j10;
            this.f45221c = c0858p;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return C4401z0.m22405q(this.f45220b, cVar.f45220b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/h0$d.class
     */
    /* renamed from: y7.h0$d */
    /* loaded from: combined.jar:classes2.jar:y7/h0$d.class */
    public static final class d extends AbstractRunnableFutureC4371k0<Void, IOException> {

        /* renamed from: i */
        public final c f45222i;

        /* renamed from: j */
        public final C1033c f45223j;

        /* renamed from: k */
        public final b f45224k;

        /* renamed from: l */
        public final byte[] f45225l;

        /* renamed from: m */
        public final C1041k f45226m;

        public d(c cVar, C1033c c1033c, b bVar, byte[] bArr) {
            this.f45222i = cVar;
            this.f45223j = c1033c;
            this.f45224k = bVar;
            this.f45225l = bArr;
            this.f45226m = new C1041k(c1033c, cVar.f45221c, bArr, bVar);
        }

        @Override // p059d9.AbstractRunnableFutureC4371k0
        /* renamed from: d */
        public void mo22056d() {
            this.f45226m.m6115b();
        }

        @Override // p059d9.AbstractRunnableFutureC4371k0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void mo22057e() {
            this.f45226m.m6114a();
            b bVar = this.f45224k;
            if (bVar == null) {
                return null;
            }
            bVar.m41421c();
            return null;
        }
    }

    public AbstractC9856h0(C7561b1 c7561b1, C0843g0.a<M> aVar, C1033c.c cVar, Executor executor) {
        C4349a.m21882e(c7561b1.f36449b);
        this.f45202a = m41412f(c7561b1.f36449b.f36504a);
        this.f45203b = aVar;
        this.f45204c = new ArrayList<>(c7561b1.f36449b.f36508e);
        this.f45205d = cVar;
        this.f45209h = executor;
        this.f45206e = (InterfaceC1031a) C4349a.m21882e(cVar.m6091f());
        this.f45207f = cVar.m6092g();
        this.f45208g = cVar.m6093h();
        this.f45210i = new ArrayList<>();
    }

    /* renamed from: d */
    public static boolean m41411d(C0858p c0858p, C0858p c0858p2) {
        boolean z10;
        if (c0858p.f5847a.equals(c0858p2.f5847a)) {
            long j10 = c0858p.f5854h;
            if (j10 != -1 && c0858p.f5853g + j10 == c0858p2.f5853g && C4401z0.m22371c(c0858p.f5855i, c0858p2.f5855i) && c0858p.f5856j == c0858p2.f5856j && c0858p.f5849c == c0858p2.f5849c && c0858p.f5851e.equals(c0858p2.f5851e)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: f */
    public static C0858p m41412f(Uri uri) {
        return new C0858p.b().m5391i(uri).m5384b(1).m5383a();
    }

    /* renamed from: i */
    public static void m41413i(List<c> list, InterfaceC1039i interfaceC1039i) {
        HashMap hashMap = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            String mo6109a = interfaceC1039i.mo6109a(cVar.f45221c);
            Integer num = (Integer) hashMap.get(mo6109a);
            c cVar2 = num == null ? null : list.get(num.intValue());
            if (cVar2 == null || cVar.f45220b > cVar2.f45220b + 20000000 || !m41411d(cVar2.f45221c, cVar.f45221c)) {
                hashMap.put(mo6109a, Integer.valueOf(i10));
                list.set(i10, cVar);
                i10++;
            } else {
                long j10 = cVar.f45221c.f5854h;
                list.set(((Integer) C4349a.m21882e(num)).intValue(), new c(cVar2.f45220b, cVar2.f45221c.m5381f(0L, j10 != -1 ? cVar2.f45221c.f5854h + j10 : -1L)));
            }
        }
        C4401z0.m22342O0(list, i10, list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0329 A[LOOP:1: B:44:0x031d->B:46:0x0329, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x034f A[LOOP:2: B:49:0x034b->B:51:0x034f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0376  */
    /* JADX WARN: Type inference failed for: r0v195, types: [y7.d0] */
    @Override // p420y7.InterfaceC9844b0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo41375a(p420y7.InterfaceC9844b0.a r10) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p420y7.AbstractC9856h0.mo41375a(y7.b0$a):void");
    }

    /* renamed from: c */
    public final <T> void m41414c(AbstractRunnableFutureC4371k0<T, ?> abstractRunnableFutureC4371k0) {
        synchronized (this.f45210i) {
            if (this.f45211j) {
                throw new InterruptedException();
            }
            this.f45210i.add(abstractRunnableFutureC4371k0);
        }
    }

    @Override // p420y7.InterfaceC9844b0
    public void cancel() {
        synchronized (this.f45210i) {
            this.f45211j = true;
            for (int i10 = 0; i10 < this.f45210i.size(); i10++) {
                this.f45210i.get(i10).cancel(true);
            }
        }
    }

    /* renamed from: e */
    public final <T> T m41415e(AbstractRunnableFutureC4371k0<T, ?> abstractRunnableFutureC4371k0, boolean z10) {
        if (z10) {
            abstractRunnableFutureC4371k0.run();
            try {
                return abstractRunnableFutureC4371k0.get();
            } catch (ExecutionException e10) {
                Throwable th2 = (Throwable) C4349a.m21882e(e10.getCause());
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                C4401z0.m22352T0(e10);
            }
        }
        while (!this.f45211j) {
            C4365h0 c4365h0 = this.f45208g;
            if (c4365h0 != null) {
                c4365h0.m22028b(-1000);
            }
            m41414c(abstractRunnableFutureC4371k0);
            this.f45209h.execute(abstractRunnableFutureC4371k0);
            try {
                try {
                    T t10 = abstractRunnableFutureC4371k0.get();
                    abstractRunnableFutureC4371k0.m22054b();
                    m41418k(abstractRunnableFutureC4371k0);
                    return t10;
                } catch (ExecutionException e11) {
                    Throwable th3 = (Throwable) C4349a.m21882e(e11.getCause());
                    if (!(th3 instanceof C4365h0.a)) {
                        if (th3 instanceof IOException) {
                            throw ((IOException) th3);
                        }
                        C4401z0.m22352T0(e11);
                    }
                    abstractRunnableFutureC4371k0.m22054b();
                    m41418k(abstractRunnableFutureC4371k0);
                }
            } catch (Throwable th4) {
                abstractRunnableFutureC4371k0.m22054b();
                m41418k(abstractRunnableFutureC4371k0);
                throw th4;
            }
        }
        throw new InterruptedException();
    }

    /* renamed from: g */
    public final M m41416g(InterfaceC0854m interfaceC0854m, C0858p c0858p, boolean z10) {
        return (M) m41415e(new a(this, interfaceC0854m, c0858p), z10);
    }

    /* renamed from: h */
    public abstract List<c> mo24179h(InterfaceC0854m interfaceC0854m, M m10, boolean z10);

    /* renamed from: j */
    public final void m41417j(int i10) {
        synchronized (this.f45210i) {
            this.f45210i.remove(i10);
        }
    }

    /* renamed from: k */
    public final void m41418k(AbstractRunnableFutureC4371k0<?, ?> abstractRunnableFutureC4371k0) {
        synchronized (this.f45210i) {
            this.f45210i.remove(abstractRunnableFutureC4371k0);
        }
    }

    @Override // p420y7.InterfaceC9844b0
    public final void remove() {
        C1033c m6089d = this.f45205d.m6089d();
        try {
            try {
                List<c> mo24179h = mo24179h(m6089d, m41416g(m6089d, this.f45202a, true), true);
                for (int i10 = 0; i10 < mo24179h.size(); i10++) {
                    this.f45206e.mo6063j(this.f45207f.mo6109a(mo24179h.get(i10).f45221c));
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
            } catch (Exception e11) {
            }
        } finally {
            this.f45206e.mo6063j(this.f45207f.mo6109a(this.f45202a));
        }
    }
}
