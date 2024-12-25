package p344u3;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:u3/a.class
 */
/* renamed from: u3.a */
/* loaded from: combined.jar:classes1.jar:u3/a.class */
public final class C8786a implements Closeable {

    /* renamed from: b */
    public final File f40745b;

    /* renamed from: c */
    public final File f40746c;

    /* renamed from: d */
    public final File f40747d;

    /* renamed from: e */
    public final File f40748e;

    /* renamed from: f */
    public final int f40749f;

    /* renamed from: g */
    public long f40750g;

    /* renamed from: h */
    public final int f40751h;

    /* renamed from: j */
    public Writer f40753j;

    /* renamed from: l */
    public int f40755l;

    /* renamed from: i */
    public long f40752i = 0;

    /* renamed from: k */
    public final LinkedHashMap<String, c> f40754k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    public long f40756m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f40757n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o */
    public final Callable<Void> f40758o = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u3/a$a.class
     */
    /* renamed from: u3.a$a */
    /* loaded from: combined.jar:classes1.jar:u3/a$a.class */
    public class a implements Callable<Void> {

        /* renamed from: a */
        public final C8786a f40759a;

        public a(C8786a c8786a) {
            this.f40759a = c8786a;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (this.f40759a) {
                if (this.f40759a.f40753j == null) {
                    return null;
                }
                this.f40759a.m37613K0();
                if (this.f40759a.m37607C0()) {
                    this.f40759a.m37611H0();
                    this.f40759a.f40755l = 0;
                }
                return null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u3/a$b.class
     */
    /* renamed from: u3.a$b */
    /* loaded from: combined.jar:classes1.jar:u3/a$b.class */
    public final class b {

        /* renamed from: a */
        public final c f40760a;

        /* renamed from: b */
        public final boolean[] f40761b;

        /* renamed from: c */
        public boolean f40762c;

        /* renamed from: d */
        public final C8786a f40763d;

        public b(C8786a c8786a, c cVar) {
            this.f40763d = c8786a;
            this.f40760a = cVar;
            this.f40761b = cVar.f40768e ? null : new boolean[c8786a.f40751h];
        }

        public /* synthetic */ b(C8786a c8786a, c cVar, a aVar) {
            this(c8786a, cVar);
        }

        /* renamed from: a */
        public void m37620a() {
            this.f40763d.m37605B(this, false);
        }

        /* renamed from: b */
        public void m37621b() {
            if (this.f40762c) {
                return;
            }
            try {
                m37620a();
            } catch (IOException e10) {
            }
        }

        /* renamed from: e */
        public void m37622e() {
            this.f40763d.m37605B(this, true);
            this.f40762c = true;
        }

        /* renamed from: f */
        public File m37623f(int i10) {
            File m37634k;
            synchronized (this.f40763d) {
                if (this.f40760a.f40769f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f40760a.f40768e) {
                    this.f40761b[i10] = true;
                }
                m37634k = this.f40760a.m37634k(i10);
                if (!this.f40763d.f40745b.exists()) {
                    this.f40763d.f40745b.mkdirs();
                }
            }
            return m37634k;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u3/a$c.class
     */
    /* renamed from: u3.a$c */
    /* loaded from: combined.jar:classes1.jar:u3/a$c.class */
    public final class c {

        /* renamed from: a */
        public final String f40764a;

        /* renamed from: b */
        public final long[] f40765b;

        /* renamed from: c */
        public File[] f40766c;

        /* renamed from: d */
        public File[] f40767d;

        /* renamed from: e */
        public boolean f40768e;

        /* renamed from: f */
        public b f40769f;

        /* renamed from: g */
        public long f40770g;

        /* renamed from: h */
        public final C8786a f40771h;

        public c(C8786a c8786a, String str) {
            this.f40771h = c8786a;
            this.f40764a = str;
            this.f40765b = new long[c8786a.f40751h];
            this.f40766c = new File[c8786a.f40751h];
            this.f40767d = new File[c8786a.f40751h];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < c8786a.f40751h; i10++) {
                sb2.append(i10);
                this.f40766c[i10] = new File(c8786a.f40745b, sb2.toString());
                sb2.append(".tmp");
                this.f40767d[i10] = new File(c8786a.f40745b, sb2.toString());
                sb2.setLength(length);
            }
        }

        public /* synthetic */ c(C8786a c8786a, String str, a aVar) {
            this(c8786a, str);
        }

        /* renamed from: j */
        public File m37633j(int i10) {
            return this.f40766c[i10];
        }

        /* renamed from: k */
        public File m37634k(int i10) {
            return this.f40767d[i10];
        }

        /* renamed from: l */
        public String m37635l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f40765b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* renamed from: m */
        public final IOException m37636m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m37637n(String[] strArr) {
            if (strArr.length != this.f40771h.f40751h) {
                throw m37636m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f40765b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException e10) {
                    throw m37636m(strArr);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u3/a$d.class
     */
    /* renamed from: u3.a$d */
    /* loaded from: combined.jar:classes1.jar:u3/a$d.class */
    public final class d {

        /* renamed from: a */
        public final String f40772a;

        /* renamed from: b */
        public final long f40773b;

        /* renamed from: c */
        public final long[] f40774c;

        /* renamed from: d */
        public final File[] f40775d;

        /* renamed from: e */
        public final C8786a f40776e;

        public d(C8786a c8786a, String str, long j10, File[] fileArr, long[] jArr) {
            this.f40776e = c8786a;
            this.f40772a = str;
            this.f40773b = j10;
            this.f40775d = fileArr;
            this.f40774c = jArr;
        }

        public /* synthetic */ d(C8786a c8786a, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(c8786a, str, j10, fileArr, jArr);
        }

        /* renamed from: a */
        public File m37638a(int i10) {
            return this.f40775d[i10];
        }
    }

    public C8786a(File file, int i10, int i11, long j10) {
        this.f40745b = file;
        this.f40749f = i10;
        this.f40746c = new File(file, "journal");
        this.f40747d = new File(file, "journal.tmp");
        this.f40748e = new File(file, "journal.bkp");
        this.f40751h = i11;
        this.f40750g = j10;
    }

    /* renamed from: D0 */
    public static C8786a m37593D0(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m37594J0(file2, file3, false);
            }
        }
        C8786a c8786a = new C8786a(file, i10, i11, j10);
        if (c8786a.f40746c.exists()) {
            try {
                c8786a.m37609F0();
                c8786a.m37608E0();
                return c8786a;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c8786a.m37614o0();
            }
        }
        file.mkdirs();
        C8786a c8786a2 = new C8786a(file, i10, i11, j10);
        c8786a2.m37611H0();
        return c8786a2;
    }

    /* renamed from: J0 */
    public static void m37594J0(File file, File file2, boolean z10) {
        if (z10) {
            m37600q0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: q0 */
    public static void m37600q0(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: A0 */
    public final b m37604A0(String str, long j10) {
        synchronized (this) {
            m37616y();
            c cVar = this.f40754k.get(str);
            if (j10 != -1 && (cVar == null || cVar.f40770g != j10)) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, str, null);
                this.f40754k.put(str, cVar);
            } else if (cVar.f40769f != null) {
                return null;
            }
            b bVar = new b(this, cVar, null);
            cVar.f40769f = bVar;
            this.f40753j.append((CharSequence) "DIRTY");
            this.f40753j.append(' ');
            this.f40753j.append((CharSequence) str);
            this.f40753j.append('\n');
            this.f40753j.flush();
            return bVar;
        }
    }

    /* renamed from: B */
    public final void m37605B(b bVar, boolean z10) {
        synchronized (this) {
            c cVar = bVar.f40760a;
            if (cVar.f40769f != bVar) {
                throw new IllegalStateException();
            }
            int i10 = 0;
            if (z10) {
                i10 = 0;
                if (!cVar.f40768e) {
                    int i11 = 0;
                    while (true) {
                        i10 = 0;
                        if (i11 >= this.f40751h) {
                            break;
                        }
                        if (!bVar.f40761b[i11]) {
                            bVar.m37620a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                        }
                        if (!cVar.m37634k(i11).exists()) {
                            bVar.m37620a();
                            return;
                        }
                        i11++;
                    }
                }
            }
            while (i10 < this.f40751h) {
                File m37634k = cVar.m37634k(i10);
                if (!z10) {
                    m37600q0(m37634k);
                } else if (m37634k.exists()) {
                    File m37633j = cVar.m37633j(i10);
                    m37634k.renameTo(m37633j);
                    long j10 = cVar.f40765b[i10];
                    long length = m37633j.length();
                    cVar.f40765b[i10] = length;
                    this.f40752i = (this.f40752i - j10) + length;
                }
                i10++;
            }
            this.f40755l++;
            cVar.f40769f = null;
            if (cVar.f40768e || z10) {
                cVar.f40768e = true;
                this.f40753j.append((CharSequence) "CLEAN");
                this.f40753j.append(' ');
                this.f40753j.append((CharSequence) cVar.f40764a);
                this.f40753j.append((CharSequence) cVar.m37635l());
                this.f40753j.append('\n');
                if (z10) {
                    long j11 = this.f40756m;
                    this.f40756m = 1 + j11;
                    cVar.f40770g = j11;
                }
            } else {
                this.f40754k.remove(cVar.f40764a);
                this.f40753j.append((CharSequence) "REMOVE");
                this.f40753j.append(' ');
                this.f40753j.append((CharSequence) cVar.f40764a);
                this.f40753j.append('\n');
            }
            this.f40753j.flush();
            if (this.f40752i > this.f40750g || m37607C0()) {
                this.f40757n.submit(this.f40758o);
            }
        }
    }

    /* renamed from: B0 */
    public d m37606B0(String str) {
        synchronized (this) {
            m37616y();
            c cVar = this.f40754k.get(str);
            if (cVar == null) {
                return null;
            }
            if (!cVar.f40768e) {
                return null;
            }
            for (File file : cVar.f40766c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f40755l++;
            this.f40753j.append((CharSequence) "READ");
            this.f40753j.append(' ');
            this.f40753j.append((CharSequence) str);
            this.f40753j.append('\n');
            if (m37607C0()) {
                this.f40757n.submit(this.f40758o);
            }
            return new d(this, str, cVar.f40770g, cVar.f40766c, cVar.f40765b, null);
        }
    }

    /* renamed from: C0 */
    public final boolean m37607C0() {
        int i10 = this.f40755l;
        return i10 >= 2000 && i10 >= this.f40754k.size();
    }

    /* renamed from: E0 */
    public final void m37608E0() {
        m37600q0(this.f40747d);
        Iterator<c> it = this.f40754k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f40769f == null) {
                for (int i10 = 0; i10 < this.f40751h; i10++) {
                    this.f40752i += next.f40765b[i10];
                }
            } else {
                next.f40769f = null;
                for (int i11 = 0; i11 < this.f40751h; i11++) {
                    m37600q0(next.m37633j(i11));
                    m37600q0(next.m37634k(i11));
                }
                it.remove();
            }
        }
    }

    /* renamed from: F0 */
    public final void m37609F0() {
        C8787b c8787b = new C8787b(new FileInputStream(this.f40746c), C8788c.f40783a);
        try {
            String m37642p = c8787b.m37642p();
            String m37642p2 = c8787b.m37642p();
            String m37642p3 = c8787b.m37642p();
            String m37642p4 = c8787b.m37642p();
            String m37642p5 = c8787b.m37642p();
            if (!"libcore.io.DiskLruCache".equals(m37642p) || !"1".equals(m37642p2) || !Integer.toString(this.f40749f).equals(m37642p3) || !Integer.toString(this.f40751h).equals(m37642p4) || !"".equals(m37642p5)) {
                throw new IOException("unexpected journal header: [" + m37642p + ", " + m37642p2 + ", " + m37642p4 + ", " + m37642p5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m37610G0(c8787b.m37642p());
                    i10++;
                } catch (EOFException e10) {
                    this.f40755l = i10 - this.f40754k.size();
                    if (c8787b.m37641o()) {
                        m37611H0();
                    } else {
                        this.f40753j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40746c, true), C8788c.f40783a));
                    }
                    C8788c.m37643a(c8787b);
                    return;
                }
            }
        } catch (Throwable th2) {
            C8788c.m37643a(c8787b);
            throw th2;
        }
    }

    /* renamed from: G0 */
    public final void m37610G0(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i10);
        if (indexOf2 == -1) {
            String substring2 = str.substring(i10);
            substring = substring2;
            if (indexOf == 6) {
                substring = substring2;
                if (str.startsWith("REMOVE")) {
                    this.f40754k.remove(substring2);
                    return;
                }
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        c cVar = this.f40754k.get(substring);
        c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = new c(this, substring, null);
            this.f40754k.put(substring, cVar2);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            cVar2.f40768e = true;
            cVar2.f40769f = null;
            cVar2.m37637n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            cVar2.f40769f = new b(this, cVar2, null);
        } else {
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: H0 */
    public final void m37611H0() {
        synchronized (this) {
            Writer writer = this.f40753j;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40747d), C8788c.f40783a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f40749f));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f40751h));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (c cVar : this.f40754k.values()) {
                    bufferedWriter.write(cVar.f40769f != null ? "DIRTY " + cVar.f40764a + '\n' : "CLEAN " + cVar.f40764a + cVar.m37635l() + '\n');
                }
                bufferedWriter.close();
                if (this.f40746c.exists()) {
                    m37594J0(this.f40746c, this.f40748e, true);
                }
                m37594J0(this.f40747d, this.f40746c, false);
                this.f40748e.delete();
                this.f40753j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40746c, true), C8788c.f40783a));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        }
    }

    /* renamed from: I0 */
    public boolean m37612I0(String str) {
        synchronized (this) {
            m37616y();
            c cVar = this.f40754k.get(str);
            if (cVar != null && cVar.f40769f == null) {
                for (int i10 = 0; i10 < this.f40751h; i10++) {
                    File m37633j = cVar.m37633j(i10);
                    if (m37633j.exists() && !m37633j.delete()) {
                        throw new IOException("failed to delete " + m37633j);
                    }
                    this.f40752i -= cVar.f40765b[i10];
                    cVar.f40765b[i10] = 0;
                }
                this.f40755l++;
                this.f40753j.append((CharSequence) "REMOVE");
                this.f40753j.append(' ');
                this.f40753j.append((CharSequence) str);
                this.f40753j.append('\n');
                this.f40754k.remove(str);
                if (m37607C0()) {
                    this.f40757n.submit(this.f40758o);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: K0 */
    public final void m37613K0() {
        while (this.f40752i > this.f40750g) {
            m37612I0(this.f40754k.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f40753j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f40754k.values()).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f40769f != null) {
                    cVar.f40769f.m37620a();
                }
            }
            m37613K0();
            this.f40753j.close();
            this.f40753j = null;
        }
    }

    /* renamed from: o0 */
    public void m37614o0() {
        close();
        C8788c.m37644b(this.f40745b);
    }

    /* renamed from: v0 */
    public b m37615v0(String str) {
        return m37604A0(str, -1L);
    }

    /* renamed from: y */
    public final void m37616y() {
        if (this.f40753j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }
}
