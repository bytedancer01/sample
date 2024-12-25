package p027b9;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p027b9.InterfaceC0854m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/y.class
 */
/* renamed from: b9.y */
/* loaded from: combined.jar:classes2.jar:b9/y.class */
public final class C0867y implements InterfaceC0854m {

    /* renamed from: a */
    public static final C0867y f5943a = new C0867y();

    /* renamed from: b */
    public static final InterfaceC0854m.a f5944b = new InterfaceC0854m.a() { // from class: b9.x
        @Override // p027b9.InterfaceC0854m.a
        /* renamed from: a */
        public final InterfaceC0854m mo5296a() {
            return C0867y.m5430h();
        }
    };

    /* renamed from: h */
    public static /* synthetic */ C0867y m5430h() {
        return new C0867y();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public /* synthetic */ Map mo523e() {
        return C0852l.m5369a(this);
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return null;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
