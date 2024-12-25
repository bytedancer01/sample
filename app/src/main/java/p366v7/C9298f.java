package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/f.class
 */
/* renamed from: v7.f */
/* loaded from: combined.jar:classes2.jar:v7/f.class */
public final class C9298f extends AbstractC9301i {
    public static final Parcelable.Creator<C9298f> CREATOR = new a();

    /* renamed from: c */
    public final String f42418c;

    /* renamed from: d */
    public final String f42419d;

    /* renamed from: e */
    public final String f42420e;

    /* renamed from: f */
    public final byte[] f42421f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/f$a.class
     */
    /* renamed from: v7.f$a */
    /* loaded from: combined.jar:classes2.jar:v7/f$a.class */
    public class a implements Parcelable.Creator<C9298f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9298f createFromParcel(Parcel parcel) {
            return new C9298f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9298f[] newArray(int i10) {
            return new C9298f[i10];
        }
    }

    public C9298f(Parcel parcel) {
        super("GEOB");
        this.f42418c = (String) C4401z0.m22391j(parcel.readString());
        this.f42419d = (String) C4401z0.m22391j(parcel.readString());
        this.f42420e = (String) C4401z0.m22391j(parcel.readString());
        this.f42421f = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public C9298f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f42418c = str;
        this.f42419d = str2;
        this.f42420e = str3;
        this.f42421f = bArr;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9298f.class != obj.getClass()) {
            return false;
        }
        C9298f c9298f = (C9298f) obj;
        if (!C4401z0.m22371c(this.f42418c, c9298f.f42418c) || !C4401z0.m22371c(this.f42419d, c9298f.f42419d) || !C4401z0.m22371c(this.f42420e, c9298f.f42420e) || !Arrays.equals(this.f42421f, c9298f.f42421f)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f42418c;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f42419d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f42420e;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((((527 + hashCode) * 31) + hashCode2) * 31) + i10) * 31) + Arrays.hashCode(this.f42421f);
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": mimeType=" + this.f42418c + ", filename=" + this.f42419d + ", description=" + this.f42420e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42418c);
        parcel.writeString(this.f42419d);
        parcel.writeString(this.f42420e);
        parcel.writeByteArray(this.f42421f);
    }
}
