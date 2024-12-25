package p136hi;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p313s.C8490b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/n.class
 */
/* renamed from: hi.n */
/* loaded from: combined.jar:classes2.jar:hi/n.class */
public final class C5132n {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f29436b = AtomicReferenceFieldUpdater.newUpdater(C5132n.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f29437c = AtomicIntegerFieldUpdater.newUpdater(C5132n.class, "producerIndex");

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f29438d = AtomicIntegerFieldUpdater.newUpdater(C5132n.class, "consumerIndex");

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f29439e = AtomicIntegerFieldUpdater.newUpdater(C5132n.class, "blockingTasksInBuffer");

    /* renamed from: a */
    @NotNull
    public final AtomicReferenceArray<AbstractRunnableC5127i> f29440a = new AtomicReferenceArray<>(128);

    @NotNull
    private volatile Object lastScheduledTask = null;

    @NotNull
    private volatile int producerIndex = 0;

    @NotNull
    private volatile int consumerIndex = 0;

    @NotNull
    private volatile int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC5127i m25721b(C5132n c5132n, AbstractRunnableC5127i abstractRunnableC5127i, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c5132n.m25722a(abstractRunnableC5127i, z10);
    }

    @Nullable
    /* renamed from: a */
    public final AbstractRunnableC5127i m25722a(@NotNull AbstractRunnableC5127i abstractRunnableC5127i, boolean z10) {
        if (z10) {
            return m25723c(abstractRunnableC5127i);
        }
        AbstractRunnableC5127i abstractRunnableC5127i2 = (AbstractRunnableC5127i) f29436b.getAndSet(this, abstractRunnableC5127i);
        if (abstractRunnableC5127i2 == null) {
            return null;
        }
        return m25723c(abstractRunnableC5127i2);
    }

    /* renamed from: c */
    public final AbstractRunnableC5127i m25723c(AbstractRunnableC5127i abstractRunnableC5127i) {
        boolean z10 = true;
        if (abstractRunnableC5127i.f29428c.mo25718q0() != 1) {
            z10 = false;
        }
        if (z10) {
            f29439e.incrementAndGet(this);
        }
        if (m25725e() == 127) {
            return abstractRunnableC5127i;
        }
        int i10 = this.producerIndex & 127;
        while (this.f29440a.get(i10) != null) {
            Thread.yield();
        }
        this.f29440a.lazySet(i10, abstractRunnableC5127i);
        f29437c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    public final void m25724d(AbstractRunnableC5127i abstractRunnableC5127i) {
        if (abstractRunnableC5127i != null) {
            boolean z10 = true;
            if (abstractRunnableC5127i.f29428c.mo25718q0() != 1) {
                z10 = false;
            }
            if (z10) {
                f29439e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: e */
    public final int m25725e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m25726f() {
        return this.lastScheduledTask != null ? m25725e() + 1 : m25725e();
    }

    /* renamed from: g */
    public final void m25727g(@NotNull C5122d c5122d) {
        AbstractRunnableC5127i abstractRunnableC5127i = (AbstractRunnableC5127i) f29436b.getAndSet(this, null);
        if (abstractRunnableC5127i != null) {
            c5122d.m24775a(abstractRunnableC5127i);
        }
        while (m25730j(c5122d)) {
        }
    }

    @Nullable
    /* renamed from: h */
    public final AbstractRunnableC5127i m25728h() {
        AbstractRunnableC5127i abstractRunnableC5127i = (AbstractRunnableC5127i) f29436b.getAndSet(this, null);
        AbstractRunnableC5127i abstractRunnableC5127i2 = abstractRunnableC5127i;
        if (abstractRunnableC5127i == null) {
            abstractRunnableC5127i2 = m25729i();
        }
        return abstractRunnableC5127i2;
    }

    /* renamed from: i */
    public final AbstractRunnableC5127i m25729i() {
        AbstractRunnableC5127i andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            if (f29438d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f29440a.getAndSet(i10 & 127, null)) != null) {
                m25724d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    public final boolean m25730j(C5122d c5122d) {
        AbstractRunnableC5127i m25729i = m25729i();
        if (m25729i == null) {
            return false;
        }
        c5122d.m24775a(m25729i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        return m25733m(r7, true);
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m25731k(@org.jetbrains.annotations.NotNull p136hi.C5132n r7) {
        /*
            r6 = this;
            r0 = r7
            int r0 = r0.consumerIndex
            r8 = r0
            r0 = r7
            int r0 = r0.producerIndex
            r10 = r0
            r0 = r7
            java.util.concurrent.atomic.AtomicReferenceArray<hi.i> r0 = r0.f29440a
            r12 = r0
        L11:
            r0 = 1
            r9 = r0
            r0 = r8
            r1 = r10
            if (r0 == r1) goto L7a
            r0 = r8
            r1 = 127(0x7f, float:1.78E-43)
            r0 = r0 & r1
            r11 = r0
            r0 = r7
            int r0 = r0.blockingTasksInBuffer
            if (r0 != 0) goto L29
            goto L7a
        L29:
            r0 = r12
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            hi.i r0 = (p136hi.AbstractRunnableC5127i) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L74
            r0 = r13
            hi.j r0 = r0.f29428c
            int r0 = r0.mo25718q0()
            r1 = 1
            if (r0 != r1) goto L4b
            goto L4d
        L4b:
            r0 = 0
            r9 = r0
        L4d:
            r0 = r9
            if (r0 == 0) goto L74
            r0 = r12
            r1 = r11
            r2 = r13
            r3 = 0
            boolean r0 = p136hi.C5131m.m25720a(r0, r1, r2, r3)
            if (r0 == 0) goto L74
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p136hi.C5132n.f29439e
            r1 = r7
            int r0 = r0.decrementAndGet(r1)
            r0 = r6
            r1 = r13
            r2 = 0
            r3 = 2
            r4 = 0
            hi.i r0 = m25721b(r0, r1, r2, r3, r4)
            r0 = -1
            return r0
        L74:
            int r8 = r8 + 1
            goto L11
        L7a:
            r0 = r6
            r1 = r7
            r2 = 1
            long r0 = r0.m25733m(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p136hi.C5132n.m25731k(hi.n):long");
    }

    /* renamed from: l */
    public final long m25732l(@NotNull C5132n c5132n) {
        AbstractRunnableC5127i m25729i = c5132n.m25729i();
        if (m25729i == null) {
            return m25733m(c5132n, false);
        }
        m25721b(this, m25729i, false, 2, null);
        return -1L;
    }

    /* renamed from: m */
    public final long m25733m(C5132n c5132n, boolean z10) {
        AbstractRunnableC5127i abstractRunnableC5127i;
        do {
            abstractRunnableC5127i = (AbstractRunnableC5127i) c5132n.lastScheduledTask;
            if (abstractRunnableC5127i == null) {
                return -2L;
            }
            if (z10) {
                boolean z11 = true;
                if (abstractRunnableC5127i.f29428c.mo25718q0() != 1) {
                    z11 = false;
                }
                if (!z11) {
                    return -2L;
                }
            }
            long mo25719a = C5130l.f29435f.mo25719a() - abstractRunnableC5127i.f29427b;
            long j10 = C5130l.f29430a;
            if (mo25719a < j10) {
                return j10 - mo25719a;
            }
        } while (!C8490b.m36639a(f29436b, c5132n, abstractRunnableC5127i, null));
        m25721b(this, abstractRunnableC5127i, false, 2, null);
        return -1L;
    }
}
