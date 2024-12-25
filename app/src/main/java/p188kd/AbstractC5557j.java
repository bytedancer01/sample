package p188kd;

import java.io.IOException;
import java.io.StringWriter;
import md.C6571l;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/j.class
 */
/* renamed from: kd.j */
/* loaded from: combined.jar:classes2.jar:kd/j.class */
public abstract class AbstractC5557j {
    /* renamed from: d */
    public C5554g m27577d() {
        if (m27580q()) {
            return (C5554g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: f */
    public C5560m m27578f() {
        if (m27582v()) {
            return (C5560m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: g */
    public C5562o m27579g() {
        if (m27583w()) {
            return (C5562o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: i */
    public String mo27575i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: q */
    public boolean m27580q() {
        return this instanceof C5554g;
    }

    /* renamed from: t */
    public boolean m27581t() {
        return this instanceof C5559l;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8557c c8557c = new C8557c(stringWriter);
            c8557c.m36813G0(true);
            C6571l.m30335b(this, c8557c);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: v */
    public boolean m27582v() {
        return this instanceof C5560m;
    }

    /* renamed from: w */
    public boolean m27583w() {
        return this instanceof C5562o;
    }
}
