package ki;

import ci.C1117c;
import ci.C1119e;
import ci.C1128n;
import ci.C1129o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kh.AbstractC5629w;
import kh.C5613g;
import kh.C5616j;
import kh.C5617k;
import kh.C5624r;
import kh.C5632z;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.InterfaceC7038SM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5382a;
import p173ji.AbstractC5408e0;
import p173ji.AbstractC5412g0;
import p173ji.AbstractC5429t;
import p173ji.C5402b0;
import p173ji.C5410f0;
import p173ji.C5432w;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p312ri.C8477c;
import p372vh.C9367f;
import p372vh.C9374m;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9775s;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p448zh.C10238c;
import p448zh.C10240e;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ki/b.class
 */
/* renamed from: ki.b */
/* loaded from: combined.jar:classes2.jar:ki/b.class */
public final class C5634b {

    /* renamed from: a */
    @NotNull
    public static final byte[] f31704a;

    /* renamed from: b */
    @NotNull
    public static final C5432w f31705b = C5432w.f31143c.m27102g(new String[0]);

    /* renamed from: c */
    @NotNull
    public static final AbstractC5412g0 f31706c;

    /* renamed from: d */
    @NotNull
    public static final AbstractC5408e0 f31707d;

    /* renamed from: e */
    public static final C9775s f31708e;

    /* renamed from: f */
    @NotNull
    public static final TimeZone f31709f;

    /* renamed from: g */
    public static final C1119e f31710g;

    /* renamed from: h */
    public static final boolean f31711h;

    /* renamed from: i */
    @NotNull
    public static final String f31712i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ki/b$a.class
     */
    /* renamed from: ki.b$a */
    /* loaded from: combined.jar:classes2.jar:ki/b$a.class */
    public static final class a implements AbstractC5429t.c {

        /* renamed from: a */
        public final AbstractC5429t f31713a;

        public a(AbstractC5429t abstractC5429t) {
            this.f31713a = abstractC5429t;
        }

