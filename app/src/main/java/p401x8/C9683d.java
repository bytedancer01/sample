package p401x8;

import android.text.TextUtils;
import ec.C4699b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/d.class
 */
/* renamed from: x8.d */
/* loaded from: combined.jar:classes2.jar:x8/d.class */
public final class C9683d {

    /* renamed from: f */
    public int f44186f;

    /* renamed from: h */
    public int f44188h;

    /* renamed from: o */
    public float f44195o;

    /* renamed from: a */
    public String f44181a = "";

    /* renamed from: b */
    public String f44182b = "";

    /* renamed from: c */
    public Set<String> f44183c = Collections.emptySet();

    /* renamed from: d */
    public String f44184d = "";

    /* renamed from: e */
    public String f44185e = null;

    /* renamed from: g */
    public boolean f44187g = false;

    /* renamed from: i */
    public boolean f44189i = false;

    /* renamed from: j */
    public int f44190j = -1;

    /* renamed from: k */
    public int f44191k = -1;

    /* renamed from: l */
    public int f44192l = -1;

    /* renamed from: m */
    public int f44193m = -1;

    /* renamed from: n */
    public int f44194n = -1;

    /* renamed from: p */
    public int f44196p = -1;

    /* renamed from: q */
    public boolean f44197q = false;

    /* renamed from: B */
    public static int m40726B(int i10, String str, String str2, int i11) {
        if (!str.isEmpty()) {
            int i12 = -1;
            if (i10 != -1) {
                if (str.equals(str2)) {
                    i12 = i10 + i11;
                }
                return i12;
            }
        }
        return i10;
    }

    /* renamed from: A */
    public C9683d m40727A(boolean z10) {
        this.f44191k = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int m40728a() {
        if (this.f44189i) {
            return this.f44188h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m40729b() {
        return this.f44197q;
    }

    /* renamed from: c */
    public int m40730c() {
        if (this.f44187g) {
            return this.f44186f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m40731d() {
        return this.f44185e;
    }

    /* renamed from: e */
    public float m40732e() {
        return this.f44195o;
    }

    /* renamed from: f */
    public int m40733f() {
        return this.f44194n;
    }

    /* renamed from: g */
    public int m40734g() {
        return this.f44196p;
    }

    /* renamed from: h */
    public int m40735h(String str, String str2, Set<String> set, String str3) {
        if (this.f44181a.isEmpty() && this.f44182b.isEmpty() && this.f44183c.isEmpty() && this.f44184d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m40726B = m40726B(m40726B(m40726B(0, this.f44181a, str, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), this.f44182b, str2, 2), this.f44184d, str3, 4);
        if (m40726B == -1 || !set.containsAll(this.f44183c)) {
            return 0;
        }
        return m40726B + (this.f44183c.size() * 4);
    }

    /* renamed from: i */
    public int m40736i() {
        int i10 = this.f44192l;
        if (i10 == -1 && this.f44193m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f44193m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    /* renamed from: j */
    public boolean m40737j() {
        return this.f44189i;
    }

    /* renamed from: k */
    public boolean m40738k() {
        return this.f44187g;
    }

    /* renamed from: l */
    public boolean m40739l() {
        boolean z10 = true;
        if (this.f44190j != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: m */
    public boolean m40740m() {
        boolean z10 = true;
        if (this.f44191k != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: n */
    public C9683d m40741n(int i10) {
        this.f44188h = i10;
        this.f44189i = true;
        return this;
    }

    /* renamed from: o */
    public C9683d m40742o(boolean z10) {
        this.f44192l = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C9683d m40743p(boolean z10) {
        this.f44197q = z10;
        return this;
    }

    /* renamed from: q */
    public C9683d m40744q(int i10) {
        this.f44186f = i10;
        this.f44187g = true;
        return this;
    }

    /* renamed from: r */
    public C9683d m40745r(String str) {
        this.f44185e = str == null ? null : C4699b.m23638e(str);
        return this;
    }

    /* renamed from: s */
    public C9683d m40746s(float f10) {
        this.f44195o = f10;
        return this;
    }

    /* renamed from: t */
    public C9683d m40747t(int i10) {
        this.f44194n = i10;
        return this;
    }

    /* renamed from: u */
    public C9683d m40748u(boolean z10) {
        this.f44193m = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C9683d m40749v(int i10) {
        this.f44196p = i10;
        return this;
    }

    /* renamed from: w */
    public void m40750w(String[] strArr) {
        this.f44183c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void m40751x(String str) {
        this.f44181a = str;
    }

    /* renamed from: y */
    public void m40752y(String str) {
        this.f44182b = str;
    }

    /* renamed from: z */
    public void m40753z(String str) {
        this.f44184d = str;
    }
}
