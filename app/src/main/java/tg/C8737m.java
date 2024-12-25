package tg;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/m.class
 */
/* renamed from: tg.m */
/* loaded from: combined.jar:classes2.jar:tg/m.class */
public final class C8737m {

    /* renamed from: a */
    public int f40638a = 64;

    /* renamed from: b */
    public int f40639b = 5;

    /* renamed from: c */
    public final Deque<Object> f40640c = new ArrayDeque();

    /* renamed from: d */
    public final Deque<Object> f40641d = new ArrayDeque();

    /* renamed from: e */
    public final Deque<C8729e> f40642e = new ArrayDeque();

    /* renamed from: a */
    public void m37389a(C8729e c8729e) {
        synchronized (this) {
            this.f40642e.add(c8729e);
        }
    }

    /* renamed from: b */
    public void m37390b(C8729e c8729e) {
        synchronized (this) {
            if (!this.f40642e.remove(c8729e)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
    }
}
