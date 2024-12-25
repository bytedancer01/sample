package ua;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/g5.class
 */
/* renamed from: ua.g5 */
/* loaded from: combined.jar:classes2.jar:ua/g5.class */
public final class C8918g5 {

    /* renamed from: A */
    public long f41101A;

    /* renamed from: B */
    public long f41102B;

    /* renamed from: C */
    public String f41103C;

    /* renamed from: D */
    public boolean f41104D;

    /* renamed from: E */
    public long f41105E;

    /* renamed from: F */
    public long f41106F;

    /* renamed from: a */
    public final C8870c5 f41107a;

    /* renamed from: b */
    public final String f41108b;

    /* renamed from: c */
    public String f41109c;

    /* renamed from: d */
    public String f41110d;

    /* renamed from: e */
    public String f41111e;

    /* renamed from: f */
    public String f41112f;

    /* renamed from: g */
    public long f41113g;

    /* renamed from: h */
    public long f41114h;

    /* renamed from: i */
    public long f41115i;

    /* renamed from: j */
    public String f41116j;

    /* renamed from: k */
    public long f41117k;

    /* renamed from: l */
    public String f41118l;

    /* renamed from: m */
    public long f41119m;

    /* renamed from: n */
    public long f41120n;

    /* renamed from: o */
    public boolean f41121o;

    /* renamed from: p */
    public long f41122p;

    /* renamed from: q */
    public boolean f41123q;

    /* renamed from: r */
    public String f41124r;

    /* renamed from: s */
    public Boolean f41125s;

    /* renamed from: t */
    public long f41126t;

    /* renamed from: u */
    public List<String> f41127u;

    /* renamed from: v */
    public String f41128v;

    /* renamed from: w */
    public long f41129w;

    /* renamed from: x */
    public long f41130x;

    /* renamed from: y */
    public long f41131y;

    /* renamed from: z */
    public long f41132z;

    public C8918g5(C8870c5 c8870c5, String str) {
        C9935o.m41850j(c8870c5);
        C9935o.m41846f(str);
        this.f41107a = c8870c5;
        this.f41108b = str;
        c8870c5.mo37782e().mo37811h();
    }

