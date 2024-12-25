package p198l7;

import com.google.android.exoplayer2.extractor.C2345d;
import com.google.android.exoplayer2.extractor.C2346e;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p057d7.C4330m;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p198l7.AbstractC5738i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/b.class
 */
/* renamed from: l7.b */
/* loaded from: combined.jar:classes2.jar:l7/b.class */
public final class C5731b extends AbstractC5738i {

    /* renamed from: n */
    public FlacStreamMetadata f32110n;

    /* renamed from: o */
    public a f32111o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l7/b$a.class
     */
    /* renamed from: l7.b$a */
    /* loaded from: combined.jar:classes2.jar:l7/b$a.class */
    public static final class a implements InterfaceC5736g {

        /* renamed from: a */
        public FlacStreamMetadata f32112a;

        /* renamed from: b */
        public FlacStreamMetadata.C2341a f32113b;

        /* renamed from: c */
        public long f32114c = -1;

        /* renamed from: d */
        public long f32115d = -1;

        public a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.C2341a c2341a) {
            this.f32112a = flacStreamMetadata;
            this.f32113b = c2341a;
        }

        @Override // p198l7.InterfaceC5736g
        /* renamed from: a */
        public long mo28087a(InterfaceC4324g interfaceC4324g) {
            long j10 = this.f32115d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f32115d = -1L;
            return j11;
        }

        @Override // p198l7.InterfaceC5736g
        /* renamed from: b */
        public InterfaceC2348g mo28088b() {
            C4349a.m21884g(this.f32114c != -1);
            return new C2346e(this.f32112a, this.f32114c);
        }

        @Override // p198l7.InterfaceC5736g
        /* renamed from: c */
        public void mo28089c(long j10) {
            long[] jArr = this.f32113b.f13764a;
            this.f32115d = jArr[C4401z0.m22389i(jArr, j10, true, true)];
        }

        /* renamed from: d */
        public void m28100d(long j10) {
            this.f32114c = j10;
        }
    }

    /* renamed from: o */
    public static boolean m28094o(byte[] bArr) {
        boolean z10 = false;
        if (bArr[0] == -1) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: p */
    public static boolean m28095p(C4361f0 c4361f0) {
        return c4361f0.m21985a() >= 5 && c4361f0.m21971D() == 127 && c4361f0.m21973F() == 1179402563;
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: f */
    public long mo28096f(C4361f0 c4361f0) {
        if (m28094o(c4361f0.m21988d())) {
            return m28099n(c4361f0);
        }
        return -1L;
    }

    @Override // p198l7.AbstractC5738i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo28097i(C4361f0 c4361f0, long j10, AbstractC5738i.b bVar) {
        byte[] m21988d = c4361f0.m21988d();
        FlacStreamMetadata flacStreamMetadata = this.f32110n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(m21988d, 17);
            this.f32110n = flacStreamMetadata2;
            bVar.f32151a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(m21988d, 9, c4361f0.m21990f()), null);
            return true;
        }
        if ((m21988d[0] & Byte.MAX_VALUE) == 3) {
            FlacStreamMetadata.C2341a m12105h = C2345d.m12105h(c4361f0);
            FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(m12105h);
            this.f32110n = copyWithSeekTable;
            this.f32111o = new a(copyWithSeekTable, m12105h);
            return true;
        }
        if (!m28094o(m21988d)) {
            return true;
        }
        a aVar = this.f32111o;
        if (aVar != null) {
            aVar.m28100d(j10);
            bVar.f32152b = this.f32111o;
        }
        C4349a.m21882e(bVar.f32151a);
        return false;
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: l */
    public void mo28098l(boolean z10) {
        super.mo28098l(z10);
        if (z10) {
            this.f32110n = null;
            this.f32111o = null;
        }
    }

    /* renamed from: n */
    public final int m28099n(C4361f0 c4361f0) {
        int i10 = (c4361f0.m21988d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c4361f0.m21984Q(4);
            c4361f0.m21978K();
        }
        int m21835j = C4330m.m21835j(c4361f0, i10);
        c4361f0.m21983P(0);
        return m21835j;
    }
}
