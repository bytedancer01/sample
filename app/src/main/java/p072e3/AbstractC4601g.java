package p072e3;

import p033c3.AbstractC0984d;
import p033c3.InterfaceC0983c;
import p072e3.AbstractC4600f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/g.class
 */
/* renamed from: e3.g */
/* loaded from: combined.jar:classes1.jar:e3/g.class */
public abstract class AbstractC4601g<T extends AbstractC4600f> {

    /* renamed from: a */
    public AbstractC0984d<AbstractC4601g> f27254a = AbstractC0984d.m5887a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/g$a.class
     */
    /* renamed from: e3.g$a */
    /* loaded from: combined.jar:classes1.jar:e3/g$a.class */
    public class a implements InterfaceC0983c<AbstractC4601g, AbstractC4600f> {

        /* renamed from: a */
        public final C4604j f27255a;

        /* renamed from: b */
        public final AbstractC4601g f27256b;

        public a(AbstractC4601g abstractC4601g, C4604j c4604j) {
            this.f27256b = abstractC4601g;
            this.f27255a = c4604j;
        }

        @Override // p033c3.InterfaceC0983c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC4600f apply(AbstractC4601g abstractC4601g) {
            return abstractC4601g.m23199b(this.f27255a);
        }
    }

    /* renamed from: a */
    public abstract T mo23198a(C4604j c4604j);

    /* renamed from: b */
    public final AbstractC4600f m23199b(C4604j c4604j) {
        return this.f27254a.mo5882f() ? mo23198a(c4604j).m23190a((AbstractC4600f) this.f27254a.mo5883g(new a(this, c4604j)).mo5881e()) : mo23198a(c4604j);
    }
}
