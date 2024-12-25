package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/l.class
 */
/* renamed from: v7.l */
/* loaded from: combined.jar:classes2.jar:v7/l.class */
public final class C9304l extends AbstractC9301i {
    public static final Parcelable.Creator<C9304l> CREATOR = new a();

    /* renamed from: c */
    public final String f42436c;

    /* renamed from: d */
    public final byte[] f42437d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/l$a.class
     */
    /* renamed from: v7.l$a */
    /* loaded from: combined.jar:classes2.jar:v7/l$a.class */
    public class a implements Parcelable.Creator<C9304l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9304l createFromParcel(Parcel parcel) {
            return new C9304l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9304l[] newArray(int i10) {
            return new C9304l[i10];
        }
    }

    public C9304l(Parcel parcel) {
        super("PRIV");
        this.f42436c = (String) C4401z0.m22391j(parcel.readString());
        this.f42437d = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public C9304l(String str, byte[] bArr) {
        super("PRIV");
        this.f42436c = str;
        this.f42437d = bArr;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9304l.class != obj.getClass()) {
            return false;
        }
        C9304l c9304l = (C9304l) obj;
        if (!C4401z0.m22371c(this.f42436c, c9304l.f42436c) || !Arrays.equals(this.f42437d, c9304l.f42437d)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f42436c;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f42437d);
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": owner=" + this.f42436c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42436c);
        parcel.writeByteArray(this.f42437d);
    }
}
