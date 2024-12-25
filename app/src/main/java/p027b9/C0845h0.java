package p027b9;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p059d9.C4349a;
import p059d9.C4365h0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/h0.class
 */
/* renamed from: b9.h0 */
/* loaded from: combined.jar:classes2.jar:b9/h0.class */
public final class C0845h0 implements InterfaceC0854m {

    /* renamed from: a */
    public final InterfaceC0854m f5808a;

    /* renamed from: b */
    public final C4365h0 f5809b;

    /* renamed from: c */
    public final int f5810c;

    public C0845h0(InterfaceC0854m interfaceC0854m, C4365h0 c4365h0, int i10) {
        this.f5808a = (InterfaceC0854m) C4349a.m21882e(interfaceC0854m);
        this.f5809b = (C4365h0) C4349a.m21882e(c4365h0);
        this.f5810c = i10;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        this.f5809b.m22029c(this.f5810c);
        return this.f5808a.mo521a(c0858p);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f5808a.mo522c(interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5808a.close();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        return this.f5808a.mo523e();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5808a.getUri();
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        this.f5809b.m22029c(this.f5810c);
        return this.f5808a.read(bArr, i10, i11);
    }
}
