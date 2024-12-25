package p395x2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import p395x2.C9637p;
import p395x2.C9643v;
import p395x2.InterfaceC9623b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/n.class
 */
/* renamed from: x2.n */
/* loaded from: combined.jar:classes1.jar:x2/n.class */
public abstract class AbstractC9635n<T> implements Comparable<AbstractC9635n<T>> {

    /* renamed from: b */
    public final C9643v.a f43986b;

    /* renamed from: c */
    public final int f43987c;

    /* renamed from: d */
    public final String f43988d;

    /* renamed from: e */
    public final int f43989e;

    /* renamed from: f */
    public final Object f43990f;

    /* renamed from: g */
    public C9637p.a f43991g;

    /* renamed from: h */
    public Integer f43992h;

    /* renamed from: i */
    public C9636o f43993i;

    /* renamed from: j */
    public boolean f43994j;

    /* renamed from: k */
    public boolean f43995k;

    /* renamed from: l */
    public boolean f43996l;

    /* renamed from: m */
    public boolean f43997m;

    /* renamed from: n */
    public InterfaceC9639r f43998n;

    /* renamed from: o */
    public InterfaceC9623b.a f43999o;

    /* renamed from: p */
    public b f44000p;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/n$a.class
     */
    /* renamed from: x2.n$a */
    /* loaded from: combined.jar:classes1.jar:x2/n$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final String f44001b;

        /* renamed from: c */
        public final long f44002c;

        /* renamed from: d */
        public final AbstractC9635n f44003d;

