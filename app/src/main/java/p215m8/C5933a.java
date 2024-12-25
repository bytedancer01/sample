package p215m8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p059d9.C4349a;
import p059d9.C4393v0;
import p059d9.C4401z0;
import p182k7.C5525p;
import p267p6.C7629w0;
import p420y7.C9858i0;
import p420y7.InterfaceC9848d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m8/a.class
 */
/* renamed from: m8.a */
/* loaded from: combined.jar:classes2.jar:m8/a.class */
public class C5933a implements InterfaceC9848d0<C5933a> {

    /* renamed from: a */
    public final int f33322a;

    /* renamed from: b */
    public final int f33323b;

    /* renamed from: c */
    public final int f33324c;

    /* renamed from: d */
    public final boolean f33325d;

    /* renamed from: e */
    public final a f33326e;

    /* renamed from: f */
    public final b[] f33327f;

    /* renamed from: g */
    public final long f33328g;

    /* renamed from: h */
    public final long f33329h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/a$a.class
     */
    /* renamed from: m8.a$a */
    /* loaded from: combined.jar:classes2.jar:m8/a$a.class */
    public static class a {

        /* renamed from: a */
        public final UUID f33330a;

        /* renamed from: b */
        public final byte[] f33331b;

        /* renamed from: c */
        public final C5525p[] f33332c;

        public a(UUID uuid, byte[] bArr, C5525p[] c5525pArr) {
            this.f33330a = uuid;
            this.f33331b = bArr;
            this.f33332c = c5525pArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/a$b.class
     */
    /* renamed from: m8.a$b */
    /* loaded from: combined.jar:classes2.jar:m8/a$b.class */
    public static class b {

        /* renamed from: a */
        public final int f33333a;

        /* renamed from: b */
        public final String f33334b;

        /* renamed from: c */
        public final long f33335c;

        /* renamed from: d */
        public final String f33336d;

        /* renamed from: e */
        public final int f33337e;

        /* renamed from: f */
        public final int f33338f;

        /* renamed from: g */
        public final int f33339g;

        /* renamed from: h */
        public final int f33340h;

        /* renamed from: i */
        public final String f33341i;

        /* renamed from: j */
        public final C7629w0[] f33342j;

        /* renamed from: k */
        public final int f33343k;

        /* renamed from: l */
        public final String f33344l;

        /* renamed from: m */
        public final String f33345m;

        /* renamed from: n */
        public final List<Long> f33346n;

        /* renamed from: o */
        public final long[] f33347o;

        /* renamed from: p */
        public final long f33348p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C7629w0[] c7629w0Arr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, c7629w0Arr, list, C4401z0.m22348R0(list, 1000000L, j10), C4401z0.m22346Q0(j11, 1000000L, j10));
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, C7629w0[] c7629w0Arr, List<Long> list, long[] jArr, long j11) {
            this.f33344l = str;
            this.f33345m = str2;
            this.f33333a = i10;
            this.f33334b = str3;
            this.f33335c = j10;
            this.f33336d = str4;
            this.f33337e = i11;
            this.f33338f = i12;
            this.f33339g = i13;
            this.f33340h = i14;
            this.f33341i = str5;
            this.f33342j = c7629w0Arr;
            this.f33346n = list;
            this.f33347o = jArr;
            this.f33348p = j11;
            this.f33343k = list.size();
        }

        /* renamed from: a */
        public Uri m29187a(int i10, int i11) {
            C4349a.m21884g(this.f33342j != null);
            C4349a.m21884g(this.f33346n != null);
            C4349a.m21884g(i11 < this.f33346n.size());
            String num = Integer.toString(this.f33342j[i10].f37082i);
            String l10 = this.f33346n.get(i11).toString();
            return C4393v0.m22281e(this.f33344l, this.f33345m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        /* renamed from: b */
        public b m29188b(C7629w0[] c7629w0Arr) {
            return new b(this.f33344l, this.f33345m, this.f33333a, this.f33334b, this.f33335c, this.f33336d, this.f33337e, this.f33338f, this.f33339g, this.f33340h, this.f33341i, c7629w0Arr, this.f33346n, this.f33347o, this.f33348p);
        }

        /* renamed from: c */
        public long m29189c(int i10) {
            long j10;
            if (i10 == this.f33343k - 1) {
                j10 = this.f33348p;
            } else {
                long[] jArr = this.f33347o;
                j10 = jArr[i10 + 1] - jArr[i10];
            }
            return j10;
        }

        /* renamed from: d */
        public int m29190d(long j10) {
            return C4401z0.m22389i(this.f33347o, j10, true, true);
        }

        /* renamed from: e */
        public long m29191e(int i10) {
            return this.f33347o[i10];
        }
    }

    public C5933a(int i10, int i11, long j10, long j11, int i12, boolean z10, a aVar, b[] bVarArr) {
        this.f33322a = i10;
        this.f33323b = i11;
        this.f33328g = j10;
        this.f33329h = j11;
        this.f33324c = i12;
        this.f33325d = z10;
        this.f33326e = aVar;
        this.f33327f = bVarArr;
    }

    public C5933a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, a aVar, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : C4401z0.m22346Q0(j11, 1000000L, j10), j12 == 0 ? -9223372036854775807L : C4401z0.m22346Q0(j12, 1000000L, j10), i12, z10, aVar, bVarArr);
    }

    @Override // p420y7.InterfaceC9848d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5933a mo23296a(List<C9858i0> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C9858i0 c9858i0 = (C9858i0) arrayList.get(i10);
            b bVar2 = this.f33327f[c9858i0.f45228c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m29188b((C7629w0[]) arrayList3.toArray(new C7629w0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f33342j[c9858i0.f45229d]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m29188b((C7629w0[]) arrayList3.toArray(new C7629w0[0])));
        }
        return new C5933a(this.f33322a, this.f33323b, this.f33328g, this.f33329h, this.f33324c, this.f33325d, this.f33326e, (b[]) arrayList2.toArray(new b[0]));
    }
}
