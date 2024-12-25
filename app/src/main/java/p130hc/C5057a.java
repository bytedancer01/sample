package p130hc;

import ec.C4708k;
import java.io.File;
import p099fc.AbstractC4839v0;
import p116gc.InterfaceC4997a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hc/a.class
 */
/* renamed from: hc.a */
/* loaded from: combined.jar:classes2.jar:hc/a.class */
public final class C5057a {

    /* renamed from: a */
    public static final AbstractC4839v0<File> f29134a = new a();

    /* renamed from: b */
    public static final InterfaceC4997a<File> f29135b = new b();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hc/a$a.class
     */
    /* renamed from: hc.a$a */
    /* loaded from: combined.jar:classes2.jar:hc/a$a.class */
    public static final class a extends AbstractC4839v0<File> {
        public String toString() {
            return "Files.fileTreeTraverser()";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hc/a$b.class
     */
    /* renamed from: hc.a$b */
    /* loaded from: combined.jar:classes2.jar:hc/a$b.class */
    public static final class b implements InterfaceC4997a<File> {
    }

    /* renamed from: a */
    public static String m25291a(String str) {
        C4708k.m23668j(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }
}
