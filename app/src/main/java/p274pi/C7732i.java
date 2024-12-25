package p274pi;

import java.net.Proxy;
import org.jetbrains.annotations.NotNull;
import p173ji.C5406d0;
import p173ji.C5433x;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/i.class
 */
/* renamed from: pi.i */
/* loaded from: combined.jar:classes2.jar:pi/i.class */
public final class C7732i {

    /* renamed from: a */
    public static final C7732i f37510a = new C7732i();

    @NotNull
    /* renamed from: a */
    public final String m33757a(@NotNull C5406d0 c5406d0, @NotNull Proxy.Type type) {
        C9367f.m39526e(c5406d0, "request");
        C9367f.m39526e(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c5406d0.m26877g());
        sb2.append(' ');
        C7732i c7732i = f37510a;
        boolean m33758b = c7732i.m33758b(c5406d0, type);
        C5433x m26880j = c5406d0.m26880j();
        if (m33758b) {
            sb2.append(m26880j);
        } else {
            sb2.append(c7732i.m33759c(m26880j));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: b */
    public final boolean m33758b(C5406d0 c5406d0, Proxy.Type type) {
        return !c5406d0.m26876f() && type == Proxy.Type.HTTP;
    }

    @NotNull
    /* renamed from: c */
    public final String m33759c(@NotNull C5433x c5433x) {
        C9367f.m39526e(c5433x, "url");
        String m27108d = c5433x.m27108d();
        String m27110f = c5433x.m27110f();
        String str = m27108d;
        if (m27110f != null) {
            str = m27108d + '?' + m27110f;
        }
        return str;
    }
}
