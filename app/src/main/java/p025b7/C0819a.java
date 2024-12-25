package p025b7;

import android.net.Uri;
import net.butterflytv.rtmp_client.RtmpClient;
import p027b9.AbstractC0842g;
import p027b9.C0858p;
import p059d9.C4401z0;
import p267p6.C7623u0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b7/a.class
 */
/* renamed from: b7.a */
/* loaded from: combined.jar:classes2.jar:b7/a.class */
public final class C0819a extends AbstractC0842g {

    /* renamed from: g */
    public static final int f5679g = 0;

    /* renamed from: e */
    public RtmpClient f5680e;

    /* renamed from: f */
    public Uri f5681f;

    static {
        C7623u0.m33152a("goog.exo.rtmp");
    }

    public C0819a() {
        super(true);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        m5355t(c0858p);
        RtmpClient rtmpClient = new RtmpClient();
        this.f5680e = rtmpClient;
        rtmpClient.m31240b(c0858p.f5847a.toString(), false);
        this.f5681f = c0858p.f5847a;
        m5356u(c0858p);
        return -1L;
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        if (this.f5681f != null) {
            this.f5681f = null;
            m5354s();
        }
        RtmpClient rtmpClient = this.f5680e;
        if (rtmpClient != null) {
            rtmpClient.m31239a();
            this.f5680e = null;
        }
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5681f;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        int m31241c = ((RtmpClient) C4401z0.m22391j(this.f5680e)).m31241c(bArr, i10, i11);
        if (m31241c == -1) {
            return -1;
        }
        m5353r(m31241c);
        return m31241c;
    }
}
