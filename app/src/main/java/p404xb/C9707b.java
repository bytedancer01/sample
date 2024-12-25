package p404xb;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/b.class
 */
/* renamed from: xb.b */
/* loaded from: combined.jar:classes2.jar:xb/b.class */
public final class C9707b implements InterfaceC9708c {

    /* renamed from: a */
    public final InterfaceC9708c f44251a;

    /* renamed from: b */
    public final float f44252b;

    public C9707b(float f10, InterfaceC9708c interfaceC9708c) {
        while (interfaceC9708c instanceof C9707b) {
            interfaceC9708c = ((C9707b) interfaceC9708c).f44251a;
            f10 += ((C9707b) interfaceC9708c).f44252b;
        }
        this.f44251a = interfaceC9708c;
        this.f44252b = f10;
    }

    @Override // p404xb.InterfaceC9708c
    /* renamed from: a */
    public float mo40809a(RectF rectF) {
        return Math.max(0.0f, this.f44251a.mo40809a(rectF) + this.f44252b);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9707b)) {
            return false;
        }
        C9707b c9707b = (C9707b) obj;
        if (!this.f44251a.equals(c9707b.f44251a) || this.f44252b != c9707b.f44252b) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44251a, Float.valueOf(this.f44252b)});
    }
}
