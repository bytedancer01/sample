package p071e2;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/i.class
 */
/* renamed from: e2.i */
/* loaded from: combined.jar:classes1.jar:e2/i.class */
public abstract class AbstractC4580i {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/i$a.class
     */
    /* renamed from: e2.i$a */
    /* loaded from: combined.jar:classes1.jar:e2/i$a.class */
    public class a extends AbstractC4580i {
        @Override // p071e2.AbstractC4580i
        /* renamed from: a */
        public AbstractC4579h mo23120a(String str) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC4580i m23119c() {
        return new a();
    }

    /* renamed from: a */
    public abstract AbstractC4579h mo23120a(String str);

    /* renamed from: b */
    public final AbstractC4579h m23121b(String str) {
        AbstractC4579h mo23120a = mo23120a(str);
        AbstractC4579h abstractC4579h = mo23120a;
        if (mo23120a == null) {
            abstractC4579h = AbstractC4579h.m23118a(str);
        }
        return abstractC4579h;
    }
}
