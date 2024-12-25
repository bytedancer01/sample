package p421y8;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Locale;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/m.class
 */
/* renamed from: y8.m */
/* loaded from: combined.jar:classes2.jar:y8/m.class */
public class C9889m implements Parcelable {
    public static final Parcelable.Creator<C9889m> CREATOR;

    /* renamed from: x */
    public static final C9889m f45461x;

    /* renamed from: y */
    @Deprecated
    public static final C9889m f45462y;

    /* renamed from: b */
    public final int f45463b;

    /* renamed from: c */
    public final int f45464c;

    /* renamed from: d */
    public final int f45465d;

    /* renamed from: e */
    public final int f45466e;

    /* renamed from: f */
    public final int f45467f;

    /* renamed from: g */
    public final int f45468g;

    /* renamed from: h */
    public final int f45469h;

    /* renamed from: i */
    public final int f45470i;

    /* renamed from: j */
    public final int f45471j;

    /* renamed from: k */
    public final int f45472k;

    /* renamed from: l */
    public final boolean f45473l;

    /* renamed from: m */
    public final AbstractC4834t<String> f45474m;

    /* renamed from: n */
    public final AbstractC4834t<String> f45475n;

    /* renamed from: o */
    public final int f45476o;

    /* renamed from: p */
    public final int f45477p;

    /* renamed from: q */
    public final int f45478q;

    /* renamed from: r */
    public final AbstractC4834t<String> f45479r;

    /* renamed from: s */
    public final AbstractC4834t<String> f45480s;

    /* renamed from: t */
    public final int f45481t;

    /* renamed from: u */
    public final boolean f45482u;

    /* renamed from: v */
    public final boolean f45483v;

