package p027b9;

import com.facebook.ads.AdError;
import ec.C4699b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027b9.InterfaceC0854m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/a0.class
 */
/* renamed from: b9.a0 */
/* loaded from: combined.jar:classes2.jar:b9/a0.class */
public interface InterfaceC0831a0 extends InterfaceC0854m {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/a0$a.class
     */
    /* renamed from: b9.a0$a */
    /* loaded from: combined.jar:classes2.jar:b9/a0$a.class */
    public static final class a extends c {
        public a(IOException iOException, C0858p c0858p) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, c0858p, 2007, 1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/a0$b.class
     */
    /* renamed from: b9.a0$b */
    /* loaded from: combined.jar:classes2.jar:b9/a0$b.class */
    public interface b extends InterfaceC0854m.a {
        @Override // p027b9.InterfaceC0854m.a
        /* renamed from: a */
        InterfaceC0831a0 mo5296a();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/a0$c.class
     */
    /* renamed from: b9.a0$c */
    /* loaded from: combined.jar:classes2.jar:b9/a0$c.class */
    public static class c extends C0856n {

        /* renamed from: c */
        public final C0858p f5738c;

        /* renamed from: d */
        public final int f5739d;

        public c(C0858p c0858p, int i10, int i11) {
            super(m5297a(i10, i11));
            this.f5738c = c0858p;
            this.f5739d = i11;
        }

        public c(IOException iOException, C0858p c0858p, int i10, int i11) {
            super(iOException, m5297a(i10, i11));
            this.f5738c = c0858p;
            this.f5739d = i11;
        }

        public c(String str, C0858p c0858p, int i10, int i11) {
            super(str, m5297a(i10, i11));
            this.f5738c = c0858p;
            this.f5739d = i11;
        }

        public c(String str, IOException iOException, C0858p c0858p, int i10, int i11) {
            super(str, iOException, m5297a(i10, i11));
            this.f5738c = c0858p;
            this.f5739d = i11;
        }

        /* renamed from: a */
        public static int m5297a(int i10, int i11) {
            int i12 = i10;
            if (i10 == 2000) {
                i12 = i10;
                if (i11 == 1) {
                    i12 = 2001;
                }
            }
            return i12;
        }

        /* renamed from: b */
        public static c m5298b(IOException iOException, C0858p c0858p, int i10) {
            String message = iOException.getMessage();
            int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C4699b.m23638e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i11 == 2007 ? new a(iOException, c0858p) : new c(iOException, c0858p, i11, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/a0$d.class
     */
    /* renamed from: b9.a0$d */
    /* loaded from: combined.jar:classes2.jar:b9/a0$d.class */
    public static final class d extends c {

        /* renamed from: e */
        public final String f5740e;

        public d(String str, C0858p c0858p) {
            super("Invalid content type: " + str, c0858p, AdError.INTERNAL_ERROR_2003, 1);
            this.f5740e = str;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/a0$e.class
     */
    /* renamed from: b9.a0$e */
    /* loaded from: combined.jar:classes2.jar:b9/a0$e.class */
    public static final class e extends c {

        /* renamed from: e */
        public final int f5741e;

        /* renamed from: f */
        public final String f5742f;

        /* renamed from: g */
        public final Map<String, List<String>> f5743g;

        /* renamed from: h */
        public final byte[] f5744h;

        public e(int i10, String str, IOException iOException, Map<String, List<String>> map, C0858p c0858p, byte[] bArr) {
            super("Response code: " + i10, iOException, c0858p, AdError.INTERNAL_ERROR_2004, 1);
            this.f5741e = i10;
            this.f5742f = str;
            this.f5743g = map;
            this.f5744h = bArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/a0$f.class
     */
    /* renamed from: b9.a0$f */
    /* loaded from: combined.jar:classes2.jar:b9/a0$f.class */
    public static final class f {

        /* renamed from: a */
        public final Map<String, String> f5745a = new HashMap();

        /* renamed from: b */
        public Map<String, String> f5746b;

        /* renamed from: a */
        public Map<String, String> m5299a() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f5746b == null) {
                    this.f5746b = Collections.unmodifiableMap(new HashMap(this.f5745a));
                }
                map = this.f5746b;
            }
            return map;
        }
    }
}
