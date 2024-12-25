package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/e.class
 */
/* renamed from: v7.e */
/* loaded from: combined.jar:classes2.jar:v7/e.class */
public final class C9297e extends AbstractC9301i {
    public static final Parcelable.Creator<C9297e> CREATOR = new a();

    /* renamed from: c */
    public final String f42415c;

    /* renamed from: d */
    public final String f42416d;

    /* renamed from: e */
    public final String f42417e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/e$a.class
     */
    /* renamed from: v7.e$a */
    /* loaded from: combined.jar:classes2.jar:v7/e$a.class */
    public class a implements Parcelable.Creator<C9297e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9297e createFromParcel(Parcel parcel) {
            return new C9297e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9297e[] newArray(int i10) {
            return new C9297e[i10];
        }
    }

    public C9297e(Parcel parcel) {
        super("COMM");
        this.f42415c = (String) C4401z0.m22391j(parcel.readString());
        this.f42416d = (String) C4401z0.m22391j(parcel.readString());
        this.f42417e = (String) C4401z0.m22391j(parcel.readString());
    }

    public C9297e(String str, String str2, String str3) {
        super("COMM");
        this.f42415c = str;
        this.f42416d = str2;
        this.f42417e = str3;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9297e.class != obj.getClass()) {
            return false;
        }
        C9297e c9297e = (C9297e) obj;
        if (!C4401z0.m22371c(this.f42416d, c9297e.f42416d) || !C4401z0.m22371c(this.f42415c, c9297e.f42415c) || !C4401z0.m22371c(this.f42417e, c9297e.f42417e)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f42415c;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f42416d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f42417e;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((527 + hashCode) * 31) + hashCode2) * 31) + i10;
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": language=" + this.f42415c + ", description=" + this.f42416d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42427b);
        parcel.writeString(this.f42415c);
        parcel.writeString(this.f42417e);
    }
}
