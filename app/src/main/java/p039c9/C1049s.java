package p039c9;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import p039c9.InterfaceC1031a;
import p059d9.C4349a;
import p059d9.C4392v;
import p320s6.InterfaceC8539b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/s.class
 */
/* renamed from: c9.s */
/* loaded from: combined.jar:classes2.jar:c9/s.class */
public final class C1049s implements InterfaceC1031a {

    /* renamed from: l */
    public static final HashSet<File> f7021l = new HashSet<>();

    /* renamed from: a */
    public final File f7022a;

    /* renamed from: b */
    public final InterfaceC1034d f7023b;

    /* renamed from: c */
    public final C1043m f7024c;

    /* renamed from: d */
    public final C1036f f7025d;

    /* renamed from: e */
    public final HashMap<String, ArrayList<InterfaceC1031a.b>> f7026e;

    /* renamed from: f */
    public final Random f7027f;

    /* renamed from: g */
    public final boolean f7028g;

    /* renamed from: h */
    public long f7029h;

    /* renamed from: i */
    public long f7030i;

    /* renamed from: j */
    public boolean f7031j;

    /* renamed from: k */
    public InterfaceC1031a.a f7032k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/s$a.class
     */
    /* renamed from: c9.s$a */
    /* loaded from: combined.jar:classes2.jar:c9/s$a.class */
    public class a extends Thread {

        /* renamed from: b */
        public final ConditionVariable f7033b;

