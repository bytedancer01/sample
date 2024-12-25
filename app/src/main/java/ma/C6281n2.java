package ma;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/n2.class
 */
/* renamed from: ma.n2 */
/* loaded from: combined.jar:classes2.jar:ma/n2.class */
public final class C6281n2 extends C6218k2 {
    public C6281n2() {
        super(4);
    }

    /* renamed from: b */
    public final C6281n2 m29868b(Object obj) {
        obj.getClass();
        int i10 = this.f33861b + 1;
        Object[] objArr = this.f33860a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f33862c) {
                this.f33860a = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.f33860a;
            int i11 = this.f33861b;
            this.f33861b = i11 + 1;
            objArr2[i11] = obj;
            return this;
        }
        this.f33860a = Arrays.copyOf(objArr, C6239l2.m29828a(length, i10));
        this.f33862c = false;
        Object[] objArr22 = this.f33860a;
        int i112 = this.f33861b;
        this.f33861b = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }

    /* renamed from: c */
    public final AbstractC6344q2 m29869c() {
        this.f33862c = true;
        return AbstractC6344q2.m29975t(this.f33860a, this.f33861b);
    }
}
