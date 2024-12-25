package p422y9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p350u9.C8804b;
import p422y9.InterfaceC9917i;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/m0.class
 */
/* renamed from: y9.m0 */
/* loaded from: combined.jar:classes2.jar:y9/m0.class */
public final class C9930m0 extends AbstractC10125a {
    public static final Parcelable.Creator<C9930m0> CREATOR = new C9933n0();

    /* renamed from: d */
    public final int f45609d;

    /* renamed from: e */
    public final IBinder f45610e;

    /* renamed from: f */
    public final C8804b f45611f;

    /* renamed from: g */
    public final boolean f45612g;

    /* renamed from: h */
    public final boolean f45613h;

    public C9930m0(int i10, IBinder iBinder, C8804b c8804b, boolean z10, boolean z11) {
        this.f45609d = i10;
        this.f45610e = iBinder;
        this.f45611f = c8804b;
        this.f45612g = z10;
        this.f45613h = z11;
    }

    /* renamed from: P */
    public final C8804b m41827P() {
        return this.f45611f;
    }

    /* renamed from: Q */
    public final InterfaceC9917i m41828Q() {
        IBinder iBinder = this.f45610e;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC9917i.a.m41804y0(iBinder);
    }

    /* renamed from: R */
    public final boolean m41829R() {
        return this.f45612g;
    }

    /* renamed from: S */
    public final boolean m41830S() {
        return this.f45613h;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9930m0)) {
            return false;
        }
        C9930m0 c9930m0 = (C9930m0) obj;
        return this.f45611f.equals(c9930m0.f45611f) && C9932n.m41832b(m41828Q(), c9930m0.m41828Q());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f45609d);
        C10127c.m42528k(parcel, 2, this.f45610e, false);
        C10127c.m42535r(parcel, 3, this.f45611f, i10, false);
        C10127c.m42520c(parcel, 4, this.f45612g);
        C10127c.m42520c(parcel, 5, this.f45613h);
        C10127c.m42519b(parcel, m42518a);
    }
}
