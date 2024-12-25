package ug;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p411xi.AbstractC9766j;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ug/a.class
 */
/* renamed from: ug.a */
/* loaded from: combined.jar:classes2.jar:ug/a.class */
public final class C9176a implements Closeable {

    /* renamed from: p */
    public static final Pattern f41956p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: q */
    public static final InterfaceC9782z f41957q = new b();

    /* renamed from: b */
    public final File f41958b;

    /* renamed from: c */
    public final File f41959c;

    /* renamed from: d */
    public final File f41960d;

    /* renamed from: e */
    public final File f41961e;

    /* renamed from: f */
    public final int f41962f;

    /* renamed from: g */
    public long f41963g;

    /* renamed from: h */
    public final int f41964h;

    /* renamed from: j */
    public InterfaceC9762f f41966j;

    /* renamed from: l */
    public int f41968l;

    /* renamed from: i */
    public long f41965i = 0;

    /* renamed from: k */
    public final LinkedHashMap<String, d> f41967k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    public long f41969m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f41970n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C9183h.m38698r("OkHttp DiskLruCache", true));

    /* renamed from: o */
    public final Runnable f41971o = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/a$a.class
     */
    /* renamed from: ug.a$a */
    /* loaded from: combined.jar:classes2.jar:ug/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C9176a f41972b;

        public a(C9176a c9176a) {
            this.f41972b = c9176a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f41972b) {
                if (this.f41972b.f41966j == null) {
                    return;
                }
                try {
                    this.f41972b.m38637O0();
                    if (this.f41972b.m38630F0()) {
                        this.f41972b.m38634K0();
                        this.f41972b.f41968l = 0;
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/a$b.class
     */
    /* renamed from: ug.a$b */
    /* loaded from: combined.jar:classes2.jar:ug/a$b.class */
    public static final class b implements InterfaceC9782z {
        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(C9761e c9761e, long j10) {
        }

        @Override // p411xi.InterfaceC9782z
        public C9758c0 timeout() {
            return C9758c0.f44503d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/a$c.class
     */
    /* renamed from: ug.a$c */
    /* loaded from: combined.jar:classes2.jar:ug/a$c.class */
    public final class c {

        /* renamed from: a */
        public final d f41973a;

        /* renamed from: b */
        public final boolean[] f41974b;

        /* renamed from: c */
        public boolean f41975c;

        /* renamed from: d */
        public boolean f41976d;

        /* renamed from: e */
        public final C9176a f41977e;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ug/a$c$a.class
         */
        /* renamed from: ug.a$c$a */
        /* loaded from: combined.jar:classes2.jar:ug/a$c$a.class */
        public class a extends AbstractC9766j {

            /* renamed from: c */
            public final c f41978c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, InterfaceC9782z interfaceC9782z) {
                super(interfaceC9782z);
                this.f41978c = cVar;
            }

            @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    super.close();
                } catch (IOException e10) {
                    synchronized (this.f41978c.f41977e) {
                        this.f41978c.f41975c = true;
                    }
                }
            }

            @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z, java.io.Flushable
            public void flush() {
                try {
                    super.flush();
                } catch (IOException e10) {
                    synchronized (this.f41978c.f41977e) {
                        this.f41978c.f41975c = true;
                    }
                }
            }

            @Override // p411xi.AbstractC9766j, p411xi.InterfaceC9782z
            /* renamed from: h */
            public void mo32031h(C9761e c9761e, long j10) {
                try {
                    super.mo32031h(c9761e, j10);
                } catch (IOException e10) {
                    synchronized (this.f41978c.f41977e) {
                        this.f41978c.f41975c = true;
                    }
                }
            }
        }

        public c(C9176a c9176a, d dVar) {
            this.f41977e = c9176a;
            this.f41973a = dVar;
            this.f41974b = dVar.f41983e ? null : new boolean[c9176a.f41964h];
        }

        public /* synthetic */ c(C9176a c9176a, d dVar, a aVar) {
            this(c9176a, dVar);
        }

        /* renamed from: a */
        public void m38644a() {
            synchronized (this.f41977e) {
                this.f41977e.m38640v0(this, false);
            }
        }

        /* renamed from: e */
        public void m38645e() {
            synchronized (this.f41977e) {
                if (this.f41975c) {
                    this.f41977e.m38640v0(this, false);
                    this.f41977e.m38636M0(this.f41973a);
                } else {
                    this.f41977e.m38640v0(this, true);
                }
                this.f41976d = true;
            }
        }

        /* renamed from: f */
        public InterfaceC9782z m38646f(int i10) {
            InterfaceC9782z m41231e;
            a aVar;
            synchronized (this.f41977e) {
                if (this.f41973a.f41984f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f41973a.f41983e) {
                    this.f41974b[i10] = true;
                }
                File file = this.f41973a.f41982d[i10];
                try {
                    m41231e = C9772p.m41231e(file);
                } catch (FileNotFoundException e10) {
                    this.f41977e.f41958b.mkdirs();
                    try {
                        m41231e = C9772p.m41231e(file);
                    } catch (FileNotFoundException e11) {
                        return C9176a.f41957q;
                    }
                }
                aVar = new a(this, m41231e);
            }
            return aVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/a$d.class
     */
    /* renamed from: ug.a$d */
    /* loaded from: combined.jar:classes2.jar:ug/a$d.class */
    public final class d {

        /* renamed from: a */
        public final String f41979a;

        /* renamed from: b */
        public final long[] f41980b;

        /* renamed from: c */
        public final File[] f41981c;

        /* renamed from: d */
        public final File[] f41982d;

        /* renamed from: e */
        public boolean f41983e;

        /* renamed from: f */
        public c f41984f;

        /* renamed from: g */
        public long f41985g;

        /* renamed from: h */
        public final C9176a f41986h;

        public d(C9176a c9176a, String str) {
            this.f41986h = c9176a;
            this.f41979a = str;
            this.f41980b = new long[c9176a.f41964h];
            this.f41981c = new File[c9176a.f41964h];
            this.f41982d = new File[c9176a.f41964h];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < c9176a.f41964h; i10++) {
                sb2.append(i10);
                this.f41981c[i10] = new File(c9176a.f41958b, sb2.toString());
                sb2.append(".tmp");
                this.f41982d[i10] = new File(c9176a.f41958b, sb2.toString());
                sb2.setLength(length);
            }
        }

        public /* synthetic */ d(C9176a c9176a, String str, a aVar) {
            this(c9176a, str);
        }

        /* renamed from: l */
        public String m38658l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f41980b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* renamed from: m */
        public final IOException m38659m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m38660n(String[] strArr) {
            if (strArr.length != this.f41986h.f41964h) {
                throw m38659m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f41980b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException e10) {
                    throw m38659m(strArr);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/a$e.class
     */
    /* renamed from: ug.a$e */
    /* loaded from: combined.jar:classes2.jar:ug/a$e.class */
    public final class e implements Closeable {

        /* renamed from: b */
        public final String f41987b;

        /* renamed from: c */
        public final long f41988c;

        /* renamed from: d */
        public final InterfaceC9756b0[] f41989d;

        /* renamed from: e */
        public final long[] f41990e;

        /* renamed from: f */
        public final C9176a f41991f;

        public e(C9176a c9176a, String str, long j10, InterfaceC9756b0[] interfaceC9756b0Arr, long[] jArr) {
            this.f41991f = c9176a;
            this.f41987b = str;
            this.f41988c = j10;
            this.f41989d = interfaceC9756b0Arr;
            this.f41990e = jArr;
        }

        public /* synthetic */ e(C9176a c9176a, String str, long j10, InterfaceC9756b0[] interfaceC9756b0Arr, long[] jArr, a aVar) {
            this(c9176a, str, j10, interfaceC9756b0Arr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InterfaceC9756b0 interfaceC9756b0 : this.f41989d) {
                C9183h.m38683c(interfaceC9756b0);
            }
        }

        /* renamed from: f */
        public c m38661f() {
            return this.f41991f.m38628D0(this.f41987b, this.f41988c);
        }

        /* renamed from: l */
        public InterfaceC9756b0 m38662l(int i10) {
            return this.f41989d[i10];
        }
    }

    public C9176a(File file, int i10, int i11, long j10) {
        this.f41958b = file;
        this.f41962f = i10;
        this.f41959c = new File(file, "journal");
        this.f41960d = new File(file, "journal.tmp");
        this.f41961e = new File(file, "journal.bkp");
        this.f41964h = i11;
        this.f41963g = j10;
    }

    /* renamed from: B0 */
    public static void m38613B0(File file) {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    /* renamed from: G0 */
    public static C9176a m38614G0(File file, int i10, int i11, long j10) {
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
                m38615N0(file2, file3, false);
            }
        }
        C9176a c9176a = new C9176a(file, i10, i11, j10);
        if (c9176a.f41959c.exists()) {
            try {
                c9176a.m38632I0();
                c9176a.m38631H0();
                return c9176a;
            } catch (IOException e10) {
                C9181f.m38667e().m38672h("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c9176a.m38626A0();
            }
        }
        file.mkdirs();
        C9176a c9176a2 = new C9176a(file, i10, i11, j10);
        c9176a2.m38634K0();
        return c9176a2;
    }

    /* renamed from: N0 */
    public static void m38615N0(File file, File file2, boolean z10) {
        if (z10) {
            m38613B0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: A0 */
    public void m38626A0() {
        close();
        C9183h.m38685e(this.f41958b);
    }

    /* renamed from: C0 */
    public c m38627C0(String str) {
        return m38628D0(str, -1L);
    }

    /* renamed from: D0 */
    public final c m38628D0(String str, long j10) {
        synchronized (this) {
            m38639q0();
            m38638P0(str);
            d dVar = this.f41967k.get(str);
            if (j10 != -1 && (dVar == null || dVar.f41985g != j10)) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str, null);
                this.f41967k.put(str, dVar);
            } else if (dVar.f41984f != null) {
                return null;
            }
            c cVar = new c(this, dVar, null);
            dVar.f41984f = cVar;
            this.f41966j.mo41136Q("DIRTY").writeByte(32).mo41136Q(str).writeByte(10);
            this.f41966j.flush();
            return cVar;
        }
    }

    /* renamed from: E0 */
    public e m38629E0(String str) {
        InterfaceC9756b0 interfaceC9756b0;
        synchronized (this) {
            m38639q0();
            m38638P0(str);
            d dVar = this.f41967k.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f41983e) {
                return null;
            }
            InterfaceC9756b0[] interfaceC9756b0Arr = new InterfaceC9756b0[this.f41964h];
            for (int i10 = 0; i10 < this.f41964h; i10++) {
                try {
                    interfaceC9756b0Arr[i10] = C9772p.m41236j(dVar.f41981c[i10]);
                } catch (FileNotFoundException e10) {
                    for (int i11 = 0; i11 < this.f41964h && (interfaceC9756b0 = interfaceC9756b0Arr[i11]) != null; i11++) {
                        C9183h.m38683c(interfaceC9756b0);
                    }
                    return null;
                }
            }
            this.f41968l++;
            this.f41966j.mo41136Q("READ").writeByte(32).mo41136Q(str).writeByte(10);
            if (m38630F0()) {
                this.f41970n.execute(this.f41971o);
            }
            return new e(this, str, dVar.f41985g, interfaceC9756b0Arr, dVar.f41980b, null);
        }
    }

    /* renamed from: F0 */
    public final boolean m38630F0() {
        int i10 = this.f41968l;
        return i10 >= 2000 && i10 >= this.f41967k.size();
    }

    /* renamed from: H0 */
    public final void m38631H0() {
        m38613B0(this.f41960d);
        Iterator<d> it = this.f41967k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f41984f == null) {
                for (int i10 = 0; i10 < this.f41964h; i10++) {
                    this.f41965i += next.f41980b[i10];
                }
            } else {
                next.f41984f = null;
                for (int i11 = 0; i11 < this.f41964h; i11++) {
                    m38613B0(next.f41981c[i11]);
                    m38613B0(next.f41982d[i11]);
                }
                it.remove();
            }
        }
    }

    /* renamed from: I0 */
    public final void m38632I0() {
        InterfaceC9763g m41229c = C9772p.m41229c(C9772p.m41236j(this.f41959c));
        try {
            String mo41143V = m41229c.mo41143V();
            String mo41143V2 = m41229c.mo41143V();
            String mo41143V3 = m41229c.mo41143V();
            String mo41143V4 = m41229c.mo41143V();
            String mo41143V5 = m41229c.mo41143V();
            if (!"libcore.io.DiskLruCache".equals(mo41143V) || !"1".equals(mo41143V2) || !Integer.toString(this.f41962f).equals(mo41143V3) || !Integer.toString(this.f41964h).equals(mo41143V4) || !"".equals(mo41143V5)) {
                throw new IOException("unexpected journal header: [" + mo41143V + ", " + mo41143V2 + ", " + mo41143V4 + ", " + mo41143V5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m38633J0(m41229c.mo41143V());
                    i10++;
                } catch (EOFException e10) {
                    this.f41968l = i10 - this.f41967k.size();
                    if (m41229c.mo41164k0()) {
                        this.f41966j = C9772p.m41228b(C9772p.m41227a(this.f41959c));
                    } else {
                        m38634K0();
                    }
                    C9183h.m38683c(m41229c);
                    return;
                }
            }
        } catch (Throwable th2) {
            C9183h.m38683c(m41229c);
            throw th2;
        }
    }

    /* renamed from: J0 */
    public final void m38633J0(String str) {
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
                    this.f41967k.remove(substring2);
                    return;
                }
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = this.f41967k.get(substring);
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = new d(this, substring, null);
            this.f41967k.put(substring, dVar2);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar2.f41983e = true;
            dVar2.f41984f = null;
            dVar2.m38660n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar2.f41984f = new c(this, dVar2, null);
        } else {
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: K0 */
    public final void m38634K0() {
        synchronized (this) {
            InterfaceC9762f interfaceC9762f = this.f41966j;
            if (interfaceC9762f != null) {
                interfaceC9762f.close();
            }
            InterfaceC9762f m41228b = C9772p.m41228b(C9772p.m41231e(this.f41960d));
            try {
                m41228b.mo41136Q("libcore.io.DiskLruCache").writeByte(10);
                m41228b.mo41136Q("1").writeByte(10);
                m41228b.mo41136Q(Integer.toString(this.f41962f)).writeByte(10);
                m41228b.mo41136Q(Integer.toString(this.f41964h)).writeByte(10);
                m41228b.writeByte(10);
                for (d dVar : this.f41967k.values()) {
                    if (dVar.f41984f != null) {
                        m41228b.mo41136Q("DIRTY").writeByte(32);
                        m41228b.mo41136Q(dVar.f41979a);
                    } else {
                        m41228b.mo41136Q("CLEAN").writeByte(32);
                        m41228b.mo41136Q(dVar.f41979a);
                        m41228b.mo41136Q(dVar.m38658l());
                    }
                    m41228b.writeByte(10);
                }
                m41228b.close();
                if (this.f41959c.exists()) {
                    m38615N0(this.f41959c, this.f41961e, true);
                }
                m38615N0(this.f41960d, this.f41959c, false);
                this.f41961e.delete();
                this.f41966j = C9772p.m41228b(C9772p.m41227a(this.f41959c));
            } catch (Throwable th2) {
                m41228b.close();
                throw th2;
            }
        }
    }

    /* renamed from: L0 */
    public boolean m38635L0(String str) {
        synchronized (this) {
            m38639q0();
            m38638P0(str);
            d dVar = this.f41967k.get(str);
            if (dVar == null) {
                return false;
            }
            return m38636M0(dVar);
        }
    }

    /* renamed from: M0 */
    public final boolean m38636M0(d dVar) {
        if (dVar.f41984f != null) {
            dVar.f41984f.f41975c = true;
        }
        for (int i10 = 0; i10 < this.f41964h; i10++) {
            m38613B0(dVar.f41981c[i10]);
            this.f41965i -= dVar.f41980b[i10];
            dVar.f41980b[i10] = 0;
        }
        this.f41968l++;
        this.f41966j.mo41136Q("REMOVE").writeByte(32).mo41136Q(dVar.f41979a).writeByte(10);
        this.f41967k.remove(dVar.f41979a);
        if (!m38630F0()) {
            return true;
        }
        this.f41970n.execute(this.f41971o);
        return true;
    }

    /* renamed from: O0 */
    public final void m38637O0() {
        while (this.f41965i > this.f41963g) {
            m38636M0(this.f41967k.values().iterator().next());
        }
    }

    /* renamed from: P0 */
    public final void m38638P0(String str) {
        if (f41956p.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f41966j == null) {
                return;
            }
            for (d dVar : (d[]) this.f41967k.values().toArray(new d[this.f41967k.size()])) {
                if (dVar.f41984f != null) {
                    dVar.f41984f.m38644a();
                }
            }
            m38637O0();
            this.f41966j.close();
            this.f41966j = null;
        }
    }

    /* renamed from: q0 */
    public final void m38639q0() {
        if (this.f41966j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: v0 */
    public final void m38640v0(c cVar, boolean z10) {
        synchronized (this) {
            d dVar = cVar.f41973a;
            if (dVar.f41984f != cVar) {
                throw new IllegalStateException();
            }
            int i10 = 0;
            if (z10) {
                i10 = 0;
                if (!dVar.f41983e) {
                    int i11 = 0;
                    while (true) {
                        i10 = 0;
                        if (i11 >= this.f41964h) {
                            break;
                        }
                        if (!cVar.f41974b[i11]) {
                            cVar.m38644a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                        }
                        if (!dVar.f41982d[i11].exists()) {
                            cVar.m38644a();
                            return;
                        }
                        i11++;
                    }
                }
            }
            while (i10 < this.f41964h) {
                File file = dVar.f41982d[i10];
                if (!z10) {
                    m38613B0(file);
                } else if (file.exists()) {
                    File file2 = dVar.f41981c[i10];
                    file.renameTo(file2);
                    long j10 = dVar.f41980b[i10];
                    long length = file2.length();
                    dVar.f41980b[i10] = length;
                    this.f41965i = (this.f41965i - j10) + length;
                }
                i10++;
            }
            this.f41968l++;
            dVar.f41984f = null;
            if (dVar.f41983e || z10) {
                dVar.f41983e = true;
                this.f41966j.mo41136Q("CLEAN").writeByte(32);
                this.f41966j.mo41136Q(dVar.f41979a);
                this.f41966j.mo41136Q(dVar.m38658l());
                this.f41966j.writeByte(10);
                if (z10) {
                    long j11 = this.f41969m;
                    this.f41969m = 1 + j11;
                    dVar.f41985g = j11;
                }
            } else {
                this.f41967k.remove(dVar.f41979a);
                this.f41966j.mo41136Q("REMOVE").writeByte(32);
                this.f41966j.mo41136Q(dVar.f41979a);
                this.f41966j.writeByte(10);
            }
            this.f41966j.flush();
            if (this.f41965i > this.f41963g || m38630F0()) {
                this.f41970n.execute(this.f41971o);
            }
        }
    }
}
