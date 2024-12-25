package p421y8;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/l.class
 */
/* renamed from: y8.l */
/* loaded from: combined.jar:classes2.jar:y8/l.class */
public final class C9888l {

    /* renamed from: a */
    public final int f45458a;

    /* renamed from: b */
    public final InterfaceC9887k[] f45459b;

    /* renamed from: c */
    public int f45460c;

    public C9888l(InterfaceC9887k... interfaceC9887kArr) {
        this.f45459b = interfaceC9887kArr;
        this.f45458a = interfaceC9887kArr.length;
    }

    /* renamed from: a */
    public InterfaceC9887k m41716a(int i10) {
        return this.f45459b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9888l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45459b, ((C9888l) obj).f45459b);
    }

    public int hashCode() {
        if (this.f45460c == 0) {
            this.f45460c = 527 + Arrays.hashCode(this.f45459b);
        }
        return this.f45460c;
    }
}