        public a(AbstractC9635n abstractC9635n, String str, long j10) {
            this.f44003d = abstractC9635n;
            this.f44001b = str;
            this.f44002c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44003d.f43986b.m40582a(this.f44001b, this.f44002c);
            this.f44003d.f43986b.m40583b(this.f44003d.toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/n$b.class
     */
    /* renamed from: x2.n$b */
    /* loaded from: combined.jar:classes1.jar:x2/n$b.class */
    public interface b {
        /* renamed from: a */
        void mo40508a(AbstractC9635n<?> abstractC9635n, C9637p<?> c9637p);

        /* renamed from: b */
        void mo40509b(AbstractC9635n<?> abstractC9635n);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/n$c.class
     */
    /* renamed from: x2.n$c */
    /* loaded from: combined.jar:classes1.jar:x2/n$c.class */
    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC9635n(int i10, String str, C9637p.a aVar) {
        this.f43986b = C9643v.a.f44023c ? new C9643v.a() : null;
        this.f43990f = new Object();
        this.f43994j = true;
        this.f43995k = false;
        this.f43996l = false;
        this.f43997m = false;
        this.f43999o = null;
        this.f43987c = i10;
        this.f43988d = str;
        this.f43991g = aVar;
        m40542M(new C9626e());
        this.f43989e = m40529i(str);
    }

    /* renamed from: i */
    public static int m40529i(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: A */
    public int m40530A() {
        return this.f43989e;
    }

    /* renamed from: B */
    public String m40531B() {
        return this.f43988d;
    }

    /* renamed from: C */
    public boolean m40532C() {
        boolean z10;
        synchronized (this.f43990f) {
            z10 = this.f43996l;
        }
        return z10;
    }

    /* renamed from: D */
    public boolean m40533D() {
        boolean z10;
        synchronized (this.f43990f) {
            z10 = this.f43995k;
        }
        return z10;
    }

    /* renamed from: E */
    public void m40534E() {
        synchronized (this.f43990f) {
            this.f43996l = true;
        }
    }

    /* renamed from: F */
    public void m40535F() {
        b bVar;
        synchronized (this.f43990f) {
            bVar = this.f44000p;
        }
        if (bVar != null) {
            bVar.mo40509b(this);
        }
    }

    /* renamed from: G */
    public void m40536G(C9637p<?> c9637p) {
        b bVar;
        synchronized (this.f43990f) {
            bVar = this.f44000p;
        }
        if (bVar != null) {
            bVar.mo40508a(this, c9637p);
        }
    }

    /* renamed from: H */
    public C9642u m40537H(C9642u c9642u) {
        return c9642u;
    }

    /* renamed from: I */
    public abstract C9637p<T> mo40538I(C9632k c9632k);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public AbstractC9635n<?> m40539J(InterfaceC9623b.a aVar) {
        this.f43999o = aVar;
        return this;
    }

    /* renamed from: K */
    public void m40540K(b bVar) {
        synchronized (this.f43990f) {
            this.f44000p = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public AbstractC9635n<?> m40541L(C9636o c9636o) {
        this.f43993i = c9636o;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public AbstractC9635n<?> m40542M(InterfaceC9639r interfaceC9639r) {
        this.f43998n = interfaceC9639r;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final AbstractC9635n<?> m40543N(int i10) {
        this.f43992h = Integer.valueOf(i10);
        return this;
    }

    /* renamed from: O */
    public final boolean m40544O() {
        return this.f43994j;
    }

    /* renamed from: P */
    public final boolean m40545P() {
        return this.f43997m;
    }

    /* renamed from: b */
    public void m40546b(String str) {
        if (C9643v.a.f44023c) {
            this.f43986b.m40582a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: d */
    public void mo40547d() {
        synchronized (this.f43990f) {
            this.f43995k = true;
            this.f43991g = null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC9635n<T> abstractC9635n) {
        c mo40564x = mo40564x();
        c mo40564x2 = abstractC9635n.mo40564x();
        return mo40564x == mo40564x2 ? this.f43992h.intValue() - abstractC9635n.f43992h.intValue() : mo40564x2.ordinal() - mo40564x.ordinal();
    }

    /* renamed from: f */
    public void m40549f(C9642u c9642u) {
        C9637p.a aVar;
        synchronized (this.f43990f) {
            aVar = this.f43991g;
        }
        if (aVar != null) {
            aVar.mo6895a(c9642u);
        }
    }

    /* renamed from: g */
    public abstract void mo40550g(T t10);

    /* renamed from: h */
    public final byte[] m40551h(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb2.append(URLEncoder.encode(entry.getKey(), str));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), str));
                sb2.append('&');
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    /* renamed from: j */
    public void m40552j(String str) {
        C9636o c9636o = this.f43993i;
        if (c9636o != null) {
            c9636o.m40568b(this);
        }
        if (C9643v.a.f44023c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(this, str, id2));
            } else {
                this.f43986b.m40582a(str, id2);
                this.f43986b.m40583b(toString());
            }
        }
    }

    /* renamed from: m */
    public byte[] m40553m() {
        Map<String, String> m40559s = m40559s();
        if (m40559s == null || m40559s.size() <= 0) {
            return null;
        }
        return m40551h(m40559s, m40560t());
    }

    /* renamed from: n */
    public String m40554n() {
        return "application/x-www-form-urlencoded; charset=" + m40560t();
    }

    /* renamed from: o */
    public InterfaceC9623b.a m40555o() {
        return this.f43999o;
    }

    /* renamed from: p */
    public String m40556p() {
        String m40531B = m40531B();
        int m40558r = m40558r();
        String str = m40531B;
        if (m40558r != 0) {
            if (m40558r == -1) {
                str = m40531B;
            } else {
                str = Integer.toString(m40558r) + '-' + m40531B;
            }
        }
        return str;
    }

    /* renamed from: q */
    public Map<String, String> m40557q() {
        return Collections.emptyMap();
    }

    /* renamed from: r */
    public int m40558r() {
        return this.f43987c;
    }

    /* renamed from: s */
    public Map<String, String> m40559s() {
        return null;
    }

    /* renamed from: t */
    public String m40560t() {
        return "UTF-8";
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(m40530A());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m40533D() ? "[X] " : "[ ] ");
        sb2.append(m40531B());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(mo40564x());
        sb2.append(" ");
        sb2.append(this.f43992h);
        return sb2.toString();
    }

    @Deprecated
    /* renamed from: u */
    public byte[] m40561u() {
        Map<String, String> m40562v = m40562v();
        if (m40562v == null || m40562v.size() <= 0) {
            return null;
        }
        return m40551h(m40562v, m40563w());
    }

    @Deprecated
    /* renamed from: v */
    public Map<String, String> m40562v() {
        return m40559s();
    }

    @Deprecated
    /* renamed from: w */
    public String m40563w() {
        return m40560t();
    }

    /* renamed from: x */
    public c mo40564x() {
        return c.NORMAL;
    }

    /* renamed from: y */
    public InterfaceC9639r m40565y() {
        return this.f43998n;
    }

    /* renamed from: z */
    public final int m40566z() {
        return m40565y().mo40512b();
    }
}
