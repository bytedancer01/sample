package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/m1.class
 */
/* renamed from: di.m1 */
/* loaded from: combined.jar:classes2.jar:di/m1.class */
public abstract class AbstractC4496m1 extends AbstractC4462b0 {
    @NotNull
    /* renamed from: C0 */
    public abstract AbstractC4496m1 mo22788C0();

    @Nullable
    /* renamed from: D0 */
    public final String m22789D0() {
        AbstractC4496m1 abstractC4496m1;
        AbstractC4496m1 m22792b = C4498n0.m22792b();
        if (this == m22792b) {
            return "Dispatchers.Main";
        }
        try {
            abstractC4496m1 = m22792b.mo22788C0();
        } catch (UnsupportedOperationException e10) {
            abstractC4496m1 = null;
        }
        if (this == abstractC4496m1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        String m22789D0 = m22789D0();
        String str = m22789D0;
        if (m22789D0 == null) {
            str = C4483i0.m22670a(this) + '@' + C4483i0.m22671b(this);
        }
        return str;
    }
}
