package p114g8;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p401x8.C9688i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/v.class
 */
/* renamed from: g8.v */
/* loaded from: combined.jar:classes2.jar:g8/v.class */
public final class C4989v implements InterfaceC4323f {

    /* renamed from: g */
    public static final Pattern f28980g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f28981h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    public final String f28982a;

    /* renamed from: b */
    public final C4389t0 f28983b;

    /* renamed from: d */
    public InterfaceC4325h f28985d;

    /* renamed from: f */
    public int f28987f;

    /* renamed from: c */
    public final C4361f0 f28984c = new C4361f0();

    /* renamed from: e */
    public byte[] f28986e = new byte[1024];

    public C4989v(String str, C4389t0 c4389t0) {
        this.f28982a = str;
        this.f28983b = c4389t0;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @RequiresNonNull({"output"})
    /* renamed from: b */
    public final InterfaceC4337t m25148b(long j10) {
        InterfaceC4337t mo479e = this.f28985d.mo479e(0, 3);
        mo479e.mo608f(new C7629w0.b().m33220e0("text/vtt").m33211V(this.f28982a).m33224i0(j10).m33194E());
        this.f28985d.mo491u();
        return mo479e;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f28985d = interfaceC4325h;
        interfaceC4325h.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21800d(this.f28986e, 0, 6, false);
        this.f28984c.m21981N(this.f28986e, 6);
        if (C9688i.m40795b(this.f28984c)) {
            return true;
        }
        interfaceC4324g.mo21800d(this.f28986e, 6, 3, false);
        this.f28984c.m21981N(this.f28986e, 9);
        return C9688i.m40795b(this.f28984c);
    }

    @RequiresNonNull({"output"})
    /* renamed from: e */
    public final void m25149e() {
        C4361f0 c4361f0 = new C4361f0(this.f28986e);
        C9688i.m40798e(c4361f0);
        long j10 = 0;
        long j11 = 0;
        for (String m22000p = c4361f0.m22000p(); !TextUtils.isEmpty(m22000p); m22000p = c4361f0.m22000p()) {
            if (m22000p.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f28980g.matcher(m22000p);
                if (!matcher.find()) {
                    throw C7594k1.m32822a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m22000p, null);
                }
                Matcher matcher2 = f28981h.matcher(m22000p);
                if (!matcher2.find()) {
                    throw C7594k1.m32822a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m22000p, null);
                }
                j11 = C9688i.m40797d((String) C4349a.m21882e(matcher.group(1)));
                j10 = C4389t0.m22237f(Long.parseLong((String) C4349a.m21882e(matcher2.group(1))));
            }
        }
        Matcher m40794a = C9688i.m40794a(c4361f0);
        if (m40794a == null) {
            m25148b(0L);
            return;
        }
        long m40797d = C9688i.m40797d((String) C4349a.m21882e(m40794a.group(1)));
        long m22241b = this.f28983b.m22241b(C4389t0.m22239j((j10 + m40797d) - j11));
        InterfaceC4337t m25148b = m25148b(m22241b - m40797d);
        this.f28984c.m21981N(this.f28986e, this.f28987f);
        m25148b.mo606e(this.f28984c, this.f28987f);
        m25148b.mo600b(m22241b, 1, this.f28987f, 0, null);
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C4349a.m21882e(this.f28985d);
        int length = (int) interfaceC4324g.getLength();
        int i10 = this.f28987f;
        byte[] bArr = this.f28986e;
        if (i10 == bArr.length) {
            this.f28986e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f28986e;
        int i11 = this.f28987f;
        int read = interfaceC4324g.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f28987f + read;
            this.f28987f = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        m25149e();
        return -1;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
