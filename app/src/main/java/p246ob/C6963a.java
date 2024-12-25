package p246ob;

import android.content.Context;
import android.graphics.Color;
import lb.C5837a;
import p012ab.C0142b;
import p087f0.C4738a;
import p351ub.C9147b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ob/a.class
 */
/* renamed from: ob.a */
/* loaded from: combined.jar:classes2.jar:ob/a.class */
public class C6963a {

    /* renamed from: a */
    public final boolean f35935a;

    /* renamed from: b */
    public final int f35936b;

    /* renamed from: c */
    public final int f35937c;

    /* renamed from: d */
    public final float f35938d;

    public C6963a(Context context) {
        this.f35935a = C9147b.m38473b(context, C0142b.f656p, false);
        this.f35936b = C5837a.m28422a(context, C0142b.f655o, 0);
        this.f35937c = C5837a.m28422a(context, C0142b.f653m, 0);
        this.f35938d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public float m31957a(float f10) {
        if (this.f35938d <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m31958b(int i10, float f10) {
        float m31957a = m31957a(f10);
        return C4738a.m23974m(C5837a.m28427f(C4738a.m23974m(i10, 255), this.f35936b, m31957a), Color.alpha(i10));
    }

    /* renamed from: c */
    public int m31959c(int i10, float f10) {
        int i11 = i10;
        if (this.f35935a) {
            i11 = i10;
            if (m31961e(i10)) {
                i11 = m31958b(i10, f10);
            }
        }
        return i11;
    }

    /* renamed from: d */
    public boolean m31960d() {
        return this.f35935a;
    }

    /* renamed from: e */
    public final boolean m31961e(int i10) {
        return C4738a.m23974m(i10, 255) == this.f35937c;
    }
}
