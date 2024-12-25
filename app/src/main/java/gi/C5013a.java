package gi;

import fi.C4867f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p252oh.C6975b;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gi/a.class
 */
/* renamed from: gi.a */
/* loaded from: combined.jar:classes2.jar:gi/a.class */
public final class C5013a {
    /* renamed from: a */
    public static final void m25214a(@NotNull InterfaceC6789d<? super C5398q> interfaceC6789d, @NotNull InterfaceC6789d<?> interfaceC6789d2) {
        try {
            InterfaceC6789d m32003c = C6975b.m32003c(interfaceC6789d);
            C5392k.a aVar = C5392k.f30764b;
            C4867f.m24751c(m32003c, C5392k.m26741a(C5398q.f30770a), null, 2, null);
        } catch (Throwable th2) {
            C5392k.a aVar2 = C5392k.f30764b;
            interfaceC6789d2.mo22620c(C5392k.m26741a(C5393l.m26745a(th2)));
        }
    }

    /* renamed from: b */
    public static final <T> void m25215b(@NotNull InterfaceC9196l<? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9196l, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        try {
            InterfaceC6789d m32003c = C6975b.m32003c(C6975b.m32001a(interfaceC9196l, interfaceC6789d));
            C5392k.a aVar = C5392k.f30764b;
            C4867f.m24751c(m32003c, C5392k.m26741a(C5398q.f30770a), null, 2, null);
        } catch (Throwable th2) {
            C5392k.a aVar2 = C5392k.f30764b;
            interfaceC6789d.mo22620c(C5392k.m26741a(C5393l.m26745a(th2)));
        }
    }

    /* renamed from: c */
    public static final <R, T> void m25216c(@NotNull InterfaceC9200p<? super R, ? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9200p, R r10, @NotNull InterfaceC6789d<? super T> interfaceC6789d, @Nullable InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        try {
            InterfaceC6789d m32003c = C6975b.m32003c(C6975b.m32002b(interfaceC9200p, r10, interfaceC6789d));
            C5392k.a aVar = C5392k.f30764b;
            C4867f.m24750b(m32003c, C5392k.m26741a(C5398q.f30770a), interfaceC9196l);
        } catch (Throwable th2) {
            C5392k.a aVar2 = C5392k.f30764b;
            interfaceC6789d.mo22620c(C5392k.m26741a(C5393l.m26745a(th2)));
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m25217d(InterfaceC9200p interfaceC9200p, Object obj, InterfaceC6789d interfaceC6789d, InterfaceC9196l interfaceC9196l, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC9196l = null;
        }
        m25216c(interfaceC9200p, obj, interfaceC6789d, interfaceC9196l);
    }
}
