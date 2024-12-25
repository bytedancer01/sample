package af;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:af/d.class
 */
/* renamed from: af.d */
/* loaded from: combined.jar:classes2.jar:af/d.class */
public class C0161d extends C0159b {
    public static final Parcelable.Creator<C0161d> CREATOR = new a();

    /* renamed from: j */
    public int f1276j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:af/d$a.class
     */
    /* renamed from: af.d$a */
    /* loaded from: combined.jar:classes2.jar:af/d$a.class */
    public class a implements Parcelable.Creator<C0161d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0161d createFromParcel(Parcel parcel) {
            C0161d c0161d = new C0161d();
            c0161d.m700Q(parcel.readLong());
            c0161d.m701R(parcel.readString());
            c0161d.m702S(parcel.readString());
            c0161d.m704U(parcel.readLong());
            c0161d.m697C(parcel.readString());
            c0161d.m698H(parcel.readString());
            c0161d.m699P(parcel.readLong());
            c0161d.m703T(parcel.readByte() != 0);
            c0161d.m720V(parcel.readInt());
            return c0161d;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0161d[] newArray(int i10) {
            return new C0161d[i10];
        }
    }

    /* renamed from: V */
    public void m720V(int i10) {
        this.f1276j = i10;
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
        parcel.writeInt(this.f1276j);
    }
}
