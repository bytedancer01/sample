package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/n.class
 */
/* renamed from: v7.n */
/* loaded from: combined.jar:classes2.jar:v7/n.class */
public final class C9306n extends AbstractC9301i {
    public static final Parcelable.Creator<C9306n> CREATOR = new a();

    /* renamed from: c */
    public final String f42440c;

    /* renamed from: d */
    public final String f42441d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/n$a.class
     */
    /* renamed from: v7.n$a */
    /* loaded from: combined.jar:classes2.jar:v7/n$a.class */
    public class a implements Parcelable.Creator<C9306n> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9306n createFromParcel(Parcel parcel) {
            return new C9306n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9306n[] newArray(int i10) {
            return new C9306n[i10];
        }
    }

    public C9306n(Parcel parcel) {
        super((String) C4401z0.m22391j(parcel.readString()));
        this.f42440c = parcel.readString();
        this.f42441d = (String) C4401z0.m22391j(parcel.readString());
    }

    public C9306n(String str, String str2, String str3) {
        super(str);
        this.f42440c = str2;
        this.f42441d = str3;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9306n.class != obj.getClass()) {
            return false;
        }
        C9306n c9306n = (C9306n) obj;
        if (!this.f42427b.equals(c9306n.f42427b) || !C4401z0.m22371c(this.f42440c, c9306n.f42440c) || !C4401z0.m22371c(this.f42441d, c9306n.f42441d)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f42427b.hashCode();
        String str = this.f42440c;
        int i10 = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f42441d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((527 + hashCode) * 31) + hashCode2) * 31) + i10;
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": url=" + this.f42441d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42427b);
        parcel.writeString(this.f42440c);
        parcel.writeString(this.f42441d);
    }
}
