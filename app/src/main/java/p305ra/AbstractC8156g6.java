package p305ra;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p305ra.C8425y5;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/g6.class
 */
/* renamed from: ra.g6 */
/* loaded from: combined.jar:classes2.jar:ra/g6.class */
public abstract class AbstractC8156g6<T extends C8425y5> {

    /* renamed from: a */
    public static final Logger f39089a = Logger.getLogger(AbstractC8350t5.class.getName());

    /* renamed from: b */
    public static final String f39090b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static <T extends C8425y5> T m35385b(Class<T> cls) {
        String format;
        ClassLoader classLoader = AbstractC8156g6.class.getClassLoader();
        if (cls.equals(C8425y5.class)) {
            format = f39090b;
        } else {
            if (!cls.getPackage().equals(AbstractC8156g6.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        try {
                            return cls.cast(((AbstractC8156g6) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m35386a());
                        } catch (IllegalAccessException e10) {
                            throw new IllegalStateException(e10);
                        }
                    } catch (InvocationTargetException e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (NoSuchMethodException e12) {
                    throw new IllegalStateException(e12);
                }
            } catch (InstantiationException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException e14) {
            Iterator it = ServiceLoader.load(AbstractC8156g6.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC8156g6) it.next()).m35386a()));
                } catch (ServiceConfigurationError e15) {
                    Logger logger = f39089a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e15);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (NoSuchMethodException e17) {
                throw new IllegalStateException(e17);
            } catch (InvocationTargetException e18) {
                throw new IllegalStateException(e18);
            }
        }
    }

    /* renamed from: a */
    public abstract T m35386a();
}
