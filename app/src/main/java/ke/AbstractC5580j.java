package ke;

import p444zd.C10193a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/j.class
 */
/* renamed from: ke.j */
/* loaded from: combined.jar:classes2.jar:ke/j.class */
public abstract class AbstractC5580j {

    /* renamed from: a */
    public final C10193a f31654a;

    /* renamed from: b */
    public final C5589s f31655b;

    public AbstractC5580j(C10193a c10193a) {
        this.f31654a = c10193a;
        this.f31655b = new C5589s(c10193a);
    }

    /* renamed from: a */
    public static AbstractC5580j m27607a(C10193a c10193a) {
        if (c10193a.m42660c(1)) {
            return new C5577g(c10193a);
        }
        if (!c10193a.m42660c(2)) {
            return new C5581k(c10193a);
        }
        int m27633g = C5589s.m27633g(c10193a, 1, 4);
        if (m27633g == 4) {
            return new C5571a(c10193a);
        }
        if (m27633g == 5) {
            return new C5572b(c10193a);
        }
        int m27633g2 = C5589s.m27633g(c10193a, 1, 5);
        if (m27633g2 == 12) {
            return new C5573c(c10193a);
        }
        if (m27633g2 == 13) {
            return new C5574d(c10193a);
        }
        switch (C5589s.m27633g(c10193a, 1, 7)) {
            case 56:
                return new C5575e(c10193a, "310", "11");
            case 57:
                return new C5575e(c10193a, "320", "11");
            case 58:
                return new C5575e(c10193a, "310", "13");
            case 59:
                return new C5575e(c10193a, "320", "13");
            case 60:
                return new C5575e(c10193a, "310", "15");
            case 61:
                return new C5575e(c10193a, "320", "15");
            case 62:
                return new C5575e(c10193a, "310", "17");
            case 63:
                return new C5575e(c10193a, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c10193a)));
        }
    }

    /* renamed from: b */
    public final C5589s m27608b() {
        return this.f31655b;
    }

    /* renamed from: c */
    public final C10193a m27609c() {
        return this.f31654a;
    }

    /* renamed from: d */
    public abstract String mo27601d();
}
