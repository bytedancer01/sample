package p230n9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ga.BinderC4994b;
import p230n9.C6719h;
import p304r9.C8015b;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/a.class
 */
/* renamed from: n9.a */
/* loaded from: combined.jar:classes2.jar:n9/a.class */
public class C6698a extends AbstractC10125a {

    /* renamed from: d */
    public final String f35053d;

    /* renamed from: e */
    public final String f35054e;

    /* renamed from: f */
    public final InterfaceC6748v0 f35055f;

    /* renamed from: g */
    public final C6719h f35056g;

    /* renamed from: h */
    public final boolean f35057h;

    /* renamed from: i */
    public final boolean f35058i;

    /* renamed from: j */
    public static final C8015b f35052j = new C8015b("CastMediaOptions");
    public static final Parcelable.Creator<C6698a> CREATOR = new C6725k();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n9/a$a.class
     */
    /* renamed from: n9.a$a */
    /* loaded from: combined.jar:classes2.jar:n9/a$a.class */
    public static final class a {

        /* renamed from: b */
        public String f35060b;

        /* renamed from: c */
        public C6704c f35061c;

        /* renamed from: a */
        public String f35059a = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";

        /* renamed from: d */
        public C6719h f35062d = new C6719h.a().m30960a();

        /* renamed from: e */
        public boolean f35063e = true;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder] */
        /* renamed from: a */
        public C6698a m30861a() {
            C6704c c6704c = this.f35061c;
            return new C6698a(this.f35059a, this.f35060b, c6704c == null ? null : c6704c.m30874c(), this.f35062d, false, this.f35063e);
        }

        /* renamed from: b */
        public a m30862b(String str) {
            this.f35060b = str;
            return this;
        }

        /* renamed from: c */
        public a m30863c(C6719h c6719h) {
            this.f35062d = c6719h;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [n9.v0] */
    public C6698a(String str, String str2, IBinder iBinder, C6719h c6719h, boolean z10, boolean z11) {
        C6702b0 c6702b0;
        this.f35053d = str;
        this.f35054e = str2;
        if (iBinder == null) {
            c6702b0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c6702b0 = queryLocalInterface instanceof InterfaceC6748v0 ? (InterfaceC6748v0) queryLocalInterface : new C6702b0(iBinder);
        }
        this.f35055f = c6702b0;
        this.f35056g = c6719h;
        this.f35057h = z10;
        this.f35058i = z11;
    }

    /* renamed from: P */
    public String m30856P() {
        return this.f35054e;
    }

    /* renamed from: Q */
    public C6704c m30857Q() {
        InterfaceC6748v0 interfaceC6748v0 = this.f35055f;
        if (interfaceC6748v0 == null) {
            return null;
        }
        try {
            return (C6704c) BinderC4994b.m25161U0(interfaceC6748v0.mo30866b());
        } catch (RemoteException e10) {
            f35052j.m34874b(e10, "Unable to call %s on %s.", "getWrappedClientObject", InterfaceC6748v0.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: R */
    public String m30858R() {
        return this.f35053d;
    }

    /* renamed from: S */
    public boolean m30859S() {
        return this.f35058i;
    }

    /* renamed from: T */
    public C6719h m30860T() {
        return this.f35056g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m30858R(), false);
        C10127c.m42536s(parcel, 3, m30856P(), false);
        InterfaceC6748v0 interfaceC6748v0 = this.f35055f;
        C10127c.m42528k(parcel, 4, interfaceC6748v0 == null ? null : interfaceC6748v0.asBinder(), false);
        C10127c.m42535r(parcel, 5, m30860T(), i10, false);
        C10127c.m42520c(parcel, 6, this.f35057h);
        C10127c.m42520c(parcel, 7, m30859S());
        C10127c.m42519b(parcel, m42518a);
    }

    public final boolean zza() {
        return this.f35057h;
    }
}
