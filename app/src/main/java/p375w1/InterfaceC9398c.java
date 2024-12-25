package p375w1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w1/c.class
 */
/* renamed from: w1.c */
/* loaded from: combined.jar:classes1.jar:w1/c.class */
public interface InterfaceC9398c extends Closeable {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w1/c$a.class
     */
    /* renamed from: w1.c$a */
    /* loaded from: combined.jar:classes1.jar:w1/c$a.class */
    public static abstract class a {

        /* renamed from: a */
        public final int f43092a;

        public a(int i10) {
            this.f43092a = i10;
        }

        /* renamed from: a */
        public final void m39722a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        /* renamed from: b */
        public void mo36927b(InterfaceC9397b interfaceC9397b) {
        }

        /* renamed from: c */
        public void m39723c(InterfaceC9397b interfaceC9397b) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC9397b.getPath());
            if (!interfaceC9397b.isOpen()) {
                m39722a(interfaceC9397b.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            List<Pair<String, String>> list2 = null;
            try {
                try {
                    list = interfaceC9397b.mo39712E();
                } finally {
                    if (list2 != null) {
                        Iterator<Pair<String, String>> it = list2.iterator();
                        while (it.hasNext()) {
                            m39722a((String) it.next().second);
                        }
                    } else {
                        m39722a(interfaceC9397b.getPath());
                    }
                }
            } catch (SQLiteException e10) {
            }
            list2 = list2;
            try {
                interfaceC9397b.close();
            } catch (IOException e11) {
            }
        }

        /* renamed from: d */
        public abstract void mo36928d(InterfaceC9397b interfaceC9397b);

        /* renamed from: e */
        public abstract void mo36929e(InterfaceC9397b interfaceC9397b, int i10, int i11);

        /* renamed from: f */
        public void mo36930f(InterfaceC9397b interfaceC9397b) {
        }

        /* renamed from: g */
        public abstract void mo36931g(InterfaceC9397b interfaceC9397b, int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w1/c$b.class
     */
    /* renamed from: w1.c$b */
    /* loaded from: combined.jar:classes1.jar:w1/c$b.class */
    public static class b {

        /* renamed from: a */
        public final Context f43093a;

        /* renamed from: b */
        public final String f43094b;

        /* renamed from: c */
        public final a f43095c;

        /* renamed from: d */
        public final boolean f43096d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:w1/c$b$a.class
         */
        /* renamed from: w1.c$b$a */
        /* loaded from: combined.jar:classes1.jar:w1/c$b$a.class */
        public static class a {

            /* renamed from: a */
            public Context f43097a;

            /* renamed from: b */
            public String f43098b;

            /* renamed from: c */
            public a f43099c;

            /* renamed from: d */
            public boolean f43100d;

            public a(Context context) {
                this.f43097a = context;
            }

            /* renamed from: a */
            public b m39725a() {
                if (this.f43099c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f43097a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f43100d && TextUtils.isEmpty(this.f43098b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f43097a, this.f43098b, this.f43099c, this.f43100d);
            }

            /* renamed from: b */
            public a m39726b(a aVar) {
                this.f43099c = aVar;
                return this;
            }

            /* renamed from: c */
            public a m39727c(String str) {
                this.f43098b = str;
                return this;
            }

            /* renamed from: d */
            public a m39728d(boolean z10) {
                this.f43100d = z10;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z10) {
            this.f43093a = context;
            this.f43094b = str;
            this.f43095c = aVar;
            this.f43096d = z10;
        }

        /* renamed from: a */
        public static a m39724a(Context context) {
            return new a(context);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:w1/c$c.class
     */
    /* renamed from: w1.c$c */
    /* loaded from: combined.jar:classes1.jar:w1/c$c.class */
    public interface c {
        /* renamed from: a */
        InterfaceC9398c mo4897a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    InterfaceC9397b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
