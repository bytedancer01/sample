package dj;

import java.lang.reflect.Method;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.C4488k;
import p067di.InterfaceC4485j;
import p172jh.C5385d;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p252oh.C6975b;
import p252oh.C6976c;
import p356uh.InterfaceC9196l;
import p372vh.AbstractC9368g;
import p372vh.C9367f;
import ph.AbstractC7716c;
import ph.C7720g;
import ph.InterfaceC7718e;

/* renamed from: dj.m */
/* loaded from: combined.jar:classes3.jar:dj/m.class */
public final class C4546m {

    /* renamed from: dj.m$a */
    /* loaded from: combined.jar:classes3.jar:dj/m$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9196l<Throwable, C5398q> {

        /* renamed from: c */
        public final InterfaceC4535b f27000c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4535b interfaceC4535b) {
            super(1);
            this.f27000c = interfaceC4535b;
        }

        /* renamed from: a */
        public final void m22889a(@Nullable Throwable th2) {
            this.f27000c.cancel();
        }

        @Override // p356uh.InterfaceC9196l
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
            m22889a(th2);
            return C5398q.f30770a;
        }
    }

    /* renamed from: dj.m$b */
    /* loaded from: combined.jar:classes3.jar:dj/m$b.class */
    public static final class b extends AbstractC9368g implements InterfaceC9196l<Throwable, C5398q> {

        /* renamed from: c */
        public final InterfaceC4535b f27001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4535b interfaceC4535b) {
            super(1);
            this.f27001c = interfaceC4535b;
        }

        /* renamed from: a */
        public final void m22890a(@Nullable Throwable th2) {
            this.f27001c.cancel();
        }

        @Override // p356uh.InterfaceC9196l
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
            m22890a(th2);
            return C5398q.f30770a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: dj.m$c */
    /* loaded from: combined.jar:classes3.jar:dj/m$c.class */
    public static final class c<T> implements InterfaceC4537d<T> {

        /* renamed from: a */
        public final InterfaceC4485j f27002a;

        public c(InterfaceC4485j interfaceC4485j) {
            this.f27002a = interfaceC4485j;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull C4554u<T> c4554u) {
            InterfaceC4485j interfaceC4485j;
            Object m26745a;
            C9367f.m39527f(interfaceC4535b, "call");
            C9367f.m39527f(c4554u, "response");
            if (c4554u.m22954d()) {
                m26745a = c4554u.m22952a();
                if (m26745a == null) {
                    Object m26879i = interfaceC4535b.request().m26879i(C4545l.class);
                    if (m26879i == null) {
                        C9367f.m39534m();
                    }
                    C9367f.m39523b(m26879i, "call.request().tag(Invocation::class.java)!!");
                    Method m22884a = ((C4545l) m26879i).m22884a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    C9367f.m39523b(m22884a, "method");
                    Class<?> declaringClass = m22884a.getDeclaringClass();
                    C9367f.m39523b(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(m22884a.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    C5385d c5385d = new C5385d(sb2.toString());
                    interfaceC4485j = this.f27002a;
                    C5392k.a aVar = C5392k.f30764b;
                    m26745a = C5393l.m26745a(c5385d);
                } else {
                    interfaceC4485j = this.f27002a;
                }
            } else {
                interfaceC4485j = this.f27002a;
                C4543j c4543j = new C4543j(c4554u);
                C5392k.a aVar2 = C5392k.f30764b;
                m26745a = C5393l.m26745a(c4543j);
            }
            interfaceC4485j.mo22620c(C5392k.m26741a(m26745a));
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull Throwable th2) {
            C9367f.m39527f(interfaceC4535b, "call");
            C9367f.m39527f(th2, "t");
            InterfaceC4485j interfaceC4485j = this.f27002a;
            C5392k.a aVar = C5392k.f30764b;
            interfaceC4485j.mo22620c(C5392k.m26741a(C5393l.m26745a(th2)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: dj.m$d */
    /* loaded from: combined.jar:classes3.jar:dj/m$d.class */
    public static final class d<T> implements InterfaceC4537d<T> {

        /* renamed from: a */
        public final InterfaceC4485j f27003a;

        public d(InterfaceC4485j interfaceC4485j) {
            this.f27003a = interfaceC4485j;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull C4554u<T> c4554u) {
            InterfaceC4485j interfaceC4485j;
            Object m26745a;
            C9367f.m39527f(interfaceC4535b, "call");
            C9367f.m39527f(c4554u, "response");
            if (c4554u.m22954d()) {
                interfaceC4485j = this.f27003a;
                m26745a = c4554u.m22952a();
            } else {
                interfaceC4485j = this.f27003a;
                C4543j c4543j = new C4543j(c4554u);
                C5392k.a aVar = C5392k.f30764b;
                m26745a = C5393l.m26745a(c4543j);
            }
            interfaceC4485j.mo22620c(C5392k.m26741a(m26745a));
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull Throwable th2) {
            C9367f.m39527f(interfaceC4535b, "call");
            C9367f.m39527f(th2, "t");
            InterfaceC4485j interfaceC4485j = this.f27003a;
            C5392k.a aVar = C5392k.f30764b;
            interfaceC4485j.mo22620c(C5392k.m26741a(C5393l.m26745a(th2)));
        }
    }

    /* renamed from: dj.m$e */
    /* loaded from: combined.jar:classes3.jar:dj/m$e.class */
    public static final class e extends AbstractC9368g implements InterfaceC9196l<Throwable, C5398q> {

        /* renamed from: c */
        public final InterfaceC4535b f27004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4535b interfaceC4535b) {
            super(1);
            this.f27004c = interfaceC4535b;
        }

        /* renamed from: a */
        public final void m22891a(@Nullable Throwable th2) {
            this.f27004c.cancel();
        }

        @Override // p356uh.InterfaceC9196l
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
            m22891a(th2);
            return C5398q.f30770a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: dj.m$f */
    /* loaded from: combined.jar:classes3.jar:dj/m$f.class */
    public static final class f<T> implements InterfaceC4537d<T> {

        /* renamed from: a */
        public final InterfaceC4485j f27005a;

        public f(InterfaceC4485j interfaceC4485j) {
            this.f27005a = interfaceC4485j;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull C4554u<T> c4554u) {
            C9367f.m39527f(interfaceC4535b, "call");
            C9367f.m39527f(c4554u, "response");
            this.f27005a.mo22620c(C5392k.m26741a(c4554u));
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull Throwable th2) {
            C9367f.m39527f(interfaceC4535b, "call");
            C9367f.m39527f(th2, "t");
            InterfaceC4485j interfaceC4485j = this.f27005a;
            C5392k.a aVar = C5392k.f30764b;
            interfaceC4485j.mo22620c(C5392k.m26741a(C5393l.m26745a(th2)));
        }
    }

    /* renamed from: dj.m$g */
    /* loaded from: combined.jar:classes3.jar:dj/m$g.class */
    public static final class g implements Runnable {

        /* renamed from: b */
        public final InterfaceC6789d f27006b;

        /* renamed from: c */
        public final Exception f27007c;

        public g(InterfaceC6789d interfaceC6789d, Exception exc) {
            this.f27006b = interfaceC6789d;
            this.f27007c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC6789d m32003c = C6975b.m32003c(this.f27006b);
            Exception exc = this.f27007c;
            C5392k.a aVar = C5392k.f30764b;
            m32003c.mo22620c(C5392k.m26741a(C5393l.m26745a(exc)));
        }
    }

    @InterfaceC7718e(m33709c = "retrofit2.KotlinExtensions", m33710f = "KotlinExtensions.kt", m33711l = {113}, m33712m = "suspendAndThrow")
    /* renamed from: dj.m$h */
    /* loaded from: combined.jar:classes3.jar:dj/m$h.class */
    public static final class h extends AbstractC7716c {

        /* renamed from: e */
        public Object f27008e;

        /* renamed from: f */
        public int f27009f;

        /* renamed from: g */
        public Object f27010g;

        public h(InterfaceC6789d interfaceC6789d) {
            super(interfaceC6789d);
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public final Object mo4817k(@NotNull Object obj) {
            this.f27008e = obj;
            this.f27009f |= NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            return C4546m.m22888d(null, this);
        }
    }

    @Nullable
    /* renamed from: a */
    public static final <T> Object m22885a(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        C4488k c4488k = new C4488k(C6975b.m32003c(interfaceC6789d), 1);
        c4488k.mo22676e(new a(interfaceC4535b));
        interfaceC4535b.mo22862f(new c(c4488k));
        Object m22767u = c4488k.m22767u();
        if (m22767u == C6976c.m32004d()) {
            C7720g.m33720c(interfaceC6789d);
        }
        return m22767u;
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m22886b(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        C4488k c4488k = new C4488k(C6975b.m32003c(interfaceC6789d), 1);
        c4488k.mo22676e(new b(interfaceC4535b));
        interfaceC4535b.mo22862f(new d(c4488k));
        Object m22767u = c4488k.m22767u();
        if (m22767u == C6976c.m32004d()) {
            C7720g.m33720c(interfaceC6789d);
        }
        return m22767u;
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m22887c(@NotNull InterfaceC4535b<T> interfaceC4535b, @NotNull InterfaceC6789d<? super C4554u<T>> interfaceC6789d) {
        C4488k c4488k = new C4488k(C6975b.m32003c(interfaceC6789d), 1);
        c4488k.mo22676e(new e(interfaceC4535b));
        interfaceC4535b.mo22862f(new f(c4488k));
        Object m22767u = c4488k.m22767u();
        if (m22767u == C6976c.m32004d()) {
            C7720g.m33720c(interfaceC6789d);
        }
        return m22767u;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m22888d(@org.jetbrains.annotations.NotNull java.lang.Exception r7, @org.jetbrains.annotations.NotNull p233nh.InterfaceC6789d<?> r8) {
        /*
            r0 = r8
            boolean r0 = r0 instanceof dj.C4546m.h
            if (r0 == 0) goto L25
            r0 = r8
            dj.m$h r0 = (dj.C4546m.h) r0
            r10 = r0
            r0 = r10
            int r0 = r0.f27009f
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.f27009f = r1
            r0 = r10
            r8 = r0
            goto L2e
        L25:
            dj.m$h r0 = new dj.m$h
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r8 = r0
        L2e:
            r0 = r8
            java.lang.Object r0 = r0.f27008e
            r10 = r0
            java.lang.Object r0 = p252oh.C6976c.m32004d()
            r11 = r0
            r0 = r8
            int r0 = r0.f27009f
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L5f
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L55
            r0 = r8
            java.lang.Object r0 = r0.f27010g
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7 = r0
            r0 = r10
            p172jh.C5393l.m26746b(r0)
            goto L9a
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r10
            p172jh.C5393l.m26746b(r0)
            r0 = r8
            r1 = r7
            r0.f27010g = r1
            r0 = r8
            r1 = 1
            r0.f27009f = r1
            di.b0 r0 = p067di.C4498n0.m22791a()
            r1 = r8
            nh.g r1 = r1.mo22619b()
            dj.m$g r2 = new dj.m$g
            r3 = r2
            r4 = r8
            r5 = r7
            r3.<init>(r4, r5)
            r0.mo22632A0(r1, r2)
            java.lang.Object r0 = p252oh.C6976c.m32004d()
            r7 = r0
            r0 = r7
            java.lang.Object r1 = p252oh.C6976c.m32004d()
            if (r0 != r1) goto L91
            r0 = r8
            ph.C7720g.m33720c(r0)
        L91:
            r0 = r7
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            jh.q r0 = p172jh.C5398q.f30770a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C4546m.m22888d(java.lang.Exception, nh.d):java.lang.Object");
    }
}
