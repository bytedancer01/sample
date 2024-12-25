package p169jd;

import java.util.Iterator;
import java.util.Set;
import p287qc.C7882d;
import p287qc.C7896q;
import p287qc.InterfaceC7884e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jd/c.class
 */
/* renamed from: jd.c */
/* loaded from: combined.jar:classes2.jar:jd/c.class */
public class C5358c implements InterfaceC5364i {

    /* renamed from: a */
    public final String f30673a;

    /* renamed from: b */
    public final C5359d f30674b;

    public C5358c(Set<AbstractC5361f> set, C5359d c5359d) {
        this.f30673a = m26657d(set);
        this.f30674b = c5359d;
    }

    /* renamed from: b */
    public static C7882d<InterfaceC5364i> m26655b() {
        return C7882d.m34166a(InterfaceC5364i.class).m34181b(C7896q.m34236j(AbstractC5361f.class)).m34185f(C5357b.m26654b()).m34183d();
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC5364i m26656c(InterfaceC7884e interfaceC7884e) {
        return new C5358c(interfaceC7884e.mo34154b(AbstractC5361f.class), C5359d.m26659a());
    }

    /* renamed from: d */
    public static String m26657d(Set<AbstractC5361f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC5361f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC5361f next = it.next();
            sb2.append(next.mo26652b());
            sb2.append('/');
            sb2.append(next.mo26653c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p169jd.InterfaceC5364i
    /* renamed from: a */
    public String mo26658a() {
        if (this.f30674b.m26660b().isEmpty()) {
            return this.f30673a;
        }
        return this.f30673a + ' ' + m26657d(this.f30674b.m26660b());
    }
}
