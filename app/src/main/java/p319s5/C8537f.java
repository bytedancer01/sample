package p319s5;

import java.io.IOException;
import p006a5.C0072b;
import p397x4.AbstractC9654d;
import p397x4.AbstractC9656f;
import p397x4.AbstractC9659i;
import p397x4.C9655e;
import p397x4.EnumC9658h;
import p417y4.AbstractC9824a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s5/f.class
 */
/* renamed from: s5.f */
/* loaded from: combined.jar:classes1.jar:s5/f.class */
public class C8537f extends AbstractC9654d {

    /* renamed from: f */
    public static final int f39933f = AbstractC9654d.a.collectDefaults();

    /* renamed from: b */
    public AbstractC9659i f39934b;

    /* renamed from: c */
    public boolean f39935c;

    /* renamed from: d */
    public boolean f39936d;

    /* renamed from: e */
    public boolean f39937e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s5/f$a.class
     */
    /* renamed from: s5.f$a */
    /* loaded from: combined.jar:classes1.jar:s5/f$a.class */
    public static final class a extends AbstractC9824a {

        /* renamed from: d */
        public AbstractC9659i f39938d;

        /* renamed from: e */
        public final boolean f39939e;

        /* renamed from: f */
        public final boolean f39940f;

        /* renamed from: g */
        public final boolean f39941g;

        /* renamed from: h */
        public int f39942h;

        /* renamed from: i */
        public C0072b f39943i;

        /* renamed from: j */
        public boolean f39944j;

        /* renamed from: k */
        public C9655e f39945k;

        public a(b bVar, AbstractC9659i abstractC9659i, boolean z10, boolean z11) {
            super(0);
            this.f39945k = null;
            this.f39942h = -1;
            this.f39938d = abstractC9659i;
            this.f39943i = C0072b.m271b(null);
            this.f39939e = z10;
            this.f39940f = z11;
            this.f39941g = z10 | z11;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f39944j) {
                return;
            }
            this.f39944j = true;
        }

        @Override // p397x4.AbstractC9656f
        /* renamed from: f */
        public String mo36762f() {
            EnumC9658h enumC9658h = this.f45157c;
            return ((enumC9658h == EnumC9658h.START_OBJECT || enumC9658h == EnumC9658h.START_ARRAY) ? this.f39943i.m273d() : this.f39943i).m272c();
        }

        @Override // p397x4.AbstractC9656f
        /* renamed from: l */
        public EnumC9658h mo36763l() {
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s5/f$b.class
     */
    /* renamed from: s5.f$b */
    /* loaded from: combined.jar:classes1.jar:s5/f$b.class */
    public static final class b {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39935c = true;
    }

    /* renamed from: f */
    public final void m36759f(StringBuilder sb2) {
        throw null;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    /* renamed from: l */
    public AbstractC9656f m36760l() {
        return m36761o(this.f39934b);
    }

    /* renamed from: o */
    public AbstractC9656f m36761o(AbstractC9659i abstractC9659i) {
        return new a(null, abstractC9659i, this.f39936d, this.f39937e);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[TokenBuffer: ");
        AbstractC9656f m36760l = m36760l();
        int i10 = 0;
        boolean z10 = this.f39936d || this.f39937e;
        while (true) {
            try {
                EnumC9658h mo36763l = m36760l.mo36763l();
                if (mo36763l == null) {
                    break;
                }
                if (z10) {
                    m36759f(sb2);
                }
                if (i10 < 100) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(mo36763l.toString());
                    if (mo36763l == EnumC9658h.FIELD_NAME) {
                        sb2.append('(');
                        sb2.append(m36760l.mo36762f());
                        sb2.append(')');
                    }
                }
                i10++;
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (i10 >= 100) {
            sb2.append(" ... (truncated ");
            sb2.append(i10 - 100);
            sb2.append(" entries)");
        }
        sb2.append(']');
        return sb2.toString();
    }
}
