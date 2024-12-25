package af;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:af/b.class
 */
/* renamed from: af.b */
/* loaded from: combined.jar:classes2.jar:af/b.class */
public class C0159b implements Parcelable {
    public static final Parcelable.Creator<C0159b> CREATOR = new a();

    /* renamed from: b */
    public long f1264b;

    /* renamed from: c */
    public String f1265c;

    /* renamed from: d */
    public String f1266d;

    /* renamed from: e */
    public long f1267e;

    /* renamed from: f */
    public String f1268f;

    /* renamed from: g */
    public String f1269g;

    /* renamed from: h */
    public long f1270h;

    /* renamed from: i */
    public boolean f1271i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:af/b$a.class
     */
    /* renamed from: af.b$a */
    /* loaded from: combined.jar:classes2.jar:af/b$a.class */
    public class a implements Parcelable.Creator<C0159b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0159b createFromParcel(Parcel parcel) {
            C0159b c0159b = new C0159b();
            c0159b.f1264b = parcel.readLong();
            c0159b.f1265c = parcel.readString();
            c0159b.f1266d = parcel.readString();
            c0159b.f1267e = parcel.readLong();
            c0159b.f1268f = parcel.readString();
            c0159b.f1269g = parcel.readString();
            c0159b.f1270h = parcel.readLong();
            c0159b.f1271i = parcel.readByte() != 0;
            return c0159b;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0159b[] newArray(int i10) {
            return new C0159b[i10];
        }
    }

    /* renamed from: A */
    public long m695A() {
        return this.f1267e;
    }

    /* renamed from: B */
    public boolean m696B() {
        return this.f1271i;
    }

    /* renamed from: C */
    public void m697C(String str) {
        this.f1268f = str;
    }

    /* renamed from: H */
    public void m698H(String str) {
        this.f1269g = str;
    }

    /* renamed from: P */
    public void m699P(long j10) {
        this.f1270h = j10;
    }

    /* renamed from: Q */
    public void m700Q(long j10) {
        this.f1264b = j10;
    }

    /* renamed from: R */
    public void m701R(String str) {
        this.f1265c = str;
    }

    /* renamed from: S */
    public void m702S(String str) {
        this.f1266d = str;
    }

    /* renamed from: T */
    public void m703T(boolean z10) {
        this.f1271i = z10;
    }

    /* renamed from: U */
    public void m704U(long j10) {
        this.f1267e = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0159b) {
            return this.f1266d.equals(((C0159b) obj).f1266d);
        }
        return false;
    }

    public int hashCode() {
        return this.f1266d.hashCode();
    }

    /* renamed from: p */
    public String m705p() {
        return this.f1268f;
    }

    /* renamed from: r */
    public String m706r() {
        return this.f1269g;
    }

    /* renamed from: s */
    public long m707s() {
        return this.f1270h;
    }

    /* renamed from: u */
    public long m708u() {
        return this.f1264b;
    }

    /* renamed from: w */
    public String m709w() {
        return this.f1265c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f1264b);
        parcel.writeString(this.f1265c);
        parcel.writeString(this.f1266d);
        parcel.writeLong(this.f1267e);
        parcel.writeString(this.f1268f);
        parcel.writeString(this.f1269g);
        parcel.writeLong(this.f1270h);
        parcel.writeByte(this.f1271i ? (byte) 1 : (byte) 0);
    }

    /* renamed from: z */
    public String m710z() {
        return this.f1266d;
    }
}
