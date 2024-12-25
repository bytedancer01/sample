package p216m9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ma.AbstractC6507y1;
import p200l9.C5770h;
import p230n9.C6698a;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/c.class
 */
/* renamed from: m9.c */
/* loaded from: combined.jar:classes2.jar:m9/c.class */
public class C5941c extends AbstractC10125a {
    public static final Parcelable.Creator<C5941c> CREATOR = new C5937a1();

    /* renamed from: d */
    public String f33405d;

    /* renamed from: e */
    public final List f33406e;

    /* renamed from: f */
    public final boolean f33407f;

    /* renamed from: g */
    public C5770h f33408g;

    /* renamed from: h */
    public final boolean f33409h;

    /* renamed from: i */
    public final C6698a f33410i;

    /* renamed from: j */
    public final boolean f33411j;

    /* renamed from: k */
    public final double f33412k;

    /* renamed from: l */
    public final boolean f33413l;

    /* renamed from: m */
    public final boolean f33414m;

    /* renamed from: n */
    public final boolean f33415n;

    /* renamed from: o */
    public final List f33416o;

    /* renamed from: p */
    public final boolean f33417p;

    /* renamed from: q */
    public final int f33418q;

    /* renamed from: r */
    public final boolean f33419r;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m9/c$a.class
     */
    /* renamed from: m9.c$a */
    /* loaded from: combined.jar:classes2.jar:m9/c$a.class */
    public static final class a {

        /* renamed from: a */
        public String f33420a;

        /* renamed from: c */
        public boolean f33422c;

        /* renamed from: b */
        public List f33421b = new ArrayList();

        /* renamed from: d */
        public C5770h f33423d = new C5770h();

        /* renamed from: e */
        public boolean f33424e = true;

        /* renamed from: f */
        public AbstractC6507y1 f33425f = null;

        /* renamed from: g */
        public boolean f33426g = true;

        /* renamed from: h */
        public double f33427h = 0.05000000074505806d;

        /* renamed from: i */
        public boolean f33428i = false;

        /* renamed from: j */
        public final List f33429j = new ArrayList();

        /* renamed from: a */
        public C5941c m29265a() {
            AbstractC6507y1 abstractC6507y1 = this.f33425f;
            return new C5941c(this.f33420a, this.f33421b, this.f33422c, this.f33423d, this.f33424e, (C6698a) (abstractC6507y1 != null ? abstractC6507y1.mo29540a() : new C6698a.a().m30861a()), this.f33426g, this.f33427h, false, false, this.f33428i, this.f33429j, true, 0, false);
        }

        /* renamed from: b */
        public a m29266b(C6698a c6698a) {
            this.f33425f = AbstractC6507y1.m30156b(c6698a);
            return this;
        }

        /* renamed from: c */
        public a m29267c(String str) {
            this.f33420a = str;
            return this;
        }
    }

    public C5941c(String str, List list, boolean z10, C5770h c5770h, boolean z11, C6698a c6698a, boolean z12, double d10, boolean z13, boolean z14, boolean z15, List list2, boolean z16, int i10, boolean z17) {
        this.f33405d = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.f33406e = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.f33407f = z10;
        this.f33408g = c5770h == null ? new C5770h() : c5770h;
        this.f33409h = z11;
        this.f33410i = c6698a;
        this.f33411j = z12;
        this.f33412k = d10;
        this.f33413l = z13;
        this.f33414m = z14;
        this.f33415n = z15;
        this.f33416o = list2;
        this.f33417p = z16;
        this.f33418q = i10;
        this.f33419r = z17;
    }

    /* renamed from: P */
    public C6698a m29251P() {
        return this.f33410i;
    }

    /* renamed from: Q */
    public boolean m29252Q() {
        return this.f33411j;
    }

    /* renamed from: R */
    public C5770h m29253R() {
        return this.f33408g;
    }

    /* renamed from: S */
    public String m29254S() {
        return this.f33405d;
    }

    /* renamed from: T */
    public boolean m29255T() {
        return this.f33409h;
    }

    /* renamed from: U */
    public boolean m29256U() {
        return this.f33407f;
    }

    /* renamed from: V */
    public List<String> m29257V() {
        return Collections.unmodifiableList(this.f33406e);
    }

    @Deprecated
    /* renamed from: W */
    public double m29258W() {
        return this.f33412k;
    }

    /* renamed from: X */
    public final List m29259X() {
        return Collections.unmodifiableList(this.f33416o);
    }

    /* renamed from: Y */
    public final boolean m29260Y() {
        return this.f33414m;
    }

    /* renamed from: Z */
    public final boolean m29261Z() {
        return this.f33418q == 1;
    }

    /* renamed from: a0 */
    public final boolean m29262a0() {
        return this.f33415n;
    }

    /* renamed from: b0 */
    public final boolean m29263b0() {
        return this.f33419r;
    }

    /* renamed from: c0 */
    public final boolean m29264c0() {
        return this.f33417p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m29254S(), false);
        C10127c.m42538u(parcel, 3, m29257V(), false);
        C10127c.m42520c(parcel, 4, m29256U());
        C10127c.m42535r(parcel, 5, m29253R(), i10, false);
        C10127c.m42520c(parcel, 6, m29255T());
        C10127c.m42535r(parcel, 7, m29251P(), i10, false);
        C10127c.m42520c(parcel, 8, m29252Q());
        C10127c.m42524g(parcel, 9, m29258W());
        C10127c.m42520c(parcel, 10, this.f33413l);
        C10127c.m42520c(parcel, 11, this.f33414m);
        C10127c.m42520c(parcel, 12, this.f33415n);
        C10127c.m42538u(parcel, 13, Collections.unmodifiableList(this.f33416o), false);
        C10127c.m42520c(parcel, 14, this.f33417p);
        C10127c.m42529l(parcel, 15, this.f33418q);
        C10127c.m42520c(parcel, 16, this.f33419r);
        C10127c.m42519b(parcel, m42518a);
    }
}
