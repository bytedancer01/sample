package p078e9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/b.class
 */
/* renamed from: e9.b */
/* loaded from: combined.jar:classes2.jar:e9/b.class */
public final class C4665b implements Parcelable {
    public static final Parcelable.Creator<C4665b> CREATOR = new a();

    /* renamed from: b */
    public final int f27508b;

    /* renamed from: c */
    public final int f27509c;

    /* renamed from: d */
    public final int f27510d;

    /* renamed from: e */
    public final byte[] f27511e;

    /* renamed from: f */
    public int f27512f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/b$a.class
     */
    /* renamed from: e9.b$a */
    /* loaded from: combined.jar:classes2.jar:e9/b$a.class */
    public class a implements Parcelable.Creator<C4665b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4665b createFromParcel(Parcel parcel) {
            return new C4665b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4665b[] newArray(int i10) {
            return new C4665b[i10];
        }
    }

    public C4665b(int i10, int i11, int i12, byte[] bArr) {
        this.f27508b = i10;
        this.f27509c = i11;
        this.f27510d = i12;
        this.f27511e = bArr;
    }

    public C4665b(Parcel parcel) {
        this.f27508b = parcel.readInt();
        this.f27509c = parcel.readInt();
        this.f27510d = parcel.readInt();
        this.f27511e = C4401z0.m22338M0(parcel) ? parcel.createByteArray() : null;
    }

    @Pure
    /* renamed from: b */
    public static int m23399b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* renamed from: c */
    public static int m23400c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4665b.class != obj.getClass()) {
            return false;
        }
        C4665b c4665b = (C4665b) obj;
        if (this.f27508b != c4665b.f27508b || this.f27509c != c4665b.f27509c || this.f27510d != c4665b.f27510d || !Arrays.equals(this.f27511e, c4665b.f27511e)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        if (this.f27512f == 0) {
            this.f27512f = ((((((527 + this.f27508b) * 31) + this.f27509c) * 31) + this.f27510d) * 31) + Arrays.hashCode(this.f27511e);
        }
        return this.f27512f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f27508b);
        sb2.append(", ");
        sb2.append(this.f27509c);
        sb2.append(", ");
        sb2.append(this.f27510d);
        sb2.append(", ");
        sb2.append(this.f27511e != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27508b);
        parcel.writeInt(this.f27509c);
        parcel.writeInt(this.f27510d);
        C4401z0.m22388h1(parcel, this.f27511e != null);
        byte[] bArr = this.f27511e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
