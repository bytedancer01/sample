package p009a8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/a1.class
 */
/* renamed from: a8.a1 */
/* loaded from: combined.jar:classes2.jar:a8/a1.class */
public final class C0083a1 implements Parcelable {

    /* renamed from: b */
    public final int f261b;

    /* renamed from: c */
    public final C0134z0[] f262c;

    /* renamed from: d */
    public int f263d;

    /* renamed from: e */
    public static final C0083a1 f260e = new C0083a1(new C0134z0[0]);
    public static final Parcelable.Creator<C0083a1> CREATOR = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/a1$a.class
     */
    /* renamed from: a8.a1$a */
    /* loaded from: combined.jar:classes2.jar:a8/a1$a.class */
    public class a implements Parcelable.Creator<C0083a1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0083a1 createFromParcel(Parcel parcel) {
            return new C0083a1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0083a1[] newArray(int i10) {
            return new C0083a1[i10];
        }
    }

    public C0083a1(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f261b = readInt;
        this.f262c = new C0134z0[readInt];
        for (int i10 = 0; i10 < this.f261b; i10++) {
            this.f262c[i10] = (C0134z0) parcel.readParcelable(C0134z0.class.getClassLoader());
        }
    }

    public C0083a1(C0134z0... c0134z0Arr) {
        this.f262c = c0134z0Arr;
        this.f261b = c0134z0Arr.length;
    }

    /* renamed from: b */
    public C0134z0 m323b(int i10) {
        return this.f262c[i10];
    }

    /* renamed from: c */
    public int m324c(C0134z0 c0134z0) {
        for (int i10 = 0; i10 < this.f261b; i10++) {
            if (this.f262c[i10] == c0134z0) {
                return i10;
            }
        }
        return -1;
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
        if (obj == null || C0083a1.class != obj.getClass()) {
            return false;
        }
        C0083a1 c0083a1 = (C0083a1) obj;
        if (this.f261b != c0083a1.f261b || !Arrays.equals(this.f262c, c0083a1.f262c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        if (this.f263d == 0) {
            this.f263d = Arrays.hashCode(this.f262c);
        }
        return this.f263d;
    }

    /* renamed from: j */
    public boolean m325j() {
        return this.f261b == 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f261b);
        for (int i11 = 0; i11 < this.f261b; i11++) {
            parcel.writeParcelable(this.f262c[i11], 0);
        }
    }
}
