package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/a.class
 */
/* renamed from: androidx.leanback.widget.a */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/a.class */
public class C0493a extends AbstractC0494a0 {

    /* renamed from: f */
    public static final Boolean f3387f = Boolean.FALSE;

    /* renamed from: d */
    public final List f3388d;

    /* renamed from: e */
    public final List f3389e;

    public C0493a(AbstractC0519j0 abstractC0519j0) {
        super(abstractC0519j0);
        this.f3388d = new ArrayList();
        this.f3389e = new ArrayList();
    }

    @Override // androidx.leanback.widget.AbstractC0494a0
    /* renamed from: a */
    public Object mo2535a(int i10) {
        return this.f3388d.get(i10);
    }

    @Override // androidx.leanback.widget.AbstractC0494a0
    /* renamed from: i */
    public int mo2536i() {
        return this.f3388d.size();
    }
}
