package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;
import p267p6.C7565c1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/a.class
 */
/* renamed from: v7.a */
/* loaded from: combined.jar:classes2.jar:v7/a.class */
public final class C9293a extends AbstractC9301i {
    public static final Parcelable.Creator<C9293a> CREATOR = new a();

    /* renamed from: c */
    public final String f42399c;

    /* renamed from: d */
    public final String f42400d;

    /* renamed from: e */
    public final int f42401e;

    /* renamed from: f */
    public final byte[] f42402f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/a$a.class
     */
    /* renamed from: v7.a$a */
    /* loaded from: combined.jar:classes2.jar:v7/a$a.class */
    public class a implements Parcelable.Creator<C9293a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9293a createFromParcel(Parcel parcel) {
            return new C9293a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9293a[] newArray(int i10) {
            return new C9293a[i10];
        }
    }

    public C9293a(Parcel parcel) {
        super("APIC");
        this.f42399c = (String) C4401z0.m22391j(parcel.readString());
        this.f42400d = parcel.readString();
        this.f42401e = parcel.readInt();
        this.f42402f = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public C9293a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f42399c = str;
        this.f42400d = str2;
        this.f42401e = i10;
        this.f42402f = bArr;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9293a.class != obj.getClass()) {
            return false;
        }
        C9293a c9293a = (C9293a) obj;
        if (this.f42401e != c9293a.f42401e || !C4401z0.m22371c(this.f42399c, c9293a.f42399c) || !C4401z0.m22371c(this.f42400d, c9293a.f42400d) || !Arrays.equals(this.f42402f, c9293a.f42402f)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int i10 = this.f42401e;
        String str = this.f42399c;
        int i11 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f42400d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((((((527 + i10) * 31) + hashCode) * 31) + i11) * 31) + Arrays.hashCode(this.f42402f);
    }

    @Override // p366v7.AbstractC9301i, p283q7.C7839a.b
    public void populateMediaMetadata(C7565c1.b bVar) {
        bVar.m32561G(this.f42402f, this.f42401e);
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": mimeType=" + this.f42399c + ", description=" + this.f42400d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42399c);
        parcel.writeString(this.f42400d);
        parcel.writeInt(this.f42401e);
        parcel.writeByteArray(this.f42402f);
    }
}
