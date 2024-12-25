package p365v6;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.Map;
import java.util.UUID;
import p059d9.C4349a;
import p267p6.C7583h;
import p365v6.InterfaceC9277p;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/f0.class
 */
/* renamed from: v6.f0 */
/* loaded from: combined.jar:classes2.jar:v6/f0.class */
public final class C9258f0 implements InterfaceC9277p {

    /* renamed from: a */
    public final InterfaceC9277p.a f42255a;

    public C9258f0(InterfaceC9277p.a aVar) {
        this.f42255a = (InterfaceC9277p.a) C4349a.m21882e(aVar);
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: a */
    public void mo39023a(InterfaceC9290x.a aVar) {
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: b */
    public final UUID mo39024b() {
        return C7583h.f36776a;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: c */
    public boolean mo39025c() {
        return false;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: d */
    public ExoMediaCrypto mo39026d() {
        return null;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: e */
    public byte[] mo39027e() {
        return null;
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: f */
    public void mo39028f(InterfaceC9290x.a aVar) {
    }

    @Override // p365v6.InterfaceC9277p
    /* renamed from: g */
    public Map<String, String> mo39029g() {
        return null;
    }

    @Override // p365v6.InterfaceC9277p
    public InterfaceC9277p.a getError() {
        return this.f42255a;
    }

    @Override // p365v6.InterfaceC9277p
    public int getState() {
        return 1;
    }
}
