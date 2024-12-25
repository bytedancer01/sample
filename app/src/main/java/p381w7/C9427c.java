package p381w7;

import android.os.Parcel;
import android.os.Parcelable;
import ec.C4705h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4401z0;
import p099fc.AbstractC4822n;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;
import p381w7.C9427c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w7/c.class
 */
/* renamed from: w7.c */
/* loaded from: combined.jar:classes2.jar:w7/c.class */
public final class C9427c implements C7839a.b {
    public static final Parcelable.Creator<C9427c> CREATOR = new a();

    /* renamed from: b */
    public final List<b> f43188b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w7/c$a.class
     */
    /* renamed from: w7.c$a */
    /* loaded from: combined.jar:classes2.jar:w7/c$a.class */
    public class a implements Parcelable.Creator<C9427c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9427c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new C9427c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9427c[] newArray(int i10) {
            return new C9427c[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w7/c$b.class
     */
    /* renamed from: w7.c$b */
    /* loaded from: combined.jar:classes2.jar:w7/c$b.class */
    public static final class b implements Parcelable {

        /* renamed from: b */
        public final long f43190b;

        /* renamed from: c */
        public final long f43191c;

        /* renamed from: d */
        public final int f43192d;

        /* renamed from: e */
        public static final Comparator<b> f43189e = new Comparator() { // from class: w7.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m39785c;
                m39785c = C9427c.b.m39785c((C9427c.b) obj, (C9427c.b) obj2);
                return m39785c;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:w7/c$b$a.class
         */
        /* renamed from: w7.c$b$a */
        /* loaded from: combined.jar:classes2.jar:w7/c$b$a.class */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            C4349a.m21878a(j10 < j11);
            this.f43190b = j10;
            this.f43191c = j11;
            this.f43192d = i10;
        }

        /* renamed from: c */
        public static /* synthetic */ int m39785c(b bVar, b bVar2) {
            return AbstractC4822n.m24459j().mo24461e(bVar.f43190b, bVar2.f43190b).mo24461e(bVar.f43191c, bVar2.f43191c).mo24460d(bVar.f43192d, bVar2.f43192d).mo24465i();
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
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f43190b != bVar.f43190b || this.f43191c != bVar.f43191c || this.f43192d != bVar.f43192d) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return C4705h.m23656b(Long.valueOf(this.f43190b), Long.valueOf(this.f43191c), Integer.valueOf(this.f43192d));
        }

        public String toString() {
            return C4401z0.m22321E("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f43190b), Long.valueOf(this.f43191c), Integer.valueOf(this.f43192d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f43190b);
            parcel.writeLong(this.f43191c);
            parcel.writeInt(this.f43192d);
        }
    }

    public C9427c(List<b> list) {
        this.f43188b = list;
        C4349a.m21878a(!m39781b(list));
    }

    /* renamed from: b */
    public static boolean m39781b(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f43191c;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f43190b < j10) {
                return true;
            }
            j10 = list.get(i10).f43191c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9427c.class != obj.getClass()) {
            return false;
        }
        return this.f43188b.equals(((C9427c) obj).f43188b);
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
        return this.f43188b.hashCode();
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f43188b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f43188b);
    }
}
