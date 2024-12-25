package p302r7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4349a;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r7/a.class
 */
/* renamed from: r7.a */
/* loaded from: combined.jar:classes2.jar:r7/a.class */
public final class C8009a implements C7839a.b {
    public static final Parcelable.Creator<C8009a> CREATOR = new a();

    /* renamed from: b */
    public final int f38778b;

    /* renamed from: c */
    public final String f38779c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r7/a$a.class
     */
    /* renamed from: r7.a$a */
    /* loaded from: combined.jar:classes2.jar:r7/a$a.class */
    public class a implements Parcelable.Creator<C8009a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8009a createFromParcel(Parcel parcel) {
            return new C8009a(parcel.readInt(), (String) C4349a.m21882e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8009a[] newArray(int i10) {
            return new C8009a[i10];
        }
    }

    public C8009a(int i10, String str) {
        this.f38778b = i10;
        this.f38779c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C7840b.m34090a(this);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ C7629w0 getWrappedMetadataFormat() {
        return C7840b.m34091b(this);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f38778b + ",url=" + this.f38779c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f38779c);
        parcel.writeInt(this.f38778b);
    }
}
