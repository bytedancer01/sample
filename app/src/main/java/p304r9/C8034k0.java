package p304r9;

import com.google.android.gms.common.api.Status;
import p200l9.C5754d;
import p200l9.C5758e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/k0.class
 */
/* renamed from: r9.k0 */
/* loaded from: combined.jar:classes2.jar:r9/k0.class */
public final class C8034k0 implements C5758e.a {

    /* renamed from: b */
    public final Status f38823b;

    /* renamed from: c */
    public final C5754d f38824c;

    /* renamed from: d */
    public final String f38825d;

    /* renamed from: e */
    public final String f38826e;

    /* renamed from: f */
    public final boolean f38827f;

    public C8034k0(Status status, C5754d c5754d, String str, String str2, boolean z10) {
        this.f38823b = status;
        this.f38824c = c5754d;
        this.f38825d = str;
        this.f38826e = str2;
        this.f38827f = z10;
    }

    @Override // p200l9.C5758e.a
    /* renamed from: A */
    public final boolean mo28176A() {
        return this.f38827f;
    }

    @Override // p200l9.C5758e.a
    /* renamed from: B */
    public final String mo28177B() {
        return this.f38825d;
    }

    @Override // p200l9.C5758e.a
    /* renamed from: H */
    public final C5754d mo28178H() {
        return this.f38824c;
    }

    @Override // p200l9.C5758e.a
    public final String getSessionId() {
        return this.f38826e;
    }

    @Override // p368v9.InterfaceC9320f
    /* renamed from: w */
    public final Status mo13127w() {
        return this.f38823b;
    }
}
