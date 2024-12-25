package bj;

import android.content.Context;
import android.util.Log;
import bj.C0915c;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p042cj.C1140i;

/* renamed from: bj.d */
/* loaded from: combined.jar:classes3.jar:bj/d.class */
public class C0916d {

    /* renamed from: a */
    public final Set<String> f6065a;

    /* renamed from: b */
    public final C0915c.b f6066b;

    /* renamed from: c */
    public final C0915c.a f6067c;

    /* renamed from: d */
    public boolean f6068d;

    /* renamed from: e */
    public boolean f6069e;

    /* renamed from: f */
    public C0915c.d f6070f;

    /* renamed from: bj.d$a */
    /* loaded from: combined.jar:classes3.jar:bj/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final Context f6071b;

        /* renamed from: c */
        public final String f6072c;

        /* renamed from: d */
        public final String f6073d;

        /* renamed from: e */
        public final C0915c.c f6074e;

        /* renamed from: f */
        public final C0916d f6075f;

        public a(C0916d c0916d, Context context, String str, String str2, C0915c.c cVar) {
            this.f6075f = c0916d;
            this.f6071b = context;
            this.f6072c = str;
            this.f6073d = str2;
            this.f6074e = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6075f.m5622g(this.f6071b, this.f6072c, this.f6073d);
                this.f6074e.m5613a();
            } catch (C0914b | UnsatisfiedLinkError e10) {
                this.f6074e.m5614b(e10);
            }
        }
    }

    /* renamed from: bj.d$b */
    /* loaded from: combined.jar:classes3.jar:bj/d$b.class */
    public class b implements FilenameFilter {

        /* renamed from: a */
        public final String f6076a;

        /* renamed from: b */
        public final C0916d f6077b;

        public b(C0916d c0916d, String str) {
            this.f6077b = c0916d;
            this.f6076a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f6076a);
        }
    }

    public C0916d() {
        this(new C0917e(), new C0913a());
    }

    public C0916d(C0915c.b bVar, C0915c.a aVar) {
        this.f6065a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f6066b = bVar;
        this.f6067c = aVar;
    }

    /* renamed from: b */
    public void m5617b(Context context, String str, String str2) {
        File m5618c = m5618c(context);
        File m5619d = m5619d(context, str, str2);
        File[] listFiles = m5618c.listFiles(new b(this, this.f6066b.mo5609a(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f6068d || !file.getAbsolutePath().equals(m5619d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    public File m5618c(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: d */
    public File m5619d(Context context, String str, String str2) {
        String mo5609a = this.f6066b.mo5609a(str);
        if (C0918f.m5625a(str2)) {
            return new File(m5618c(context), mo5609a);
        }
        return new File(m5618c(context), mo5609a + InstructionFileId.DOT + str2);
    }

    /* renamed from: e */
    public void m5620e(Context context, String str) {
        m5621f(context, str, null, null);
    }

    /* renamed from: f */
    public void m5621f(Context context, String str, String str2, C0915c.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (C0918f.m5625a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m5624i("Beginning load of %s...", str);
        if (cVar == null) {
            m5622g(context, str, str2);
        } else {
            new Thread(new a(this, context, str, str2, cVar)).start();
        }
    }

    /* renamed from: g */
    public final void m5622g(Context context, String str, String str2) {
        C1140i c1140i;
        if (this.f6065a.contains(str) && !this.f6068d) {
            m5624i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f6066b.loadLibrary(str);
            this.f6065a.add(str);
            m5624i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            m5624i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            m5624i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File m5619d = m5619d(context, str, str2);
            if (!m5619d.exists() || this.f6068d) {
                if (this.f6068d) {
                    m5624i("Forcing a re-link of %s (%s)...", str, str2);
                }
                m5617b(context, str, str2);
                this.f6067c.mo5601a(context, this.f6066b.mo5611c(), this.f6066b.mo5609a(str), m5619d, this);
            }
            try {
                if (this.f6069e) {
                    try {
                        c1140i = new C1140i(m5619d);
                    } catch (Throwable th2) {
                        th = th2;
                        c1140i = null;
                    }
                    try {
                        List<String> m6791o = c1140i.m6791o();
                        c1140i.close();
                        Iterator<String> it = m6791o.iterator();
                        while (it.hasNext()) {
                            m5620e(context, this.f6066b.mo5610b(it.next()));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c1140i.close();
                        throw th;
                    }
                }
            } catch (IOException e11) {
            }
            this.f6066b.mo5612d(m5619d.getAbsolutePath());
            this.f6065a.add(str);
            m5624i("%s (%s) was re-linked!", str, str2);
        }
    }

    /* renamed from: h */
    public void m5623h(String str) {
        C0915c.d dVar = this.f6070f;
        if (dVar != null) {
            dVar.m5615a(str);
        }
    }

    /* renamed from: i */
    public void m5624i(String str, Object... objArr) {
        m5623h(String.format(Locale.US, str, objArr));
    }
}
