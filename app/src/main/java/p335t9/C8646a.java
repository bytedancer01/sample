package p335t9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/a.class
 */
/* renamed from: t9.a */
/* loaded from: combined.jar:classes2.jar:t9/a.class */
public final class C8646a extends AbstractC10125a {
    public static final Parcelable.Creator<C8646a> CREATOR = new C8655f();

    /* renamed from: d */
    public Intent f40392d;

    public C8646a(Intent intent) {
        this.f40392d = intent;
    }

    /* renamed from: P */
    public final Intent m37124P() {
        return this.f40392d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 1, this.f40392d, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
