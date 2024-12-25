package p077e8;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/g.class
 */
/* renamed from: e8.g */
/* loaded from: combined.jar:classes2.jar:e8/g.class */
public class C4654g {

    /* renamed from: a */
    public final String f27444a;

    /* renamed from: b */
    public final long f27445b;

    /* renamed from: c */
    public final List<C4648a> f27446c;

    /* renamed from: d */
    public final List<C4653f> f27447d;

    /* renamed from: e */
    public final C4652e f27448e;

    public C4654g(String str, long j10, List<C4648a> list, List<C4653f> list2) {
        this(str, j10, list, list2, null);
    }

    public C4654g(String str, long j10, List<C4648a> list, List<C4653f> list2, C4652e c4652e) {
        this.f27444a = str;
        this.f27445b = j10;
        this.f27446c = Collections.unmodifiableList(list);
        this.f27447d = Collections.unmodifiableList(list2);
        this.f27448e = c4652e;
    }

    /* renamed from: a */
    public int m23371a(int i10) {
        int size = this.f27446c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f27446c.get(i11).f27402b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
