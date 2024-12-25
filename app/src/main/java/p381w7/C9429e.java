package p381w7;

import android.os.Parcel;
import android.os.Parcelable;
import p168jc.C5353b;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w7/e.class
 */
/* renamed from: w7.e */
/* loaded from: combined.jar:classes2.jar:w7/e.class */
public final class C9429e implements C7839a.b {
    public static final Parcelable.Creator<C9429e> CREATOR = new a();

    /* renamed from: b */
    public final float f43193b;

    /* renamed from: c */
    public final int f43194c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w7/e$a.class
     */
    /* renamed from: w7.e$a */
    /* loaded from: combined.jar:classes2.jar:w7/e$a.class */
    public class a implements Parcelable.Creator<C9429e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9429e createFromParcel(Parcel parcel) {
            return new C9429e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9429e[] newArray(int i10) {
            return new C9429e[i10];
        }
    }

    public C9429e(float f10, int i10) {
        this.f43193b = f10;
        this.f43194c = i10;
    }

    public C9429e(Parcel parcel) {
        this.f43193b = parcel.readFloat();
        this.f43194c = parcel.readInt();
    }

    public /* synthetic */ C9429e(Parcel parcel, a aVar) {
        this(parcel);
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
        if (obj == null || C9429e.class != obj.getClass()) {
            return false;
        }
        C9429e c9429e = (C9429e) obj;
        if (this.f43193b != c9429e.f43193b || this.f43194c != c9429e.f43194c) {
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
        return ((527 + C5353b.m26634a(this.f43193b)) * 31) + this.f43194c;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f43193b + ", svcTemporalLayerCount=" + this.f43194c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f43193b);
        parcel.writeInt(this.f43194c);
    }
}
