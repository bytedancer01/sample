package me;

import java.util.Formatter;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/g.class
 */
/* renamed from: me.g */
/* loaded from: combined.jar:classes2.jar:me/g.class */
public class C6579g {

    /* renamed from: a */
    public final C6575c f34428a;

    /* renamed from: b */
    public final C6576d[] f34429b;

    public C6579g(C6575c c6575c) {
        this.f34428a = new C6575c(c6575c);
        this.f34429b = new C6576d[(c6575c.m30352e() - c6575c.m30354g()) + 1];
    }

    /* renamed from: a */
    public final C6575c m30391a() {
        return this.f34428a;
    }

    /* renamed from: b */
    public final C6576d m30392b(int i10) {
        return this.f34429b[m30395e(i10)];
    }

    /* renamed from: c */
    public final C6576d m30393c(int i10) {
        C6576d c6576d;
        C6576d c6576d2;
        C6576d m30392b = m30392b(i10);
        if (m30392b != null) {
            return m30392b;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int m30395e = m30395e(i10) - i11;
            if (m30395e >= 0 && (c6576d2 = this.f34429b[m30395e]) != null) {
                return c6576d2;
            }
            int m30395e2 = m30395e(i10) + i11;
            C6576d[] c6576dArr = this.f34429b;
            if (m30395e2 < c6576dArr.length && (c6576d = c6576dArr[m30395e2]) != null) {
                return c6576d;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C6576d[] m30394d() {
        return this.f34429b;
    }

    /* renamed from: e */
    public final int m30395e(int i10) {
        return i10 - this.f34428a.m30354g();
    }

    /* renamed from: f */
    public final void m30396f(int i10, C6576d c6576d) {
        this.f34429b[m30395e(i10)] = c6576d;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (C6576d c6576d : this.f34429b) {
                if (c6576d == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(c6576d.m30359c()), Integer.valueOf(c6576d.m30361e()));
                }
                i10++;
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
