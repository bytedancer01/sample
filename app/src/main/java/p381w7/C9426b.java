package p381w7;

import android.os.Parcel;
import android.os.Parcelable;
import p168jc.C5355d;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w7/b.class
 */
/* renamed from: w7.b */
/* loaded from: combined.jar:classes2.jar:w7/b.class */
public final class C9426b implements C7839a.b {
    public static final Parcelable.Creator<C9426b> CREATOR = new a();

    /* renamed from: b */
    public final long f43183b;

    /* renamed from: c */
    public final long f43184c;

    /* renamed from: d */
    public final long f43185d;

    /* renamed from: e */
    public final long f43186e;

    /* renamed from: f */
    public final long f43187f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w7/b$a.class
     */
    /* renamed from: w7.b$a */
    /* loaded from: combined.jar:classes2.jar:w7/b$a.class */
    public class a implements Parcelable.Creator<C9426b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9426b createFromParcel(Parcel parcel) {
            return new C9426b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9426b[] newArray(int i10) {
            return new C9426b[i10];
        }
    }

    public C9426b(long j10, long j11, long j12, long j13, long j14) {
        this.f43183b = j10;
        this.f43184c = j11;
        this.f43185d = j12;
        this.f43186e = j13;
        this.f43187f = j14;
    }

    public C9426b(Parcel parcel) {
        this.f43183b = parcel.readLong();
        this.f43184c = parcel.readLong();
        this.f43185d = parcel.readLong();
        this.f43186e = parcel.readLong();
        this.f43187f = parcel.readLong();
    }

    public /* synthetic */ C9426b(Parcel parcel, a aVar) {
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
        if (obj == null || C9426b.class != obj.getClass()) {
            return false;
        }
        C9426b c9426b = (C9426b) obj;
        if (this.f43183b != c9426b.f43183b || this.f43184c != c9426b.f43184c || this.f43185d != c9426b.f43185d || this.f43186e != c9426b.f43186e || this.f43187f != c9426b.f43187f) {
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
        return ((((((((527 + C5355d.m26649b(this.f43183b)) * 31) + C5355d.m26649b(this.f43184c)) * 31) + C5355d.m26649b(this.f43185d)) * 31) + C5355d.m26649b(this.f43186e)) * 31) + C5355d.m26649b(this.f43187f);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f43183b + ", photoSize=" + this.f43184c + ", photoPresentationTimestampUs=" + this.f43185d + ", videoStartPosition=" + this.f43186e + ", videoSize=" + this.f43187f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f43183b);
        parcel.writeLong(this.f43184c);
        parcel.writeLong(this.f43185d);
        parcel.writeLong(this.f43186e);
        parcel.writeLong(this.f43187f);
    }
}
