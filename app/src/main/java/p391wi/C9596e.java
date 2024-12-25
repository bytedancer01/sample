package p391wi;

import ci.C1127m;
import ci.C1128n;
import ci.C1129o;
import com.amplifyframework.core.model.ModelIdentifier;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5432w;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/e.class
 */
/* renamed from: wi.e */
/* loaded from: combined.jar:classes2.jar:wi/e.class */
public final class C9596e {

    /* renamed from: g */
    public static final a f43820g = new a(null);

    /* renamed from: a */
    public final boolean f43821a;

    /* renamed from: b */
    @Nullable
    public final Integer f43822b;

    /* renamed from: c */
    public final boolean f43823c;

    /* renamed from: d */
    @Nullable
    public final Integer f43824d;

    /* renamed from: e */
    public final boolean f43825e;

    /* renamed from: f */
    public final boolean f43826f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/e$a.class
     */
    /* renamed from: wi.e$a */
    /* loaded from: combined.jar:classes2.jar:wi/e$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C9596e m40429a(@NotNull C5432w c5432w) {
            boolean z10;
            Integer num;
            boolean z11;
            Integer num2;
            boolean z12;
            boolean z13;
            Integer num3;
            Integer num4;
            boolean z14;
            boolean z15;
            Integer num5;
            C9367f.m39526e(c5432w, "responseHeaders");
            int size = c5432w.size();
            int i10 = 0;
            boolean z16 = false;
            Integer num6 = null;
            boolean z17 = false;
            Integer num7 = null;
            boolean z18 = false;
            boolean z19 = false;
            while (true) {
                boolean z20 = z19;
                if (i10 >= size) {
                    return new C9596e(z16, num6, z17, num7, z18, z20);
                }
                if (C1128n.m6719l(c5432w.m27082b(i10), "Sec-WebSocket-Extensions", true)) {
                    String m27085h = c5432w.m27085h(i10);
                    int i11 = 0;
                    while (true) {
                        z10 = z16;
                        num = num6;
                        z11 = z17;
                        num2 = num7;
                        z12 = z18;
                        z13 = z20;
                        if (i11 < m27085h.length()) {
                            int m27795o = C5634b.m27795o(m27085h, ',', i11, 0, 4, null);
                            int m27793m = C5634b.m27793m(m27085h, ';', i11, m27795o);
                            int i12 = m27793m + 1;
                            if (C1128n.m6719l(C5634b.m27777U(m27085h, i11, m27793m), "permessage-deflate", true)) {
                                i11 = i12;
                                Integer num8 = num6;
                                boolean z21 = z17;
                                Integer num9 = num7;
                                boolean z22 = z18;
                                if (z16) {
                                    z20 = true;
                                    z22 = z18;
                                    num9 = num7;
                                    z21 = z17;
                                    num8 = num6;
                                    i11 = i12;
                                }
                                while (i11 < m27795o) {
                                    int m27793m2 = C5634b.m27793m(m27085h, ';', i11, m27795o);
                                    int m27793m3 = C5634b.m27793m(m27085h, '=', i11, m27793m2);
                                    String m27777U = C5634b.m27777U(m27085h, i11, m27793m3);
                                    String m6763e0 = m27793m3 < m27793m2 ? C1129o.m6763e0(C5634b.m27777U(m27085h, m27793m3 + 1, m27793m2), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) : null;
                                    if (C1128n.m6719l(m27777U, "client_max_window_bits", true)) {
                                        if (num8 != null) {
                                            z20 = true;
                                        }
                                        Integer m6713f = m6763e0 != null ? C1127m.m6713f(m6763e0) : null;
                                        num3 = m6713f;
                                        z15 = z21;
                                        num5 = num9;
                                        z14 = z22;
                                        if (m6713f == null) {
                                            num3 = m6713f;
                                            num4 = num9;
                                            z20 = true;
                                            z14 = z22;
                                            num5 = num4;
                                            z15 = z21;
                                            i11 = m27793m2 + 1;
                                            num8 = num3;
                                            z21 = z15;
                                            num9 = num5;
                                            z22 = z14;
                                        } else {
                                            i11 = m27793m2 + 1;
                                            num8 = num3;
                                            z21 = z15;
                                            num9 = num5;
                                            z22 = z14;
                                        }
                                    } else {
                                        if (C1128n.m6719l(m27777U, "client_no_context_takeover", true)) {
                                            if (z21) {
                                                z20 = true;
                                            }
                                            if (m6763e0 != null) {
                                                z20 = true;
                                            }
                                            z15 = true;
                                            num3 = num8;
                                            num5 = num9;
                                            z14 = z22;
                                        } else if (C1128n.m6719l(m27777U, "server_max_window_bits", true)) {
                                            if (num9 != null) {
                                                z20 = true;
                                            }
                                            num4 = m6763e0 != null ? C1127m.m6713f(m6763e0) : null;
                                            num3 = num8;
                                            z15 = z21;
                                            num5 = num4;
                                            z14 = z22;
                                            if (num4 == null) {
                                                num3 = num8;
                                                z20 = true;
                                                z14 = z22;
                                                num5 = num4;
                                                z15 = z21;
                                            }
                                        } else {
                                            num3 = num8;
                                            num4 = num9;
                                            if (C1128n.m6719l(m27777U, "server_no_context_takeover", true)) {
                                                if (z22) {
                                                    z20 = true;
                                                }
                                                if (m6763e0 != null) {
                                                    z20 = true;
                                                }
                                                z14 = true;
                                                num3 = num8;
                                                z15 = z21;
                                                num5 = num9;
                                            }
                                            z20 = true;
                                            z14 = z22;
                                            num5 = num4;
                                            z15 = z21;
                                        }
                                        i11 = m27793m2 + 1;
                                        num8 = num3;
                                        z21 = z15;
                                        num9 = num5;
                                        z22 = z14;
                                    }
                                }
                                z16 = true;
                                num6 = num8;
                                z17 = z21;
                                num7 = num9;
                                z18 = z22;
                            } else {
                                i11 = i12;
                                z20 = true;
                            }
                        }
                    }
                } else {
                    z10 = z16;
                    num = num6;
                    z11 = z17;
                    num2 = num7;
                    z12 = z18;
                    z13 = z20;
                }
                i10++;
                z16 = z10;
                num6 = num;
                z17 = z11;
                num7 = num2;
                z18 = z12;
                z19 = z13;
            }
        }
    }

    public C9596e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public C9596e(boolean z10, @Nullable Integer num, boolean z11, @Nullable Integer num2, boolean z12, boolean z13) {
        this.f43821a = z10;
        this.f43822b = num;
        this.f43823c = z11;
        this.f43824d = num2;
        this.f43825e = z12;
        this.f43826f = z13;
    }

    public /* synthetic */ C9596e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, C9365d c9365d) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }

    /* renamed from: a */
    public final boolean m40428a(boolean z10) {
        return z10 ? this.f43823c : this.f43825e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9596e)) {
            return false;
        }
        C9596e c9596e = (C9596e) obj;
        return this.f43821a == c9596e.f43821a && C9367f.m39522a(this.f43822b, c9596e.f43822b) && this.f43823c == c9596e.f43823c && C9367f.m39522a(this.f43824d, c9596e.f43824d) && this.f43825e == c9596e.f43825e && this.f43826f == c9596e.f43826f;
    }

    public int hashCode() {
        boolean z10 = this.f43821a;
        int i10 = 1;
        boolean z11 = z10;
        if (z10) {
            z11 = true;
        }
        Integer num = this.f43822b;
        int i11 = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        boolean z12 = this.f43823c;
        int i12 = z12 ? 1 : 0;
        if (z12) {
            i12 = 1;
        }
        Integer num2 = this.f43824d;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        boolean z13 = this.f43825e;
        int i13 = z13 ? 1 : 0;
        if (z13) {
            i13 = 1;
        }
        boolean z14 = this.f43826f;
        if (!z14) {
            i10 = z14 ? 1 : 0;
        }
        return ((((((((((z11 ? 1 : 0) * 31) + hashCode) * 31) + i12) * 31) + i11) * 31) + i13) * 31) + i10;
    }

    @NotNull
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f43821a + ", clientMaxWindowBits=" + this.f43822b + ", clientNoContextTakeover=" + this.f43823c + ", serverMaxWindowBits=" + this.f43824d + ", serverNoContextTakeover=" + this.f43825e + ", unknownValues=" + this.f43826f + ")";
    }
}