    /* renamed from: w */
    public final boolean f45484w;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/m$a.class
     */
    /* renamed from: y8.m$a */
    /* loaded from: combined.jar:classes2.jar:y8/m$a.class */
    public class a implements Parcelable.Creator<C9889m> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9889m createFromParcel(Parcel parcel) {
            return new C9889m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9889m[] newArray(int i10) {
            return new C9889m[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/m$b.class
     */
    /* renamed from: y8.m$b */
    /* loaded from: combined.jar:classes2.jar:y8/m$b.class */
    public static class b {

        /* renamed from: a */
        public int f45485a;

        /* renamed from: b */
        public int f45486b;

        /* renamed from: c */
        public int f45487c;

        /* renamed from: d */
        public int f45488d;

        /* renamed from: e */
        public int f45489e;

        /* renamed from: f */
        public int f45490f;

        /* renamed from: g */
        public int f45491g;

        /* renamed from: h */
        public int f45492h;

        /* renamed from: i */
        public int f45493i;

        /* renamed from: j */
        public int f45494j;

        /* renamed from: k */
        public boolean f45495k;

        /* renamed from: l */
        public AbstractC4834t<String> f45496l;

        /* renamed from: m */
        public AbstractC4834t<String> f45497m;

        /* renamed from: n */
        public int f45498n;

        /* renamed from: o */
        public int f45499o;

        /* renamed from: p */
        public int f45500p;

        /* renamed from: q */
        public AbstractC4834t<String> f45501q;

        /* renamed from: r */
        public AbstractC4834t<String> f45502r;

        /* renamed from: s */
        public int f45503s;

        /* renamed from: t */
        public boolean f45504t;

        /* renamed from: u */
        public boolean f45505u;

        /* renamed from: v */
        public boolean f45506v;

        @Deprecated
        public b() {
            this.f45485a = Integer.MAX_VALUE;
            this.f45486b = Integer.MAX_VALUE;
            this.f45487c = Integer.MAX_VALUE;
            this.f45488d = Integer.MAX_VALUE;
            this.f45493i = Integer.MAX_VALUE;
            this.f45494j = Integer.MAX_VALUE;
            this.f45495k = true;
            this.f45496l = AbstractC4834t.m24539E();
            this.f45497m = AbstractC4834t.m24539E();
            this.f45498n = 0;
            this.f45499o = Integer.MAX_VALUE;
            this.f45500p = Integer.MAX_VALUE;
            this.f45501q = AbstractC4834t.m24539E();
            this.f45502r = AbstractC4834t.m24539E();
            this.f45503s = 0;
            this.f45504t = false;
            this.f45505u = false;
            this.f45506v = false;
        }

        public b(Context context) {
            this();
            mo41690y(context);
            mo41678B(context, true);
        }

        public b(C9889m c9889m) {
            this.f45485a = c9889m.f45463b;
            this.f45486b = c9889m.f45464c;
            this.f45487c = c9889m.f45465d;
            this.f45488d = c9889m.f45466e;
            this.f45489e = c9889m.f45467f;
            this.f45490f = c9889m.f45468g;
            this.f45491g = c9889m.f45469h;
            this.f45492h = c9889m.f45470i;
            this.f45493i = c9889m.f45471j;
            this.f45494j = c9889m.f45472k;
            this.f45495k = c9889m.f45473l;
            this.f45496l = c9889m.f45474m;
            this.f45497m = c9889m.f45475n;
            this.f45498n = c9889m.f45476o;
            this.f45499o = c9889m.f45477p;
            this.f45500p = c9889m.f45478q;
            this.f45501q = c9889m.f45479r;
            this.f45502r = c9889m.f45480s;
            this.f45503s = c9889m.f45481t;
            this.f45504t = c9889m.f45482u;
            this.f45505u = c9889m.f45483v;
            this.f45506v = c9889m.f45484w;
        }

        /* renamed from: A */
        public b mo41677A(int i10, int i11, boolean z10) {
            this.f45493i = i10;
            this.f45494j = i11;
            this.f45495k = z10;
            return this;
        }

        /* renamed from: B */
        public b mo41678B(Context context, boolean z10) {
            Point m22343P = C4401z0.m22343P(context);
            return mo41677A(m22343P.x, m22343P.y, z10);
        }

        /* renamed from: w */
        public C9889m mo41689w() {
            return new C9889m(this);
        }

        /* renamed from: x */
        public b m41741x(boolean z10) {
            this.f45506v = z10;
            return this;
        }

        /* renamed from: y */
        public b mo41690y(Context context) {
            if (C4401z0.f26679a >= 19) {
                m41742z(context);
            }
            return this;
        }

        /* renamed from: z */
        public final void m41742z(Context context) {
            CaptioningManager captioningManager;
            if ((C4401z0.f26679a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f45503s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f45502r = AbstractC4834t.m24540F(C4401z0.m22359X(locale));
                }
            }
        }
    }

    static {
        C9889m mo41689w = new b().mo41689w();
        f45461x = mo41689w;
        f45462y = mo41689w;
        CREATOR = new a();
    }

    public C9889m(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f45475n = AbstractC4834t.m24538A(arrayList);
        this.f45476o = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f45480s = AbstractC4834t.m24538A(arrayList2);
        this.f45481t = parcel.readInt();
        this.f45482u = C4401z0.m22338M0(parcel);
        this.f45463b = parcel.readInt();
        this.f45464c = parcel.readInt();
        this.f45465d = parcel.readInt();
        this.f45466e = parcel.readInt();
        this.f45467f = parcel.readInt();
        this.f45468g = parcel.readInt();
        this.f45469h = parcel.readInt();
        this.f45470i = parcel.readInt();
        this.f45471j = parcel.readInt();
        this.f45472k = parcel.readInt();
        this.f45473l = C4401z0.m22338M0(parcel);
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, null);
        this.f45474m = AbstractC4834t.m24538A(arrayList3);
        this.f45477p = parcel.readInt();
        this.f45478q = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, null);
        this.f45479r = AbstractC4834t.m24538A(arrayList4);
        this.f45483v = C4401z0.m22338M0(parcel);
        this.f45484w = C4401z0.m22338M0(parcel);
    }

