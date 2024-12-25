package p428yg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p428yg.AbstractC10019y;
import p428yg.C10012r;
import p428yg.C10014t;
import p428yg.InterfaceC10004j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/c.class
 */
/* renamed from: yg.c */
/* loaded from: combined.jar:classes2.jar:yg/c.class */
public class RunnableC9992c implements Runnable {

    /* renamed from: u */
    public static final Object f45801u = new Object();

    /* renamed from: v */
    public static final ThreadLocal<StringBuilder> f45802v = new a();

    /* renamed from: w */
    public static final AtomicInteger f45803w = new AtomicInteger();

    /* renamed from: x */
    public static final AbstractC10019y f45804x = new b();

    /* renamed from: b */
    public final int f45805b = f45803w.incrementAndGet();

    /* renamed from: c */
    public final C10014t f45806c;

    /* renamed from: d */
    public final C10003i f45807d;

    /* renamed from: e */
    public final InterfaceC9994d f45808e;

    /* renamed from: f */
    public final C9989a0 f45809f;

    /* renamed from: g */
    public final String f45810g;

    /* renamed from: h */
    public final C10017w f45811h;

    /* renamed from: i */
    public final int f45812i;

    /* renamed from: j */
    public int f45813j;

    /* renamed from: k */
    public final AbstractC10019y f45814k;

    /* renamed from: l */
    public AbstractC9988a f45815l;

    /* renamed from: m */
    public List<AbstractC9988a> f45816m;

    /* renamed from: n */
    public Bitmap f45817n;

    /* renamed from: o */
    public Future<?> f45818o;

    /* renamed from: p */
    public C10014t.e f45819p;

    /* renamed from: q */
    public Exception f45820q;

    /* renamed from: r */
    public int f45821r;

    /* renamed from: s */
    public int f45822s;

    /* renamed from: t */
    public C10014t.f f45823t;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/c$a.class
     */
    /* renamed from: yg.c$a */
    /* loaded from: combined.jar:classes2.jar:yg/c$a.class */
    public static final class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/c$b.class
     */
    /* renamed from: yg.c$b */
    /* loaded from: combined.jar:classes2.jar:yg/c$b.class */
    public static final class b extends AbstractC10019y {
        @Override // p428yg.AbstractC10019y
        /* renamed from: c */
        public boolean mo41998c(C10017w c10017w) {
            return true;
        }

        @Override // p428yg.AbstractC10019y
        /* renamed from: f */
        public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + c10017w);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/c$c.class
     */
    /* renamed from: yg.c$c */
    /* loaded from: combined.jar:classes2.jar:yg/c$c.class */
    public static final class c implements Runnable {

        /* renamed from: b */
        public final InterfaceC9997e0 f45824b;

        /* renamed from: c */
        public final RuntimeException f45825c;

