package p321s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4401z0;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s7/a.class
 */
/* renamed from: s7.a */
/* loaded from: combined.jar:classes2.jar:s7/a.class */
public final class C8542a implements C7839a.b {

    /* renamed from: b */
    public final String f39948b;

    /* renamed from: c */
    public final String f39949c;

    /* renamed from: d */
    public final long f39950d;

    /* renamed from: e */
    public final long f39951e;

    /* renamed from: f */
    public final byte[] f39952f;

    /* renamed from: g */
    public int f39953g;

    /* renamed from: h */
    public static final C7629w0 f39946h = new C7629w0.b().m33220e0("application/id3").m33194E();

    /* renamed from: i */
    public static final C7629w0 f39947i = new C7629w0.b().m33220e0("application/x-scte35").m33194E();
    public static final Parcelable.Creator<C8542a> CREATOR = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:s7/a$a.class
     */
    /* renamed from: s7.a$a */
    /* loaded from: combined.jar:classes2.jar:s7/a$a.class */
    public class a implements Parcelable.Creator<C8542a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8542a createFromParcel(Parcel parcel) {
            return new C8542a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8542a[] newArray(int i10) {
            return new C8542a[i10];
        }
    }

    public C8542a(Parcel parcel) {
        this.f39948b = (String) C4401z0.m22391j(parcel.readString());
        this.f39949c = (String) C4401z0.m22391j(parcel.readString());
        this.f39950d = parcel.readLong();
        this.f39951e = parcel.readLong();
        this.f39952f = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public C8542a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f39948b = str;
        this.f39949c = str2;
        this.f39950d = j10;
        this.f39951e = j11;
        this.f39952f = bArr;
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
        if (obj == null || C8542a.class != obj.getClass()) {
            return false;
        }
        C8542a c8542a = (C8542a) obj;
        if (this.f39950d != c8542a.f39950d || this.f39951e != c8542a.f39951e || !C4401z0.m22371c(this.f39948b, c8542a.f39948b) || !C4401z0.m22371c(this.f39949c, c8542a.f39949c) || !Arrays.equals(this.f39952f, c8542a.f39952f)) {
            z10 = false;
        }
        return z10;
    }

    @Override // p283q7.C7839a.b
    public byte[] getWrappedMetadataBytes() {
        return getWrappedMetadataFormat() != null ? this.f39952f : null;
    }

    @Override // p283q7.C7839a.b
    public C7629w0 getWrappedMetadataFormat() {
        String str = this.f39948b;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f39947i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f39946h;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f39953g == 0) {
            String str = this.f39948b;
            int i10 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.f39949c;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f39950d;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            long j11 = this.f39951e;
            this.f39953g = ((((((((527 + hashCode) * 31) + i10) * 31) + i11) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f39952f);
        }
        return this.f39953g;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f39948b + ", id=" + this.f39951e + ", durationMs=" + this.f39950d + ", value=" + this.f39949c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f39948b);
        parcel.writeString(this.f39949c);
        parcel.writeLong(this.f39950d);
        parcel.writeLong(this.f39951e);
        parcel.writeByteArray(this.f39952f);
    }
}
