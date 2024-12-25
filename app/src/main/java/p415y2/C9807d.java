package p415y2;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p395x2.C9628g;
import p395x2.C9643v;
import p395x2.InterfaceC9623b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/d.class
 */
/* renamed from: y2.d */
/* loaded from: combined.jar:classes1.jar:y2/d.class */
public class C9807d implements InterfaceC9623b {

    /* renamed from: a */
    public final Map<String, a> f45113a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    public long f45114b = 0;

    /* renamed from: c */
    public final File f45115c;

    /* renamed from: d */
    public final int f45116d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y2/d$a.class
     */
    /* renamed from: y2.d$a */
    /* loaded from: combined.jar:classes1.jar:y2/d$a.class */
    public static class a {

        /* renamed from: a */
        public long f45117a;

        /* renamed from: b */
        public final String f45118b;

        /* renamed from: c */
        public final String f45119c;

        /* renamed from: d */
        public final long f45120d;

        /* renamed from: e */
        public final long f45121e;

        /* renamed from: f */
        public final long f45122f;

        /* renamed from: g */
        public final long f45123g;

        /* renamed from: h */
        public final List<C9628g> f45124h;

        public a(String str, String str2, long j10, long j11, long j12, long j13, List<C9628g> list) {
            this.f45118b = str;
            this.f45119c = "".equals(str2) ? null : str2;
            this.f45120d = j10;
            this.f45121e = j11;
            this.f45122f = j12;
            this.f45123g = j13;
            this.f45124h = list;
        }

        public a(String str, InterfaceC9623b.a aVar) {
            this(str, aVar.f43945b, aVar.f43946c, aVar.f43947d, aVar.f43948e, aVar.f43949f, m41315a(aVar));
            this.f45117a = aVar.f43944a.length;
        }

        /* renamed from: a */
        public static List<C9628g> m41315a(InterfaceC9623b.a aVar) {
            List<C9628g> list = aVar.f43951h;
            return list != null ? list : C9808e.m41324e(aVar.f43950g);
        }

        /* renamed from: b */
        public static a m41316b(b bVar) {
            if (C9807d.m41299j(bVar) == 538247942) {
                return new a(C9807d.m41301l(bVar), C9807d.m41301l(bVar), C9807d.m41300k(bVar), C9807d.m41300k(bVar), C9807d.m41300k(bVar), C9807d.m41300k(bVar), C9807d.m41298i(bVar));
            }
            throw new IOException();
        }

        /* renamed from: c */
        public InterfaceC9623b.a m41317c(byte[] bArr) {
            InterfaceC9623b.a aVar = new InterfaceC9623b.a();
            aVar.f43944a = bArr;
            aVar.f43945b = this.f45119c;
            aVar.f43946c = this.f45120d;
            aVar.f43947d = this.f45121e;
            aVar.f43948e = this.f45122f;
            aVar.f43949f = this.f45123g;
            aVar.f43950g = C9808e.m41325f(this.f45124h);
            aVar.f43951h = Collections.unmodifiableList(this.f45124h);
            return aVar;
        }

