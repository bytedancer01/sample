package p350u9;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ga.BinderC4994b;
import ga.InterfaceC4993a;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/c0.class
 */
/* renamed from: u9.c0 */
/* loaded from: combined.jar:classes2.jar:u9/c0.class */
public final class C8807c0 extends AbstractC10125a {
    public static final Parcelable.Creator<C8807c0> CREATOR = new C8809d0();

    /* renamed from: d */
    public final String f40833d;

    /* renamed from: e */
    public final boolean f40834e;

    /* renamed from: f */
    public final boolean f40835f;

    /* renamed from: g */
    public final Context f40836g;

    /* renamed from: h */
    public final boolean f40837h;

    public C8807c0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f40833d = str;
        this.f40834e = z10;
        this.f40835f = z11;
        this.f40836g = (Context) BinderC4994b.m25161U0(InterfaceC4993a.a.m25159y0(iBinder));
        this.f40837h = z12;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [android.os.IBinder, ga.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 1, this.f40833d, false);
        C10127c.m42520c(parcel, 2, this.f40834e);
        C10127c.m42520c(parcel, 3, this.f40835f);
        C10127c.m42528k(parcel, 4, BinderC4994b.m25160B1(this.f40836g), false);
        C10127c.m42520c(parcel, 5, this.f40837h);
        C10127c.m42519b(parcel, m42518a);
    }
}
