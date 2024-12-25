package p301r6;

import android.media.AudioAttributes;
import p059d9.C4401z0;
import p267p6.C7604o;
import p267p6.InterfaceC7579g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/d.class
 */
/* renamed from: r6.d */
/* loaded from: combined.jar:classes2.jar:r6/d.class */
public final class C7972d {

    /* renamed from: f */
    public static final C7972d f38501f = new b().m34576a();

    /* renamed from: g */
    public static final InterfaceC7579g<C7972d> f38502g = new C7604o();

    /* renamed from: a */
    public final int f38503a;

    /* renamed from: b */
    public final int f38504b;

    /* renamed from: c */
    public final int f38505c;

    /* renamed from: d */
    public final int f38506d;

    /* renamed from: e */
    public AudioAttributes f38507e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/d$b.class
     */
    /* renamed from: r6.d$b */
    /* loaded from: combined.jar:classes2.jar:r6/d$b.class */
    public static final class b {

        /* renamed from: a */
        public int f38508a = 0;

        /* renamed from: b */
        public int f38509b = 0;

        /* renamed from: c */
        public int f38510c = 1;

        /* renamed from: d */
        public int f38511d = 1;

        /* renamed from: a */
        public C7972d m34576a() {
            return new C7972d(this.f38508a, this.f38509b, this.f38510c, this.f38511d);
        }
    }

    public C7972d(int i10, int i11, int i12, int i13) {
        this.f38503a = i10;
        this.f38504b = i11;
        this.f38505c = i12;
        this.f38506d = i13;
    }

    /* renamed from: a */
    public AudioAttributes m34575a() {
        if (this.f38507e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f38503a).setFlags(this.f38504b).setUsage(this.f38505c);
            if (C4401z0.f26679a >= 29) {
                usage.setAllowedCapturePolicy(this.f38506d);
            }
            this.f38507e = usage.build();
        }
        return this.f38507e;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7972d.class != obj.getClass()) {
            return false;
        }
        C7972d c7972d = (C7972d) obj;
        if (this.f38503a != c7972d.f38503a || this.f38504b != c7972d.f38504b || this.f38505c != c7972d.f38505c || this.f38506d != c7972d.f38506d) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((527 + this.f38503a) * 31) + this.f38504b) * 31) + this.f38505c) * 31) + this.f38506d;
    }
}
