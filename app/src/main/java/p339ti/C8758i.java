package p339ti;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p339ti.C8759j;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8582d;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/i.class
 */
/* renamed from: ti.i */
/* loaded from: combined.jar:classes2.jar:ti/i.class */
public final class C8758i implements InterfaceC8760k {

    /* renamed from: b */
    public static final b f40735b = new b(null);

    /* renamed from: a */
    @NotNull
    public static final C8759j.a f40734a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/i$a.class
     */
    /* renamed from: ti.i$a */
    /* loaded from: combined.jar:classes2.jar:ti/i$a.class */
    public static final class a implements C8759j.a {
        @Override // p339ti.C8759j.a
        /* renamed from: a */
        public boolean mo37562a(@NotNull SSLSocket sSLSocket) {
            C9367f.m39526e(sSLSocket, "sslSocket");
            return C8582d.f40023f.m36858c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // p339ti.C8759j.a
        @NotNull
        /* renamed from: b */
        public InterfaceC8760k mo37563b(@NotNull SSLSocket sSLSocket) {
            C9367f.m39526e(sSLSocket, "sslSocket");
            return new C8758i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/i$b.class
     */
    /* renamed from: ti.i$b */
    /* loaded from: combined.jar:classes2.jar:ti/i$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C8759j.a m37570a() {
            return C8758i.f40734a;
        }
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: a */
    public boolean mo37543a(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: b */
    public boolean mo37544b() {
        return C8582d.f40023f.m36858c();
    }

    @Override // p339ti.InterfaceC8760k
    @Nullable
    /* renamed from: c */
    public String mo37545c(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return mo37543a(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : null;
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: d */
    public void mo37546d(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        if (mo37543a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C8588j.f40042c.m36875b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
