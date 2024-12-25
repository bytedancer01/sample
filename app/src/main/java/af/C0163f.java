package af;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:af/f.class
 */
/* renamed from: af.f */
/* loaded from: combined.jar:classes2.jar:af/f.class */
public class C0163f extends C0159b {
    public static final Parcelable.Creator<C0163f> CREATOR = new a();

    /* renamed from: j */
    public long f1278j;

    /* renamed from: k */
    public String f1279k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:af/f$a.class
     */
    /* renamed from: af.f$a */
    /* loaded from: combined.jar:classes2.jar:af/f$a.class */
    public class a implements Parcelable.Creator<C0163f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0163f createFromParcel(Parcel parcel) {
            C0163f c0163f = new C0163f();
            c0163f.m700Q(parcel.readLong());
            c0163f.m701R(parcel.readString());
            c0163f.m702S(parcel.readString());
            c0163f.m704U(parcel.readLong());
            c0163f.m697C(parcel.readString());
            c0163f.m698H(parcel.readString());
            c0163f.m699P(parcel.readLong());
            c0163f.m703T(parcel.readByte() != 0);
            c0163f.m729X(parcel.readLong());
            c0163f.m730Y(parcel.readString());
            return c0163f;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0163f[] newArray(int i10) {
            return new C0163f[i10];
        }
    }

    /* renamed from: V */
    public long m727V() {
        return this.f1278j;
    }

    /* renamed from: W */
    public String m728W() {
        return this.f1279k;
    }

    /* renamed from: X */
    public void m729X(long j10) {
        this.f1278j = j10;
    }

    /* renamed from: Y */
    public void m730Y(String str) {
        this.f1279k = str;
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
        parcel.writeLong(m727V());
        parcel.writeString(m728W());
    }
}
