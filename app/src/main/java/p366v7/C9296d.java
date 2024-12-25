package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/d.class
 */
/* renamed from: v7.d */
/* loaded from: combined.jar:classes2.jar:v7/d.class */
public final class C9296d extends AbstractC9301i {
    public static final Parcelable.Creator<C9296d> CREATOR = new a();

    /* renamed from: c */
    public final String f42410c;

    /* renamed from: d */
    public final boolean f42411d;

    /* renamed from: e */
    public final boolean f42412e;

    /* renamed from: f */
    public final String[] f42413f;

    /* renamed from: g */
    public final AbstractC9301i[] f42414g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/d$a.class
     */
    /* renamed from: v7.d$a */
    /* loaded from: combined.jar:classes2.jar:v7/d$a.class */
    public class a implements Parcelable.Creator<C9296d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9296d createFromParcel(Parcel parcel) {
            return new C9296d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9296d[] newArray(int i10) {
            return new C9296d[i10];
        }
    }

    public C9296d(Parcel parcel) {
        super("CTOC");
        this.f42410c = (String) C4401z0.m22391j(parcel.readString());
        this.f42411d = parcel.readByte() != 0;
        this.f42412e = parcel.readByte() != 0;
        this.f42413f = (String[]) C4401z0.m22391j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f42414g = new AbstractC9301i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f42414g[i10] = (AbstractC9301i) parcel.readParcelable(AbstractC9301i.class.getClassLoader());
        }
    }

    public C9296d(String str, boolean z10, boolean z11, String[] strArr, AbstractC9301i[] abstractC9301iArr) {
        super("CTOC");
        this.f42410c = str;
        this.f42411d = z10;
        this.f42412e = z11;
        this.f42413f = strArr;
        this.f42414g = abstractC9301iArr;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9296d.class != obj.getClass()) {
            return false;
        }
        C9296d c9296d = (C9296d) obj;
        if (this.f42411d != c9296d.f42411d || this.f42412e != c9296d.f42412e || !C4401z0.m22371c(this.f42410c, c9296d.f42410c) || !Arrays.equals(this.f42413f, c9296d.f42413f) || !Arrays.equals(this.f42414g, c9296d.f42414g)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        boolean z10 = this.f42411d;
        boolean z11 = this.f42412e;
        String str = this.f42410c;
        return ((((527 + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42410c);
        parcel.writeByte(this.f42411d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42412e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f42413f);
        parcel.writeInt(this.f42414g.length);
        for (AbstractC9301i abstractC9301i : this.f42414g) {
            parcel.writeParcelable(abstractC9301i, 0);
        }
    }
}
