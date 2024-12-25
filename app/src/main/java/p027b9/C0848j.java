package p027b9;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import ec.C4701d;
import java.net.URLDecoder;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/j.class
 */
/* renamed from: b9.j */
/* loaded from: combined.jar:classes2.jar:b9/j.class */
public final class C0848j extends AbstractC0842g {

    /* renamed from: e */
    public C0858p f5818e;

    /* renamed from: f */
    public byte[] f5819f;

    /* renamed from: g */
    public int f5820g;

    /* renamed from: h */
    public int f5821h;

    public C0848j() {
        super(false);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        m5355t(c0858p);
        this.f5818e = c0858p;
        Uri uri = c0858p.f5847a;
        String scheme = uri.getScheme();
        C4349a.m21879b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] m22356V0 = C4401z0.m22356V0(uri.getSchemeSpecificPart(), ",");
        if (m22356V0.length != 2) {
            throw C7594k1.m32823b("Unexpected URI format: " + uri, null);
        }
        String str = m22356V0[1];
        if (m22356V0[0].contains(";base64")) {
            try {
                this.f5819f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw C7594k1.m32823b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f5819f = C4401z0.m22396l0(URLDecoder.decode(str, C4701d.f27715a.name()));
        }
        long j10 = c0858p.f5853g;
        byte[] bArr = this.f5819f;
        if (j10 > bArr.length) {
            this.f5819f = null;
            throw new C0856n(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i10 = (int) j10;
        this.f5820g = i10;
        int length = bArr.length - i10;
        this.f5821h = length;
        long j11 = c0858p.f5854h;
        if (j11 != -1) {
            this.f5821h = (int) Math.min(length, j11);
        }
        m5356u(c0858p);
        long j12 = c0858p.f5854h;
        if (j12 == -1) {
            j12 = this.f5821h;
        }
        return j12;
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        if (this.f5819f != null) {
            this.f5819f = null;
            m5354s();
        }
        this.f5818e = null;
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        C0858p c0858p = this.f5818e;
        return c0858p != null ? c0858p.f5847a : null;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f5821h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(C4401z0.m22391j(this.f5819f), this.f5820g, bArr, i10, min);
        this.f5820g += min;
        this.f5821h -= min;
        m5353r(min);
        return min;
    }
}