    public C9889m(b bVar) {
        this.f45463b = bVar.f45485a;
        this.f45464c = bVar.f45486b;
        this.f45465d = bVar.f45487c;
        this.f45466e = bVar.f45488d;
        this.f45467f = bVar.f45489e;
        this.f45468g = bVar.f45490f;
        this.f45469h = bVar.f45491g;
        this.f45470i = bVar.f45492h;
        this.f45471j = bVar.f45493i;
        this.f45472k = bVar.f45494j;
        this.f45473l = bVar.f45495k;
        this.f45474m = bVar.f45496l;
        this.f45475n = bVar.f45497m;
        this.f45476o = bVar.f45498n;
        this.f45477p = bVar.f45499o;
        this.f45478q = bVar.f45500p;
        this.f45479r = bVar.f45501q;
        this.f45480s = bVar.f45502r;
        this.f45481t = bVar.f45503s;
        this.f45482u = bVar.f45504t;
        this.f45483v = bVar.f45505u;
        this.f45484w = bVar.f45506v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9889m c9889m = (C9889m) obj;
        if (this.f45463b != c9889m.f45463b || this.f45464c != c9889m.f45464c || this.f45465d != c9889m.f45465d || this.f45466e != c9889m.f45466e || this.f45467f != c9889m.f45467f || this.f45468g != c9889m.f45468g || this.f45469h != c9889m.f45469h || this.f45470i != c9889m.f45470i || this.f45473l != c9889m.f45473l || this.f45471j != c9889m.f45471j || this.f45472k != c9889m.f45472k || !this.f45474m.equals(c9889m.f45474m) || !this.f45475n.equals(c9889m.f45475n) || this.f45476o != c9889m.f45476o || this.f45477p != c9889m.f45477p || this.f45478q != c9889m.f45478q || !this.f45479r.equals(c9889m.f45479r) || !this.f45480s.equals(c9889m.f45480s) || this.f45481t != c9889m.f45481t || this.f45482u != c9889m.f45482u || this.f45483v != c9889m.f45483v || this.f45484w != c9889m.f45484w) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.f45463b + 31) * 31) + this.f45464c) * 31) + this.f45465d) * 31) + this.f45466e) * 31) + this.f45467f) * 31) + this.f45468g) * 31) + this.f45469h) * 31) + this.f45470i) * 31) + (this.f45473l ? 1 : 0)) * 31) + this.f45471j) * 31) + this.f45472k) * 31) + this.f45474m.hashCode()) * 31) + this.f45475n.hashCode()) * 31) + this.f45476o) * 31) + this.f45477p) * 31) + this.f45478q) * 31) + this.f45479r.hashCode()) * 31) + this.f45480s.hashCode()) * 31) + this.f45481t) * 31) + (this.f45482u ? 1 : 0)) * 31) + (this.f45483v ? 1 : 0)) * 31) + (this.f45484w ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f45475n);
        parcel.writeInt(this.f45476o);
        parcel.writeList(this.f45480s);
        parcel.writeInt(this.f45481t);
        C4401z0.m22388h1(parcel, this.f45482u);
        parcel.writeInt(this.f45463b);
        parcel.writeInt(this.f45464c);
        parcel.writeInt(this.f45465d);
        parcel.writeInt(this.f45466e);
        parcel.writeInt(this.f45467f);
        parcel.writeInt(this.f45468g);
        parcel.writeInt(this.f45469h);
        parcel.writeInt(this.f45470i);
        parcel.writeInt(this.f45471j);
        parcel.writeInt(this.f45472k);
        C4401z0.m22388h1(parcel, this.f45473l);
        parcel.writeList(this.f45474m);
        parcel.writeInt(this.f45477p);
        parcel.writeInt(this.f45478q);
        parcel.writeList(this.f45479r);
        C4401z0.m22388h1(parcel, this.f45483v);
        C4401z0.m22388h1(parcel, this.f45484w);
    }
}
