package p357ui;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kh.C5615i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ui/a.class
 */
/* renamed from: ui.a */
/* loaded from: combined.jar:classes2.jar:ui/a.class */
public final class C9208a extends ProxySelector {

    /* renamed from: a */
    public static final C9208a f42018a = new C9208a();

    @Override // java.net.ProxySelector
    public void connectFailed(@Nullable URI uri, @Nullable SocketAddress socketAddress, @Nullable IOException iOException) {
    }

    @Override // java.net.ProxySelector
    @NotNull
    public List<Proxy> select(@Nullable URI uri) {
        if (uri != null) {
            return C5615i.m27696b(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
