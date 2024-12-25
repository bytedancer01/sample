package p198l7;

import com.amazonaws.services.p045s3.internal.Constants;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p059d9.C4349a;
import p059d9.C4361f0;
import p198l7.AbstractC5738i;
import p267p6.C7629w0;
import p301r6.C7987k0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/h.class
 */
/* renamed from: l7.h */
/* loaded from: combined.jar:classes2.jar:l7/h.class */
public final class C5737h extends AbstractC5738i {

    /* renamed from: o */
    public static final byte[] f32136o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f32137n;

    /* renamed from: o */
    public static boolean m28115o(C4361f0 c4361f0) {
        int m21985a = c4361f0.m21985a();
        byte[] bArr = f32136o;
        if (m21985a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c4361f0.m21994j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: f */
    public long mo28096f(C4361f0 c4361f0) {
        return m28119c(m28116n(c4361f0.m21988d()));
    }

    @Override // p198l7.AbstractC5738i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo28097i(C4361f0 c4361f0, long j10, AbstractC5738i.b bVar) {
        boolean z10 = true;
        if (this.f32137n) {
            C4349a.m21882e(bVar.f32151a);
            if (c4361f0.m21998n() != 1332770163) {
                z10 = false;
            }
            c4361f0.m21983P(0);
            return z10;
        }
        byte[] copyOf = Arrays.copyOf(c4361f0.m21988d(), c4361f0.m21990f());
        bVar.f32151a = new C7629w0.b().m33220e0("audio/opus").m33197H(C7987k0.m34732c(copyOf)).m33221f0(48000).m33209T(C7987k0.m34730a(copyOf)).m33194E();
        this.f32137n = true;
        return true;
    }

    @Override // p198l7.AbstractC5738i
    /* renamed from: l */
    public void mo28098l(boolean z10) {
        super.mo28098l(z10);
        if (z10) {
            this.f32137n = false;
        }
    }

    /* renamed from: n */
    public final long m28116n(byte[] bArr) {
        int i10;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1) {
                i10 = 2;
                if (i12 != 2) {
                    i10 = bArr[1] & 63;
                }
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? Constants.MAXIMUM_UPLOAD_PARTS << (r0 & 1) : (i13 & 3) == 3 ? 60000 : Constants.MAXIMUM_UPLOAD_PARTS << r0);
    }
}
