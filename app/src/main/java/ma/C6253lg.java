package ma;

import ma.AbstractC6295ng;
import ma.C6253lg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/lg.class
 */
/* renamed from: ma.lg */
/* loaded from: combined.jar:classes2.jar:ma/lg.class */
public class C6253lg<MessageType extends AbstractC6295ng<MessageType, BuilderType>, BuilderType extends C6253lg<MessageType, BuilderType>> extends AbstractC6084df<MessageType, BuilderType> {

    /* renamed from: b */
    public final AbstractC6295ng f33876b;

    /* renamed from: c */
    public AbstractC6295ng f33877c;

    public C6253lg(MessageType messagetype) {
        this.f33876b = messagetype;
        if (messagetype.m29912l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f33877c = messagetype.m29918u();
    }

    /* renamed from: a */
    public static void m29834a(Object obj, Object obj2) {
        C6066ci.m29511a().m29512b(obj.getClass()).mo29647f(obj, obj2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6253lg clone() {
        C6253lg c6253lg = (C6253lg) this.f33876b.mo29386o(5, null, null);
        c6253lg.f33877c = mo29841q();
        return c6253lg;
    }

    /* renamed from: c */
    public final C6253lg m29836c(AbstractC6295ng abstractC6295ng) {
        if (!this.f33876b.equals(abstractC6295ng)) {
            if (!this.f33877c.m29912l()) {
                m29840k();
            }
            m29834a(this.f33877c, abstractC6295ng);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (r0 != false) goto L13;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType m29837d() {
        /*
            r5 = this;
            r0 = r5
            ma.ng r0 = r0.mo29841q()
            r9 = r0
            r0 = r9
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Object r0 = r0.mo29386o(r1, r2, r3)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r6 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1d
            goto L4e
        L1d:
            r0 = r6
            if (r0 == 0) goto L51
            ma.ci r0 = ma.C6066ci.m29511a()
            r1 = r9
            java.lang.Class r1 = r1.getClass()
            ma.gi r0 = r0.m29512b(r1)
            r1 = r9
            boolean r0 = r0.mo29648g(r1)
            r7 = r0
            r0 = 1
            r1 = r7
            if (r0 == r1) goto L3e
            r0 = 0
            r8 = r0
            goto L41
        L3e:
            r0 = r9
            r8 = r0
        L41:
            r0 = r9
            r1 = 2
            r2 = r8
            r3 = 0
            java.lang.Object r0 = r0.mo29386o(r1, r2, r3)
            r0 = r7
            if (r0 == 0) goto L51
        L4e:
            r0 = r9
            return r0
        L51:
            ma.wi r0 = new ma.wi
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6253lg.m29837d():ma.ng");
    }

    @Override // ma.InterfaceC6422th
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType mo29841q() {
        if (!this.f33877c.m29912l()) {
            return (MessageType) this.f33877c;
        }
        this.f33877c.m29908f();
        return (MessageType) this.f33877c;
    }

    /* renamed from: j */
    public final void m29839j() {
        if (this.f33877c.m29912l()) {
            return;
        }
        m29840k();
    }

    /* renamed from: k */
    public void m29840k() {
        AbstractC6295ng m29918u = this.f33876b.m29918u();
        m29834a(m29918u, this.f33877c);
        this.f33877c = m29918u;
    }
}
