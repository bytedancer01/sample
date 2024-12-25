package p348u7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u7/b.class
 */
/* renamed from: u7.b */
/* loaded from: combined.jar:classes2.jar:u7/b.class */
public final class C8798b implements C7839a.b {
    public static final Parcelable.Creator<C8798b> CREATOR = new a();

    /* renamed from: b */
    public final int f40800b;

    /* renamed from: c */
    public final String f40801c;

    /* renamed from: d */
    public final String f40802d;

    /* renamed from: e */
    public final String f40803e;

    /* renamed from: f */
    public final boolean f40804f;

    /* renamed from: g */
    public final int f40805g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:u7/b$a.class
     */
    /* renamed from: u7.b$a */
    /* loaded from: combined.jar:classes2.jar:u7/b$a.class */
    public class a implements Parcelable.Creator<C8798b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8798b createFromParcel(Parcel parcel) {
            return new C8798b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8798b[] newArray(int i10) {
            return new C8798b[i10];
        }
    }

    public C8798b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        C4349a.m21878a(i11 == -1 || i11 > 0);
        this.f40800b = i10;
        this.f40801c = str;
        this.f40802d = str2;
        this.f40803e = str3;
        this.f40804f = z10;
        this.f40805g = i11;
    }

    public C8798b(Parcel parcel) {
        this.f40800b = parcel.readInt();
        this.f40801c = parcel.readString();
        this.f40802d = parcel.readString();
        this.f40803e = parcel.readString();
        this.f40804f = C4401z0.m22338M0(parcel);
        this.f40805g = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p348u7.C8798b m37648b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p348u7.C8798b.m37648b(java.util.Map):u7.b");
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
        if (obj == null || C8798b.class != obj.getClass()) {
            return false;
        }
        C8798b c8798b = (C8798b) obj;
        if (this.f40800b != c8798b.f40800b || !C4401z0.m22371c(this.f40801c, c8798b.f40801c) || !C4401z0.m22371c(this.f40802d, c8798b.f40802d) || !C4401z0.m22371c(this.f40803e, c8798b.f40803e) || this.f40804f != c8798b.f40804f || this.f40805g != c8798b.f40805g) {
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
        int i10 = this.f40800b;
        String str = this.f40801c;
        int i11 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f40802d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f40803e;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((((((((527 + i10) * 31) + hashCode) * 31) + hashCode2) * 31) + i11) * 31) + (this.f40804f ? 1 : 0)) * 31) + this.f40805g;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f40802d + "\", genre=\"" + this.f40801c + "\", bitrate=" + this.f40800b + ", metadataInterval=" + this.f40805g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f40800b);
        parcel.writeString(this.f40801c);
        parcel.writeString(this.f40802d);
        parcel.writeString(this.f40803e);
        C4401z0.m22388h1(parcel, this.f40804f);
        parcel.writeInt(this.f40805g);
    }
}
