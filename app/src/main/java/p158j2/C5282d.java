package p158j2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p071e2.AbstractC4582k;
import p177k2.AbstractC5456c;
import p177k2.C5454a;
import p177k2.C5455b;
import p177k2.C5457d;
import p177k2.C5458e;
import p177k2.C5459f;
import p177k2.C5460g;
import p177k2.C5461h;
import p223n2.C6636p;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j2/d.class
 */
/* renamed from: j2.d */
/* loaded from: combined.jar:classes1.jar:j2/d.class */
public class C5282d implements AbstractC5456c.a {

    /* renamed from: d */
    public static final String f30324d = AbstractC4582k.m23128f("WorkConstraintsTracker");

    /* renamed from: a */
    public final InterfaceC5281c f30325a;

    /* renamed from: b */
    public final AbstractC5456c<?>[] f30326b;

    /* renamed from: c */
    public final Object f30327c;

    public C5282d(Context context, InterfaceC7748a interfaceC7748a, InterfaceC5281c interfaceC5281c) {
        Context applicationContext = context.getApplicationContext();
        this.f30325a = interfaceC5281c;
        this.f30326b = new AbstractC5456c[]{new C5454a(applicationContext, interfaceC7748a), new C5455b(applicationContext, interfaceC7748a), new C5461h(applicationContext, interfaceC7748a), new C5457d(applicationContext, interfaceC7748a), new C5460g(applicationContext, interfaceC7748a), new C5459f(applicationContext, interfaceC7748a), new C5458e(applicationContext, interfaceC7748a)};
        this.f30327c = new Object();
    }

    @Override // p177k2.AbstractC5456c.a
    /* renamed from: a */
    public void mo26366a(List<String> list) {
        synchronized (this.f30327c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (m26368c(str)) {
                    AbstractC4582k.m23126c().mo23129a(f30324d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            InterfaceC5281c interfaceC5281c = this.f30325a;
            if (interfaceC5281c != null) {
                interfaceC5281c.mo4945f(arrayList);
            }
        }
    }

    @Override // p177k2.AbstractC5456c.a
    /* renamed from: b */
    public void mo26367b(List<String> list) {
        synchronized (this.f30327c) {
            InterfaceC5281c interfaceC5281c = this.f30325a;
            if (interfaceC5281c != null) {
                interfaceC5281c.mo4942b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean m26368c(String str) {
        synchronized (this.f30327c) {
            for (AbstractC5456c<?> abstractC5456c : this.f30326b) {
                if (abstractC5456c.m27214d(str)) {
                    AbstractC4582k.m23126c().mo23129a(f30324d, String.format("Work %s constrained by %s", str, abstractC5456c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void m26369d(Iterable<C6636p> iterable) {
        synchronized (this.f30327c) {
            for (AbstractC5456c<?> abstractC5456c : this.f30326b) {
                abstractC5456c.m27217g(null);
            }
            for (AbstractC5456c<?> abstractC5456c2 : this.f30326b) {
                abstractC5456c2.m27215e(iterable);
            }
            for (AbstractC5456c<?> abstractC5456c3 : this.f30326b) {
                abstractC5456c3.m27217g(this);
            }
        }
    }

    /* renamed from: e */
    public void m26370e() {
        synchronized (this.f30327c) {
            for (AbstractC5456c<?> abstractC5456c : this.f30326b) {
                abstractC5456c.m27216f();
            }
        }
    }
}
