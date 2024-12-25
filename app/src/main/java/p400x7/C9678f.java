package p400x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/f.class
 */
/* renamed from: x7.f */
/* loaded from: combined.jar:classes2.jar:x7/f.class */
public final class C9678f extends AbstractC9674b {
    public static final Parcelable.Creator<C9678f> CREATOR = new a();

    /* renamed from: b */
    public final List<c> f44159b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/f$a.class
     */
    /* renamed from: x7.f$a */
    /* loaded from: combined.jar:classes2.jar:x7/f$a.class */
    public class a implements Parcelable.Creator<C9678f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9678f createFromParcel(Parcel parcel) {
            return new C9678f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9678f[] newArray(int i10) {
            return new C9678f[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/f$b.class
     */
    /* renamed from: x7.f$b */
    /* loaded from: combined.jar:classes2.jar:x7/f$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f44160a;

        /* renamed from: b */
        public final long f44161b;

        public b(int i10, long j10) {
            this.f44160a = i10;
            this.f44161b = j10;
        }

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* renamed from: c */
        public static b m40699c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void m40700d(Parcel parcel) {
            parcel.writeInt(this.f44160a);
            parcel.writeLong(this.f44161b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/f$c.class
     */
    /* renamed from: x7.f$c */
    /* loaded from: combined.jar:classes2.jar:x7/f$c.class */
    public static final class c {

        /* renamed from: a */
        public final long f44162a;

        /* renamed from: b */
        public final boolean f44163b;

        /* renamed from: c */
        public final boolean f44164c;

        /* renamed from: d */
        public final boolean f44165d;

        /* renamed from: e */
        public final long f44166e;

        /* renamed from: f */
        public final List<b> f44167f;

        /* renamed from: g */
        public final boolean f44168g;

        /* renamed from: h */
        public final long f44169h;

        /* renamed from: i */
        public final int f44170i;

        /* renamed from: j */
        public final int f44171j;

        /* renamed from: k */
        public final int f44172k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f44162a = j10;
            this.f44163b = z10;
            this.f44164c = z11;
            this.f44165d = z12;
            this.f44167f = Collections.unmodifiableList(list);
            this.f44166e = j11;
            this.f44168g = z13;
            this.f44169h = j12;
            this.f44170i = i10;
            this.f44171j = i11;
            this.f44172k = i12;
        }

        public c(Parcel parcel) {
            this.f44162a = parcel.readLong();
            this.f44163b = parcel.readByte() == 1;
            this.f44164c = parcel.readByte() == 1;
            this.f44165d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.m40699c(parcel));
            }
            this.f44167f = Collections.unmodifiableList(arrayList);
            this.f44166e = parcel.readLong();
            this.f44168g = parcel.readByte() == 1;
            this.f44169h = parcel.readLong();
            this.f44170i = parcel.readInt();
            this.f44171j = parcel.readInt();
            this.f44172k = parcel.readInt();
        }

        /* renamed from: d */
        public static c m40704d(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: e */
        public static c m40705e(C4361f0 c4361f0) {
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            long m21973F = c4361f0.m21973F();
            boolean z13 = (c4361f0.m21971D() & 128) != 0;
            ArrayList arrayList = new ArrayList();
            if (z13) {
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int m21971D = c4361f0.m21971D();
                z10 = (m21971D & 128) != 0;
                z12 = (m21971D & 64) != 0;
                boolean z14 = (m21971D & 32) != 0;
                j10 = z12 ? c4361f0.m21973F() : -9223372036854775807L;
                if (!z12) {
                    int m21971D2 = c4361f0.m21971D();
                    arrayList = new ArrayList(m21971D2);
                    for (int i13 = 0; i13 < m21971D2; i13++) {
                        arrayList.add(new b(c4361f0.m21971D(), c4361f0.m21973F(), null));
                    }
                }
                if (z14) {
                    long m21971D3 = c4361f0.m21971D();
                    z11 = (128 & m21971D3) != 0;
                    j11 = ((((m21971D3 & 1) << 32) | c4361f0.m21973F()) * 1000) / 90;
                } else {
                    z11 = false;
                    j11 = -9223372036854775807L;
                }
                i10 = c4361f0.m21977J();
                i11 = c4361f0.m21971D();
                i12 = c4361f0.m21971D();
            }
            return new c(m21973F, z13, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* renamed from: f */
        public final void m40706f(Parcel parcel) {
            parcel.writeLong(this.f44162a);
            parcel.writeByte(this.f44163b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f44164c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f44165d ? (byte) 1 : (byte) 0);
            int size = this.f44167f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f44167f.get(i10).m40700d(parcel);
            }
            parcel.writeLong(this.f44166e);
            parcel.writeByte(this.f44168g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f44169h);
            parcel.writeInt(this.f44170i);
            parcel.writeInt(this.f44171j);
            parcel.writeInt(this.f44172k);
        }
    }

    public C9678f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.m40704d(parcel));
        }
        this.f44159b = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ C9678f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public C9678f(List<c> list) {
        this.f44159b = Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static C9678f m40694b(C4361f0 c4361f0) {
        int m21971D = c4361f0.m21971D();
        ArrayList arrayList = new ArrayList(m21971D);
        for (int i10 = 0; i10 < m21971D; i10++) {
            arrayList.add(c.m40705e(c4361f0));
        }
        return new C9678f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f44159b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f44159b.get(i11).m40706f(parcel);
        }
    }
}
