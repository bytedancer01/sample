package ma;

import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/mh.class
 */
/* renamed from: ma.mh */
/* loaded from: combined.jar:classes2.jar:ma/mh.class */
public final class C6275mh implements InterfaceC6171hi {

    /* renamed from: b */
    public static final InterfaceC6401sh f33892b = new C6233kh();

    /* renamed from: a */
    public final InterfaceC6401sh f33893a;

    public C6275mh() {
        InterfaceC6401sh interfaceC6401sh;
        C6232kg m29820c = C6232kg.m29820c();
        try {
            interfaceC6401sh = (InterfaceC6401sh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e10) {
            interfaceC6401sh = f33892b;
        }
        C6254lh c6254lh = new C6254lh(m29820c, interfaceC6401sh);
        Charset charset = C6482wg.f34130a;
        this.f33893a = c6254lh;
    }

    /* renamed from: b */
    public static boolean m29852b(InterfaceC6380rh interfaceC6380rh) {
        return interfaceC6380rh.mo29573l() == 1;
    }

    @Override // ma.InterfaceC6171hi
    /* renamed from: a */
    public final InterfaceC6150gi mo29665a(Class cls) {
        C6543zh m29433a;
        AbstractC6504xi m29707W;
        AbstractC6085dg abstractC6085dg;
        C6338ph m29986a;
        AbstractC6085dg abstractC6085dg2;
        AbstractC6504xi abstractC6504xi;
        AbstractC6191ih abstractC6191ih;
        AbstractC6504xi m29706V;
        AbstractC6085dg m29610a;
        C6192ii.m29710c(cls);
        InterfaceC6380rh mo29821a = this.f33893a.mo29821a(cls);
        if (mo29821a.mo29572k()) {
            if (AbstractC6295ng.class.isAssignableFrom(cls)) {
                m29706V = C6192ii.m29708a();
                m29610a = C6127fg.m29611b();
            } else {
                m29706V = C6192ii.m29706V();
                m29610a = C6127fg.m29610a();
            }
            return C6523yh.m30174h(m29706V, m29610a, mo29821a.zza());
        }
        if (AbstractC6295ng.class.isAssignableFrom(cls)) {
            boolean m29852b = m29852b(mo29821a);
            m29433a = C6024ai.m29434b();
            abstractC6191ih = AbstractC6191ih.m29684d();
            abstractC6504xi = C6192ii.m29708a();
            AbstractC6085dg m29611b = m29852b ? C6127fg.m29611b() : null;
            m29986a = C6359qh.m29987b();
            abstractC6085dg2 = m29611b;
        } else {
            boolean m29852b2 = m29852b(mo29821a);
            m29433a = C6024ai.m29433a();
            AbstractC6191ih m29683c = AbstractC6191ih.m29683c();
            if (m29852b2) {
                m29707W = C6192ii.m29706V();
                abstractC6085dg = C6127fg.m29610a();
            } else {
                m29707W = C6192ii.m29707W();
                abstractC6085dg = null;
            }
            m29986a = C6359qh.m29986a();
            abstractC6085dg2 = abstractC6085dg;
            abstractC6504xi = m29707W;
            abstractC6191ih = m29683c;
        }
        return C6503xh.m30127p(cls, mo29821a, m29433a, abstractC6191ih, abstractC6504xi, abstractC6085dg2, m29986a);
    }
}
