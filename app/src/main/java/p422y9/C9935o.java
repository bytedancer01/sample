package p422y9;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p060da.C4420s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/o.class
 */
/* renamed from: y9.o */
/* loaded from: combined.jar:classes2.jar:y9/o.class */
public final class C9935o {
    /* renamed from: a */
    public static void m41841a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m41842b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m41843c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb2.append("Must be called on ");
            sb2.append(name2);
            sb2.append(" thread, but got ");
            sb2.append(name);
            sb2.append(InstructionFileId.DOT);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: d */
    public static void m41844d(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: e */
    public static void m41845e(String str) {
        if (!C4420s.m22472a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static String m41846f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m41847g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: h */
    public static void m41848h() {
        m41849i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m41849i(String str) {
        if (C4420s.m22472a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m41850j(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T m41851k(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m41852l(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: m */
    public static void m41853m(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public static void m41854n(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: o */
    public static void m41855o(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
