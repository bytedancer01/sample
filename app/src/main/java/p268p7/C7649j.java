package p268p7;

import java.nio.ByteBuffer;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/j.class
 */
/* renamed from: p7.j */
/* loaded from: combined.jar:classes2.jar:p7/j.class */
public final class C7649j extends C8638f {

    /* renamed from: i */
    public long f37186i;

    /* renamed from: j */
    public int f37187j;

    /* renamed from: k */
    public int f37188k;

    public C7649j() {
        super(2);
        this.f37188k = 32;
    }

    @Override // p332t6.C8638f, p332t6.AbstractC8633a
    public void clear() {
        super.clear();
        this.f37187j = 0;
    }

    /* renamed from: m */
    public boolean m33301m(C8638f c8638f) {
        C4349a.m21878a(!c8638f.m37083h());
        C4349a.m21878a(!c8638f.hasSupplementalData());
        C4349a.m21878a(!c8638f.isEndOfStream());
        if (!m33302n(c8638f)) {
            return false;
        }
        int i10 = this.f37187j;
        this.f37187j = i10 + 1;
        if (i10 == 0) {
            this.f40329e = c8638f.f40329e;
            if (c8638f.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (c8638f.isDecodeOnly()) {
            setFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        }
        ByteBuffer byteBuffer = c8638f.f40327c;
        if (byteBuffer != null) {
            m37081f(byteBuffer.remaining());
            this.f40327c.put(byteBuffer);
        }
        this.f37186i = c8638f.f40329e;
        return true;
    }

    /* renamed from: n */
    public final boolean m33302n(C8638f c8638f) {
        ByteBuffer byteBuffer;
        if (!m33306r()) {
            return true;
        }
        if (this.f37187j >= this.f37188k || c8638f.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = c8638f.f40327c;
        return byteBuffer2 == null || (byteBuffer = this.f40327c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* renamed from: o */
    public long m33303o() {
        return this.f40329e;
    }

    /* renamed from: p */
    public long m33304p() {
        return this.f37186i;
    }

    /* renamed from: q */
    public int m33305q() {
        return this.f37187j;
    }

    /* renamed from: r */
    public boolean m33306r() {
        return this.f37187j > 0;
    }

    /* renamed from: s */
    public void m33307s(int i10) {
        C4349a.m21878a(i10 > 0);
        this.f37188k = i10;
    }
}
