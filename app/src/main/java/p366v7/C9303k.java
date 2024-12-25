package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/k.class
 */
/* renamed from: v7.k */
/* loaded from: combined.jar:classes2.jar:v7/k.class */
public final class C9303k extends AbstractC9301i {
    public static final Parcelable.Creator<C9303k> CREATOR = new a();

    /* renamed from: c */
    public final int f42431c;

    /* renamed from: d */
    public final int f42432d;

    /* renamed from: e */
    public final int f42433e;

    /* renamed from: f */
    public final int[] f42434f;

    /* renamed from: g */
    public final int[] f42435g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/k$a.class
     */
    /* renamed from: v7.k$a */
    /* loaded from: combined.jar:classes2.jar:v7/k$a.class */
    public class a implements Parcelable.Creator<C9303k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9303k createFromParcel(Parcel parcel) {
            return new C9303k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9303k[] newArray(int i10) {
            return new C9303k[i10];
        }
    }

    public C9303k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f42431c = i10;
        this.f42432d = i11;
        this.f42433e = i12;
        this.f42434f = iArr;
        this.f42435g = iArr2;
    }

    public C9303k(Parcel parcel) {
        super("MLLT");
        this.f42431c = parcel.readInt();
        this.f42432d = parcel.readInt();
        this.f42433e = parcel.readInt();
        this.f42434f = (int[]) C4401z0.m22391j(parcel.createIntArray());
        this.f42435g = (int[]) C4401z0.m22391j(parcel.createIntArray());
    }

    @Override // p366v7.AbstractC9301i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9303k.class != obj.getClass()) {
            return false;
        }
        C9303k c9303k = (C9303k) obj;
        if (this.f42431c != c9303k.f42431c || this.f42432d != c9303k.f42432d || this.f42433e != c9303k.f42433e || !Arrays.equals(this.f42434f, c9303k.f42434f) || !Arrays.equals(this.f42435g, c9303k.f42435g)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((((527 + this.f42431c) * 31) + this.f42432d) * 31) + this.f42433e) * 31) + Arrays.hashCode(this.f42434f)) * 31) + Arrays.hashCode(this.f42435g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42431c);
        parcel.writeInt(this.f42432d);
        parcel.writeInt(this.f42433e);
        parcel.writeIntArray(this.f42434f);
        parcel.writeIntArray(this.f42435g);
    }
}
