package p290qf;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qf/a.class
 */
/* renamed from: qf.a */
/* loaded from: combined.jar:classes2.jar:qf/a.class */
public class C7920a implements Parcelable {
    public static final Parcelable.Creator<C7920a> CREATOR = new a();

    /* renamed from: E */
    public static C7920a f38069E;

    /* renamed from: A */
    public boolean f38070A;

    /* renamed from: B */
    public String f38071B;

    /* renamed from: C */
    public int f38072C;

    /* renamed from: D */
    public String f38073D;

    /* renamed from: b */
    public HashSet<Object> f38074b;

    /* renamed from: c */
    public boolean f38075c;

    /* renamed from: d */
    public Uri f38076d;

    /* renamed from: e */
    public String f38077e;

    /* renamed from: f */
    public boolean f38078f;

    /* renamed from: g */
    public String f38079g;

    /* renamed from: h */
    public int f38080h;

    /* renamed from: i */
    public String f38081i;

    /* renamed from: j */
    public Uri f38082j;

    /* renamed from: k */
    public int f38083k;

    /* renamed from: l */
    public int f38084l;

    /* renamed from: m */
    public String f38085m;

    /* renamed from: n */
    public boolean f38086n;

    /* renamed from: o */
    public boolean f38087o;

    /* renamed from: p */
    public boolean f38088p;

    /* renamed from: q */
    public boolean f38089q;

    /* renamed from: r */
    public int f38090r;

    /* renamed from: s */
    public long f38091s;

    /* renamed from: t */
    public int f38092t;

    /* renamed from: u */
    public int f38093u;

    /* renamed from: v */
    public ArrayList<LiveStreamsDBModel> f38094v;

    /* renamed from: w */
    public List<GetEpisdoeDetailsCallback> f38095w;

    /* renamed from: x */
    public String f38096x;

    /* renamed from: y */
    public boolean f38097y;

    /* renamed from: z */
    public boolean f38098z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qf/a$a.class
     */
    /* renamed from: qf.a$a */
    /* loaded from: combined.jar:classes2.jar:qf/a$a.class */
    public class a implements Parcelable.Creator<C7920a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7920a createFromParcel(Parcel parcel) {
            return new C7920a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7920a[] newArray(int i10) {
            return new C7920a[i10];
        }
    }

    public C7920a() {
        this.f38074b = new HashSet<>();
        this.f38075c = false;
        this.f38077e = "12345";
        this.f38078f = true;
        this.f38080h = 0;
        this.f38083k = 0;
        this.f38084l = DefaultRenderer.BACKGROUND_COLOR;
        this.f38085m = "ijk";
        this.f38086n = true;
        this.f38087o = false;
        this.f38088p = true;
        this.f38089q = false;
        this.f38090r = 0;
        this.f38092t = 0;
        this.f38097y = false;
        this.f38098z = false;
        this.f38070A = false;
    }

    public C7920a(Parcel parcel) {
        this.f38074b = new HashSet<>();
        this.f38075c = false;
        this.f38077e = "12345";
        this.f38078f = true;
        this.f38080h = 0;
        this.f38083k = 0;
        this.f38084l = DefaultRenderer.BACKGROUND_COLOR;
        this.f38085m = "ijk";
        this.f38086n = true;
        this.f38087o = false;
        this.f38088p = true;
        this.f38089q = false;
        this.f38090r = 0;
        this.f38092t = 0;
        this.f38097y = false;
        this.f38098z = false;
        this.f38070A = false;
        this.f38077e = parcel.readString();
        this.f38076d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f38079g = parcel.readString();
        this.f38078f = parcel.readByte() != 0;
        this.f38080h = parcel.readInt();
        this.f38081i = parcel.readString();
        this.f38082j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f38074b = (HashSet) parcel.readSerializable();
        this.f38075c = parcel.readByte() != 0;
        this.f38083k = parcel.readInt();
        this.f38084l = parcel.readInt();
        this.f38085m = parcel.readString();
        this.f38086n = parcel.readByte() != 0;
        this.f38087o = parcel.readByte() != 0;
        this.f38088p = parcel.readByte() != 0;
        this.f38089q = parcel.readByte() != 0;
    }

    /* renamed from: l */
    public static C7920a m34301l() {
        if (f38069E == null) {
            f38069E = new C7920a();
        }
        return f38069E;
    }

    /* renamed from: A */
    public C7920a m34302A(int i10) {
        this.f38072C = i10;
        return this;
    }

    /* renamed from: B */
    public C7920a m34303B(int i10) {
        this.f38093u = i10;
        return this;
    }

    /* renamed from: C */
    public C7920a m34304C(long j10) {
        this.f38091s = j10;
        return this;
    }

    /* renamed from: b */
    public String m34305b() {
        return this.f38096x;
    }

    /* renamed from: c */
    public ArrayList<LiveStreamsDBModel> m34306c() {
        return this.f38094v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public int m34307j() {
        return this.f38090r;
    }

    /* renamed from: k */
    public String m34308k() {
        return this.f38071B;
    }

    /* renamed from: m */
    public String m34309m() {
        return this.f38073D;
    }

    /* renamed from: n */
    public int m34310n() {
        return this.f38072C;
    }

    /* renamed from: o */
    public int m34311o() {
        return this.f38093u;
    }

    /* renamed from: p */
    public C7920a m34312p(String str) {
        this.f38096x = str;
        return this;
    }

    /* renamed from: r */
    public C7920a m34313r(ArrayList<LiveStreamsDBModel> arrayList) {
        this.f38094v = arrayList;
        return this;
    }

    /* renamed from: s */
    public C7920a m34314s(List<GetEpisdoeDetailsCallback> list) {
        this.f38095w = list;
        return this;
    }

    /* renamed from: u */
    public C7920a m34315u(int i10) {
        this.f38090r = i10;
        return this;
    }

    /* renamed from: w */
    public C7920a m34316w(String str) {
        this.f38071B = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f38077e);
        parcel.writeParcelable(this.f38076d, i10);
        parcel.writeString(this.f38079g);
        parcel.writeByte(this.f38078f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f38080h);
        parcel.writeString(this.f38081i);
        parcel.writeParcelable(this.f38082j, i10);
        parcel.writeSerializable(this.f38074b);
        parcel.writeByte(this.f38075c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f38083k);
        parcel.writeInt(this.f38084l);
        parcel.writeString(this.f38085m);
        parcel.writeByte(this.f38086n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f38087o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f38088p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f38089q ? (byte) 1 : (byte) 0);
    }

    /* renamed from: z */
    public C7920a m34317z(String str) {
        this.f38073D = str;
        return this;
    }
}
