package gi;

import fi.C4885x;
import org.jetbrains.annotations.NotNull;
import p172jh.C5392k;
import p172jh.C5393l;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p252oh.C6976c;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;
import p372vh.C9375n;
import ph.C7720g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gi/b.class
 */
/* renamed from: gi.b */
/* loaded from: combined.jar:classes2.jar:gi/b.class */
public final class C5014b {
    /* renamed from: a */
    public static final <T> void m25218a(@NotNull InterfaceC9196l<? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9196l, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        Object m26745a;
        InterfaceC6789d m33718a = C7720g.m33718a(interfaceC6789d);
        try {
            InterfaceC6792g mo22619b = interfaceC6789d.mo22619b();
            Object m24818c = C4885x.m24818c(mo22619b, null);
            try {
            } finally {
                C4885x.m24816a(mo22619b, m24818c);
            }
        } catch (Throwable th2) {
            C5392k.a aVar = C5392k.f30764b;
            m26745a = C5393l.m26745a(th2);
        }
        if (interfaceC9196l == null) {
            throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        m26745a = ((InterfaceC9196l) C9375n.m39544b(interfaceC9196l, 1)).mo6711d(m33718a);
        if (m26745a == C6976c.m32004d()) {
            return;
        }
        m33718a.mo22620c(C5392k.m26741a(m26745a));
    }

    /* renamed from: b */
    public static final <R, T> void m25219b(@NotNull InterfaceC9200p<? super R, ? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9200p, R r10, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        Object m26745a;
        InterfaceC6789d m33718a = C7720g.m33718a(interfaceC6789d);
        try {
            InterfaceC6792g mo22619b = interfaceC6789d.mo22619b();
            Object m24818c = C4885x.m24818c(mo22619b, null);
            try {
            } finally {
                C4885x.m24816a(mo22619b, m24818c);
            }
        } catch (Throwable th2) {
            C5392k.a aVar = C5392k.f30764b;
            m26745a = C5393l.m26745a(th2);
        }
        if (interfaceC9200p == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        m26745a = ((InterfaceC9200p) C9375n.m39544b(interfaceC9200p, 2)).mo4818m(r10, m33718a);
        if (m26745a == C6976c.m32004d()) {
            return;
        }
        m33718a.mo22620c(C5392k.m26741a(m26745a));
    }
}
