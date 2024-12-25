package p348u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4349a;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u7/c.class
 */
/* renamed from: u7.c */
/* loaded from: combined.jar:classes2.jar:u7/c.class */
public final class C8799c implements C7839a.b {
    public static final Parcelable.Creator<C8799c> CREATOR = new a();

    /* renamed from: b */
    public final byte[] f40806b;

    /* renamed from: c */
    public final String f40807c;

    /* renamed from: d */
    public final String f40808d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:u7/c$a.class
     */
    /* renamed from: u7.c$a */
    /* loaded from: combined.jar:classes2.jar:u7/c$a.class */
    public class a implements Parcelable.Creator<C8799c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8799c createFromParcel(Parcel parcel) {
            return new C8799c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8799c[] newArray(int i10) {
            return new C8799c[i10];
        }
    }

    public C8799c(Parcel parcel) {
        this.f40806b = (byte[]) C4349a.m21882e(parcel.createByteArray());
        this.f40807c = parcel.readString();
        this.f40808d = parcel.readString();
    }

    public C8799c(byte[] bArr, String str, String str2) {
        this.f40806b = bArr;
        this.f40807c = str;
        this.f40808d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8799c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f40806b, ((C8799c) obj).f40806b);
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
        return Arrays.hashCode(this.f40806b);
    }

    @Override // p283q7.C7839a.b
    public void populateMediaMetadata(C7565c1.b bVar) {
        String str = this.f40807c;
        if (str != null) {
            bVar.m32576V(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f40807c, this.f40808d, Integer.valueOf(this.f40806b.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f40806b);
        parcel.writeString(this.f40807c);
        parcel.writeString(this.f40808d);
    }
}
