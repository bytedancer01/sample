package p400x7;

import android.os.Parcel;
import android.os.Parcelable;
import p059d9.C4361f0;
import p059d9.C4389t0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/g.class
 */
/* renamed from: x7.g */
/* loaded from: combined.jar:classes2.jar:x7/g.class */
public final class C9679g extends AbstractC9674b {
    public static final Parcelable.Creator<C9679g> CREATOR = new a();

    /* renamed from: b */
    public final long f44173b;

    /* renamed from: c */
    public final long f44174c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/g$a.class
     */
    /* renamed from: x7.g$a */
    /* loaded from: combined.jar:classes2.jar:x7/g$a.class */
    public class a implements Parcelable.Creator<C9679g> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9679g createFromParcel(Parcel parcel) {
            return new C9679g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9679g[] newArray(int i10) {
            return new C9679g[i10];
        }
    }

    public C9679g(long j10, long j11) {
        this.f44173b = j10;
        this.f44174c = j11;
    }

    public /* synthetic */ C9679g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* renamed from: b */
    public static C9679g m40707b(C4361f0 c4361f0, long j10, C4389t0 c4389t0) {
        long m40708c = m40708c(c4361f0, j10);
        return new C9679g(m40708c, c4389t0.m22241b(m40708c));
    }

    /* renamed from: c */
    public static long m40708c(C4361f0 c4361f0, long j10) {
        long m21971D = c4361f0.m21971D();
        return (128 & m21971D) != 0 ? 8589934591L & ((((m21971D & 1) << 32) | c4361f0.m21973F()) + j10) : -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f44173b);
        parcel.writeLong(this.f44174c);
    }
}
