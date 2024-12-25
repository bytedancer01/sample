package p400x7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4361f0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/a.class
 */
/* renamed from: x7.a */
/* loaded from: combined.jar:classes2.jar:x7/a.class */
public final class C9673a extends AbstractC9674b {
    public static final Parcelable.Creator<C9673a> CREATOR = new a();

    /* renamed from: b */
    public final long f44137b;

    /* renamed from: c */
    public final long f44138c;

    /* renamed from: d */
    public final byte[] f44139d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/a$a.class
     */
    /* renamed from: x7.a$a */
    /* loaded from: combined.jar:classes2.jar:x7/a$a.class */
    public class a implements Parcelable.Creator<C9673a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9673a createFromParcel(Parcel parcel) {
            return new C9673a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9673a[] newArray(int i10) {
            return new C9673a[i10];
        }
    }

    public C9673a(long j10, byte[] bArr, long j11) {
        this.f44137b = j11;
        this.f44138c = j10;
        this.f44139d = bArr;
    }

    public C9673a(Parcel parcel) {
        this.f44137b = parcel.readLong();
        this.f44138c = parcel.readLong();
        this.f44139d = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public /* synthetic */ C9673a(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public static C9673a m40684b(C4361f0 c4361f0, int i10, long j10) {
        long m21973F = c4361f0.m21973F();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        c4361f0.m21994j(bArr, 0, i11);
        return new C9673a(m21973F, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f44137b);
        parcel.writeLong(this.f44138c);
        parcel.writeByteArray(this.f44139d);
    }
}
