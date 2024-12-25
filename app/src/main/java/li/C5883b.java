package li;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import kh.C5624r;
import org.jetbrains.annotations.NotNull;
import p173ji.C5433x;
import p173ji.InterfaceC5401b;
import p173ji.InterfaceC5428s;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:li/b.class
 */
/* renamed from: li.b */
/* loaded from: combined.jar:classes2.jar:li/b.class */
public final class C5883b implements InterfaceC5401b {

    /* renamed from: d */
    public final InterfaceC5428s f32961d;

    public C5883b(@NotNull InterfaceC5428s interfaceC5428s) {
        C9367f.m39526e(interfaceC5428s, "defaultDns");
        this.f32961d = interfaceC5428s;
    }

    public /* synthetic */ C5883b(InterfaceC5428s interfaceC5428s, int i10, C9365d c9365d) {
        this((i10 & 1) != 0 ? InterfaceC5428s.f31125a : interfaceC5428s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r13 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r11 != null) goto L12;
     */
    @Override // p173ji.InterfaceC5401b
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p173ji.C5406d0 mo26775a(@org.jetbrains.annotations.Nullable p173ji.C5414h0 r10, @org.jetbrains.annotations.NotNull p173ji.C5410f0 r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: li.C5883b.mo26775a(ji.h0, ji.f0):ji.d0");
    }

    /* renamed from: b */
    public final InetAddress m28692b(Proxy proxy, C5433x c5433x, InterfaceC5428s interfaceC5428s) {
        InetAddress address;
        Proxy.Type type = proxy.type();
        if (type != null && C5882a.f32960a[type.ordinal()] == 1) {
            address = (InetAddress) C5624r.m27725u(interfaceC5428s.lookup(c5433x.m27112i()));
        } else {
            SocketAddress address2 = proxy.address();
            if (address2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
            }
            address = ((InetSocketAddress) address2).getAddress();
            C9367f.m39525d(address, "(address() as InetSocketAddress).address");
        }
        return address;
    }
}
