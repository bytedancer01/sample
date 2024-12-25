package p339ti;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/j.class
 */
/* renamed from: ti.j */
/* loaded from: combined.jar:classes2.jar:ti/j.class */
public final class C8759j implements InterfaceC8760k {

    /* renamed from: a */
    public InterfaceC8760k f40736a;

    /* renamed from: b */
    public final a f40737b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/j$a.class
     */
    /* renamed from: ti.j$a */
    /* loaded from: combined.jar:classes2.jar:ti/j$a.class */
    public interface a {
        /* renamed from: a */
        boolean mo37562a(@NotNull SSLSocket sSLSocket);

        @NotNull
        /* renamed from: b */
        InterfaceC8760k mo37563b(@NotNull SSLSocket sSLSocket);
    }

    public C8759j(@NotNull a aVar) {
        C9367f.m39526e(aVar, "socketAdapterFactory");
        this.f40737b = aVar;
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: a */
    public boolean mo37543a(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return this.f40737b.mo37562a(sSLSocket);
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: b */
    public boolean mo37544b() {
        return true;
    }

    @Override // p339ti.InterfaceC8760k
    @Nullable
    /* renamed from: c */
    public String mo37545c(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        InterfaceC8760k m37571e = m37571e(sSLSocket);
        return m37571e != null ? m37571e.mo37545c(sSLSocket) : null;
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: d */
    public void mo37546d(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        InterfaceC8760k m37571e = m37571e(sSLSocket);
        if (m37571e != null) {
            m37571e.mo37546d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final InterfaceC8760k m37571e(SSLSocket sSLSocket) {
        InterfaceC8760k interfaceC8760k;
        synchronized (this) {
            if (this.f40736a == null && this.f40737b.mo37562a(sSLSocket)) {
                this.f40736a = this.f40737b.mo37563b(sSLSocket);
            }
            interfaceC8760k = this.f40736a;
        }
        return interfaceC8760k;
    }
}
