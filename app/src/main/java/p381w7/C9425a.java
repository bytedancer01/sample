package p381w7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w7/a.class
 */
/* renamed from: w7.a */
/* loaded from: combined.jar:classes2.jar:w7/a.class */
public final class C9425a implements C7839a.b {
    public static final Parcelable.Creator<C9425a> CREATOR = new a();

    /* renamed from: b */
    public final String f43179b;

    /* renamed from: c */
    public final byte[] f43180c;

    /* renamed from: d */
    public final int f43181d;

    /* renamed from: e */
    public final int f43182e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w7/a$a.class
     */
    /* renamed from: w7.a$a */
    /* loaded from: combined.jar:classes2.jar:w7/a$a.class */
    public class a implements Parcelable.Creator<C9425a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9425a createFromParcel(Parcel parcel) {
            return new C9425a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9425a[] newArray(int i10) {
            return new C9425a[i10];
        }
    }

    public C9425a(Parcel parcel) {
        this.f43179b = (String) C4401z0.m22391j(parcel.readString());
        this.f43180c = (byte[]) C4401z0.m22391j(parcel.createByteArray());
        this.f43181d = parcel.readInt();
        this.f43182e = parcel.readInt();
    }

    public /* synthetic */ C9425a(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C9425a(String str, byte[] bArr, int i10, int i11) {
        this.f43179b = str;
        this.f43180c = bArr;
        this.f43181d = i10;
        this.f43182e = i11;
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
        if (obj == null || C9425a.class != obj.getClass()) {
            return false;
        }
        C9425a c9425a = (C9425a) obj;
        if (!this.f43179b.equals(c9425a.f43179b) || !Arrays.equals(this.f43180c, c9425a.f43180c) || this.f43181d != c9425a.f43181d || this.f43182e != c9425a.f43182e) {
            z10 = false;
        }
        return z10;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C7840b.m34090a(this);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ C7629w0 getWrappedMetadataFormat() {
        return C7840b.m34091b(this);
    }

    public int hashCode() {
        return ((((((527 + this.f43179b.hashCode()) * 31) + Arrays.hashCode(this.f43180c)) * 31) + this.f43181d) * 31) + this.f43182e;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "mdta: key=" + this.f43179b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f43179b);
        parcel.writeByteArray(this.f43180c);
        parcel.writeInt(this.f43181d);
        parcel.writeInt(this.f43182e);
    }
}
