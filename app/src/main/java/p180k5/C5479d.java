package p180k5;

import java.util.Collections;
import java.util.List;
import p074e5.AbstractC4625b;
import p074e5.AbstractC4626c;
import p074e5.AbstractC4631h;
import p111g5.AbstractC4953g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k5/d.class
 */
/* renamed from: k5.d */
/* loaded from: combined.jar:classes1.jar:k5/d.class */
public class C5479d extends AbstractC4626c {

    /* renamed from: b */
    public final AbstractC4953g<?> f31299b;

    /* renamed from: c */
    public final AbstractC4625b f31300c;

    /* renamed from: d */
    public final C5477b f31301d;

    /* renamed from: e */
    public List<Object> f31302e;

    public C5479d(AbstractC4953g<?> abstractC4953g, AbstractC4631h abstractC4631h, C5477b c5477b, List<Object> list) {
        super(abstractC4631h);
        this.f31299b = abstractC4953g;
        this.f31300c = abstractC4953g == null ? null : abstractC4953g.mo23268c();
        this.f31301d = c5477b;
        this.f31302e = list;
    }

    /* renamed from: a */
    public static C5479d m27280a(AbstractC4953g<?> abstractC4953g, AbstractC4631h abstractC4631h, C5477b c5477b) {
        return new C5479d(abstractC4953g, abstractC4631h, c5477b, Collections.emptyList());
    }
}
