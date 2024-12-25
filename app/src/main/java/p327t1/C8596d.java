package p327t1;

import android.content.Context;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import p327t1.AbstractC8597e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/d.class
 */
/* renamed from: t1.d */
/* loaded from: combined.jar:classes1.jar:t1/d.class */
public class C8596d {
    /* renamed from: a */
    public static <T extends AbstractC8597e> AbstractC8597e.a<T> m36892a(Context context, Class<T> cls, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC8597e.a<>(context, cls, str);
    }

    /* renamed from: b */
    public static <T, C> T m36893b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + InstructionFileId.DOT + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    /* renamed from: c */
    public static <T extends AbstractC8597e> AbstractC8597e.a<T> m36894c(Context context, Class<T> cls) {
        return new AbstractC8597e.a<>(context, cls, null);
    }
}
