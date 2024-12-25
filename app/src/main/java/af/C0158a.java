package af;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:af/a.class
 */
/* renamed from: af.a */
/* loaded from: combined.jar:classes2.jar:af/a.class */
public class C0158a extends C0159b {
    public static final Parcelable.Creator<C0158a> CREATOR = new a();

    /* renamed from: j */
    public long f1263j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:af/a$a.class
     */
    /* renamed from: af.a$a */
    /* loaded from: combined.jar:classes2.jar:af/a$a.class */
    public class a implements Parcelable.Creator<C0158a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0158a createFromParcel(Parcel parcel) {
            C0158a c0158a = new C0158a();
            c0158a.m700Q(parcel.readLong());
            c0158a.m701R(parcel.readString());
            c0158a.m702S(parcel.readString());
            c0158a.m704U(parcel.readLong());
            c0158a.m697C(parcel.readString());
            c0158a.m698H(parcel.readString());
            c0158a.m699P(parcel.readLong());
            c0158a.m703T(parcel.readByte() != 0);
            c0158a.m684W(parcel.readLong());
            return c0158a;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0158a[] newArray(int i10) {
            return new C0158a[i10];
        }
    }

    /* renamed from: V */
    public long m683V() {
        return this.f1263j;
    }

    /* renamed from: W */
    public void m684W(long j10) {
        this.f1263j = j10;
    }

    @Override // af.C0159b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // af.C0159b, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(m708u());
        parcel.writeString(m709w());
        parcel.writeString(m710z());
        parcel.writeLong(m695A());
        parcel.writeString(m705p());
        parcel.writeString(m706r());
        parcel.writeLong(m707s());
        parcel.writeByte(m696B() ? (byte) 1 : (byte) 0);
        parcel.writeLong(m683V());
    }
}
