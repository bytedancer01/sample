package p067di;

import fi.C4874m;
import fi.C4881t;
import fi.C4886y;
import fi.InterfaceC4887z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p313s.C8490b;
import p372vh.C9367f;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/r0.class
 */
/* renamed from: di.r0 */
/* loaded from: combined.jar:classes2.jar:di/r0.class */
public abstract class AbstractC4510r0 extends AbstractC4513s0 {

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f26926f = AtomicReferenceFieldUpdater.newUpdater(AbstractC4510r0.class, Object.class, "_queue");

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f26927g = AtomicReferenceFieldUpdater.newUpdater(AbstractC4510r0.class, Object.class, "_delayed");

    @NotNull
    private volatile Object _queue = null;

    @NotNull
    private volatile Object _delayed = null;

    @NotNull
    private volatile int _isCompleted = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/r0$a.class
     */
    /* renamed from: di.r0$a */
    /* loaded from: combined.jar:classes2.jar:di/r0$a.class */
    public static abstract class a implements Runnable, Comparable<a>, InterfaceC4501o0, InterfaceC4887z {

        /* renamed from: b */
        public long f26928b;

        /* renamed from: c */
        @Nullable
        public Object f26929c;

        /* renamed from: d */
        public int f26930d;

        @Override // fi.InterfaceC4887z
        /* renamed from: a */
        public void mo22816a(@Nullable C4886y<?> c4886y) {
            C4881t c4881t;
            Object obj = this.f26929c;
            c4881t = C4519u0.f26942a;
            if (!(obj != c4881t)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f26929c = c4886y;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull a aVar) {
            long j10 = this.f26928b - aVar.f26928b;
            return j10 > 0 ? 1 : j10 < 0 ? -1 : 0;
        }

        @Override // fi.InterfaceC4887z
        @Nullable
        /* renamed from: d */
        public C4886y<?> mo22818d() {
            Object obj = this.f26929c;
            return obj instanceof C4886y ? (C4886y) obj : null;
        }

        @Override // p067di.InterfaceC4501o0
        public final void dispose() {
            C4881t c4881t;
            C4881t c4881t2;
            synchronized (this) {
                Object obj = this.f26929c;
                c4881t = C4519u0.f26942a;
                if (obj == c4881t) {
                    return;
                }
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.m24828g(this);
                }
                c4881t2 = C4519u0.f26942a;
                this.f26929c = c4881t2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #0 {, blocks: (B:17:0x001f, B:26:0x003e, B:27:0x006a, B:30:0x007e, B:32:0x0085, B:38:0x0046, B:42:0x005c), top: B:16:0x001f, outer: #1 }] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m22819e(long r6, @org.jetbrains.annotations.NotNull p067di.AbstractC4510r0.b r8, @org.jetbrains.annotations.NotNull p067di.AbstractC4510r0 r9) {
            /*
                r5 = this;
                r0 = r5
                monitor-enter(r0)
                r0 = r5
                java.lang.Object r0 = r0.f26929c     // Catch: java.lang.Throwable -> L98
                r15 = r0
                fi.t r0 = p067di.C4519u0.m22843b()     // Catch: java.lang.Throwable -> L98
                r14 = r0
                r0 = r15
                r1 = r14
                if (r0 != r1) goto L1c
                r0 = 2
                r10 = r0
            L17:
                r0 = r5
                monitor-exit(r0)
                r0 = r10
                return r0
            L1c:
                r0 = r8
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L98
                r0 = r8
                fi.z r0 = r0.m24823b()     // Catch: java.lang.Throwable -> L91
                di.r0$a r0 = (p067di.AbstractC4510r0.a) r0     // Catch: java.lang.Throwable -> L91
                r14 = r0
                r0 = r9
                boolean r0 = p067di.AbstractC4510r0.m22802O0(r0)     // Catch: java.lang.Throwable -> L91
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L39
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                r0 = r5
                monitor-exit(r0)
                r0 = 1
                return r0
            L39:
                r0 = r14
                if (r0 != 0) goto L46
            L3e:
                r0 = r8
                r1 = r6
                r0.f26931b = r1     // Catch: java.lang.Throwable -> L91
                goto L6a
            L46:
                r0 = r14
                long r0 = r0.f26928b     // Catch: java.lang.Throwable -> L91
                r11 = r0
                r0 = r11
                r1 = r6
                long r0 = r0 - r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L59
                goto L5c
            L59:
                r0 = r11
                r6 = r0
            L5c:
                r0 = r6
                r1 = r8
                long r1 = r1.f26931b     // Catch: java.lang.Throwable -> L91
                long r0 = r0 - r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6a
                goto L3e
            L6a:
                r0 = r5
                long r0 = r0.f26928b     // Catch: java.lang.Throwable -> L91
                r6 = r0
                r0 = r8
                long r0 = r0.f26931b     // Catch: java.lang.Throwable -> L91
                r11 = r0
                r0 = r6
                r1 = r11
                long r0 = r0 - r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L84
                r0 = r5
                r1 = r11
                r0.f26928b = r1     // Catch: java.lang.Throwable -> L91
            L84:
                r0 = r8
                r1 = r5
                r0.m24822a(r1)     // Catch: java.lang.Throwable -> L91
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                r0 = 0
                r10 = r0
                goto L17
            L91:
                r9 = move-exception
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L98
                r0 = r9
                throw r0     // Catch: java.lang.Throwable -> L98
            L98:
                r8 = move-exception
                r0 = r5
                monitor-exit(r0)
                r0 = r8
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p067di.AbstractC4510r0.a.m22819e(long, di.r0$b, di.r0):int");
        }

        /* renamed from: f */
        public final boolean m22820f(long j10) {
            return j10 - this.f26928b >= 0;
        }

        @Override // fi.InterfaceC4887z
        public int getIndex() {
            return this.f26930d;
        }

        @Override // fi.InterfaceC4887z
        public void setIndex(int i10) {
            this.f26930d = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f26928b + ']';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/r0$b.class
     */
    /* renamed from: di.r0$b */
    /* loaded from: combined.jar:classes2.jar:di/r0$b.class */
    public static final class b extends C4886y<a> {

        /* renamed from: b */
        public long f26931b;

        public b(long j10) {
            this.f26931b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* renamed from: T0 */
    public final boolean m22803T0() {
        return this._isCompleted;
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: A0 */
    public final void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        m22806R0(runnable);
    }

    @Override // p067di.AbstractC4507q0
    /* renamed from: F0 */
    public long mo22797F0() {
        C4881t c4881t;
        if (super.mo22797F0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C4874m)) {
                c4881t = C4519u0.f26943b;
                return obj == c4881t ? Long.MAX_VALUE : 0L;
            }
            if (!((C4874m) obj).m24785g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        a m24826e = bVar == null ? null : bVar.m24826e();
        if (m24826e == null) {
            return Long.MAX_VALUE;
        }
        long j10 = m24826e.f26928b;
        C4464c.m22637a();
        return C10240e.m42835c(j10 - System.nanoTime(), 0L);
    }

    /* renamed from: P0 */
    public final void m22804P0() {
        C4881t c4881t;
        C4881t c4881t2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26926f;
                c4881t = C4519u0.f26943b;
                if (C8490b.m36639a(atomicReferenceFieldUpdater, this, null, c4881t)) {
                    return;
                }
            } else {
                if (obj instanceof C4874m) {
                    ((C4874m) obj).m24782d();
                    return;
                }
                c4881t2 = C4519u0.f26943b;
                if (obj == c4881t2) {
                    return;
                }
                C4874m c4874m = new C4874m(8, true);
                c4874m.m24779a((Runnable) obj);
                if (C8490b.m36639a(f26926f, this, obj, c4874m)) {
                    return;
                }
            }
        }
    }

    /* renamed from: Q0 */
    public final Runnable m22805Q0() {
        C4881t c4881t;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C4874m) {
                C4874m c4874m = (C4874m) obj;
                Object m24788j = c4874m.m24788j();
                if (m24788j != C4874m.f28571h) {
                    return (Runnable) m24788j;
                }
                C8490b.m36639a(f26926f, this, obj, c4874m.m24787i());
            } else {
                c4881t = C4519u0.f26943b;
                if (obj == c4881t) {
                    return null;
                }
                if (C8490b.m36639a(f26926f, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: R0 */
    public final void m22806R0(@NotNull Runnable runnable) {
        if (m22807S0(runnable)) {
            m22831N0();
        } else {
            RunnableC4486j0.f26887h.m22806R0(runnable);
        }
    }

    /* renamed from: S0 */
    public final boolean m22807S0(Runnable runnable) {
        C4881t c4881t;
        while (true) {
            Object obj = this._queue;
            if (m22803T0()) {
                return false;
            }
            if (obj == null) {
                if (C8490b.m36639a(f26926f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C4874m) {
                C4874m c4874m = (C4874m) obj;
                int m24779a = c4874m.m24779a(runnable);
                if (m24779a == 0) {
                    return true;
                }
                if (m24779a == 1) {
                    C8490b.m36639a(f26926f, this, obj, c4874m.m24787i());
                } else if (m24779a == 2) {
                    return false;
                }
            } else {
                c4881t = C4519u0.f26943b;
                if (obj == c4881t) {
                    return false;
                }
                C4874m c4874m2 = new C4874m(8, true);
                c4874m2.m24779a((Runnable) obj);
                c4874m2.m24779a(runnable);
                if (C8490b.m36639a(f26926f, this, obj, c4874m2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r0 == r1) goto L14;
     */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m22808U0() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.m22800J0()
            r5 = r0
            r0 = 0
            r4 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r3
            java.lang.Object r0 = r0._delayed
            di.r0$b r0 = (p067di.AbstractC4510r0.b) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r6
            boolean r0 = r0.m24825d()
            if (r0 != 0) goto L22
            r0 = 0
            return r0
        L22:
            r0 = r3
            java.lang.Object r0 = r0._queue
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L30
        L2b:
            r0 = 1
            r4 = r0
            goto L4c
        L30:
            r0 = r6
            boolean r0 = r0 instanceof fi.C4874m
            if (r0 == 0) goto L42
            r0 = r6
            fi.m r0 = (fi.C4874m) r0
            boolean r0 = r0.m24785g()
            r4 = r0
            goto L4c
        L42:
            r0 = r6
            fi.t r1 = p067di.C4519u0.m22842a()
            if (r0 != r1) goto L4c
            goto L2b
        L4c:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067di.AbstractC4510r0.m22808U0():boolean");
    }

    /* renamed from: V0 */
    public long m22809V0() {
        a aVar;
        if (m22801K0()) {
            return 0L;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.m24825d()) {
            C4464c.m22637a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a m24823b = bVar.m24823b();
                    aVar = null;
                    if (m24823b != null) {
                        a aVar2 = m24823b;
                        if (aVar2.m22820f(nanoTime) ? m22807S0(aVar2) : false) {
                            aVar = bVar.m24829h(0);
                        }
                    }
                }
            } while (aVar != null);
        }
        Runnable m22805Q0 = m22805Q0();
        if (m22805Q0 == null) {
            return mo22797F0();
        }
        m22805Q0.run();
        return 0L;
    }

    /* renamed from: W0 */
    public final void m22810W0() {
        C4464c.m22637a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a m24830i = bVar == null ? null : bVar.m24830i();
            if (m24830i == null) {
                return;
            } else {
                m22830M0(nanoTime, m24830i);
            }
        }
    }

    /* renamed from: X0 */
    public final void m22811X0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: Y0 */
    public final void m22812Y0(long j10, @NotNull a aVar) {
        int m22813Z0 = m22813Z0(j10, aVar);
        if (m22813Z0 == 0) {
            if (m22815b1(aVar)) {
                m22831N0();
            }
        } else if (m22813Z0 == 1) {
            m22830M0(j10, aVar);
        } else if (m22813Z0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* renamed from: Z0 */
    public final int m22813Z0(long j10, a aVar) {
        if (m22803T0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        b bVar2 = bVar;
        if (bVar == null) {
            C8490b.m36639a(f26927g, this, null, new b(j10));
            bVar2 = (b) this._delayed;
            C9367f.m39524c(bVar2);
        }
        return aVar.m22819e(j10, bVar2, this);
    }

    /* renamed from: a1 */
    public final void m22814a1(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    /* renamed from: b1 */
    public final boolean m22815b1(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : bVar.m24826e()) == aVar;
    }

    @Override // p067di.AbstractC4507q0
    public void shutdown() {
        C4517t1.f26935a.m22836b();
        m22814a1(true);
        m22804P0();
        while (m22809V0() <= 0) {
        }
        m22810W0();
    }
}
