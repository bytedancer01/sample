package p400x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p059d9.C4361f0;
import p059d9.C4389t0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/d.class
 */
/* renamed from: x7.d */
/* loaded from: combined.jar:classes2.jar:x7/d.class */
public final class C9676d extends AbstractC9674b {
    public static final Parcelable.Creator<C9676d> CREATOR = new a();

    /* renamed from: b */
    public final long f44143b;

    /* renamed from: c */
    public final boolean f44144c;

    /* renamed from: d */
    public final boolean f44145d;

    /* renamed from: e */
    public final boolean f44146e;

    /* renamed from: f */
    public final boolean f44147f;

    /* renamed from: g */
    public final long f44148g;

    /* renamed from: h */
    public final long f44149h;

    /* renamed from: i */
    public final List<b> f44150i;

    /* renamed from: j */
    public final boolean f44151j;

    /* renamed from: k */
    public final long f44152k;

    /* renamed from: l */
    public final int f44153l;

    /* renamed from: m */
    public final int f44154m;

    /* renamed from: n */
    public final int f44155n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/d$a.class
     */
    /* renamed from: x7.d$a */
    /* loaded from: combined.jar:classes2.jar:x7/d$a.class */
    public class a implements Parcelable.Creator<C9676d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9676d createFromParcel(Parcel parcel) {
            return new C9676d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9676d[] newArray(int i10) {
            return new C9676d[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/d$b.class
     */
    /* renamed from: x7.d$b */
    /* loaded from: combined.jar:classes2.jar:x7/d$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f44156a;

        /* renamed from: b */
        public final long f44157b;

        /* renamed from: c */
        public final long f44158c;

        public b(int i10, long j10, long j11) {
            this.f44156a = i10;
            this.f44157b = j10;
            this.f44158c = j11;
        }

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        /* renamed from: a */
        public static b m40690a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m40691b(Parcel parcel) {
            parcel.writeInt(this.f44156a);
            parcel.writeLong(this.f44157b);
            parcel.writeLong(this.f44158c);
        }
    }

    public C9676d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f44143b = j10;
        this.f44144c = z10;
        this.f44145d = z11;
        this.f44146e = z12;
        this.f44147f = z13;
        this.f44148g = j11;
        this.f44149h = j12;
        this.f44150i = Collections.unmodifiableList(list);
        this.f44151j = z14;
        this.f44152k = j13;
        this.f44153l = i10;
        this.f44154m = i11;
        this.f44155n = i12;
    }

    public C9676d(Parcel parcel) {
        this.f44143b = parcel.readLong();
        this.f44144c = parcel.readByte() == 1;
        this.f44145d = parcel.readByte() == 1;
        this.f44146e = parcel.readByte() == 1;
        this.f44147f = parcel.readByte() == 1;
        this.f44148g = parcel.readLong();
        this.f44149h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.m40690a(parcel));
        }
        this.f44150i = Collections.unmodifiableList(arrayList);
        this.f44151j = parcel.readByte() == 1;
        this.f44152k = parcel.readLong();
        this.f44153l = parcel.readInt();
        this.f44154m = parcel.readInt();
        this.f44155n = parcel.readInt();
    }

    public /* synthetic */ C9676d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public static C9676d m40687b(C4361f0 c4361f0, long j10, C4389t0 c4389t0) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        long m21973F = c4361f0.m21973F();
        boolean z14 = (c4361f0.m21971D() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z14) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int m21971D = c4361f0.m21971D();
            boolean z15 = (m21971D & 128) != 0;
            z13 = (m21971D & 64) != 0;
            boolean z16 = (m21971D & 32) != 0;
            boolean z17 = (m21971D & 16) != 0;
            j11 = (!z13 || z17) ? -9223372036854775807L : C9679g.m40708c(c4361f0, j10);
            if (!z13) {
                int m21971D2 = c4361f0.m21971D();
                emptyList = new ArrayList(m21971D2);
                for (int i13 = 0; i13 < m21971D2; i13++) {
                    int m21971D3 = c4361f0.m21971D();
                    long m40708c = !z17 ? C9679g.m40708c(c4361f0, j10) : -9223372036854775807L;
                    emptyList.add(new b(m21971D3, m40708c, c4389t0.m22241b(m40708c), null));
                }
            }
            if (z16) {
                long m21971D4 = c4361f0.m21971D();
                z12 = (128 & m21971D4) != 0;
                j12 = ((((m21971D4 & 1) << 32) | c4361f0.m21973F()) * 1000) / 90;
            } else {
                z12 = false;
                j12 = -9223372036854775807L;
            }
            i10 = c4361f0.m21977J();
            i11 = c4361f0.m21971D();
            i12 = c4361f0.m21971D();
            list = emptyList;
            boolean z18 = z17;
            z10 = z15;
            z11 = z18;
        }
        return new C9676d(m21973F, z14, z10, z13, z11, j11, c4389t0.m22241b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f44143b);
        parcel.writeByte(this.f44144c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44145d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44146e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44147f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f44148g);
        parcel.writeLong(this.f44149h);
        int size = this.f44150i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f44150i.get(i11).m40691b(parcel);
        }
        parcel.writeByte(this.f44151j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f44152k);
        parcel.writeInt(this.f44153l);
        parcel.writeInt(this.f44154m);
        parcel.writeInt(this.f44155n);
    }
}
