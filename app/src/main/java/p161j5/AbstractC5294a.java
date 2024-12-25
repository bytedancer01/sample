package p161j5;

import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j5/a.class
 */
/* renamed from: j5.a */
/* loaded from: combined.jar:classes1.jar:j5/a.class */
public abstract class AbstractC5294a {

    /* renamed from: a */
    public static final AbstractC5294a f30447a;

    static {
        AbstractC5294a abstractC5294a;
        try {
            abstractC5294a = (AbstractC5294a) C5295b.class.newInstance();
        } catch (Throwable th2) {
            Logger.getLogger(AbstractC5294a.class.getName()).warning("Unable to load JDK7 types (annotations, java.nio.file.Path): no Java7 support added");
            abstractC5294a = null;
        }
        f30447a = abstractC5294a;
    }

    /* renamed from: a */
    public static AbstractC5294a m26478a() {
        return f30447a;
    }
}