        @Override // p173ji.AbstractC5429t.c
        @NotNull
        /* renamed from: a */
        public final AbstractC5429t mo27066a(@NotNull InterfaceC5407e interfaceC5407e) {
            C9367f.m39526e(interfaceC5407e, "it");
            return this.f31713a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ki/b$b.class
     */
    /* renamed from: ki.b$b */
    /* loaded from: combined.jar:classes2.jar:ki/b$b.class */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        public final String f31714a;

        /* renamed from: b */
        public final boolean f31715b;

        public b(String str, boolean z10) {
            this.f31714a = str;
            this.f31715b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f31714a);
            thread.setDaemon(this.f31715b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f31704a = bArr;
        f31706c = AbstractC5412g0.b.m26969e(AbstractC5412g0.f30948c, bArr, null, 1, null);
        f31707d = AbstractC5408e0.a.m26903k(AbstractC5408e0.f30901a, bArr, null, 0, 0, 7, null);
        C9775s.a aVar = C9775s.f44553e;
        C9764h.a aVar2 = C9764h.f44531f;
        f31708e = aVar.m41260d(aVar2.m41210b("efbbbf"), aVar2.m41210b("feff"), aVar2.m41210b("fffe"), aVar2.m41210b("0000ffff"), aVar2.m41210b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C9367f.m39524c(timeZone);
        f31709f = timeZone;
        f31710g = new C1119e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f31711h = false;
        String name = C5402b0.class.getName();
        C9367f.m39525d(name, "OkHttpClient::class.java.name");
        f31712i = C1129o.m6762d0(C1129o.m6761c0(name, "okhttp3."), "Client");
    }

    /* renamed from: A */
    public static final int m27757A(@NotNull String str, int i10) {
        C9367f.m39526e(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    @NotNull
    /* renamed from: B */
    public static final String[] m27758B(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        C9367f.m39526e(strArr, "$this$intersect");
        C9367f.m39526e(strArr2, "other");
        C9367f.m39526e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: C */
    public static final boolean m27759C(@NotNull Socket socket, @NotNull InterfaceC9763g interfaceC9763g) {
        C9367f.m39526e(socket, "$this$isHealthy");
        C9367f.m39526e(interfaceC9763g, "source");
        boolean z10 = true;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                z10 = !interfaceC9763g.mo41164k0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException e10) {
        } catch (IOException e11) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: D */
    public static final boolean m27760D(@NotNull String str) {
        C9367f.m39526e(str, "name");
        boolean z10 = true;
        if (!C1128n.m6719l(str, "Authorization", true)) {
            z10 = true;
            if (!C1128n.m6719l(str, InterfaceC7038SM.COOKIE, true)) {
                z10 = true;
                if (!C1128n.m6719l(str, "Proxy-Authorization", true)) {
                    z10 = C1128n.m6719l(str, InterfaceC7038SM.SET_COOKIE, true);
                }
            }
        }
        return z10;
    }

    /* renamed from: E */
    public static final int m27761E(char c10) {
        int i10;
        if ('0' <= c10 && '9' >= c10) {
            i10 = c10 - '0';
        } else {
            char c11 = 'a';
            if ('a' > c10 || 'f' < c10) {
                c11 = 'A';
                if ('A' > c10 || 'F' < c10) {
                    i10 = -1;
                }
            }
            i10 = (c10 - c11) + 10;
        }
        return i10;
    }

    @NotNull
    /* renamed from: F */
    public static final Charset m27762F(@NotNull InterfaceC9763g interfaceC9763g, @NotNull Charset charset) {
        String str;
        C9367f.m39526e(interfaceC9763g, "$this$readBomAsCharset");
        C9367f.m39526e(charset, CookieSpecs.DEFAULT);
        int mo41173s = interfaceC9763g.mo41173s(f31708e);
        Charset charset2 = charset;
        if (mo41173s != -1) {
            if (mo41173s == 0) {
                charset2 = StandardCharsets.UTF_8;
                str = "UTF_8";
            } else if (mo41173s == 1) {
                charset2 = StandardCharsets.UTF_16BE;
                str = "UTF_16BE";
            } else if (mo41173s == 2) {
                charset2 = StandardCharsets.UTF_16LE;
                str = "UTF_16LE";
            } else if (mo41173s == 3) {
                charset2 = C1117c.f7454a.m6695a();
            } else {
                if (mo41173s != 4) {
                    throw new AssertionError();
                }
                charset2 = C1117c.f7454a.m6696b();
            }
            C9367f.m39525d(charset2, str);
        }
        return charset2;
    }

    /* renamed from: G */
    public static final int m27763G(@NotNull InterfaceC9763g interfaceC9763g) {
        C9367f.m39526e(interfaceC9763g, "$this$readMedium");
        return m27782b(interfaceC9763g.readByte(), 255) | (m27782b(interfaceC9763g.readByte(), 255) << 16) | (m27782b(interfaceC9763g.readByte(), 255) << 8);
    }

    /* renamed from: H */
    public static final int m27764H(@NotNull C9761e c9761e, byte b10) {
        C9367f.m39526e(c9761e, "$this$skipAll");
        int i10 = 0;
        while (!c9761e.mo41164k0() && c9761e.m41119B0(0L) == b10) {
            i10++;
            c9761e.readByte();
        }
        return i10;
    }

    /* renamed from: I */
    public static final boolean m27765I(@NotNull InterfaceC9756b0 interfaceC9756b0, int i10, @NotNull TimeUnit timeUnit) {
        boolean z10;
        C9367f.m39526e(interfaceC9756b0, "$this$skipAll");
        C9367f.m39526e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long mo41088c = interfaceC9756b0.timeout().mo41090e() ? interfaceC9756b0.timeout().mo41088c() - nanoTime : Long.MAX_VALUE;
        interfaceC9756b0.timeout().mo41089d(Math.min(mo41088c, timeUnit.toNanos(i10)) + nanoTime);
        try {
            C9761e c9761e = new C9761e();
            while (interfaceC9756b0.mo22901x(c9761e, 8192L) != -1) {
                c9761e.m41165l();
            }
            z10 = true;
        } catch (InterruptedIOException e10) {
            z10 = false;
            if (mo41088c == Long.MAX_VALUE) {
                z10 = false;
            }
        } catch (Throwable th2) {
            C9758c0 timeout = interfaceC9756b0.timeout();
            if (mo41088c == Long.MAX_VALUE) {
                timeout.mo41086a();
            } else {
                timeout.mo41089d(nanoTime + mo41088c);
            }
            throw th2;
        }
        if (mo41088c == Long.MAX_VALUE) {
            z10 = true;
            interfaceC9756b0.timeout().mo41086a();
            return z10;
        }
        interfaceC9756b0.timeout().mo41089d(nanoTime + mo41088c);
        return z10;
    }

    @NotNull
    /* renamed from: J */
    public static final ThreadFactory m27766J(@NotNull String str, boolean z10) {
        C9367f.m39526e(str, "name");
        return new b(str, z10);
    }

    @NotNull
    /* renamed from: K */
    public static final List<C8477c> m27767K(@NotNull C5432w c5432w) {
        C9367f.m39526e(c5432w, "$this$toHeaderList");
        C10238c m42841i = C10240e.m42841i(0, c5432w.size());
        ArrayList arrayList = new ArrayList(C5617k.m27708n(m42841i, 10));
        Iterator<Integer> it = m42841i.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC5629w) it).nextInt();
            arrayList.add(new C8477c(c5432w.m27082b(nextInt), c5432w.m27085h(nextInt)));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: L */
    public static final C5432w m27768L(@NotNull List<C8477c> list) {
        C9367f.m39526e(list, "$this$toHeaders");
        C5432w.a aVar = new C5432w.a();
        for (C8477c c8477c : list) {
            aVar.m27090d(c8477c.m36399a().m41188D(), c8477c.m36400b().m41188D());
        }
        return aVar.m27092f();
    }

    @NotNull
    /* renamed from: M */
    public static final String m27769M(int i10) {
        String hexString = Integer.toHexString(i10);
        C9367f.m39525d(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @NotNull
    /* renamed from: N */
    public static final String m27770N(long j10) {
        String hexString = Long.toHexString(j10);
        C9367f.m39525d(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        if (r6.m27117o() != p173ji.C5433x.f31147l.m27159c(r6.m27121s())) goto L10;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m27771O(@org.jetbrains.annotations.NotNull p173ji.C5433x r6, boolean r7) {
        /*
            r0 = r6
            java.lang.String r1 = "$this$toHostHeader"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r6
            java.lang.String r0 = r0.m27112i()
            java.lang.String r1 = ":"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = ci.C1129o.m6736D(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r6
            java.lang.String r1 = r1.m27112i()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r0 = r0.toString()
            r8 = r0
            goto L43
        L3e:
            r0 = r6
            java.lang.String r0 = r0.m27112i()
            r8 = r0
        L43:
            r0 = r7
            if (r0 != 0) goto L5a
            r0 = r8
            r9 = r0
            r0 = r6
            int r0 = r0.m27117o()
            ji.x$b r1 = p173ji.C5433x.f31147l
            r2 = r6
            java.lang.String r2 = r2.m27121s()
            int r1 = r1.m27159c(r2)
            if (r0 == r1) goto L7d
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = 58
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = r6
            int r1 = r1.m27117o()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r0 = r0.toString()
            r9 = r0
        L7d:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C5634b.m27771O(ji.x, boolean):java.lang.String");
    }

    /* renamed from: P */
    public static /* synthetic */ String m27772P(C5433x c5433x, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m27771O(c5433x, z10);
    }

    @NotNull
    /* renamed from: Q */
    public static final <T> List<T> m27773Q(@NotNull List<? extends T> list) {
        C9367f.m39526e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C5624r.m27720I(list));
        C9367f.m39525d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @NotNull
    /* renamed from: R */
    public static final <K, V> Map<K, V> m27774R(@NotNull Map<K, ? extends V> map) {
        Map<K, V> unmodifiableMap;
        C9367f.m39526e(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            unmodifiableMap = C5632z.m27749c();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
            C9367f.m39525d(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        return unmodifiableMap;
    }

    /* renamed from: S */
    public static final long m27775S(@NotNull String str, long j10) {
        C9367f.m39526e(str, "$this$toLongOrDefault");
        try {
            j10 = Long.parseLong(str);
        } catch (NumberFormatException e10) {
        }
        return j10;
    }

    /* renamed from: T */
    public static final int m27776T(@Nullable String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                int i11 = Integer.MAX_VALUE;
                if (parseLong <= Integer.MAX_VALUE) {
                    i11 = parseLong < 0 ? 0 : (int) parseLong;
                }
                return i11;
            } catch (NumberFormatException e10) {
            }
        }
        return i10;
    }

    @NotNull
    /* renamed from: U */
    public static final String m27777U(@NotNull String str, int i10, int i11) {
        C9367f.m39526e(str, "$this$trimSubstring");
        int m27803w = m27803w(str, i10, i11);
        String substring = str.substring(m27803w, m27805y(str, m27803w, i11));
        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: V */
    public static /* synthetic */ String m27778V(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m27777U(str, i10, i11);
    }

    @NotNull
    /* renamed from: W */
    public static final Throwable m27779W(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        C9367f.m39526e(exc, "$this$withSuppressed");
        C9367f.m39526e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            C5382a.m26732a(exc, it.next());
        }
        return exc;
    }

    /* renamed from: X */
    public static final void m27780X(@NotNull InterfaceC9762f interfaceC9762f, int i10) {
        C9367f.m39526e(interfaceC9762f, "$this$writeMedium");
        interfaceC9762f.writeByte((i10 >>> 16) & 255);
        interfaceC9762f.writeByte((i10 >>> 8) & 255);
        interfaceC9762f.writeByte(i10 & 255);
    }

    /* renamed from: a */
    public static final <E> void m27781a(@NotNull List<E> list, E e10) {
        C9367f.m39526e(list, "$this$addIfAbsent");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    /* renamed from: b */
    public static final int m27782b(byte b10, int i10) {
        return b10 & i10;
    }

    /* renamed from: c */
    public static final int m27783c(short s10, int i10) {
        return s10 & i10;
    }

    /* renamed from: d */
    public static final long m27784d(int i10, long j10) {
        return i10 & j10;
    }

    @NotNull
    /* renamed from: e */
    public static final AbstractC5429t.c m27785e(@NotNull AbstractC5429t abstractC5429t) {
        C9367f.m39526e(abstractC5429t, "$this$asFactory");
        return new a(abstractC5429t);
    }

    /* renamed from: f */
    public static final boolean m27786f(@NotNull String str) {
        C9367f.m39526e(str, "$this$canParseAsIpAddress");
        return f31710g.m6703a(str);
    }

    /* renamed from: g */
    public static final boolean m27787g(@NotNull C5433x c5433x, @NotNull C5433x c5433x2) {
        C9367f.m39526e(c5433x, "$this$canReuseConnectionFor");
        C9367f.m39526e(c5433x2, "other");
        return C9367f.m39522a(c5433x.m27112i(), c5433x2.m27112i()) && c5433x.m27117o() == c5433x2.m27117o() && C9367f.m39522a(c5433x.m27121s(), c5433x2.m27121s());
    }

    /* renamed from: h */
    public static final int m27788h(@NotNull String str, long j10, @Nullable TimeUnit timeUnit) {
        C9367f.m39526e(str, "name");
        if (!(j10 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        boolean z10 = true;
        if (millis == 0) {
            z10 = j10 <= 0;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    /* renamed from: i */
    public static final void m27789i(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: j */
    public static final void m27790j(@NotNull Closeable closeable) {
        C9367f.m39526e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
        }
    }

    /* renamed from: k */
    public static final void m27791k(@NotNull Socket socket) {
        C9367f.m39526e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!C9367f.m39522a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception e12) {
        }
    }

    @NotNull
    /* renamed from: l */
    public static final String[] m27792l(@NotNull String[] strArr, @NotNull String str) {
        C9367f.m39526e(strArr, "$this$concat");
        C9367f.m39526e(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C5613g.m27688n(strArr2)] = str;
        return strArr2;
    }

    /* renamed from: m */
    public static final int m27793m(@NotNull String str, char c10, int i10, int i11) {
        C9367f.m39526e(str, "$this$delimiterOffset");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: n */
    public static final int m27794n(@NotNull String str, @NotNull String str2, int i10, int i11) {
        C9367f.m39526e(str, "$this$delimiterOffset");
        C9367f.m39526e(str2, "delimiters");
        while (i10 < i11) {
            if (C1129o.m6735C(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: o */
    public static /* synthetic */ int m27795o(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m27793m(str, c10, i10, i11);
    }

    /* renamed from: p */
    public static final boolean m27796p(@NotNull InterfaceC9756b0 interfaceC9756b0, int i10, @NotNull TimeUnit timeUnit) {
        boolean z10;
        C9367f.m39526e(interfaceC9756b0, "$this$discard");
        C9367f.m39526e(timeUnit, "timeUnit");
        try {
            z10 = m27765I(interfaceC9756b0, i10, timeUnit);
        } catch (IOException e10) {
            z10 = false;
        }
        return z10;
    }

    @NotNull
    /* renamed from: q */
    public static final String m27797q(@NotNull String str, @NotNull Object... objArr) {
        C9367f.m39526e(str, IjkMediaMeta.IJKM_KEY_FORMAT);
        C9367f.m39526e(objArr, "args");
        C9374m c9374m = C9374m.f42907a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C9367f.m39525d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: r */
    public static final boolean m27798r(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        C9367f.m39526e(strArr, "$this$hasIntersection");
        C9367f.m39526e(comparator, "comparator");
        if ((strArr.length == 0) || strArr2 == null) {
            return false;
        }
        if (strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final long m27799s(@NotNull C5410f0 c5410f0) {
        C9367f.m39526e(c5410f0, "$this$headersContentLength");
        String m27081a = c5410f0.m26923o0().m27081a("Content-Length");
        long j10 = -1;
        if (m27081a != null) {
            j10 = m27775S(m27081a, -1L);
        }
        return j10;
    }

    @SafeVarargs
    @NotNull
    /* renamed from: t */
    public static final <T> List<T> m27800t(@NotNull T... tArr) {
        C9367f.m39526e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C5616j.m27702h(Arrays.copyOf(objArr, objArr.length)));
        C9367f.m39525d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: u */
    public static final int m27801u(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        C9367f.m39526e(strArr, "$this$indexOf");
        C9367f.m39526e(str, "value");
        C9367f.m39526e(comparator, "comparator");
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (comparator.compare(strArr[i10], str) == 0) {
                break;
            }
            i10++;
        }
        return i10;
    }

    /* renamed from: v */
    public static final int m27802v(@NotNull String str) {
        C9367f.m39526e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (C9367f.m39528g(charAt, 31) <= 0 || C9367f.m39528g(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static final int m27803w(@NotNull String str, int i10, int i11) {
        C9367f.m39526e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: x */
    public static /* synthetic */ int m27804x(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m27803w(str, i10, i11);
    }

    /* renamed from: y */
    public static final int m27805y(@NotNull String str, int i10, int i11) {
        C9367f.m39526e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    /* renamed from: z */
    public static /* synthetic */ int m27806z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m27805y(str, i10, i11);
    }
}
