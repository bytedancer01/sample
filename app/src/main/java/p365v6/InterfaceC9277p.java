package p365v6;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/p.class
 */
/* renamed from: v6.p */
/* loaded from: combined.jar:classes2.jar:v6/p.class */
public interface InterfaceC9277p {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/p$a.class
     */
    /* renamed from: v6.p$a */
    /* loaded from: combined.jar:classes2.jar:v6/p$a.class */
    public static class a extends IOException {

        /* renamed from: b */
        public final int f42365b;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f42365b = i10;
        }
    }

    /* renamed from: a */
    void mo39023a(InterfaceC9290x.a aVar);

    /* renamed from: b */
    UUID mo39024b();

    /* renamed from: c */
    boolean mo39025c();

    /* renamed from: d */
    ExoMediaCrypto mo39026d();

    /* renamed from: e */
    byte[] mo39027e();

    /* renamed from: f */
    void mo39028f(InterfaceC9290x.a aVar);

    /* renamed from: g */
    Map<String, String> mo39029g();

    a getError();

    int getState();
}
