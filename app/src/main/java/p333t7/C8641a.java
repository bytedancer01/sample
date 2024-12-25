package p333t7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4401z0;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t7/a.class
 */
/* renamed from: t7.a */
/* loaded from: combined.jar:classes2.jar:t7/a.class */
public final class C8641a implements C7839a.b {
    public static final Parcelable.Creator<C8641a> CREATOR = new a();

    /* renamed from: b */
    public final String f40354b;

    /* renamed from: c */
    public final String f40355c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t7/a$a.class
     */
    /* renamed from: t7.a$a */
    /* loaded from: combined.jar:classes2.jar:t7/a$a.class */
    public class a implements Parcelable.Creator<C8641a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8641a createFromParcel(Parcel parcel) {
            return new C8641a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8641a[] newArray(int i10) {
            return new C8641a[i10];
        }
    }

    public C8641a(Parcel parcel) {
        this.f40354b = (String) C4401z0.m22391j(parcel.readString());
        this.f40355c = (String) C4401z0.m22391j(parcel.readString());
    }

    public C8641a(String str, String str2) {
        this.f40354b = str;
        this.f40355c = str2;
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
        if (obj == null || C8641a.class != obj.getClass()) {
            return false;
        }
        C8641a c8641a = (C8641a) obj;
        if (!this.f40354b.equals(c8641a.f40354b) || !this.f40355c.equals(c8641a.f40355c)) {
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
        return ((527 + this.f40354b.hashCode()) * 31) + this.f40355c.hashCode();
    }

    @Override // p283q7.C7839a.b
    public void populateMediaMetadata(C7565c1.b bVar) {
        String str = this.f40354b;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.m32565K(this.f40355c);
                break;
            case "TITLE":
                bVar.m32576V(this.f40355c);
                break;
            case "DESCRIPTION":
                bVar.m32569O(this.f40355c);
                break;
            case "ALBUMARTIST":
                bVar.m32564J(this.f40355c);
                break;
            case "ARTIST":
                bVar.m32566L(this.f40355c);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f40354b + "=" + this.f40355c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40354b);
        parcel.writeString(this.f40355c);
    }
}
