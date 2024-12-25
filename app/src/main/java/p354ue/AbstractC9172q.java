package p354ue;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p338te.C8721s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/q.class
 */
/* renamed from: ue.q */
/* loaded from: combined.jar:classes2.jar:ue/q.class */
public abstract class AbstractC9172q {

    /* renamed from: a */
    public static final String f41940a = "q";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/q$a.class
     */
    /* renamed from: ue.q$a */
    /* loaded from: combined.jar:classes2.jar:ue/q$a.class */
    public class a implements Comparator<C8721s> {

        /* renamed from: b */
        public final C8721s f41941b;

        /* renamed from: c */
        public final AbstractC9172q f41942c;

        public a(AbstractC9172q abstractC9172q, C8721s c8721s) {
            this.f41942c = abstractC9172q;
            this.f41941b = c8721s;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C8721s c8721s, C8721s c8721s2) {
            return Float.compare(this.f41942c.mo38596c(c8721s2, this.f41941b), this.f41942c.mo38596c(c8721s, this.f41941b));
        }
    }

    /* renamed from: a */
    public List<C8721s> m38604a(List<C8721s> list, C8721s c8721s) {
        if (c8721s == null) {
            return list;
        }
        Collections.sort(list, new a(this, c8721s));
        return list;
    }

    /* renamed from: b */
    public C8721s m38605b(List<C8721s> list, C8721s c8721s) {
        List<C8721s> m38604a = m38604a(list, c8721s);
        String str = f41940a;
        Log.i(str, "Viewfinder size: " + c8721s);
        Log.i(str, "Preview in order of preference: " + m38604a);
        return m38604a.get(0);
    }

    /* renamed from: c */
    public abstract float mo38596c(C8721s c8721s, C8721s c8721s2);

    /* renamed from: d */
    public abstract Rect mo38597d(C8721s c8721s, C8721s c8721s2);
}
