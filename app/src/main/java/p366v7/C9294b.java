package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/b.class
 */
/* renamed from: v7.b */
/* loaded from: combined.jar:classes2.jar:v7/b.class */
public final class C9294b extends AbstractC9301i {
    public static final Parcelable.Creator<C9294b> CREATOR = new a();

    /* renamed from: c */
    public final byte[] f42403c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/b$a.class
     */
    /* renamed from: v7.b$a */
    /* loaded from: combined.jar:classes2.jar:v7/b$a.class */
    public class a implements Parcelable.Creator<C9294b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9294b createFromParcel(Parcel parcel) {
            return new C9294b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9294b[] newArray(int i10) {
            return new C9294b[i10];
        }
    }

    public C9294b(Parcel parcel) {
        super((String) C4401z0.m22391j(parcel.readString()));
        this.f42403c = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public C9294b(String str, byte[] bArr) {
        super(str);
        this.f42403c = bArr;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9294b.class != obj.getClass()) {
            return false;
        }
        C9294b c9294b = (C9294b) obj;
        if (!this.f42427b.equals(c9294b.f42427b) || !Arrays.equals(this.f42403c, c9294b.f42403c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((527 + this.f42427b.hashCode()) * 31) + Arrays.hashCode(this.f42403c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42427b);
        parcel.writeByteArray(this.f42403c);
    }
}
