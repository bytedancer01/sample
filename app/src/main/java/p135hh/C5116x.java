package p135hh;

import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/x.class
 */
/* renamed from: hh.x */
/* loaded from: combined.jar:classes2.jar:hh/x.class */
public class C5116x {

    /* renamed from: d */
    public static C5116x f29382d;

    /* renamed from: a */
    public final UUID f29383a;

    /* renamed from: b */
    public String f29384b;

    /* renamed from: c */
    public String f29385c;

    public C5116x(UUID uuid) {
        this.f29383a = uuid;
    }

    /* renamed from: a */
    public static String m25652a(UUID uuid, boolean z10) {
        String str = m25653b(uuid).f29385c;
        if (z10) {
            m25653b(uuid).f29385c = null;
        }
        return str;
    }

    /* renamed from: b */
    public static C5116x m25653b(UUID uuid) {
        C5116x c5116x = f29382d;
        if (c5116x == null || !c5116x.f29383a.equals(uuid)) {
            f29382d = new C5116x(uuid);
        }
        return f29382d;
    }

    /* renamed from: c */
    public static String m25654c(UUID uuid, boolean z10) {
        String str = m25653b(uuid).f29384b;
        if (z10) {
            m25653b(uuid).f29384b = null;
        }
        return str;
    }

    /* renamed from: d */
    public static void m25655d(String str, int i10, String str2) {
        C5116x m25653b = m25653b(UUID.fromString(str));
        if (i10 == 2) {
            m25653b.f29384b = str2;
        } else {
            if (i10 != 3) {
                return;
            }
            m25653b.f29385c = str2;
        }
    }
}
