package p244o9;

import android.os.RemoteException;
import java.util.List;
import p200l9.C5782l;
import p230n9.C6719h;
import p230n9.InterfaceC6752x0;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/w.class
 */
/* renamed from: o9.w */
/* loaded from: combined.jar:classes2.jar:o9/w.class */
public final class C6953w {

    /* renamed from: a */
    public static final C8015b f35928a = new C8015b("MediaSessionUtils");

    /* renamed from: a */
    public static int m31940a(C6719h c6719h, long j10) {
        int m30931V = c6719h.m30931V();
        if (j10 == 10000) {
            m30931V = c6719h.m30929T();
        } else if (j10 == 30000) {
            return c6719h.m30930U();
        }
        return m30931V;
    }

    /* renamed from: b */
    public static int m31941b(C6719h c6719h, long j10) {
        int m30947l0 = c6719h.m30947l0();
        if (j10 == 10000) {
            m30947l0 = c6719h.m30945j0();
        } else if (j10 == 30000) {
            return c6719h.m30946k0();
        }
        return m30947l0;
    }

    /* renamed from: c */
    public static int m31942c(C6719h c6719h, long j10) {
        int m30936a0 = c6719h.m30936a0();
        if (j10 == 10000) {
            m30936a0 = c6719h.m30934Y();
        } else if (j10 == 30000) {
            return c6719h.m30935Z();
        }
        return m30936a0;
    }

    /* renamed from: d */
    public static int m31943d(C6719h c6719h, long j10) {
        int m30953r0 = c6719h.m30953r0();
        if (j10 == 10000) {
            m30953r0 = c6719h.m30951p0();
        } else if (j10 == 30000) {
            return c6719h.m30952q0();
        }
        return m30953r0;
    }

    /* renamed from: e */
    public static String m31944e(C5782l c5782l) {
        String str = "com.google.android.gms.cast.metadata.SUBTITLE";
        if (!c5782l.m28243P("com.google.android.gms.cast.metadata.SUBTITLE")) {
            int m28245R = c5782l.m28245R();
            if (m28245R == 1) {
                str = "com.google.android.gms.cast.metadata.STUDIO";
            } else if (m28245R == 2) {
                str = "com.google.android.gms.cast.metadata.SERIES_TITLE";
            } else if (m28245R != 3) {
                if (m28245R != 4) {
                    str = "com.google.android.gms.cast.metadata.SUBTITLE";
                }
                str = "com.google.android.gms.cast.metadata.ARTIST";
            } else {
                if (!c5782l.m28243P("com.google.android.gms.cast.metadata.ARTIST")) {
                    if (c5782l.m28243P("com.google.android.gms.cast.metadata.ALBUM_ARTIST")) {
                        str = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
                    } else {
                        str = "com.google.android.gms.cast.metadata.SUBTITLE";
                        if (c5782l.m28243P("com.google.android.gms.cast.metadata.COMPOSER")) {
                            str = "com.google.android.gms.cast.metadata.COMPOSER";
                        }
                    }
                }
                str = "com.google.android.gms.cast.metadata.ARTIST";
            }
        }
        return c5782l.m28246S(str);
    }

    /* renamed from: f */
    public static List m31945f(InterfaceC6752x0 interfaceC6752x0) {
        try {
            return interfaceC6752x0.mo31074d();
        } catch (RemoteException e10) {
            f35928a.m34876d(e10, "Unable to call %s on %s.", "getNotificationActions", InterfaceC6752x0.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: g */
    public static int[] m31946g(InterfaceC6752x0 interfaceC6752x0) {
        try {
            return interfaceC6752x0.mo31073b();
        } catch (RemoteException e10) {
            f35928a.m34876d(e10, "Unable to call %s on %s.", "getCompactViewActionIndices", InterfaceC6752x0.class.getSimpleName());
            return null;
        }
    }
}
