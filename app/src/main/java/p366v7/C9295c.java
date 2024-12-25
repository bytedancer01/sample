package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/c.class
 */
/* renamed from: v7.c */
/* loaded from: combined.jar:classes2.jar:v7/c.class */
public final class C9295c extends AbstractC9301i {
    public static final Parcelable.Creator<C9295c> CREATOR = new a();

    /* renamed from: c */
    public final String f42404c;

    /* renamed from: d */
    public final int f42405d;

    /* renamed from: e */
    public final int f42406e;

    /* renamed from: f */
    public final long f42407f;

    /* renamed from: g */
    public final long f42408g;

    /* renamed from: h */
    public final AbstractC9301i[] f42409h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/c$a.class
     */
    /* renamed from: v7.c$a */
    /* loaded from: combined.jar:classes2.jar:v7/c$a.class */
    public class a implements Parcelable.Creator<C9295c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9295c createFromParcel(Parcel parcel) {
            return new C9295c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9295c[] newArray(int i10) {
            return new C9295c[i10];
        }
    }

    public C9295c(Parcel parcel) {
        super("CHAP");
        this.f42404c = (String) C4401z0.m22391j(parcel.readString());
        this.f42405d = parcel.readInt();
        this.f42406e = parcel.readInt();
        this.f42407f = parcel.readLong();
        this.f42408g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f42409h = new AbstractC9301i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f42409h[i10] = (AbstractC9301i) parcel.readParcelable(AbstractC9301i.class.getClassLoader());
        }
    }

    public C9295c(String str, int i10, int i11, long j10, long j11, AbstractC9301i[] abstractC9301iArr) {
        super("CHAP");
        this.f42404c = str;
        this.f42405d = i10;
        this.f42406e = i11;
        this.f42407f = j10;
        this.f42408g = j11;
        this.f42409h = abstractC9301iArr;
    }

    @Override // p366v7.AbstractC9301i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9295c.class != obj.getClass()) {
            return false;
        }
        C9295c c9295c = (C9295c) obj;
        if (this.f42405d != c9295c.f42405d || this.f42406e != c9295c.f42406e || this.f42407f != c9295c.f42407f || this.f42408g != c9295c.f42408g || !C4401z0.m22371c(this.f42404c, c9295c.f42404c) || !Arrays.equals(this.f42409h, c9295c.f42409h)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int i10 = this.f42405d;
        int i11 = this.f42406e;
        int i12 = (int) this.f42407f;
        int i13 = (int) this.f42408g;
        String str = this.f42404c;
        return ((((((((527 + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42404c);
        parcel.writeInt(this.f42405d);
        parcel.writeInt(this.f42406e);
        parcel.writeLong(this.f42407f);
        parcel.writeLong(this.f42408g);
        parcel.writeInt(this.f42409h.length);
        for (AbstractC9301i abstractC9301i : this.f42409h) {
            parcel.writeParcelable(abstractC9301i, 0);
        }
    }
}