        public c(InterfaceC9997e0 interfaceC9997e0, RuntimeException runtimeException) {
            this.f45824b = interfaceC9997e0;
            this.f45825c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f45824b.key() + " crashed with exception.", this.f45825c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/c$d.class
     */
    /* renamed from: yg.c$d */
    /* loaded from: combined.jar:classes2.jar:yg/c$d.class */
    public static final class d implements Runnable {

        /* renamed from: b */
        public final StringBuilder f45826b;

        public d(StringBuilder sb2) {
            this.f45826b = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f45826b.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/c$e.class
     */
    /* renamed from: yg.c$e */
    /* loaded from: combined.jar:classes2.jar:yg/c$e.class */
    public static final class e implements Runnable {

        /* renamed from: b */
        public final InterfaceC9997e0 f45827b;

        public e(InterfaceC9997e0 interfaceC9997e0) {
            this.f45827b = interfaceC9997e0;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f45827b.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/c$f.class
     */
    /* renamed from: yg.c$f */
    /* loaded from: combined.jar:classes2.jar:yg/c$f.class */
    public static final class f implements Runnable {

        /* renamed from: b */
        public final InterfaceC9997e0 f45828b;

        public f(InterfaceC9997e0 interfaceC9997e0) {
            this.f45828b = interfaceC9997e0;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f45828b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public RunnableC9992c(C10014t c10014t, C10003i c10003i, InterfaceC9994d interfaceC9994d, C9989a0 c9989a0, AbstractC9988a abstractC9988a, AbstractC10019y abstractC10019y) {
        this.f45806c = c10014t;
        this.f45807d = c10003i;
        this.f45808e = interfaceC9994d;
        this.f45809f = c9989a0;
        this.f45815l = abstractC9988a;
        this.f45810g = abstractC9988a.m41974d();
        this.f45811h = abstractC9988a.m41979i();
        this.f45823t = abstractC9988a.m41978h();
        this.f45812i = abstractC9988a.m41975e();
        this.f45813j = abstractC9988a.m41976f();
        this.f45814k = abstractC10019y;
        this.f45822s = abstractC10019y.mo42100e();
    }

    /* renamed from: a */
    public static Bitmap m42001a(List<InterfaceC9997e0> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            InterfaceC9997e0 interfaceC9997e0 = list.get(i10);
            try {
                Bitmap m42028a = interfaceC9997e0.m42028a(bitmap);
                if (m42028a == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(interfaceC9997e0.key());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<InterfaceC9997e0> it = list.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next().key());
                        sb2.append('\n');
                    }
                    C10014t.f45883p.post(new d(sb2));
                    return null;
                }
                if (m42028a == bitmap && bitmap.isRecycled()) {
                    C10014t.f45883p.post(new e(interfaceC9997e0));
                    return null;
                }
                if (m42028a != bitmap && !bitmap.isRecycled()) {
                    C10014t.f45883p.post(new f(interfaceC9997e0));
                    return null;
                }
                i10++;
                bitmap = m42028a;
            } catch (RuntimeException e10) {
                C10014t.f45883p.post(new c(interfaceC9997e0, e10));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m42002e(InputStream inputStream, C10017w c10017w) {
        C10008n c10008n = new C10008n(inputStream);
        long m42095l = c10008n.m42095l(65536);
        BitmapFactory.Options m42159d = AbstractC10019y.m42159d(c10017w);
        boolean m42160g = AbstractC10019y.m42160g(m42159d);
        boolean m42056t = C10001g0.m42056t(c10008n);
        c10008n.m42094f(m42095l);
        if (m42056t) {
            byte[] m42060x = C10001g0.m42060x(c10008n);
            if (m42160g) {
                BitmapFactory.decodeByteArray(m42060x, 0, m42060x.length, m42159d);
                AbstractC10019y.m42158b(c10017w.f45932h, c10017w.f45933i, m42159d, c10017w);
            }
            return BitmapFactory.decodeByteArray(m42060x, 0, m42060x.length, m42159d);
        }
        if (m42160g) {
            BitmapFactory.decodeStream(c10008n, null, m42159d);
            AbstractC10019y.m42158b(c10017w.f45932h, c10017w.f45933i, m42159d, c10017w);
            c10008n.m42094f(m42095l);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(c10008n, null, m42159d);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: g */
    public static RunnableC9992c m42003g(C10014t c10014t, C10003i c10003i, InterfaceC9994d interfaceC9994d, C9989a0 c9989a0, AbstractC9988a abstractC9988a) {
        C10017w m41979i = abstractC9988a.m41979i();
        List<AbstractC10019y> m42113i = c10014t.m42113i();
        int size = m42113i.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC10019y abstractC10019y = m42113i.get(i10);
            if (abstractC10019y.mo41998c(m41979i)) {
                return new RunnableC9992c(c10014t, c10003i, interfaceC9994d, c9989a0, abstractC9988a, abstractC10019y);
            }
        }
        return new RunnableC9992c(c10014t, c10003i, interfaceC9994d, c9989a0, abstractC9988a, f45804x);
    }

    /* renamed from: t */
    public static boolean m42004t(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || i10 > i12 || i11 > i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01db  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m42005w(p428yg.C10017w r8, android.graphics.Bitmap r9, int r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p428yg.RunnableC9992c.m42005w(yg.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: x */
    public static void m42006x(C10017w c10017w) {
        String m42132a = c10017w.m42132a();
        StringBuilder sb2 = f45802v.get();
        sb2.ensureCapacity(m42132a.length() + 8);
        sb2.replace(8, sb2.length(), m42132a);
        Thread.currentThread().setName(sb2.toString());
    }

    /* renamed from: b */
    public void m42007b(AbstractC9988a abstractC9988a) {
        String m42135d;
        String str;
        boolean z10 = this.f45806c.f45898n;
        C10017w c10017w = abstractC9988a.f45756b;
        if (this.f45815l != null) {
            if (this.f45816m == null) {
                this.f45816m = new ArrayList(3);
            }
            this.f45816m.add(abstractC9988a);
            if (z10) {
                C10001g0.m42058v("Hunter", "joined", c10017w.m42135d(), C10001g0.m42049m(this, "to "));
            }
            C10014t.f m41978h = abstractC9988a.m41978h();
            if (m41978h.ordinal() > this.f45823t.ordinal()) {
                this.f45823t = m41978h;
                return;
            }
            return;
        }
        this.f45815l = abstractC9988a;
        if (z10) {
            List<AbstractC9988a> list = this.f45816m;
            if (list == null || list.isEmpty()) {
                m42135d = c10017w.m42135d();
                str = "to empty hunter";
            } else {
                m42135d = c10017w.m42135d();
                str = C10001g0.m42049m(this, "to ");
            }
            C10001g0.m42058v("Hunter", "joined", m42135d, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0.isEmpty() != false) goto L8;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m42008c() {
        /*
            r3 = this;
            r0 = r3
            yg.a r0 = r0.f45815l
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L3a
            r0 = r3
            java.util.List<yg.a> r0 = r0.f45816m
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L21
            r0 = r5
            r4 = r0
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3a
        L21:
            r0 = r3
            java.util.concurrent.Future<?> r0 = r0.f45818o
            r6 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L3a
            r0 = r5
            r4 = r0
            r0 = r6
            r1 = 0
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L3a
            r0 = 1
            r4 = r0
        L3a:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p428yg.RunnableC9992c.m42008c():boolean");
    }

    /* renamed from: d */
    public final C10014t.f m42009d() {
        C10014t.f fVar = C10014t.f.LOW;
        List<AbstractC9988a> list = this.f45816m;
        boolean z10 = (list == null || list.isEmpty()) ? false : true;
        AbstractC9988a abstractC9988a = this.f45815l;
        boolean z11 = true;
        if (abstractC9988a == null) {
            z11 = z10;
        }
        if (!z11) {
            return fVar;
        }
        if (abstractC9988a != null) {
            fVar = abstractC9988a.m41978h();
        }
        C10014t.f fVar2 = fVar;
        if (z10) {
            int size = this.f45816m.size();
            int i10 = 0;
            while (true) {
                fVar2 = fVar;
                if (i10 >= size) {
                    break;
                }
                C10014t.f m41978h = this.f45816m.get(i10).m41978h();
                C10014t.f fVar3 = fVar;
                if (m41978h.ordinal() > fVar.ordinal()) {
                    fVar3 = m41978h;
                }
                i10++;
                fVar = fVar3;
            }
        }
        return fVar2;
    }

    /* renamed from: f */
    public void m42010f(AbstractC9988a abstractC9988a) {
        boolean remove;
        if (this.f45815l == abstractC9988a) {
            this.f45815l = null;
            remove = true;
        } else {
            List<AbstractC9988a> list = this.f45816m;
            remove = list != null ? list.remove(abstractC9988a) : false;
        }
        if (remove && abstractC9988a.m41978h() == this.f45823t) {
            this.f45823t = m42009d();
        }
        if (this.f45806c.f45898n) {
            C10001g0.m42058v("Hunter", "removed", abstractC9988a.f45756b.m42135d(), C10001g0.m42049m(this, "from "));
        }
    }

    /* renamed from: h */
    public AbstractC9988a m42011h() {
        return this.f45815l;
    }

    /* renamed from: i */
    public List<AbstractC9988a> m42012i() {
        return this.f45816m;
    }

    /* renamed from: j */
    public C10017w m42013j() {
        return this.f45811h;
    }

    /* renamed from: k */
    public Exception m42014k() {
        return this.f45820q;
    }

    /* renamed from: l */
    public String m42015l() {
        return this.f45810g;
    }

    /* renamed from: m */
    public C10014t.e m42016m() {
        return this.f45819p;
    }

    /* renamed from: n */
    public int m42017n() {
        return this.f45812i;
    }

    /* renamed from: o */
    public C10014t m42018o() {
        return this.f45806c;
    }

    /* renamed from: p */
    public C10014t.f m42019p() {
        return this.f45823t;
    }

    /* renamed from: q */
    public Bitmap m42020q() {
        return this.f45817n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        if (r5.f45821r != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        if (r5.f45821r != 0) goto L43;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap m42021r() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p428yg.RunnableC9992c.m42021r():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public void run() {
        C10003i c10003i;
        C10003i c10003i2;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                m42006x(this.f45811h);
                                if (this.f45806c.f45898n) {
                                    C10001g0.m42057u("Hunter", "executing", C10001g0.m42048l(this));
                                }
                                Bitmap m42021r = m42021r();
                                this.f45817n = m42021r;
                                if (m42021r == null) {
                                    this.f45807d.m42069e(this);
                                } else {
                                    this.f45807d.m42068d(this);
                                }
                            } catch (C10012r.a e10) {
                                this.f45820q = e10;
                                c10003i = this.f45807d;
                                c10003i.m42071g(this);
                            }
                        } catch (Exception e11) {
                            this.f45820q = e11;
                            c10003i2 = this.f45807d;
                            c10003i2.m42069e(this);
                        }
                    } catch (IOException e12) {
                        this.f45820q = e12;
                        c10003i = this.f45807d;
                        c10003i.m42071g(this);
                    }
                } catch (OutOfMemoryError e13) {
                    StringWriter stringWriter = new StringWriter();
                    this.f45809f.m41985a().m42000a(new PrintWriter(stringWriter));
                    this.f45820q = new RuntimeException(stringWriter.toString(), e13);
                    c10003i2 = this.f45807d;
                    c10003i2.m42069e(this);
                }
            } catch (InterfaceC10004j.b e14) {
                if (!e14.f45864b || e14.f45865c != 504) {
                    this.f45820q = e14;
                }
                c10003i2 = this.f45807d;
                c10003i2.m42069e(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    /* renamed from: s */
    public boolean m42022s() {
        Future<?> future = this.f45818o;
        return future != null && future.isCancelled();
    }

    /* renamed from: u */
    public boolean m42023u(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f45822s;
        if (!(i10 > 0)) {
            return false;
        }
        this.f45822s = i10 - 1;
        return this.f45814k.mo42101h(z10, networkInfo);
    }

    /* renamed from: v */
    public boolean m42024v() {
        return this.f45814k.mo42102i();
    }
}
