package p440z8;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import ec.InterfaceC4709l;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p243o8.C6919a;
import p322s8.InterfaceC8546b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/y0.class
 */
/* renamed from: z8.y0 */
/* loaded from: combined.jar:classes2.jar:z8/y0.class */
public final class C10122y0 {
    /* renamed from: c */
    public static /* synthetic */ boolean m42482c(Object obj) {
        return !(obj instanceof InterfaceC8546b);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m42483d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* renamed from: e */
    public static void m42484e(C6919a.b bVar) {
        bVar.m31858b();
        if (bVar.m31861e() instanceof Spanned) {
            if (!(bVar.m31861e() instanceof Spannable)) {
                bVar.m31871o(SpannableString.valueOf(bVar.m31861e()));
            }
            m42486g((Spannable) C4349a.m21882e(bVar.m31861e()), new InterfaceC4709l() { // from class: z8.x0
                @Override // ec.InterfaceC4709l
                public final boolean apply(Object obj) {
                    boolean m42482c;
                    m42482c = C10122y0.m42482c(obj);
                    return m42482c;
                }
            });
        }
        m42485f(bVar);
    }

    /* renamed from: f */
    public static void m42485f(C6919a.b bVar) {
        bVar.m31873q(-3.4028235E38f, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        if (bVar.m31861e() instanceof Spanned) {
            if (!(bVar.m31861e() instanceof Spannable)) {
                bVar.m31871o(SpannableString.valueOf(bVar.m31861e()));
            }
            m42486g((Spannable) C4349a.m21882e(bVar.m31861e()), new InterfaceC4709l() { // from class: z8.w0
                @Override // ec.InterfaceC4709l
                public final boolean apply(Object obj) {
                    boolean m42483d;
                    m42483d = C10122y0.m42483d(obj);
                    return m42483d;
                }
            });
        }
    }

    /* renamed from: g */
    public static void m42486g(Spannable spannable, InterfaceC4709l<Object> interfaceC4709l) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (interfaceC4709l.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* renamed from: h */
    public static float m42487h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
