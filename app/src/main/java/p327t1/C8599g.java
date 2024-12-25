package p327t1;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import p342u1.AbstractC8784a;
import p375w1.C9396a;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9398c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/g.class
 */
/* renamed from: t1.g */
/* loaded from: combined.jar:classes1.jar:t1/g.class */
public class C8599g extends InterfaceC9398c.a {

    /* renamed from: b */
    public C8593a f40106b;

    /* renamed from: c */
    public final a f40107c;

    /* renamed from: d */
    public final String f40108d;

    /* renamed from: e */
    public final String f40109e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/g$a.class
     */
    /* renamed from: t1.g$a */
    /* loaded from: combined.jar:classes1.jar:t1/g$a.class */
    public static abstract class a {

        /* renamed from: a */
        public final int f40110a;

        public a(int i10) {
            this.f40110a = i10;
        }

        /* renamed from: a */
        public abstract void mo4912a(InterfaceC9397b interfaceC9397b);

        /* renamed from: b */
        public abstract void mo4913b(InterfaceC9397b interfaceC9397b);

        /* renamed from: c */
        public abstract void mo4914c(InterfaceC9397b interfaceC9397b);

        /* renamed from: d */
        public abstract void mo4915d(InterfaceC9397b interfaceC9397b);

        /* renamed from: e */
        public abstract void mo4916e(InterfaceC9397b interfaceC9397b);

        /* renamed from: f */
        public abstract void mo4917f(InterfaceC9397b interfaceC9397b);

        /* renamed from: g */
        public abstract b mo4918g(InterfaceC9397b interfaceC9397b);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/g$b.class
     */
    /* renamed from: t1.g$b */
    /* loaded from: combined.jar:classes1.jar:t1/g$b.class */
    public static class b {

        /* renamed from: a */
        public final boolean f40111a;

        /* renamed from: b */
        public final String f40112b;

        public b(boolean z10, String str) {
            this.f40111a = z10;
            this.f40112b = str;
        }
    }

    public C8599g(C8593a c8593a, a aVar, String str, String str2) {
        super(aVar.f40110a);
        this.f40106b = c8593a;
        this.f40107c = aVar;
        this.f40108d = str;
        this.f40109e = str2;
    }

    /* renamed from: j */
    public static boolean m36925j(InterfaceC9397b interfaceC9397b) {
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (mo39719p0.moveToFirst()) {
                z10 = false;
                if (mo39719p0.getInt(0) == 0) {
                    z10 = true;
                }
            }
            mo39719p0.close();
            return z10;
        } catch (Throwable th2) {
            mo39719p0.close();
            throw th2;
        }
    }

    /* renamed from: k */
    public static boolean m36926k(InterfaceC9397b interfaceC9397b) {
        Cursor mo39719p0 = interfaceC9397b.mo39719p0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (mo39719p0.moveToFirst()) {
                z10 = false;
                if (mo39719p0.getInt(0) != 0) {
                    z10 = true;
                }
            }
            mo39719p0.close();
            return z10;
        } catch (Throwable th2) {
            mo39719p0.close();
            throw th2;
        }
    }

    @Override // p375w1.InterfaceC9398c.a
    /* renamed from: b */
    public void mo36927b(InterfaceC9397b interfaceC9397b) {
        super.mo36927b(interfaceC9397b);
    }

    @Override // p375w1.InterfaceC9398c.a
    /* renamed from: d */
    public void mo36928d(InterfaceC9397b interfaceC9397b) {
        boolean m36925j = m36925j(interfaceC9397b);
        this.f40107c.mo4912a(interfaceC9397b);
        if (!m36925j) {
            b mo4918g = this.f40107c.mo4918g(interfaceC9397b);
            if (!mo4918g.f40111a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo4918g.f40112b);
            }
        }
        m36934l(interfaceC9397b);
        this.f40107c.mo4914c(interfaceC9397b);
    }

    @Override // p375w1.InterfaceC9398c.a
    /* renamed from: e */
    public void mo36929e(InterfaceC9397b interfaceC9397b, int i10, int i11) {
        mo36931g(interfaceC9397b, i10, i11);
    }

    @Override // p375w1.InterfaceC9398c.a
    /* renamed from: f */
    public void mo36930f(InterfaceC9397b interfaceC9397b) {
        super.mo36930f(interfaceC9397b);
        m36932h(interfaceC9397b);
        this.f40107c.mo4915d(interfaceC9397b);
        this.f40106b = null;
    }

    @Override // p375w1.InterfaceC9398c.a
    /* renamed from: g */
    public void mo36931g(InterfaceC9397b interfaceC9397b, int i10, int i11) {
        boolean z10;
        List<AbstractC8784a> m36922c;
        C8593a c8593a = this.f40106b;
        if (c8593a == null || (m36922c = c8593a.f40063d.m36922c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f40107c.mo4917f(interfaceC9397b);
            Iterator<AbstractC8784a> it = m36922c.iterator();
            while (it.hasNext()) {
                it.next().mo4919a(interfaceC9397b);
            }
            b mo4918g = this.f40107c.mo4918g(interfaceC9397b);
            if (!mo4918g.f40111a) {
                throw new IllegalStateException("Migration didn't properly handle: " + mo4918g.f40112b);
            }
            this.f40107c.mo4916e(interfaceC9397b);
            m36934l(interfaceC9397b);
            z10 = true;
        }
        if (z10) {
            return;
        }
        C8593a c8593a2 = this.f40106b;
        if (c8593a2 != null && !c8593a2.m36890a(i10, i11)) {
            this.f40107c.mo4913b(interfaceC9397b);
            this.f40107c.mo4912a(interfaceC9397b);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* renamed from: h */
    public final void m36932h(InterfaceC9397b interfaceC9397b) {
        if (!m36926k(interfaceC9397b)) {
            b mo4918g = this.f40107c.mo4918g(interfaceC9397b);
            if (mo4918g.f40111a) {
                this.f40107c.mo4916e(interfaceC9397b);
                m36934l(interfaceC9397b);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo4918g.f40112b);
            }
        }
        Cursor mo39721w0 = interfaceC9397b.mo39721w0(new C9396a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        String str = null;
        try {
            if (mo39721w0.moveToFirst()) {
                str = mo39721w0.getString(0);
            }
            mo39721w0.close();
            if (!this.f40108d.equals(str) && !this.f40109e.equals(str)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th2) {
            mo39721w0.close();
            throw th2;
        }
    }

    /* renamed from: i */
    public final void m36933i(InterfaceC9397b interfaceC9397b) {
        interfaceC9397b.mo39713F("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: l */
    public final void m36934l(InterfaceC9397b interfaceC9397b) {
        m36933i(interfaceC9397b);
        interfaceC9397b.mo39713F(C8598f.m36924a(this.f40108d));
    }
}
