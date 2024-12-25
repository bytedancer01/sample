package androidx.leanback.widget;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/g0.class
 */
/* renamed from: androidx.leanback.widget.g0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/g0.class */
public abstract class AbstractC0512g0<PropertyT extends Property> {

    /* renamed from: a */
    public final List<PropertyT> f3419a;

    /* renamed from: b */
    public final List<PropertyT> f3420b;

    /* renamed from: c */
    public int[] f3421c;

    /* renamed from: d */
    public float[] f3422d;

    /* renamed from: e */
    public final List<AbstractC0515h0> f3423e;

    public AbstractC0512g0() {
        ArrayList arrayList = new ArrayList();
        this.f3419a = arrayList;
        this.f3420b = Collections.unmodifiableList(arrayList);
        this.f3421c = new int[4];
        this.f3422d = new float[4];
        this.f3423e = new ArrayList(4);
    }

    /* renamed from: a */
    public final float m2600a(int i10) {
        return this.f3422d[i10];
    }

    /* renamed from: b */
    public void m2601b() {
        for (int i10 = 0; i10 < this.f3423e.size(); i10++) {
            this.f3423e.get(i10).m2645c(this);
        }
    }

    /* renamed from: c */
    public final void m2602c() {
        if (this.f3419a.size() < 2) {
            return;
        }
        float m2600a = m2600a(0);
        int i10 = 1;
        while (i10 < this.f3419a.size()) {
            float m2600a2 = m2600a(i10);
            if (m2600a2 < m2600a) {
                int i11 = i10 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", Integer.valueOf(i10), this.f3419a.get(i10).getName(), Integer.valueOf(i11), this.f3419a.get(i11).getName()));
            }
            if (m2600a == -3.4028235E38f && m2600a2 == Float.MAX_VALUE) {
                int i12 = i10 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i12), this.f3419a.get(i12).getName(), Integer.valueOf(i10), this.f3419a.get(i10).getName()));
            }
            i10++;
            m2600a = m2600a2;
        }
    }
}
