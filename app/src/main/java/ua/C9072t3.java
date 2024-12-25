package ua;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/t3.class
 */
/* renamed from: ua.t3 */
/* loaded from: combined.jar:classes2.jar:ua/t3.class */
public final class C9072t3 extends AbstractC9119x5 {

    /* renamed from: c */
    public static final AtomicReference<String[]> f41634c = new AtomicReference<>();

    /* renamed from: d */
    public static final AtomicReference<String[]> f41635d = new AtomicReference<>();

    /* renamed from: e */
    public static final AtomicReference<String[]> f41636e = new AtomicReference<>();

    public C9072t3(C8870c5 c8870c5) {
        super(c8870c5);
    }

    /* renamed from: u */
    public static final String m38229u(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C9935o.m41850j(strArr);
        C9935o.m41850j(strArr2);
        C9935o.m41850j(atomicReference);
        C9935o.m41841a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (C8899ea.m37820G(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    String[] strArr4 = strArr3;
                    if (strArr3 == null) {
                        strArr4 = new String[strArr2.length];
                        atomicReference.set(strArr4);
                    }
                    String str3 = strArr4[i10];
                    str2 = str3;
                    if (str3 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr4[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        return false;
    }

    /* renamed from: o */
    public final boolean m38230o() {
        this.f41723a.mo37783f();
        return this.f41723a.m37769K() && Log.isLoggable(this.f41723a.mo37780c().m38418z(), 3);
    }

    /* renamed from: p */
    public final String m38231p(String str) {
        if (str == null) {
            return null;
        }
        return !m38230o() ? str : m38229u(str, C8847a6.f40894c, C8847a6.f40892a, f41634c);
    }

    /* renamed from: q */
    public final String m38232q(String str) {
        if (str == null) {
            return null;
        }
        return !m38230o() ? str : m38229u(str, C8859b6.f40932b, C8859b6.f40931a, f41635d);
    }

    /* renamed from: r */
    public final String m38233r(String str) {
        if (str == null) {
            return null;
        }
        if (!m38230o()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m38229u(str, C8871c6.f40991b, C8871c6.f40990a, f41636e);
        }
        return "experiment_id(" + str + ")";
    }

    /* renamed from: s */
    public final String m38234s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m38230o()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m38232q(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? m38235t(new Object[]{obj}) : obj instanceof Object[] ? m38235t((Object[]) obj) : obj instanceof ArrayList ? m38235t(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: t */
    public final String m38235t(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String m38234s = obj instanceof Bundle ? m38234s((Bundle) obj) : String.valueOf(obj);
            if (m38234s != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(m38234s);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
