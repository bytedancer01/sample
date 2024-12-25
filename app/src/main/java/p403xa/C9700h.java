package p403xa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p368v9.InterfaceC9320f;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/h.class
 */
/* renamed from: xa.h */
/* loaded from: combined.jar:classes2.jar:xa/h.class */
public final class C9700h extends AbstractC10125a implements InterfaceC9320f {
    public static final Parcelable.Creator<C9700h> CREATOR = new C9701i();

    /* renamed from: d */
    public final List<String> f44243d;

    /* renamed from: e */
    public final String f44244e;

    public C9700h(List<String> list, String str) {
        this.f44243d = list;
        this.f44244e = str;
    }

    @Override // p368v9.InterfaceC9320f
    /* renamed from: w */
    public final Status mo13127w() {
        return this.f44244e != null ? Status.f14793i : Status.f14797m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42538u(parcel, 1, this.f44243d, false);
        C10127c.m42536s(parcel, 2, this.f44244e, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
