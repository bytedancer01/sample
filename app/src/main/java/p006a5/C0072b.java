package p006a5;

import p397x4.AbstractC9657g;
import p436z4.C10050a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a5/b.class
 */
/* renamed from: a5.b */
/* loaded from: combined.jar:classes1.jar:a5/b.class */
public final class C0072b extends AbstractC9657g {

    /* renamed from: c */
    public final C0072b f223c;

    /* renamed from: d */
    public String f224d;

    /* renamed from: e */
    public int f225e;

    /* renamed from: f */
    public int f226f;

    public C0072b(C0072b c0072b, C0071a c0071a, int i10, int i11, int i12) {
        this.f223c = c0072b;
        this.f44055a = i10;
        this.f225e = i11;
        this.f226f = i12;
        this.f44056b = -1;
    }

    /* renamed from: b */
    public static C0072b m271b(C0071a c0071a) {
        return new C0072b(null, c0071a, 0, 1, 0);
    }

    /* renamed from: c */
    public String m272c() {
        return this.f224d;
    }

    /* renamed from: d */
    public C0072b m273d() {
        return this.f223c;
    }

    public String toString() {
        char c10;
        char c11;
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f44055a;
        if (i10 != 0) {
            if (i10 != 1) {
                sb2.append('{');
                if (this.f224d != null) {
                    c11 = '\"';
                    sb2.append('\"');
                    C10050a.m42263a(sb2, this.f224d);
                } else {
                    c11 = '?';
                }
                sb2.append(c11);
                c10 = '}';
            } else {
                sb2.append('[');
                sb2.append(m40588a());
                c10 = ']';
            }
            sb2.append(c10);
        } else {
            sb2.append("/");
        }
        return sb2.toString();
    }
}
