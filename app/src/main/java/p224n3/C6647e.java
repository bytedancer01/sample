package p224n3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p033c3.C0986f;
import p141i3.InterfaceC5168a;
import p141i3.InterfaceC5169b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n3/e.class
 */
/* renamed from: n3.e */
/* loaded from: combined.jar:classes1.jar:n3/e.class */
public final class C6647e implements InterfaceC5169b {

    /* renamed from: a */
    public final List<InterfaceC5168a> f34676a;

    /* renamed from: b */
    public final int f34677b;

    public C6647e(List<InterfaceC5168a> list) {
        this(list, 0);
    }

    public C6647e(List<InterfaceC5168a> list, int i10) {
        if (i10 > list.size()) {
            throw new IllegalArgumentException();
        }
        this.f34676a = new ArrayList((Collection) C0986f.m5892c(list, "interceptors == null"));
        this.f34677b = i10;
    }

    @Override // p141i3.InterfaceC5169b
    /* renamed from: a */
    public void mo25821a(InterfaceC5168a.c cVar, Executor executor, InterfaceC5168a.a aVar) {
        if (this.f34677b >= this.f34676a.size()) {
            throw new IllegalStateException();
        }
        this.f34676a.get(this.f34677b).interceptAsync(cVar, new C6647e(this.f34676a, this.f34677b + 1), executor, aVar);
    }

    @Override // p141i3.InterfaceC5169b
    public void dispose() {
        Iterator<InterfaceC5168a> it = this.f34676a.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }
}
