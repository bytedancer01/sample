package p404xb;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/a.class
 */
/* renamed from: xb.a */
/* loaded from: combined.jar:classes2.jar:xb/a.class */
public final class C9706a implements InterfaceC9708c {

    /* renamed from: a */
    public final float f44250a;

    public C9706a(float f10) {
        this.f44250a = f10;
    }

    @Override // p404xb.InterfaceC9708c
    /* renamed from: a */
    public float mo40809a(RectF rectF) {
        return this.f44250a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9706a)) {
            return false;
        }
        if (this.f44250a != ((C9706a) obj).f44250a) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44250a)});
    }
}