    /* renamed from: A */
    public final boolean m37971A() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41104D;
    }

    /* renamed from: B */
    public final String m37972B() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41103C;
    }

    /* renamed from: C */
    public final String m37973C() {
        this.f41107a.mo37782e().mo37811h();
        String str = this.f41103C;
        m37974D(null);
        return str;
    }

    /* renamed from: D */
    public final void m37974D(String str) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= !C8899ea.m37820G(this.f41103C, str);
        this.f41103C = str;
    }

    /* renamed from: E */
    public final long m37975E() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41122p;
    }

    /* renamed from: F */
    public final void m37976F(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41122p != j10;
        this.f41122p = j10;
    }

    /* renamed from: G */
    public final boolean m37977G() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41123q;
    }

    /* renamed from: H */
    public final void m37978H(boolean z10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41123q != z10;
        this.f41123q = z10;
    }

    /* renamed from: I */
    public final Boolean m37979I() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41125s;
    }

    /* renamed from: J */
    public final void m37980J(Boolean bool) {
        this.f41107a.mo37782e().mo37811h();
        boolean z10 = this.f41104D;
        Boolean bool2 = this.f41125s;
        String[] strArr = C8899ea.f41045g;
        this.f41104D = z10 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.f41125s = bool;
    }

    /* renamed from: K */
    public final List<String> m37981K() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41127u;
    }

    /* renamed from: L */
    public final void m37982L(List<String> list) {
        this.f41107a.mo37782e().mo37811h();
        List<String> list2 = this.f41127u;
        String[] strArr = C8899ea.f41045g;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.f41104D = true;
        this.f41127u = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: M */
    public final void m37983M() {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D = false;
    }

    /* renamed from: N */
    public final String m37984N() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41108b;
    }

    /* renamed from: O */
    public final String m37985O() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41109c;
    }

    /* renamed from: P */
    public final void m37986P(String str) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= !C8899ea.m37820G(this.f41109c, str);
        this.f41109c = str;
    }

    /* renamed from: Q */
    public final String m37987Q() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41110d;
    }

    /* renamed from: R */
    public final void m37988R(String str) {
        this.f41107a.mo37782e().mo37811h();
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = null;
        }
        this.f41104D |= true ^ C8899ea.m37820G(this.f41110d, str2);
        this.f41110d = str2;
    }

    /* renamed from: S */
    public final String m37989S() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41124r;
    }

    /* renamed from: T */
    public final void m37990T(String str) {
        this.f41107a.mo37782e().mo37811h();
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = null;
        }
        this.f41104D |= true ^ C8899ea.m37820G(this.f41124r, str2);
        this.f41124r = str2;
    }

    /* renamed from: U */
    public final String m37991U() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41128v;
    }

    /* renamed from: V */
    public final void m37992V(String str) {
        this.f41107a.mo37782e().mo37811h();
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = null;
        }
        this.f41104D |= true ^ C8899ea.m37820G(this.f41128v, str2);
        this.f41128v = str2;
    }

    /* renamed from: W */
    public final String m37993W() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41111e;
    }

    /* renamed from: X */
    public final void m37994X(String str) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= !C8899ea.m37820G(this.f41111e, str);
        this.f41111e = str;
    }

    /* renamed from: Y */
    public final String m37995Y() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41112f;
    }

    /* renamed from: Z */
    public final void m37996Z(String str) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= !C8899ea.m37820G(this.f41112f, str);
        this.f41112f = str;
    }

    /* renamed from: a */
    public final void m37997a(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41119m != j10;
        this.f41119m = j10;
    }

    /* renamed from: a0 */
    public final long m37998a0() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41114h;
    }

    /* renamed from: b */
    public final long m37999b() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41120n;
    }

    /* renamed from: b0 */
    public final void m38000b0(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41114h != j10;
        this.f41114h = j10;
    }

    /* renamed from: c */
    public final void m38001c(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41120n != j10;
        this.f41120n = j10;
    }

    /* renamed from: c0 */
    public final long m38002c0() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41115i;
    }

    /* renamed from: d */
    public final long m38003d() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41126t;
    }

    /* renamed from: d0 */
    public final void m38004d0(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41115i != j10;
        this.f41115i = j10;
    }

    /* renamed from: e */
    public final void m38005e(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41126t != j10;
        this.f41126t = j10;
    }

    /* renamed from: e0 */
    public final String m38006e0() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41116j;
    }

    /* renamed from: f */
    public final boolean m38007f() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41121o;
    }

    /* renamed from: f0 */
    public final void m38008f0(String str) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= !C8899ea.m37820G(this.f41116j, str);
        this.f41116j = str;
    }

    /* renamed from: g */
    public final void m38009g(boolean z10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41121o != z10;
        this.f41121o = z10;
    }

    /* renamed from: g0 */
    public final long m38010g0() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41117k;
    }

    /* renamed from: h */
    public final void m38011h(long j10) {
        boolean z10 = true;
        C9935o.m41841a(j10 >= 0);
        this.f41107a.mo37782e().mo37811h();
        boolean z11 = this.f41104D;
        if (this.f41113g == j10) {
            z10 = false;
        }
        this.f41104D = z10 | z11;
        this.f41113g = j10;
    }

    /* renamed from: h0 */
    public final void m38012h0(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41117k != j10;
        this.f41117k = j10;
    }

    /* renamed from: i */
    public final long m38013i() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41113g;
    }

    /* renamed from: i0 */
    public final String m38014i0() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41118l;
    }

    /* renamed from: j */
    public final long m38015j() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41105E;
    }

    /* renamed from: j0 */
    public final void m38016j0(String str) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= !C8899ea.m37820G(this.f41118l, str);
        this.f41118l = str;
    }

    /* renamed from: k */
    public final void m38017k(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41105E != j10;
        this.f41105E = j10;
    }

    /* renamed from: k0 */
    public final long m38018k0() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41119m;
    }

    /* renamed from: l */
    public final long m38019l() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41106F;
    }

    /* renamed from: m */
    public final void m38020m(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41106F != j10;
        this.f41106F = j10;
    }

    /* renamed from: n */
    public final void m38021n() {
        this.f41107a.mo37782e().mo37811h();
        long j10 = this.f41113g + 1;
        long j11 = j10;
        if (j10 > 2147483647L) {
            this.f41107a.mo37780c().m38411r().m38327b("Bundle index overflow. appId", C9128y3.m38407x(this.f41108b));
            j11 = 0;
        }
        this.f41104D = true;
        this.f41113g = j11;
    }

    /* renamed from: o */
    public final long m38022o() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41129w;
    }

    /* renamed from: p */
    public final void m38023p(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41129w != j10;
        this.f41129w = j10;
    }

    /* renamed from: q */
    public final long m38024q() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41130x;
    }

    /* renamed from: r */
    public final void m38025r(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41130x != j10;
        this.f41130x = j10;
    }

    /* renamed from: s */
    public final long m38026s() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41131y;
    }

    /* renamed from: t */
    public final void m38027t(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41131y != j10;
        this.f41131y = j10;
    }

    /* renamed from: u */
    public final long m38028u() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41132z;
    }

    /* renamed from: v */
    public final void m38029v(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41132z != j10;
        this.f41132z = j10;
    }

    /* renamed from: w */
    public final long m38030w() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41102B;
    }

    /* renamed from: x */
    public final void m38031x(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41102B != j10;
        this.f41102B = j10;
    }

    /* renamed from: y */
    public final long m38032y() {
        this.f41107a.mo37782e().mo37811h();
        return this.f41101A;
    }

    /* renamed from: z */
    public final void m38033z(long j10) {
        this.f41107a.mo37782e().mo37811h();
        this.f41104D |= this.f41101A != j10;
        this.f41101A = j10;
    }
}
