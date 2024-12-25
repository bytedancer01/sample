package p088f1;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.AbstractC0563b0;
import androidx.lifecycle.C0565c0;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.C0585s;
import androidx.lifecycle.InterfaceC0579m;
import androidx.lifecycle.InterfaceC0586t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p088f1.AbstractC4749a;
import p107g1.C4931c;
import p221n0.C6610b;
import p294r.C7937j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f1/b.class
 */
/* renamed from: f1.b */
/* loaded from: combined.jar:classes1.jar:f1/b.class */
public class C4750b extends AbstractC4749a {

    /* renamed from: c */
    public static boolean f27996c;

    /* renamed from: a */
    public final InterfaceC0579m f27997a;

    /* renamed from: b */
    public final c f27998b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f1/b$a.class
     */
    /* renamed from: f1.b$a */
    /* loaded from: combined.jar:classes1.jar:f1/b$a.class */
    public static class a<D> extends C0585s<D> implements C4931c.c<D> {

        /* renamed from: l */
        public final int f27999l;

        /* renamed from: m */
        public final Bundle f28000m;

        /* renamed from: n */
        public final C4931c<D> f28001n;

        /* renamed from: o */
        public InterfaceC0579m f28002o;

        /* renamed from: p */
        public b<D> f28003p;

        /* renamed from: q */
        public C4931c<D> f28004q;

        public a(int i10, Bundle bundle, C4931c<D> c4931c, C4931c<D> c4931c2) {
            this.f27999l = i10;
            this.f28000m = bundle;
            this.f28001n = c4931c;
            this.f28004q = c4931c2;
            c4931c.m24908t(i10, this);
        }

