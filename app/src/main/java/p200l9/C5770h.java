package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p304r9.C8013a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/h.class
 */
/* renamed from: l9.h */
/* loaded from: combined.jar:classes2.jar:l9/h.class */
public class C5770h extends AbstractC10125a {
    public static final Parcelable.Creator<C5770h> CREATOR = new C5825z0();

    /* renamed from: d */
    public boolean f32241d;

    /* renamed from: e */
    public String f32242e;

    /* renamed from: f */
    public boolean f32243f;

    /* renamed from: g */
    public C5766g f32244g;

    public C5770h() {
        this(false, C8013a.m34867h(Locale.getDefault()), false, null);
    }

    public C5770h(boolean z10, String str, boolean z11, C5766g c5766g) {
        this.f32241d = z10;
        this.f32242e = str;
        this.f32243f = z11;
        this.f32244g = c5766g;
    }

    /* renamed from: P */
    public boolean m28199P() {
        return this.f32243f;
    }

    /* renamed from: Q */
    public C5766g m28200Q() {
        return this.f32244g;
    }

    /* renamed from: R */
    public String m28201R() {
        return this.f32242e;
    }

    /* renamed from: S */
    public boolean m28202S() {
        return this.f32241d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5770h)) {
            return false;
        }
        C5770h c5770h = (C5770h) obj;
        return this.f32241d == c5770h.f32241d && C8013a.m34870k(this.f32242e, c5770h.f32242e) && this.f32243f == c5770h.f32243f && C8013a.m34870k(this.f32244g, c5770h.f32244g);
    }

    public int hashCode() {
        return C9932n.m41833c(Boolean.valueOf(this.f32241d), this.f32242e, Boolean.valueOf(this.f32243f), this.f32244g);
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f32241d), this.f32242e, Boolean.valueOf(this.f32243f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42520c(parcel, 2, m28202S());
        C10127c.m42536s(parcel, 3, m28201R(), false);
        C10127c.m42520c(parcel, 4, m28199P());
        C10127c.m42535r(parcel, 5, m28200Q(), i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
