package p300r5;

import java.io.Serializable;
import p074e5.AbstractC4631h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r5/d.class
 */
/* renamed from: r5.d */
/* loaded from: combined.jar:classes1.jar:r5/d.class */
public class C7962d implements Serializable {

    /* renamed from: f */
    public static final String[] f38423f;

    /* renamed from: g */
    public static final AbstractC4631h[] f38424g;

    /* renamed from: h */
    public static final C7962d f38425h;

    /* renamed from: b */
    public final String[] f38426b;

    /* renamed from: c */
    public final AbstractC4631h[] f38427c;

    /* renamed from: d */
    public final String[] f38428d;

    /* renamed from: e */
    public final int f38429e;

    static {
        String[] strArr = new String[0];
        f38423f = strArr;
        AbstractC4631h[] abstractC4631hArr = new AbstractC4631h[0];
        f38424g = abstractC4631hArr;
        f38425h = new C7962d(strArr, abstractC4631hArr, null);
    }

    public C7962d(String[] strArr, AbstractC4631h[] abstractC4631hArr, String[] strArr2) {
        String[] strArr3 = strArr == null ? f38423f : strArr;
        this.f38426b = strArr3;
        AbstractC4631h[] abstractC4631hArr2 = abstractC4631hArr == null ? f38424g : abstractC4631hArr;
        this.f38427c = abstractC4631hArr2;
        if (strArr3.length != abstractC4631hArr2.length) {
            throw new IllegalArgumentException("Mismatching names (" + strArr3.length + "), types (" + abstractC4631hArr2.length + ")");
        }
        int length = abstractC4631hArr2.length;
        int i10 = 1;
        for (int i11 = 0; i11 < length; i11++) {
            i10 += this.f38427c[i11].hashCode();
        }
        this.f38428d = strArr2;
        this.f38429e = i10;
    }

    /* renamed from: a */
    public static C7962d m34519a() {
        return f38425h;
    }

    /* renamed from: b */
    public AbstractC4631h m34520b(int i10) {
        if (i10 < 0) {
            return null;
        }
        AbstractC4631h[] abstractC4631hArr = this.f38427c;
        if (i10 >= abstractC4631hArr.length) {
            return null;
        }
        return abstractC4631hArr[i10];
    }

    /* renamed from: c */
    public int m34521c() {
        return this.f38427c.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C7962d c7962d = (C7962d) obj;
        int length = this.f38427c.length;
        if (length != c7962d.m34521c()) {
            return false;
        }
        AbstractC4631h[] abstractC4631hArr = c7962d.f38427c;
        for (int i10 = 0; i10 < length; i10++) {
            if (!abstractC4631hArr[i10].equals(this.f38427c[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f38429e;
    }

    public String toString() {
        if (this.f38427c.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        int length = this.f38427c.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(this.f38427c[i10].m23271b());
        }
        sb2.append('>');
        return sb2.toString();
    }
}
