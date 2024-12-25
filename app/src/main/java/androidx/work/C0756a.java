package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p071e2.AbstractC4580i;
import p071e2.AbstractC4594w;
import p071e2.InterfaceC4578g;
import p071e2.InterfaceC4589r;
import p089f2.C4751a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/a.class
 */
/* renamed from: androidx.work.a */
/* loaded from: combined.jar:classes1.jar:androidx/work/a.class */
public final class C0756a {

    /* renamed from: a */
    public final Executor f5159a;

    /* renamed from: b */
    public final Executor f5160b;

    /* renamed from: c */
    public final AbstractC4594w f5161c;

    /* renamed from: d */
    public final AbstractC4580i f5162d;

    /* renamed from: e */
    public final InterfaceC4589r f5163e;

    /* renamed from: f */
    public final InterfaceC4578g f5164f;

    /* renamed from: g */
    public final String f5165g;

    /* renamed from: h */
    public final int f5166h;

    /* renamed from: i */
    public final int f5167i;

    /* renamed from: j */
    public final int f5168j;

    /* renamed from: k */
    public final int f5169k;

    /* renamed from: l */
    public final boolean f5170l;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/a$a.class
     */
    /* renamed from: androidx.work.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/a$a.class */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f5171a = new AtomicInteger(0);

        /* renamed from: b */
        public final boolean f5172b;

        /* renamed from: c */
        public final C0756a f5173c;

        public a(C0756a c0756a, boolean z10) {
            this.f5173c = c0756a;
            this.f5172b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f5172b ? "WM.task-" : "androidx.work-") + this.f5171a.incrementAndGet());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/a$b.class
     */
    /* renamed from: androidx.work.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/a$b.class */
    public static final class b {

        /* renamed from: a */
        public Executor f5174a;

        /* renamed from: b */
        public AbstractC4594w f5175b;

        /* renamed from: c */
        public AbstractC4580i f5176c;

        /* renamed from: d */
        public Executor f5177d;

        /* renamed from: e */
        public InterfaceC4589r f5178e;

        /* renamed from: f */
        public InterfaceC4578g f5179f;

        /* renamed from: g */
        public String f5180g;

        /* renamed from: h */
        public int f5181h = 4;

        /* renamed from: i */
        public int f5182i = 0;

        /* renamed from: j */
        public int f5183j = Integer.MAX_VALUE;

        /* renamed from: k */
        public int f5184k = 20;

        /* renamed from: a */
        public C0756a m4862a() {
            return new C0756a(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/a$c.class
     */
    /* renamed from: androidx.work.a$c */
    /* loaded from: combined.jar:classes1.jar:androidx/work/a$c.class */
    public interface c {
        /* renamed from: a */
        C0756a m4863a();
    }

    public C0756a(b bVar) {
        Executor executor = bVar.f5174a;
        this.f5159a = executor == null ? m4849a(false) : executor;
        Executor executor2 = bVar.f5177d;
        if (executor2 == null) {
            this.f5170l = true;
            executor2 = m4849a(true);
        } else {
            this.f5170l = false;
        }
        this.f5160b = executor2;
        AbstractC4594w abstractC4594w = bVar.f5175b;
        this.f5161c = abstractC4594w == null ? AbstractC4594w.m23157c() : abstractC4594w;
        AbstractC4580i abstractC4580i = bVar.f5176c;
        this.f5162d = abstractC4580i == null ? AbstractC4580i.m23119c() : abstractC4580i;
        InterfaceC4589r interfaceC4589r = bVar.f5178e;
        this.f5163e = interfaceC4589r == null ? new C4751a() : interfaceC4589r;
        this.f5166h = bVar.f5181h;
        this.f5167i = bVar.f5182i;
        this.f5168j = bVar.f5183j;
        this.f5169k = bVar.f5184k;
        this.f5164f = bVar.f5179f;
        this.f5165g = bVar.f5180g;
    }

    /* renamed from: a */
    public final Executor m4849a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m4850b(z10));
    }

    /* renamed from: b */
    public final ThreadFactory m4850b(boolean z10) {
        return new a(this, z10);
    }

    /* renamed from: c */
    public String m4851c() {
        return this.f5165g;
    }

    /* renamed from: d */
    public InterfaceC4578g m4852d() {
        return this.f5164f;
    }

    /* renamed from: e */
    public Executor m4853e() {
        return this.f5159a;
    }

    /* renamed from: f */
    public AbstractC4580i m4854f() {
        return this.f5162d;
    }

    /* renamed from: g */
    public int m4855g() {
        return this.f5168j;
    }

    /* renamed from: h */
    public int m4856h() {
        return Build.VERSION.SDK_INT == 23 ? this.f5169k / 2 : this.f5169k;
    }

    /* renamed from: i */
    public int m4857i() {
        return this.f5167i;
    }

    /* renamed from: j */
    public int m4858j() {
        return this.f5166h;
    }

    /* renamed from: k */
    public InterfaceC4589r m4859k() {
        return this.f5163e;
    }

    /* renamed from: l */
    public Executor m4860l() {
        return this.f5160b;
    }

    /* renamed from: m */
    public AbstractC4594w m4861m() {
        return this.f5161c;
    }
}
