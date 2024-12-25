package p009a8;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import java.util.Arrays;
import p009a8.C0108m0;
import p026b8.C0825f;
import p026b8.InterfaceC0822c;
import p027b9.C0858p;
import p027b9.C0863u;
import p027b9.InterfaceC0837d0;
import p027b9.InterfaceC0854m;
import p057d7.C4321d;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p059d9.C4392v;
import p099fc.AbstractC4834t;
import p267p6.C7561b1;
import p267p6.C7583h;
import p365v6.InterfaceC9292z;
import p440z8.InterfaceC10075b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/k.class
 */
/* renamed from: a8.k */
/* loaded from: combined.jar:classes2.jar:a8/k.class */
public final class C0103k implements InterfaceC0092e0 {

    /* renamed from: a */
    public final InterfaceC0854m.a f351a;

    /* renamed from: b */
    public final SparseArray<InterfaceC0092e0> f352b;

    /* renamed from: c */
    public final int[] f353c;

    /* renamed from: d */
    public a f354d;

    /* renamed from: e */
    public InterfaceC10075b f355e;

    /* renamed from: f */
    public InterfaceC0837d0 f356f;

    /* renamed from: g */
    public long f357g;

    /* renamed from: h */
    public long f358h;

    /* renamed from: i */
    public long f359i;

    /* renamed from: j */
    public float f360j;

    /* renamed from: k */
    public float f361k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/k$a.class
     */
    /* renamed from: a8.k$a */
    /* loaded from: combined.jar:classes2.jar:a8/k$a.class */
    public interface a {
        /* renamed from: a */
        InterfaceC0822c mo444a(C7561b1.b bVar);
    }

    public C0103k(Context context, InterfaceC4329l interfaceC4329l) {
        this(new C0863u(context), interfaceC4329l);
    }

    public C0103k(InterfaceC0854m.a aVar) {
        this(aVar, new C4321d());
    }

    public C0103k(InterfaceC0854m.a aVar, InterfaceC4329l interfaceC4329l) {
        this.f351a = aVar;
        SparseArray<InterfaceC0092e0> m438d = m438d(aVar, interfaceC4329l);
        this.f352b = m438d;
        this.f353c = new int[m438d.size()];
        for (int i10 = 0; i10 < this.f352b.size(); i10++) {
            this.f353c[i10] = this.f352b.keyAt(i10);
        }
        this.f357g = -9223372036854775807L;
        this.f358h = -9223372036854775807L;
        this.f359i = -9223372036854775807L;
        this.f360j = -3.4028235E38f;
        this.f361k = -3.4028235E38f;
    }

    /* renamed from: d */
    public static SparseArray<InterfaceC0092e0> m438d(InterfaceC0854m.a aVar, InterfaceC4329l interfaceC4329l) {
        SparseArray<InterfaceC0092e0> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (InterfaceC0092e0) DashMediaSource.Factory.class.asSubclass(InterfaceC0092e0.class).getConstructor(InterfaceC0854m.a.class).newInstance(aVar));
        } catch (Exception e10) {
        }
        try {
            sparseArray.put(1, (InterfaceC0092e0) SsMediaSource.Factory.class.asSubclass(InterfaceC0092e0.class).getConstructor(InterfaceC0854m.a.class).newInstance(aVar));
        } catch (Exception e11) {
        }
        try {
            sparseArray.put(2, (InterfaceC0092e0) HlsMediaSource.Factory.class.asSubclass(InterfaceC0092e0.class).getConstructor(InterfaceC0854m.a.class).newInstance(aVar));
        } catch (Exception e12) {
        }
        try {
            sparseArray.put(3, (InterfaceC0092e0) RtspMediaSource.Factory.class.asSubclass(InterfaceC0092e0.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception e13) {
        }
        sparseArray.put(4, new C0108m0.b(aVar, interfaceC4329l));
        return sparseArray;
    }

    /* renamed from: e */
    public static InterfaceC0127w m439e(C7561b1 c7561b1, InterfaceC0127w interfaceC0127w) {
        C7561b1.d dVar = c7561b1.f36452e;
        long j10 = dVar.f36484a;
        if (j10 == 0 && dVar.f36485b == Long.MIN_VALUE && !dVar.f36487d) {
            return interfaceC0127w;
        }
        long m32760d = C7583h.m32760d(j10);
        long m32760d2 = C7583h.m32760d(c7561b1.f36452e.f36485b);
        C7561b1.d dVar2 = c7561b1.f36452e;
        return new C0091e(interfaceC0127w, m32760d, m32760d2, !dVar2.f36488e, dVar2.f36486c, dVar2.f36487d);
    }

    @Override // p009a8.InterfaceC0092e0
    /* renamed from: a */
    public int[] mo407a() {
        int[] iArr = this.f353c;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        if (r7.f359i != (-9223372036854775807L)) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a6  */
    @Override // p009a8.InterfaceC0092e0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p009a8.InterfaceC0127w mo409c(p267p6.C7561b1 r8) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0103k.mo409c(p6.b1):a8.w");
    }

    /* renamed from: f */
    public final InterfaceC0127w m440f(C7561b1 c7561b1, InterfaceC0127w interfaceC0127w) {
        String str;
        C4349a.m21882e(c7561b1.f36449b);
        C7561b1.b bVar = c7561b1.f36449b.f36507d;
        if (bVar == null) {
            return interfaceC0127w;
        }
        a aVar = this.f354d;
        InterfaceC10075b interfaceC10075b = this.f355e;
        if (aVar == null || interfaceC10075b == null) {
            str = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.";
        } else {
            InterfaceC0822c mo444a = aVar.mo444a(bVar);
            if (mo444a != null) {
                C0858p c0858p = new C0858p(bVar.f36453a);
                Object obj = bVar.f36454b;
                return new C0825f(interfaceC0127w, c0858p, obj != null ? obj : AbstractC4834t.m24542H(c7561b1.f36448a, c7561b1.f36449b.f36504a, bVar.f36453a), this, mo444a, interfaceC10075b);
            }
            str = "Playing media without ads, as no AdsLoader was provided.";
        }
        C4392v.m22275i("DefaultMediaSourceFactory", str);
        return interfaceC0127w;
    }

    /* renamed from: g */
    public C0103k m441g(InterfaceC10075b interfaceC10075b) {
        this.f355e = interfaceC10075b;
        return this;
    }

    /* renamed from: h */
    public C0103k m442h(a aVar) {
        this.f354d = aVar;
        return this;
    }

    @Override // p009a8.InterfaceC0092e0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0103k mo408b(InterfaceC9292z interfaceC9292z) {
        for (int i10 = 0; i10 < this.f352b.size(); i10++) {
            this.f352b.valueAt(i10).mo408b(interfaceC9292z);
        }
        return this;
    }
}
