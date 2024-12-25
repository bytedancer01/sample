package ec;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/j.class
 */
/* renamed from: ec.j */
/* loaded from: combined.jar:classes2.jar:ec/j.class */
public final class C4707j {

    /* renamed from: a */
    public static final Logger f27724a = Logger.getLogger(C4707j.class.getName());

    /* renamed from: b */
    public static final InterfaceC4706i f27725b = m23657a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ec/j$b.class
     */
    /* renamed from: ec.j$b */
    /* loaded from: combined.jar:classes2.jar:ec/j$b.class */
    public static final class b implements InterfaceC4706i {
        public b() {
        }
    }

    /* renamed from: a */
    public static InterfaceC4706i m23657a() {
        return new b();
    }

    /* renamed from: b */
    public static String m23658b(@NullableDecl String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }
}
