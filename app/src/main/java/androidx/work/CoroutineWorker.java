package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import lc.InterfaceFutureC5838a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4462b0;
import p067di.C4474f0;
import p067di.C4476g;
import p067di.C4481h1;
import p067di.C4498n0;
import p067di.InterfaceC4466c1;
import p067di.InterfaceC4471e0;
import p067di.InterfaceC4515t;
import p071e2.C4576e;
import p071e2.C4581j;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p252oh.C6976c;
import p263p2.C7546c;
import p356uh.InterfaceC9200p;
import p372vh.C9367f;
import ph.AbstractC7723j;
import ph.InterfaceC7718e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/CoroutineWorker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/CoroutineWorker.class */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: g */
    @NotNull
    public final InterfaceC4515t f5126g;

    /* renamed from: h */
    @NotNull
    public final C7546c<ListenableWorker.AbstractC0753a> f5127h;

    /* renamed from: i */
    @NotNull
    public final AbstractC4462b0 f5128i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/CoroutineWorker$a.class
     */
    /* renamed from: androidx.work.CoroutineWorker$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/CoroutineWorker$a.class */
    public static final class RunnableC0750a implements Runnable {

        /* renamed from: b */
        public final CoroutineWorker f5129b;

        public RunnableC0750a(CoroutineWorker coroutineWorker) {
            this.f5129b = coroutineWorker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f5129b.m4814v().isCancelled()) {
                InterfaceC4466c1.a.m22644a(this.f5129b.m4815w(), null, 1, null);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/CoroutineWorker$b.class
     */
    @InterfaceC7718e(m33709c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m33710f = "CoroutineWorker.kt", m33711l = {134}, m33712m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/CoroutineWorker$b.class */
    public static final class C0751b extends AbstractC7723j implements InterfaceC9200p<InterfaceC4471e0, InterfaceC6789d<? super C5398q>, Object> {

        /* renamed from: f */
        public Object f5130f;

        /* renamed from: g */
        public int f5131g;

        /* renamed from: h */
        public final C4581j<C4576e> f5132h;

        /* renamed from: i */
        public final CoroutineWorker f5133i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0751b(C4581j<C4576e> c4581j, CoroutineWorker coroutineWorker, InterfaceC6789d<? super C0751b> interfaceC6789d) {
            super(2, interfaceC6789d);
            this.f5132h = c4581j;
            this.f5133i = coroutineWorker;
        }

        @Override // ph.AbstractC7714a
        @NotNull
        /* renamed from: f */
        public final InterfaceC6789d<C5398q> mo4816f(@Nullable Object obj, @NotNull InterfaceC6789d<?> interfaceC6789d) {
            return new C0751b(this.f5132h, this.f5133i, interfaceC6789d);
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public final Object mo4817k(@NotNull Object obj) {
            Object m4813t;
            C4581j<C4576e> c4581j;
            Object m32004d = C6976c.m32004d();
            int i10 = this.f5131g;
            if (i10 == 0) {
                C5393l.m26746b(obj);
                C4581j<C4576e> c4581j2 = this.f5132h;
                CoroutineWorker coroutineWorker = this.f5133i;
                this.f5130f = c4581j2;
                this.f5131g = 1;
                m4813t = coroutineWorker.m4813t(this);
                if (m4813t == m32004d) {
                    return m32004d;
                }
                c4581j = c4581j2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4581j = (C4581j) this.f5130f;
                C5393l.m26746b(obj);
                m4813t = obj;
            }
            c4581j.m23124c(m4813t);
            return C5398q.f30770a;
        }

        @Override // p356uh.InterfaceC9200p
        @Nullable
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object mo4818m(@NotNull InterfaceC4471e0 interfaceC4471e0, @Nullable InterfaceC6789d<? super C5398q> interfaceC6789d) {
            return ((C0751b) mo4816f(interfaceC4471e0, interfaceC6789d)).mo4817k(C5398q.f30770a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/CoroutineWorker$c.class
     */
    @InterfaceC7718e(m33709c = "androidx.work.CoroutineWorker$startWork$1", m33710f = "CoroutineWorker.kt", m33711l = {68}, m33712m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$c */
    /* loaded from: combined.jar:classes1.jar:androidx/work/CoroutineWorker$c.class */
    public static final class C0752c extends AbstractC7723j implements InterfaceC9200p<InterfaceC4471e0, InterfaceC6789d<? super C5398q>, Object> {

        /* renamed from: f */
        public int f5134f;

        /* renamed from: g */
        public final CoroutineWorker f5135g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0752c(CoroutineWorker coroutineWorker, InterfaceC6789d<? super C0752c> interfaceC6789d) {
            super(2, interfaceC6789d);
            this.f5135g = coroutineWorker;
        }

        @Override // ph.AbstractC7714a
        @NotNull
        /* renamed from: f */
        public final InterfaceC6789d<C5398q> mo4816f(@Nullable Object obj, @NotNull InterfaceC6789d<?> interfaceC6789d) {
            return new C0752c(this.f5135g, interfaceC6789d);
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public final Object mo4817k(@NotNull Object obj) {
            Object m32004d = C6976c.m32004d();
            int i10 = this.f5134f;
            try {
                if (i10 == 0) {
                    C5393l.m26746b(obj);
                    CoroutineWorker coroutineWorker = this.f5135g;
                    this.f5134f = 1;
                    Object m4811r = coroutineWorker.m4811r(this);
                    obj = m4811r;
                    if (m4811r == m32004d) {
                        return m32004d;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5393l.m26746b(obj);
                }
                this.f5135g.m4814v().mo32291p((ListenableWorker.AbstractC0753a) obj);
            } catch (Throwable th2) {
                this.f5135g.m4814v().mo32292q(th2);
            }
            return C5398q.f30770a;
        }

        @Override // p356uh.InterfaceC9200p
        @Nullable
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object mo4818m(@NotNull InterfaceC4471e0 interfaceC4471e0, @Nullable InterfaceC6789d<? super C5398q> interfaceC6789d) {
            return ((C0752c) mo4816f(interfaceC4471e0, interfaceC6789d)).mo4817k(C5398q.f30770a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        InterfaceC4515t m22666b;
        C9367f.m39526e(context, "appContext");
        C9367f.m39526e(workerParameters, "params");
        m22666b = C4481h1.m22666b(null, 1, null);
        this.f5126g = m22666b;
        C7546c<ListenableWorker.AbstractC0753a> m32302t = C7546c.m32302t();
        C9367f.m39525d(m32302t, "create()");
        this.f5127h = m32302t;
        m32302t.mo23123a(new RunnableC0750a(this), mo4825h().mo33903c());
        this.f5128i = C4498n0.m22791a();
    }

    /* renamed from: u */
    public static /* synthetic */ Object m4807u(CoroutineWorker coroutineWorker, InterfaceC6789d interfaceC6789d) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    /* renamed from: d */
    public final InterfaceFutureC5838a<C4576e> mo4808d() {
        InterfaceC4515t m22666b;
        m22666b = C4481h1.m22666b(null, 1, null);
        InterfaceC4471e0 m22655a = C4474f0.m22655a(m4812s().plus(m22666b));
        C4581j c4581j = new C4581j(m22666b, null, 2, null);
        C4476g.m22660b(m22655a, null, null, new C0751b(c4581j, this, null), 3, null);
        return c4581j;
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: m */
    public final void mo4809m() {
        super.mo4809m();
        this.f5127h.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    /* renamed from: p */
    public final InterfaceFutureC5838a<ListenableWorker.AbstractC0753a> mo4810p() {
        C4476g.m22660b(C4474f0.m22655a(m4812s().plus(this.f5126g)), null, null, new C0752c(this, null), 3, null);
        return this.f5127h;
    }

    @Nullable
    /* renamed from: r */
    public abstract Object m4811r(@NotNull InterfaceC6789d<? super ListenableWorker.AbstractC0753a> interfaceC6789d);

    @NotNull
    /* renamed from: s */
    public AbstractC4462b0 m4812s() {
        return this.f5128i;
    }

    @Nullable
    /* renamed from: t */
    public Object m4813t(@NotNull InterfaceC6789d<? super C4576e> interfaceC6789d) {
        return m4807u(this, interfaceC6789d);
    }

    @NotNull
    /* renamed from: v */
    public final C7546c<ListenableWorker.AbstractC0753a> m4814v() {
        return this.f5127h;
    }

    @NotNull
    /* renamed from: w */
    public final InterfaceC4515t m4815w() {
        return this.f5126g;
    }
}