        /* renamed from: d */
        public boolean m41318d(OutputStream outputStream) {
            try {
                C9807d.m41304q(outputStream, 538247942);
                C9807d.m41306s(outputStream, this.f45118b);
                String str = this.f45119c;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                C9807d.m41306s(outputStream, str2);
                C9807d.m41305r(outputStream, this.f45120d);
                C9807d.m41305r(outputStream, this.f45121e);
                C9807d.m41305r(outputStream, this.f45122f);
                C9807d.m41305r(outputStream, this.f45123g);
                C9807d.m41303p(this.f45124h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                C9643v.m40578b("%s", e10.toString());
                return false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y2/d$b.class
     */
    /* renamed from: y2.d$b */
    /* loaded from: combined.jar:classes1.jar:y2/d$b.class */
    public static class b extends FilterInputStream {

        /* renamed from: b */
        public final long f45125b;

        /* renamed from: c */
        public long f45126c;

        public b(InputStream inputStream, long j10) {
            super(inputStream);
            this.f45125b = j10;
        }

        /* renamed from: f */
        public long m41319f() {
            return this.f45125b - this.f45126c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f45126c++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = super.read(bArr, i10, i11);
            if (read != -1) {
                this.f45126c += read;
            }
            return read;
        }
    }

    public C9807d(File file, int i10) {
        this.f45115c = file;
        this.f45116d = i10;
    }

    /* renamed from: h */
    public static int m41297h(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* renamed from: i */
    public static List<C9628g> m41298i(b bVar) {
        int m41299j = m41299j(bVar);
        if (m41299j < 0) {
            throw new IOException("readHeaderList size=" + m41299j);
        }
        ArrayList emptyList = m41299j == 0 ? Collections.emptyList() : new ArrayList();
        for (int i10 = 0; i10 < m41299j; i10++) {
            emptyList.add(new C9628g(m41301l(bVar).intern(), m41301l(bVar).intern()));
        }
        return emptyList;
    }

    /* renamed from: j */
    public static int m41299j(InputStream inputStream) {
        return (m41297h(inputStream) << 24) | (m41297h(inputStream) << 0) | 0 | (m41297h(inputStream) << 8) | (m41297h(inputStream) << 16);
    }

    /* renamed from: k */
    public static long m41300k(InputStream inputStream) {
        return ((m41297h(inputStream) & 255) << 0) | 0 | ((m41297h(inputStream) & 255) << 8) | ((m41297h(inputStream) & 255) << 16) | ((m41297h(inputStream) & 255) << 24) | ((m41297h(inputStream) & 255) << 32) | ((m41297h(inputStream) & 255) << 40) | ((m41297h(inputStream) & 255) << 48) | ((255 & m41297h(inputStream)) << 56);
    }

    /* renamed from: l */
    public static String m41301l(b bVar) {
        return new String(m41302o(bVar, m41300k(bVar)), "UTF-8");
    }

    /* renamed from: o */
    public static byte[] m41302o(b bVar, long j10) {
        long m41319f = bVar.m41319f();
        if (j10 >= 0 && j10 <= m41319f) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + m41319f);
    }

    /* renamed from: p */
    public static void m41303p(List<C9628g> list, OutputStream outputStream) {
        if (list == null) {
            m41304q(outputStream, 0);
            return;
        }
        m41304q(outputStream, list.size());
        for (C9628g c9628g : list) {
            m41306s(outputStream, c9628g.m40518a());
            m41306s(outputStream, c9628g.m40519b());
        }
    }

    /* renamed from: q */
    public static void m41304q(OutputStream outputStream, int i10) {
        outputStream.write((i10 >> 0) & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    /* renamed from: r */
    public static void m41305r(OutputStream outputStream, long j10) {
        outputStream.write((byte) (j10 >>> 0));
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    /* renamed from: s */
    public static void m41306s(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m41305r(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // p395x2.InterfaceC9623b
    /* renamed from: a */
    public void mo40499a(String str, InterfaceC9623b.a aVar) {
        synchronized (this) {
            m41311f(aVar.f43944a.length);
            File m41309d = m41309d(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m41308c(m41309d));
                a aVar2 = new a(str, aVar);
                if (!aVar2.m41318d(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    C9643v.m40578b("Failed to write header for %s", m41309d.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(aVar.f43944a);
                bufferedOutputStream.close();
                m41312g(str, aVar2);
            } catch (IOException e10) {
                if (!m41309d.delete()) {
                    C9643v.m40578b("Could not clean up file %s", m41309d.getAbsolutePath());
                }
            }
        }
    }

    /* renamed from: b */
    public InputStream m41307b(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: c */
    public OutputStream m41308c(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: d */
    public File m41309d(String str) {
        return new File(this.f45115c, m41310e(str));
    }

    /* renamed from: e */
    public final String m41310e(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: f */
    public final void m41311f(int i10) {
        int i11;
        if (this.f45114b + i10 < this.f45116d) {
            return;
        }
        if (C9643v.f44021b) {
            C9643v.m40581e("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f45114b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f45113a.entrySet().iterator();
        int i12 = 0;
        while (true) {
            i11 = i12;
            if (!it.hasNext()) {
                break;
            }
            a value = it.next().getValue();
            if (m41309d(value.f45118b).delete()) {
                this.f45114b -= value.f45117a;
            } else {
                String str = value.f45118b;
                C9643v.m40578b("Could not delete cache entry for key=%s, filename=%s", str, m41310e(str));
            }
            it.remove();
            i12++;
            if (this.f45114b + r0 < this.f45116d * 0.9f) {
                i11 = i12;
                break;
            }
        }
        if (C9643v.f44021b) {
            C9643v.m40581e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f45114b - j10), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* renamed from: g */
    public final void m41312g(String str, a aVar) {
        if (this.f45113a.containsKey(str)) {
            this.f45114b += aVar.f45117a - this.f45113a.get(str).f45117a;
        } else {
            this.f45114b += aVar.f45117a;
        }
        this.f45113a.put(str, aVar);
    }

    @Override // p395x2.InterfaceC9623b
    public InterfaceC9623b.a get(String str) {
        synchronized (this) {
            a aVar = this.f45113a.get(str);
            if (aVar == null) {
                return null;
            }
            File m41309d = m41309d(str);
            try {
                b bVar = new b(new BufferedInputStream(m41307b(m41309d)), m41309d.length());
                try {
                    a m41316b = a.m41316b(bVar);
                    if (TextUtils.equals(str, m41316b.f45118b)) {
                        return aVar.m41317c(m41302o(bVar, bVar.m41319f()));
                    }
                    C9643v.m40578b("%s: key=%s, found=%s", m41309d.getAbsolutePath(), str, m41316b.f45118b);
                    m41314n(str);
                    return null;
                } finally {
                    bVar.close();
                }
            } catch (IOException e10) {
                C9643v.m40578b("%s: %s", m41309d.getAbsolutePath(), e10.toString());
                m41313m(str);
                return null;
            }
        }
    }

    @Override // p395x2.InterfaceC9623b
    public void initialize() {
        long length;
        b bVar;
        synchronized (this) {
            if (!this.f45115c.exists()) {
                if (!this.f45115c.mkdirs()) {
                    C9643v.m40579c("Unable to create cache dir %s", this.f45115c.getAbsolutePath());
                }
                return;
            }
            File[] listFiles = this.f45115c.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                try {
                    length = file.length();
                    bVar = new b(new BufferedInputStream(m41307b(file)), length);
                } catch (IOException e10) {
                    file.delete();
                }
                try {
                    a m41316b = a.m41316b(bVar);
                    m41316b.f45117a = length;
                    m41312g(m41316b.f45118b, m41316b);
                    bVar.close();
                } catch (Throwable th2) {
                    bVar.close();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: m */
    public void m41313m(String str) {
        synchronized (this) {
            boolean delete = m41309d(str).delete();
            m41314n(str);
            if (!delete) {
                C9643v.m40578b("Could not delete cache entry for key=%s, filename=%s", str, m41310e(str));
            }
        }
    }

    /* renamed from: n */
    public final void m41314n(String str) {
        a remove = this.f45113a.remove(str);
        if (remove != null) {
            this.f45114b -= remove.f45117a;
        }
    }
}
