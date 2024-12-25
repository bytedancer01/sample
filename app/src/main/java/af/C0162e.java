package af;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:af/e.class
 */
/* renamed from: af.e */
/* loaded from: combined.jar:classes2.jar:af/e.class */
public class C0162e extends C0159b {
    public static final Parcelable.Creator<C0162e> CREATOR = new a();

    /* renamed from: j */
    public String f1277j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:af/e$a.class
     */
    /* renamed from: af.e$a */
    /* loaded from: combined.jar:classes2.jar:af/e$a.class */
    public class a implements Parcelable.Creator<C0162e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0162e createFromParcel(Parcel parcel) {
            C0162e c0162e = new C0162e();
            c0162e.m700Q(parcel.readLong());
            c0162e.m701R(parcel.readString());
            c0162e.m702S(parcel.readString());
            c0162e.m704U(parcel.readLong());
            c0162e.m697C(parcel.readString());
            c0162e.m698H(parcel.readString());
            c0162e.m699P(parcel.readLong());
            c0162e.m703T(parcel.readByte() != 0);
            c0162e.m724W(parcel.readString());
            return c0162e;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0162e[] newArray(int i10) {
            return new C0162e[i10];
        }
    }

    /* renamed from: V */
    public String m723V() {
        return this.f1277j;
    }

    /* renamed from: W */
    public void m724W(String str) {
        this.f1277j = str;
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
        parcel.writeString(m723V());
    }
}
