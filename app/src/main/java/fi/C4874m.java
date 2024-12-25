package fi;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p313s.C8490b;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/m.class
 */
/* renamed from: fi.m */
/* loaded from: combined.jar:classes2.jar:fi/m.class */
public final class C4874m<E> {

    @NotNull
    private volatile Object _next = null;

    @NotNull
    private volatile long _state = 0;

    /* renamed from: a */
    public final int f28572a;

    /* renamed from: b */
    public final boolean f28573b;

    /* renamed from: c */
    public final int f28574c;

    /* renamed from: d */
    @NotNull
    public AtomicReferenceArray f28575d;

    /* renamed from: e */
    @NotNull
    public static final a f28568e = new a(null);

    /* renamed from: h */
    @NotNull
    public static final C4881t f28571h = new C4881t("REMOVE_FROZEN");

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f28569f = AtomicReferenceFieldUpdater.newUpdater(C4874m.class, Object.class, "_next");

    /* renamed from: g */
    public static final AtomicLongFieldUpdater f28570g = AtomicLongFieldUpdater.newUpdater(C4874m.class, "_state");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fi/m$a.class
     */
    /* renamed from: fi.m$a */
    /* loaded from: combined.jar:classes2.jar:fi/m$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final int m24790a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m24791b(long j10, int i10) {
            return m24793d(j10, 1073741823L) | (i10 << 0);
        }

        /* renamed from: c */
        public final long m24792c(long j10, int i10) {
            return m24793d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m24793d(long j10, long j11) {
            return j10 & (j11 ^ (-1));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fi/m$b.class
     */
    /* renamed from: fi.m$b */
    /* loaded from: combined.jar:classes2.jar:fi/m$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f28576a;

        public b(int i10) {
            this.f28576a = i10;
        }
    }

    public C4874m(int i10, boolean z10) {
        this.f28572a = i10;
        this.f28573b = z10;
        int i11 = i10 - 1;
        this.f28574c = i11;
        this.f28575d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: a */
    public final int m24779a(@NotNull E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return f28568e.m24790a(j10);
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f28574c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f28573b && this.f28575d.get(i11 & i12) != null) {
                int i13 = this.f28572a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f28570g.compareAndSet(this, j10, f28568e.m24792c(j10, (i11 + 1) & 1073741823))) {
                this.f28575d.set(i11 & i12, e10);
                C4874m<E> c4874m = this;
                while ((c4874m._state & 1152921504606846976L) != 0) {
                    C4874m<E> m24783e = c4874m.m24787i().m24783e(i11, e10);
                    c4874m = m24783e;
                    if (m24783e == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C4874m<E> m24780b(long j10) {
        C4874m<E> c4874m = new C4874m<>(this.f28572a * 2, this.f28573b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f28574c;
            if ((i10 & i12) == (i11 & i12)) {
                c4874m._state = f28568e.m24793d(j10, 1152921504606846976L);
                return c4874m;
            }
            Object obj = this.f28575d.get(i12 & i10);
            Object obj2 = obj;
            if (obj == null) {
                obj2 = new b(i10);
            }
            c4874m.f28575d.set(c4874m.f28574c & i10, obj2);
            i10++;
        }
    }

    /* renamed from: c */
    public final C4874m<E> m24781c(long j10) {
        while (true) {
            C4874m<E> c4874m = (C4874m) this._next;
            if (c4874m != null) {
                return c4874m;
            }
            C8490b.m36639a(f28569f, this, null, m24780b(j10));
        }
    }

    /* renamed from: d */
    public final boolean m24782d() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f28570g.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final C4874m<E> m24783e(int i10, E e10) {
        Object obj = this.f28575d.get(this.f28574c & i10);
        if (!(obj instanceof b) || ((b) obj).f28576a != i10) {
            return null;
        }
        this.f28575d.set(i10 & this.f28574c, e10);
        return this;
    }

    /* renamed from: f */
    public final int m24784f() {
        long j10 = this._state;
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    /* renamed from: g */
    public final boolean m24785g() {
        long j10 = this._state;
        boolean z10 = false;
        if (((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: h */
    public final long m24786h() {
        long j10;
        long j11;
        do {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!f28570g.compareAndSet(this, j10, j11));
        return j11;
    }

    @NotNull
    /* renamed from: i */
    public final C4874m<E> m24787i() {
        return m24781c(m24786h());
    }

    @Nullable
    /* renamed from: j */
    public final Object m24788j() {
        C4874m<E> m24789k;
        while (true) {
            long j10 = this._state;
            if ((1152921504606846976L & j10) != 0) {
                return f28571h;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f28574c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f28575d.get(i12 & i10);
            if (obj == null) {
                if (this.f28573b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & 1073741823;
                if (f28570g.compareAndSet(this, j10, f28568e.m24791b(j10, i13))) {
                    this.f28575d.set(this.f28574c & i10, null);
                    return obj;
                }
                if (this.f28573b) {
                    C4874m<E> c4874m = this;
                    do {
                        m24789k = c4874m.m24789k(i10, i13);
                        c4874m = m24789k;
                    } while (m24789k != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: k */
    public final C4874m<E> m24789k(int i10, int i11) {
        long j10;
        int i12;
        do {
            j10 = this._state;
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return m24787i();
            }
        } while (!f28570g.compareAndSet(this, j10, f28568e.m24791b(j10, i11)));
        this.f28575d.set(i12 & this.f28574c, null);
        return null;
    }
}
