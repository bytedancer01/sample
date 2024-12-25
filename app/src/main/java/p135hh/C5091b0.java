package p135hh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/b0.class
 */
/* renamed from: hh.b0 */
/* loaded from: combined.jar:classes2.jar:hh/b0.class */
public class C5091b0 implements Parcelable {
    public static final Parcelable.Creator<C5091b0> CREATOR = new a();

    /* renamed from: b */
    public LinkedList<c> f29212b = new LinkedList<>();

    /* renamed from: c */
    public LinkedList<c> f29213c = new LinkedList<>();

    /* renamed from: d */
    public LinkedList<c> f29214d = new LinkedList<>();

    /* renamed from: e */
    public c f29215e;

    /* renamed from: f */
    public c f29216f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/b0$a.class
     */
    /* renamed from: hh.b0$a */
    /* loaded from: combined.jar:classes2.jar:hh/b0$a.class */
    public class a implements Parcelable.Creator<C5091b0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5091b0 createFromParcel(Parcel parcel) {
            return new C5091b0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5091b0[] newArray(int i10) {
            return new C5091b0[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/b0$b.class
     */
    /* renamed from: hh.b0$b */
    /* loaded from: combined.jar:classes2.jar:hh/b0$b.class */
    public static class b {

        /* renamed from: a */
        public final c f29217a;

        /* renamed from: b */
        public final c f29218b;

        public b(c cVar, c cVar2) {
            this.f29218b = cVar;
            this.f29217a = cVar2;
        }

        public /* synthetic */ b(c cVar, c cVar2, a aVar) {
            this(cVar, cVar2);
        }

        /* renamed from: a */
        public long m25407a() {
            return Math.max(0L, this.f29217a.f29220c - this.f29218b.f29220c);
        }

        /* renamed from: b */
        public long m25408b() {
            return Math.max(0L, this.f29217a.f29221d - this.f29218b.f29221d);
        }

        /* renamed from: c */
        public long m25409c() {
            return this.f29217a.f29220c;
        }

        /* renamed from: d */
        public long m25410d() {
            return this.f29217a.f29221d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/b0$c.class
     */
    /* renamed from: hh.b0$c */
    /* loaded from: combined.jar:classes2.jar:hh/b0$c.class */
    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b */
        public final long f29219b;

        /* renamed from: c */
        public final long f29220c;

        /* renamed from: d */
        public final long f29221d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:hh/b0$c$a.class
         */
        /* renamed from: hh.b0$c$a */
        /* loaded from: combined.jar:classes2.jar:hh/b0$c$a.class */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(long j10, long j11, long j12) {
            this.f29220c = j10;
            this.f29221d = j11;
            this.f29219b = j12;
        }

        public /* synthetic */ c(long j10, long j11, long j12, a aVar) {
            this(j10, j11, j12);
        }

        public c(Parcel parcel) {
            this.f29219b = parcel.readLong();
            this.f29220c = parcel.readLong();
            this.f29221d = parcel.readLong();
        }

        public /* synthetic */ c(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f29219b);
            parcel.writeLong(this.f29220c);
            parcel.writeLong(this.f29221d);
        }
    }

    public C5091b0() {
    }

    public C5091b0(Parcel parcel) {
        parcel.readList(this.f29212b, getClass().getClassLoader());
        parcel.readList(this.f29213c, getClass().getClassLoader());
        parcel.readList(this.f29214d, getClass().getClassLoader());
        this.f29215e = (c) parcel.readParcelable(getClass().getClassLoader());
        this.f29216f = (c) parcel.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: b */
    public b m25401b(long j10, long j11) {
        c cVar = new c(j10, j11, System.currentTimeMillis(), null);
        b m25403j = m25403j(cVar);
        m25402c(cVar);
        return m25403j;
    }

    /* renamed from: c */
    public final void m25402c(c cVar) {
        this.f29212b.add(cVar);
        if (this.f29215e == null) {
            this.f29215e = new c(0L, 0L, 0L, null);
            this.f29216f = new c(0L, 0L, 0L, null);
        }
        m25404k(cVar, true);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public b m25403j(c cVar) {
        c cVar2 = this.f29212b.size() == 0 ? new c(0L, 0L, System.currentTimeMillis(), null) : this.f29212b.getLast();
        c cVar3 = cVar;
        if (cVar == null) {
            if (this.f29212b.size() < 2) {
                cVar3 = cVar2;
            } else {
                this.f29212b.descendingIterator().next();
                cVar3 = this.f29212b.descendingIterator().next();
            }
        }
        return new b(cVar2, cVar3, null);
    }

    /* renamed from: k */
    public final void m25404k(c cVar, boolean z10) {
        long j10;
        LinkedList<c> linkedList;
        LinkedList<c> linkedList2;
        c cVar2;
        HashSet hashSet = new HashSet();
        new Vector();
        if (z10) {
            j10 = 60000;
            linkedList = this.f29212b;
            linkedList2 = this.f29213c;
            cVar2 = this.f29215e;
        } else {
            j10 = 3600000;
            linkedList = this.f29213c;
            linkedList2 = this.f29214d;
            cVar2 = this.f29216f;
        }
        if (cVar.f29219b / j10 > cVar2.f29219b / j10) {
            linkedList2.add(cVar);
            if (z10) {
                this.f29215e = cVar;
                m25404k(cVar, false);
            } else {
                this.f29216f = cVar;
            }
            Iterator<c> it = linkedList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if ((cVar.f29219b - next.f29219b) / j10 >= 5) {
                    hashSet.add(next);
                }
            }
            linkedList.removeAll(hashSet);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f29212b);
        parcel.writeList(this.f29213c);
        parcel.writeList(this.f29214d);
        parcel.writeParcelable(this.f29215e, 0);
        parcel.writeParcelable(this.f29216f, 0);
    }
}
