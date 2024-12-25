package p173ji;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kh.C5613g;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/s.class
 */
/* renamed from: ji.s */
/* loaded from: combined.jar:classes2.jar:ji/s.class */
public interface InterfaceC5428s {

    /* renamed from: b */
    public static final a f31126b = new a(null);

    /* renamed from: a */
    @NotNull
    public static final InterfaceC5428s f31125a = new a.C10307a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/s$a.class
     */
    /* renamed from: ji.s$a */
    /* loaded from: combined.jar:classes2.jar:ji/s$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/s$a$a.class
         */
        /* renamed from: ji.s$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ji/s$a$a.class */
        public static final class C10307a implements InterfaceC5428s {
            @Override // p173ji.InterfaceC5428s
            @NotNull
            public List<InetAddress> lookup(@NotNull String str) {
                C9367f.m39526e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C9367f.m39525d(allByName, "InetAddress.getAllByName(hostname)");
                    return C5613g.m27692r(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String str);
}
