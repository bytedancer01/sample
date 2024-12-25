package p071e2;

import androidx.work.C0757b;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/h.class
 */
/* renamed from: e2.h */
/* loaded from: combined.jar:classes1.jar:e2/h.class */
public abstract class AbstractC4579h {

    /* renamed from: a */
    public static final String f27218a = AbstractC4582k.m23128f("InputMerger");

    /* renamed from: a */
    public static AbstractC4579h m23118a(String str) {
        try {
            return (AbstractC4579h) Class.forName(str).newInstance();
        } catch (Exception e10) {
            AbstractC4582k.m23126c().mo23130b(f27218a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C0757b mo4802b(List<C0757b> list);
}
