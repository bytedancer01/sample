package p420y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.p045s3.model.InstructionFileId;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/i0.class
 */
/* renamed from: y7.i0 */
/* loaded from: combined.jar:classes2.jar:y7/i0.class */
public final class C9858i0 implements Comparable<C9858i0>, Parcelable {
    public static final Parcelable.Creator<C9858i0> CREATOR = new a();

    /* renamed from: b */
    public final int f45227b;

    /* renamed from: c */
    public final int f45228c;

    /* renamed from: d */
    public final int f45229d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/i0$a.class
     */
    /* renamed from: y7.i0$a */
    /* loaded from: combined.jar:classes2.jar:y7/i0$a.class */
    public class a implements Parcelable.Creator<C9858i0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9858i0 createFromParcel(Parcel parcel) {
            return new C9858i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9858i0[] newArray(int i10) {
            return new C9858i0[i10];
        }
    }

    public C9858i0(int i10, int i11) {
        this(0, i10, i11);
    }

    public C9858i0(int i10, int i11, int i12) {
        this.f45227b = i10;
        this.f45228c = i11;
        this.f45229d = i12;
    }

    public C9858i0(Parcel parcel) {
        this.f45227b = parcel.readInt();
        this.f45228c = parcel.readInt();
        this.f45229d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C9858i0 c9858i0) {
        int i10 = this.f45227b - c9858i0.f45227b;
        int i11 = i10;
        if (i10 == 0) {
            int i12 = this.f45228c - c9858i0.f45228c;
            i11 = i12;
            if (i12 == 0) {
                i11 = this.f45229d - c9858i0.f45229d;
            }
        }
        return i11;
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
        if (obj == null || C9858i0.class != obj.getClass()) {
            return false;
        }
        C9858i0 c9858i0 = (C9858i0) obj;
        if (this.f45227b != c9858i0.f45227b || this.f45228c != c9858i0.f45228c || this.f45229d != c9858i0.f45229d) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (((this.f45227b * 31) + this.f45228c) * 31) + this.f45229d;
    }

    public String toString() {
        return this.f45227b + InstructionFileId.DOT + this.f45228c + InstructionFileId.DOT + this.f45229d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45227b);
        parcel.writeInt(this.f45228c);
        parcel.writeInt(this.f45229d);
    }
}
