package p300r5;

import p074e5.AbstractC4631h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r5/b.class
 */
/* renamed from: r5.b */
/* loaded from: combined.jar:classes1.jar:r5/b.class */
public class C7960b extends AbstractC7961c {
    public C7960b(Class<?> cls) {
        this(cls, C7962d.m34519a(), null, null);
    }

    public C7960b(Class<?> cls, C7962d c7962d, AbstractC4631h abstractC4631h, AbstractC4631h[] abstractC4631hArr) {
        this(cls, c7962d, abstractC4631h, abstractC4631hArr, null, null, false);
    }

    public C7960b(Class<?> cls, C7962d c7962d, AbstractC4631h abstractC4631h, AbstractC4631h[] abstractC4631hArr, Object obj, Object obj2, boolean z10) {
        super(cls, c7962d, abstractC4631h, abstractC4631hArr, 0, obj, obj2, z10);
    }

    /* renamed from: g */
    public static C7960b m34515g(Class<?> cls) {
        return new C7960b(cls, null, null, null, null, null, false);
    }

    @Override // p074e5.AbstractC4631h
    /* renamed from: c */
    public StringBuilder mo23272c(StringBuilder sb2) {
        AbstractC7961c.m34517d(this.f27336b, sb2, false);
        int m34521c = this.f38421i.m34521c();
        StringBuilder sb3 = sb2;
        if (m34521c > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < m34521c; i10++) {
                sb2 = m34518f(i10).mo23272c(sb2);
            }
            sb2.append('>');
            sb3 = sb2;
        }
        sb3.append(';');
        return sb3;
    }

    @Override // p300r5.AbstractC7961c
    /* renamed from: e */
    public String mo34516e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27336b.getName());
        int m34521c = this.f38421i.m34521c();
        if (m34521c > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < m34521c; i10++) {
                AbstractC4631h m34518f = m34518f(i10);
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(m34518f.mo5894a());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // p074e5.AbstractC4631h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7960b c7960b = (C7960b) obj;
        if (c7960b.f27336b != this.f27336b) {
            return false;
        }
        return this.f38421i.equals(c7960b.f38421i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(mo34516e());
        sb2.append(']');
        return sb2.toString();
    }
}
