package p300r5;

import p074e5.AbstractC4631h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r5/c.class
 */
/* renamed from: r5.c */
/* loaded from: combined.jar:classes1.jar:r5/c.class */
public abstract class AbstractC7961c extends AbstractC4631h {

    /* renamed from: k */
    public static final C7962d f38417k = C7962d.m34519a();

    /* renamed from: l */
    public static final AbstractC4631h[] f38418l = new AbstractC4631h[0];

    /* renamed from: g */
    public final AbstractC4631h f38419g;

    /* renamed from: h */
    public final AbstractC4631h[] f38420h;

    /* renamed from: i */
    public final C7962d f38421i;

    /* renamed from: j */
    public volatile transient String f38422j;

    public AbstractC7961c(Class<?> cls, C7962d c7962d, AbstractC4631h abstractC4631h, AbstractC4631h[] abstractC4631hArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, i10, obj, obj2, z10);
        this.f38421i = c7962d == null ? f38417k : c7962d;
        this.f38419g = abstractC4631h;
        this.f38420h = abstractC4631hArr;
    }

    /* renamed from: d */
    public static StringBuilder m34517d(Class<?> cls, StringBuilder sb2, boolean z10) {
        char c10;
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = name.charAt(i10);
                char c11 = charAt;
                if (charAt == '.') {
                    c11 = '/';
                }
                sb2.append(c11);
            }
            if (z10) {
                c10 = ';';
            }
            return sb2;
        }
        if (cls == Boolean.TYPE) {
            c10 = 'Z';
        } else if (cls == Byte.TYPE) {
            c10 = 'B';
        } else if (cls == Short.TYPE) {
            c10 = 'S';
        } else if (cls == Character.TYPE) {
            c10 = 'C';
        } else if (cls == Integer.TYPE) {
            c10 = 'I';
        } else if (cls == Long.TYPE) {
            c10 = 'J';
        } else if (cls == Float.TYPE) {
            c10 = 'F';
        } else if (cls == Double.TYPE) {
            c10 = 'D';
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
            }
            c10 = 'V';
        }
        sb2.append(c10);
        return sb2;
    }

    @Override // p035c5.AbstractC0989a
    /* renamed from: a */
    public String mo5894a() {
        String str = this.f38422j;
        String str2 = str;
        if (str == null) {
            str2 = mo34516e();
        }
        return str2;
    }

    /* renamed from: e */
    public abstract String mo34516e();

    /* renamed from: f */
    public AbstractC4631h m34518f(int i10) {
        return this.f38421i.m34520b(i10);
    }
}
