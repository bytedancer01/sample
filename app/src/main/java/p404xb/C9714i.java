package p404xb;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/i.class
 */
/* renamed from: xb.i */
/* loaded from: combined.jar:classes2.jar:xb/i.class */
public final class C9714i implements InterfaceC9708c {

    /* renamed from: a */
    public final float f44303a;

    public C9714i(float f10) {
        this.f44303a = f10;
    }

    @Override // p404xb.InterfaceC9708c
    /* renamed from: a */
    public float mo40809a(RectF rectF) {
        return this.f44303a * rectF.height();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9714i)) {
            return false;
        }
        if (this.f44303a != ((C9714i) obj).f44303a) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44303a)});
    }
}