        /* renamed from: c */
        public final C1049s f7034c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1049s c1049s, String str, ConditionVariable conditionVariable) {
            super(str);
            this.f7034c = c1049s;
            this.f7033b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f7034c) {
                this.f7033b.open();
                this.f7034c.m6210t();
                this.f7034c.f7023b.mo6100f();
            }
        }
    }

    public C1049s(File file, InterfaceC1034d interfaceC1034d, C1043m c1043m, C1036f c1036f) {
        if (!m6202w(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f7022a = file;
        this.f7023b = interfaceC1034d;
        this.f7024c = c1043m;
        this.f7025d = c1036f;
        this.f7026e = new HashMap<>();
        this.f7027f = new Random();
        this.f7028g = interfaceC1034d.mo6098c();
        this.f7029h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new a(this, "ExoPlayer:SimpleCacheInit", conditionVariable).start();
        conditionVariable.block();
    }

    public C1049s(File file, InterfaceC1034d interfaceC1034d, InterfaceC8539b interfaceC8539b) {
        this(file, interfaceC1034d, interfaceC8539b, null, false, false);
    }

    public C1049s(File file, InterfaceC1034d interfaceC1034d, InterfaceC8539b interfaceC8539b, byte[] bArr, boolean z10, boolean z11) {
        this(file, interfaceC1034d, new C1043m(interfaceC8539b, file, bArr, z10, z11), (interfaceC8539b == null || z11) ? null : new C1036f(interfaceC8539b));
    }

    /* renamed from: A */
    public static long m6196A(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    /* renamed from: p */
    public static void m6199p(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        C4392v.m22270d("SimpleCache", str);
        throw new InterfaceC1031a.a(str);
    }

    /* renamed from: q */
    public static long m6200q(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* renamed from: v */
    public static long m6201v(File[] fileArr) {
        for (File file : fileArr) {
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return m6196A(name);
                } catch (NumberFormatException e10) {
                    C4392v.m22270d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    /* renamed from: w */
    public static boolean m6202w(File file) {
        boolean add;
        synchronized (C1049s.class) {
            try {
                add = f7021l.add(file.getAbsoluteFile());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return add;
    }

    /* renamed from: B */
    public final void m6203B(C1040j c1040j) {
        C1042l m6148g = this.f7024c.m6148g(c1040j.f6975b);
        if (m6148g == null || !m6148g.m6132k(c1040j)) {
            return;
        }
        this.f7030i -= c1040j.f6977d;
        if (this.f7025d != null) {
            String name = c1040j.f6979f.getName();
            try {
                this.f7025d.m6106f(name);
            } catch (IOException e10) {
                C4392v.m22275i("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f7024c.m6154p(m6148g.f6992b);
        m6213y(c1040j);
    }

    /* renamed from: C */
    public final void m6204C() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1042l> it = this.f7024c.m6149h().iterator();
        while (it.hasNext()) {
            Iterator<C1050t> it2 = it.next().m6127f().iterator();
            while (it2.hasNext()) {
                C1050t next = it2.next();
                if (next.f6979f.length() != next.f6977d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m6203B((C1040j) arrayList.get(i10));
        }
    }

    /* renamed from: D */
    public final C1050t m6205D(String str, C1050t c1050t) {
        if (!this.f7028g) {
            return c1050t;
        }
        String name = ((File) C4349a.m21882e(c1050t.f6979f)).getName();
        long j10 = c1050t.f6977d;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        C1036f c1036f = this.f7025d;
        if (c1036f != null) {
            try {
                c1036f.m6108h(name, j10, currentTimeMillis);
            } catch (IOException e10) {
                C4392v.m22275i("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        } else {
            z10 = true;
        }
        C1050t m6133l = this.f7024c.m6148g(str).m6133l(c1050t, currentTimeMillis, z10);
        m6214z(c1050t, m6133l);
        return m6133l;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: a */
    public File mo6054a(String str, long j10, long j11) {
        File m6219m;
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            m6207o();
            C1042l m6148g = this.f7024c.m6148g(str);
            C4349a.m21882e(m6148g);
            C4349a.m21884g(m6148g.m6129h(j10, j11));
            if (!this.f7022a.exists()) {
                m6199p(this.f7022a);
                m6204C();
            }
            this.f7023b.mo6099e(this, str, j10, j11);
            File file = new File(this.f7022a, Integer.toString(this.f7027f.nextInt(10)));
            if (!file.exists()) {
                m6199p(file);
            }
            m6219m = C1050t.m6219m(file, m6148g.f6991a, j10, System.currentTimeMillis());
        }
        return m6219m;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: b */
    public InterfaceC1045o mo6055b(String str) {
        InterfaceC1045o m6150j;
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            m6150j = this.f7024c.m6150j(str);
        }
        return m6150j;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: c */
    public long mo6056c(String str, long j10, long j11) {
        long j12;
        synchronized (this) {
            long j13 = j11 == -1 ? Long.MAX_VALUE : j11 + j10;
            if (j13 < 0) {
                j13 = Long.MAX_VALUE;
            }
            j12 = 0;
            while (j10 < j13) {
                long mo6058e = mo6058e(str, j10, j13 - j10);
                if (mo6058e > 0) {
                    j12 += mo6058e;
                } else {
                    mo6058e = -mo6058e;
                }
                j10 += mo6058e;
            }
        }
        return j12;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: d */
    public C1040j mo6057d(String str, long j10, long j11) {
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            m6207o();
            C1050t m6209s = m6209s(str, j10, j11);
            if (m6209s.f6978e) {
                return m6205D(str, m6209s);
            }
            if (this.f7024c.m6152m(str).m6131j(j10, m6209s.f6977d)) {
                return m6209s;
            }
            return null;
        }
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: e */
    public long mo6058e(String str, long j10, long j11) {
        long m6124c;
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            long j12 = j11;
            if (j11 == -1) {
                j12 = Long.MAX_VALUE;
            }
            C1042l m6148g = this.f7024c.m6148g(str);
            m6124c = m6148g != null ? m6148g.m6124c(j10, j12) : -j12;
        }
        return m6124c;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: f */
    public long mo6059f() {
        long j10;
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            j10 = this.f7030i;
        }
        return j10;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: g */
    public void mo6060g(C1040j c1040j) {
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            C1042l c1042l = (C1042l) C4349a.m21882e(this.f7024c.m6148g(c1040j.f6975b));
            c1042l.m6134m(c1040j.f6976c);
            this.f7024c.m6154p(c1042l.f6992b);
            notifyAll();
        }
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: h */
    public C1040j mo6061h(String str, long j10, long j11) {
        C1040j mo6057d;
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            m6207o();
            while (true) {
                mo6057d = mo6057d(str, j10, j11);
                if (mo6057d == null) {
                    wait();
                }
            }
        }
        return mo6057d;
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: i */
    public void mo6062i(File file, long j10) {
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            if (file.exists()) {
                if (j10 == 0) {
                    file.delete();
                    return;
                }
                C1050t c1050t = (C1050t) C4349a.m21882e(C1050t.m6216h(file, j10, this.f7024c));
                C1042l c1042l = (C1042l) C4349a.m21882e(this.f7024c.m6148g(c1050t.f6975b));
                C4349a.m21884g(c1042l.m6129h(c1050t.f6976c, c1050t.f6977d));
                long m6177a = C1044n.m6177a(c1042l.m6125d());
                if (m6177a != -1) {
                    C4349a.m21884g(c1050t.f6976c + c1050t.f6977d <= m6177a);
                }
                if (this.f7025d != null) {
                    try {
                        this.f7025d.m6108h(file.getName(), c1050t.f6977d, c1050t.f6980g);
                    } catch (IOException e10) {
                        throw new InterfaceC1031a.a(e10);
                    }
                }
                m6206n(c1050t);
                try {
                    this.f7024c.m6156s();
                    notifyAll();
                } catch (IOException e11) {
                    throw new InterfaceC1031a.a(e11);
                }
            }
        }
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: j */
    public void mo6063j(String str) {
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            Iterator<C1040j> it = m6208r(str).iterator();
            while (it.hasNext()) {
                m6203B(it.next());
            }
        }
    }

    @Override // p039c9.InterfaceC1031a
    /* renamed from: k */
    public void mo6064k(String str, C1046p c1046p) {
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            m6207o();
            this.f7024c.m6146e(str, c1046p);
            try {
                this.f7024c.m6156s();
            } catch (IOException e10) {
                throw new InterfaceC1031a.a(e10);
            }
        }
    }

    /* renamed from: n */
    public final void m6206n(C1050t c1050t) {
        this.f7024c.m6152m(c1050t.f6975b).m6122a(c1050t);
        this.f7030i += c1050t.f6977d;
        m6212x(c1050t);
    }

    /* renamed from: o */
    public void m6207o() {
        synchronized (this) {
            InterfaceC1031a.a aVar = this.f7032k;
            if (aVar != null) {
                throw aVar;
            }
        }
    }

    /* renamed from: r */
    public NavigableSet<C1040j> m6208r(String str) {
        TreeSet treeSet;
        synchronized (this) {
            C4349a.m21884g(!this.f7031j);
            C1042l m6148g = this.f7024c.m6148g(str);
            if (m6148g != null && !m6148g.m6128g()) {
                treeSet = new TreeSet((Collection) m6148g.m6127f());
            }
            treeSet = new TreeSet();
        }
        return treeSet;
    }

    /* renamed from: s */
    public final C1050t m6209s(String str, long j10, long j11) {
        C1050t m6126e;
        C1042l m6148g = this.f7024c.m6148g(str);
        if (m6148g == null) {
            return C1050t.m6217i(str, j10, j11);
        }
        while (true) {
            m6126e = m6148g.m6126e(j10, j11);
            if (!m6126e.f6978e || m6126e.f6979f.length() == m6126e.f6977d) {
                break;
            }
            m6204C();
        }
        return m6126e;
    }

    /* renamed from: t */
    public final void m6210t() {
        InterfaceC1031a.a aVar;
        if (!this.f7022a.exists()) {
            try {
                m6199p(this.f7022a);
            } catch (InterfaceC1031a.a e10) {
                this.f7032k = e10;
                return;
            }
        }
        File[] listFiles = this.f7022a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f7022a;
            C4392v.m22270d("SimpleCache", str);
            aVar = new InterfaceC1031a.a(str);
        } else {
            long m6201v = m6201v(listFiles);
            this.f7029h = m6201v;
            if (m6201v == -1) {
                try {
                    this.f7029h = m6200q(this.f7022a);
                } catch (IOException e11) {
                    String str2 = "Failed to create cache UID: " + this.f7022a;
                    C4392v.m22271e("SimpleCache", str2, e11);
                    aVar = new InterfaceC1031a.a(str2, e11);
                }
            }
            try {
                this.f7024c.m6153n(this.f7029h);
                C1036f c1036f = this.f7025d;
                if (c1036f != null) {
                    c1036f.m6105e(this.f7029h);
                    Map<String, C1035e> m6103b = this.f7025d.m6103b();
                    m6211u(this.f7022a, true, listFiles, m6103b);
                    this.f7025d.m6107g(m6103b.keySet());
                } else {
                    m6211u(this.f7022a, true, listFiles, null);
                }
                this.f7024c.m6155r();
                try {
                    this.f7024c.m6156s();
                    return;
                } catch (IOException e12) {
                    C4392v.m22271e("SimpleCache", "Storing index file failed", e12);
                    return;
                }
            } catch (IOException e13) {
                String str3 = "Failed to initialize cache indices: " + this.f7022a;
                C4392v.m22271e("SimpleCache", str3, e13);
                aVar = new InterfaceC1031a.a(str3, e13);
            }
        }
        this.f7032k = aVar;
    }

    /* renamed from: u */
    public final void m6211u(File file, boolean z10, File[] fileArr, Map<String, C1035e> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                m6211u(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!C1043m.m6142o(name) && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                C1035e remove = map != null ? map.remove(name) : null;
                if (remove != null) {
                    j10 = remove.f6969a;
                    j11 = remove.f6970b;
                }
                C1050t m6215g = C1050t.m6215g(file2, j10, j11, this.f7024c);
                if (m6215g != null) {
                    m6206n(m6215g);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: x */
    public final void m6212x(C1050t c1050t) {
        ArrayList<InterfaceC1031a.b> arrayList = this.f7026e.get(c1050t.f6975b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo6065a(this, c1050t);
            }
        }
        this.f7023b.mo6065a(this, c1050t);
    }

    /* renamed from: y */
    public final void m6213y(C1040j c1040j) {
        ArrayList<InterfaceC1031a.b> arrayList = this.f7026e.get(c1040j.f6975b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo6066b(this, c1040j);
            }
        }
        this.f7023b.mo6066b(this, c1040j);
    }

    /* renamed from: z */
    public final void m6214z(C1050t c1050t, C1040j c1040j) {
        ArrayList<InterfaceC1031a.b> arrayList = this.f7026e.get(c1050t.f6975b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo6067d(this, c1050t, c1040j);
            }
        }
        this.f7023b.mo6067d(this, c1050t, c1040j);
    }
}