        @Override // p107g1.C4931c.c
        /* renamed from: a */
        public void mo24053a(C4931c<D> c4931c, D d10) {
            if (C4750b.f27996c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo3106n(d10);
                return;
            }
            if (C4750b.f27996c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo3104l(d10);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: j */
        public void mo3102j() {
            if (C4750b.f27996c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f28001n.m24911w();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        public void mo3103k() {
            if (C4750b.f27996c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f28001n.m24912x();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: m */
        public void mo3105m(InterfaceC0586t<? super D> interfaceC0586t) {
            super.mo3105m(interfaceC0586t);
            this.f28002o = null;
            this.f28003p = null;
        }

        @Override // androidx.lifecycle.C0585s, androidx.lifecycle.LiveData
        /* renamed from: n */
        public void mo3106n(D d10) {
            super.mo3106n(d10);
            C4931c<D> c4931c = this.f28004q;
            if (c4931c != null) {
                c4931c.m24909u();
                this.f28004q = null;
            }
        }

        /* renamed from: o */
        public C4931c<D> m24054o(boolean z10) {
            if (C4750b.f27996c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f28001n.m24897b();
            this.f28001n.m24896a();
            b<D> bVar = this.f28003p;
            if (bVar != null) {
                mo3105m(bVar);
                if (z10) {
                    bVar.m24061d();
                }
            }
            this.f28001n.m24914z(this);
            if ((bVar == null || bVar.m24060c()) && !z10) {
                return this.f28001n;
            }
            this.f28001n.m24909u();
            return this.f28004q;
        }

        /* renamed from: p */
        public void m24055p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f27999l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f28000m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f28001n);
            this.f28001n.mo24877g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f28003p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f28003p);
                this.f28003p.m24059b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m24056q().m24899d(m3098f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m3099g());
        }

        /* renamed from: q */
        public C4931c<D> m24056q() {
            return this.f28001n;
        }

        /* renamed from: r */
        public void m24057r() {
            InterfaceC0579m interfaceC0579m = this.f28002o;
            b<D> bVar = this.f28003p;
            if (interfaceC0579m == null || bVar == null) {
                return;
            }
            super.mo3105m(bVar);
            m3100h(interfaceC0579m, bVar);
        }

        /* renamed from: s */
        public C4931c<D> m24058s(InterfaceC0579m interfaceC0579m, AbstractC4749a.a<D> aVar) {
            b<D> bVar = new b<>(this.f28001n, aVar);
            m3100h(interfaceC0579m, bVar);
            b<D> bVar2 = this.f28003p;
            if (bVar2 != null) {
                mo3105m(bVar2);
            }
            this.f28002o = interfaceC0579m;
            this.f28003p = bVar;
            return this.f28001n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f27999l);
            sb2.append(" : ");
            C6610b.m30515a(this.f28001n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f1/b$b.class
     */
    /* renamed from: f1.b$b */
    /* loaded from: combined.jar:classes1.jar:f1/b$b.class */
    public static class b<D> implements InterfaceC0586t<D> {

        /* renamed from: a */
        public final C4931c<D> f28005a;

        /* renamed from: b */
        public final AbstractC4749a.a<D> f28006b;

        /* renamed from: c */
        public boolean f28007c = false;

        public b(C4931c<D> c4931c, AbstractC4749a.a<D> aVar) {
            this.f28005a = c4931c;
            this.f28006b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC0586t
        /* renamed from: a */
        public void mo2031a(D d10) {
            if (C4750b.f27996c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f28005a + ": " + this.f28005a.m24899d(d10));
            }
            this.f28006b.mo24049a(this.f28005a, d10);
            this.f28007c = true;
        }

        /* renamed from: b */
        public void m24059b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f28007c);
        }

        /* renamed from: c */
        public boolean m24060c() {
            return this.f28007c;
        }

        /* renamed from: d */
        public void m24061d() {
            if (this.f28007c) {
                if (C4750b.f27996c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f28005a);
                }
                this.f28006b.mo24050b(this.f28005a);
            }
        }

        public String toString() {
            return this.f28006b.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f1/b$c.class
     */
    /* renamed from: f1.b$c */
    /* loaded from: combined.jar:classes1.jar:f1/b$c.class */
    public static class c extends AbstractC0563b0 {

        /* renamed from: e */
        public static final C0565c0.b f28008e = new a();

        /* renamed from: c */
        public C7937j<a> f28009c = new C7937j<>();

        /* renamed from: d */
        public boolean f28010d = false;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:f1/b$c$a.class
         */
        /* renamed from: f1.b$c$a */
        /* loaded from: combined.jar:classes1.jar:f1/b$c$a.class */
        public static final class a implements C0565c0.b {
            @Override // androidx.lifecycle.C0565c0.b
            /* renamed from: a */
            public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
                return new c();
            }
        }

        /* renamed from: h */
        public static c m24062h(C0567d0 c0567d0) {
            return (c) new C0565c0(c0567d0, f28008e).m3136a(c.class);
        }

        @Override // androidx.lifecycle.AbstractC0563b0
        /* renamed from: d */
        public void mo2287d() {
            super.mo2287d();
            int m34454l = this.f28009c.m34454l();
            for (int i10 = 0; i10 < m34454l; i10++) {
                this.f28009c.m34455m(i10).m24054o(true);
            }
            this.f28009c.m34445b();
        }

        /* renamed from: f */
        public void m24063f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f28009c.m34454l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f28009c.m34454l(); i10++) {
                    a m34455m = this.f28009c.m34455m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f28009c.m34451i(i10));
                    printWriter.print(": ");
                    printWriter.println(m34455m.toString());
                    m34455m.m24055p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        public void m24064g() {
            this.f28010d = false;
        }

        /* renamed from: i */
        public <D> a<D> m24065i(int i10) {
            return this.f28009c.m34448e(i10);
        }

        /* renamed from: j */
        public boolean m24066j() {
            return this.f28010d;
        }

        /* renamed from: k */
        public void m24067k() {
            int m34454l = this.f28009c.m34454l();
            for (int i10 = 0; i10 < m34454l; i10++) {
                this.f28009c.m34455m(i10).m24057r();
            }
        }

        /* renamed from: l */
        public void m24068l(int i10, a aVar) {
            this.f28009c.m34452j(i10, aVar);
        }

        /* renamed from: m */
        public void m24069m() {
            this.f28010d = true;
        }
    }

    public C4750b(InterfaceC0579m interfaceC0579m, C0567d0 c0567d0) {
        this.f27997a = interfaceC0579m;
        this.f27998b = c.m24062h(c0567d0);
    }

    @Override // p088f1.AbstractC4749a
    @Deprecated
    /* renamed from: a */
    public void mo24046a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f27998b.m24063f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p088f1.AbstractC4749a
    /* renamed from: c */
    public <D> C4931c<D> mo24047c(int i10, Bundle bundle, AbstractC4749a.a<D> aVar) {
        if (this.f27998b.m24066j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> m24065i = this.f27998b.m24065i(i10);
        if (f27996c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (m24065i == null) {
            return m24052e(i10, bundle, aVar, null);
        }
        if (f27996c) {
            Log.v("LoaderManager", "  Re-using existing loader " + m24065i);
        }
        return m24065i.m24058s(this.f27997a, aVar);
    }

    @Override // p088f1.AbstractC4749a
    /* renamed from: d */
    public void mo24048d() {
        this.f27998b.m24067k();
    }

    /* renamed from: e */
    public final <D> C4931c<D> m24052e(int i10, Bundle bundle, AbstractC4749a.a<D> aVar, C4931c<D> c4931c) {
        try {
            this.f27998b.m24069m();
            C4931c<D> mo24051c = aVar.mo24051c(i10, bundle);
            if (mo24051c == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (mo24051c.getClass().isMemberClass() && !Modifier.isStatic(mo24051c.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo24051c);
            }
            a aVar2 = new a(i10, bundle, mo24051c, c4931c);
            if (f27996c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f27998b.m24068l(i10, aVar2);
            this.f27998b.m24064g();
            return aVar2.m24058s(this.f27997a, aVar);
        } catch (Throwable th2) {
            this.f27998b.m24064g();
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C6610b.m30515a(this.f27997a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
