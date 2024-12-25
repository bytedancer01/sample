package p365v6;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import p059d9.C4401z0;
import p267p6.C7583h;
import p365v6.C9263i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/d0.class
 */
/* renamed from: v6.d0 */
/* loaded from: combined.jar:classes2.jar:v6/d0.class */
public final class C9254d0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/d0$a.class
     */
    /* renamed from: v6.d0$a */
    /* loaded from: combined.jar:classes2.jar:v6/d0$a.class */
    public static final class a {
        /* renamed from: a */
        public static boolean m39007a(Throwable th2) {
            return th2 instanceof DeniedByServerException;
        }

        /* renamed from: b */
        public static boolean m39008b(Throwable th2) {
            return th2 instanceof NotProvisionedException;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/d0$b.class
     */
    /* renamed from: v6.d0$b */
    /* loaded from: combined.jar:classes2.jar:v6/d0$b.class */
    public static final class b {
        /* renamed from: a */
        public static boolean m39009a(Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        /* renamed from: b */
        public static int m39010b(Throwable th2) {
            return C7583h.m32758b(C4401z0.m22357W(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/d0$c.class
     */
    /* renamed from: v6.d0$c */
    /* loaded from: combined.jar:classes2.jar:v6/d0$c.class */
    public static final class c {
        /* renamed from: a */
        public static boolean m39011a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    /* renamed from: a */
    public static int m39006a(Exception exc, int i10) {
        int i11 = C4401z0.f26679a;
        if (i11 >= 21 && b.m39009a(exc)) {
            return b.m39010b(exc);
        }
        if (i11 >= 23 && c.m39011a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.m39008b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i11 >= 18 && a.m39007a(exc)) {
            return 6007;
        }
        if (exc instanceof C9282r0) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof C9263i.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof C9274n0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
