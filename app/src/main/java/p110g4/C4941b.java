package p110g4;

import android.content.Context;
import java.io.InputStream;
import p073e4.C4608c;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;
import p416y3.C9816b;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g4/b.class
 */
/* renamed from: g4.b */
/* loaded from: combined.jar:classes1.jar:g4/b.class */
public class C4941b implements InterfaceC4617l {

    /* renamed from: a */
    public final String f28698a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g4/b$a.class
     */
    /* renamed from: g4.b$a */
    /* loaded from: combined.jar:classes1.jar:g4/b$a.class */
    public static class a implements InterfaceC4618m<byte[], InputStream> {
        @Override // p073e4.InterfaceC4618m
        /* renamed from: a */
        public void mo23256a() {
        }

        @Override // p073e4.InterfaceC4618m
        /* renamed from: b */
        public InterfaceC4617l<byte[], InputStream> mo23257b(Context context, C4608c c4608c) {
            return new C4941b();
        }
    }

    public C4941b() {
        this("");
    }

    @Deprecated
    public C4941b(String str) {
        this.f28698a = str;
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<InputStream> mo23227a(byte[] bArr, int i10, int i11) {
        return new C9816b(bArr, this.f28698a);
    }
}
