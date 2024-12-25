package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/s.class
 */
/* renamed from: y9.s */
/* loaded from: combined.jar:classes2.jar:y9/s.class */
public class C9947s extends AbstractC10125a {
    public static final Parcelable.Creator<C9947s> CREATOR = new C9958w();

    /* renamed from: d */
    public final int f45644d;

    /* renamed from: e */
    public List<C9929m> f45645e;

    public C9947s(int i10, List<C9929m> list) {
        this.f45644d = i10;
        this.f45645e = list;
    }

    /* renamed from: P */
    public final int m41877P() {
        return this.f45644d;
    }

    /* renamed from: Q */
    public final List<C9929m> m41878Q() {
        return this.f45645e;
    }

    /* renamed from: R */
    public final void m41879R(C9929m c9929m) {
        if (this.f45645e == null) {
            this.f45645e = new ArrayList();
        }
        this.f45645e.add(c9929m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f45644d);
        C10127c.m42540w(parcel, 2, this.f45645e, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
