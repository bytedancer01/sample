package fi;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4507q0;
import p067di.C4459a0;
import p067di.C4517t1;
import p067di.C4523v1;
import p067di.C4532z;
import p067di.InterfaceC4466c1;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9196l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/f.class
 */
/* renamed from: fi.f */
/* loaded from: combined.jar:classes2.jar:fi/f.class */
public final class C4867f {

    /* renamed from: a */
    @NotNull
    public static final C4881t f28556a = new C4881t("UNDEFINED");

    /* renamed from: b */
    @NotNull
    public static final C4881t f28557b = new C4881t("REUSABLE_CLAIMED");

    /* renamed from: b */
    public static final <T> void m24750b(@NotNull InterfaceC6789d<? super T> interfaceC6789d, @NotNull Object obj, @Nullable InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        boolean z10;
        if (!(interfaceC6789d instanceof C4866e)) {
            interfaceC6789d.mo22620c(obj);
            return;
        }
        C4866e c4866e = (C4866e) interfaceC6789d;
        Object m22851c = C4532z.m22851c(obj, interfaceC9196l);
        if (c4866e.f28552e.mo22633B0(c4866e.mo22619b())) {
            c4866e.f28554g = m22851c;
            c4866e.f26912d = 1;
            c4866e.f28552e.mo22632A0(c4866e.mo22619b(), c4866e);
            return;
        }
        AbstractC4507q0 m22835a = C4517t1.f26935a.m22835a();
        if (m22835a.m22799I0()) {
            c4866e.f28554g = m22851c;
            c4866e.f26912d = 1;
            m22835a.m22796E0(c4866e);
            return;
        }
        m22835a.m22798G0(true);
        try {
            InterfaceC4466c1 interfaceC4466c1 = (InterfaceC4466c1) c4866e.mo22619b().get(InterfaceC4466c1.f26879b0);
            if (interfaceC4466c1 == null || interfaceC4466c1.isActive()) {
                z10 = false;
            } else {
                CancellationException mo22640l = interfaceC4466c1.mo22640l();
                c4866e.mo22752d(m22851c, mo22640l);
                C5392k.a aVar = C5392k.f30764b;
                c4866e.mo22620c(C5392k.m26741a(C5393l.m26745a(mo22640l)));
                z10 = true;
            }
            if (!z10) {
                InterfaceC6789d<T> interfaceC6789d2 = c4866e.f28553f;
                Object obj2 = c4866e.f28555h;
                InterfaceC6792g mo22619b = interfaceC6789d2.mo22619b();
                Object m24818c = C4885x.m24818c(mo22619b, obj2);
                C4523v1<?> m22630e = m24818c != C4885x.f28587a ? C4459a0.m22630e(interfaceC6789d2, mo22619b, m24818c) : null;
                try {
                    c4866e.f28553f.mo22620c(obj);
                    C5398q c5398q = C5398q.f30770a;
                    if (m22630e == null || m22630e.m22847t0()) {
                        C4885x.m24816a(mo22619b, m24818c);
                    }
                } catch (Throwable th2) {
                    if (m22630e == null || m22630e.m22847t0()) {
                        C4885x.m24816a(mo22619b, m24818c);
                    }
                    throw th2;
                }
            }
            do {
            } while (m22835a.m22801K0());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m24751c(InterfaceC6789d interfaceC6789d, Object obj, InterfaceC9196l interfaceC9196l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC9196l = null;
        }
        m24750b(interfaceC6789d, obj, interfaceC9196l);
    }
}
