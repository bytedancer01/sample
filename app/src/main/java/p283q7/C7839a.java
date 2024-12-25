package p283q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p059d9.C4401z0;
import p267p6.C7565c1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q7/a.class
 */
/* renamed from: q7.a */
/* loaded from: combined.jar:classes2.jar:q7/a.class */
public final class C7839a implements Parcelable {
    public static final Parcelable.Creator<C7839a> CREATOR = new a();

    /* renamed from: b */
    public final b[] f37804b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q7/a$a.class
     */
    /* renamed from: q7.a$a */
    /* loaded from: combined.jar:classes2.jar:q7/a$a.class */
    public class a implements Parcelable.Creator<C7839a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7839a createFromParcel(Parcel parcel) {
            return new C7839a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7839a[] newArray(int i10) {
            return new C7839a[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:q7/a$b.class
     */
    /* renamed from: q7.a$b */
    /* loaded from: combined.jar:classes2.jar:q7/a$b.class */
    public interface b extends Parcelable {
        byte[] getWrappedMetadataBytes();

        C7629w0 getWrappedMetadataFormat();

        void populateMediaMetadata(C7565c1.b bVar);
    }

    public C7839a(Parcel parcel) {
        this.f37804b = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f37804b;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
            i10++;
        }
    }

    public C7839a(List<? extends b> list) {
        this.f37804b = (b[]) list.toArray(new b[0]);
    }

    public C7839a(b... bVarArr) {
        this.f37804b = bVarArr;
    }

    /* renamed from: b */
    public C7839a m34084b(b... bVarArr) {
        return bVarArr.length == 0 ? this : new C7839a((b[]) C4401z0.m22326G0(this.f37804b, bVarArr));
    }

    /* renamed from: c */
    public C7839a m34085c(C7839a c7839a) {
        return c7839a == null ? this : m34084b(c7839a.f37804b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7839a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f37804b, ((C7839a) obj).f37804b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f37804b);
    }

    /* renamed from: j */
    public b m34086j(int i10) {
        return this.f37804b[i10];
    }

    /* renamed from: k */
    public int m34087k() {
        return this.f37804b.length;
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f37804b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f37804b.length);
        for (b bVar : this.f37804b) {
            parcel.writeParcelable(bVar, 0);
        }
    }
}
