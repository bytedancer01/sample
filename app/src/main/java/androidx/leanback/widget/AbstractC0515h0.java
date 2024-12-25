package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/h0.class
 */
/* renamed from: androidx.leanback.widget.h0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/h0.class */
public abstract class AbstractC0515h0 {

    /* renamed from: a */
    public final List<Object> f3454a = new ArrayList(2);

    /* renamed from: b */
    public final List<Float> f3455b = new ArrayList(2);

    /* renamed from: c */
    public final List<Float> f3456c = new ArrayList(2);

    /* renamed from: d */
    public final List<AbstractC0517i0> f3457d = new ArrayList(4);

    /* renamed from: a */
    public abstract Number m2643a(AbstractC0512g0 abstractC0512g0);

    /* renamed from: b */
    public abstract float m2644b(AbstractC0512g0 abstractC0512g0);

    /* renamed from: c */
    public final void m2645c(AbstractC0512g0 abstractC0512g0) {
        Number number;
        if (this.f3454a.size() < 2) {
            return;
        }
        abstractC0512g0.m2602c();
        float f10 = 0.0f;
        Number number2 = null;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.f3457d.size()) {
            AbstractC0517i0 abstractC0517i0 = this.f3457d.get(i10);
            if (abstractC0517i0.m2648b()) {
                number = number2;
                if (number2 == null) {
                    number = m2643a(abstractC0512g0);
                }
                abstractC0517i0.m2647a(number);
            } else {
                boolean z11 = z10;
                if (!z10) {
                    f10 = m2644b(abstractC0512g0);
                    z11 = true;
                }
                abstractC0517i0.m2649c(f10);
                z10 = z11;
                number = number2;
            }
            i10++;
            number2 = number;
        }
    }
}
