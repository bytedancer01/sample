package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/j.class
 */
/* renamed from: v7.j */
/* loaded from: combined.jar:classes2.jar:v7/j.class */
public final class C9302j extends AbstractC9301i {
    public static final Parcelable.Creator<C9302j> CREATOR = new a();

    /* renamed from: c */
    public final String f42428c;

    /* renamed from: d */
    public final String f42429d;

    /* renamed from: e */
    public final String f42430e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/j$a.class
     */
    /* renamed from: v7.j$a */
    /* loaded from: combined.jar:classes2.jar:v7/j$a.class */
    public class a implements Parcelable.Creator<C9302j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9302j createFromParcel(Parcel parcel) {
            return new C9302j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9302j[] newArray(int i10) {
            return new C9302j[i10];
        }
    }

    public C9302j(Parcel parcel) {
        super("----");
        this.f42428c = (String) C4401z0.m22391j(parcel.readString());
        this.f42429d = (String) C4401z0.m22391j(parcel.readString());
        this.f42430e = (String) C4401z0.m22391j(parcel.readString());
    }

    public C9302j(String str, String str2, String str3) {
        super("----");
        this.f42428c = str;
        this.f42429d = str2;
        this.f42430e = str3;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9302j.class != obj.getClass()) {
            return false;
        }
        C9302j c9302j = (C9302j) obj;
        if (!C4401z0.m22371c(this.f42429d, c9302j.f42429d) || !C4401z0.m22371c(this.f42428c, c9302j.f42428c) || !C4401z0.m22371c(this.f42430e, c9302j.f42430e)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f42428c;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f42429d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f42430e;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((527 + hashCode) * 31) + hashCode2) * 31) + i10;
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": domain=" + this.f42428c + ", description=" + this.f42429d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42427b);
        parcel.writeString(this.f42428c);
        parcel.writeString(this.f42430e);
    }
}
