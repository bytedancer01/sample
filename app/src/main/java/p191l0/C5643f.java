package p191l0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/f.class
 */
/* renamed from: l0.f */
/* loaded from: combined.jar:classes1.jar:l0/f.class */
public class C5643f {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/f$a.class
     */
    /* renamed from: l0.f$a */
    /* loaded from: combined.jar:classes1.jar:l0/f$a.class */
    public static class a {

        /* renamed from: a */
        public final int f31763a;

        /* renamed from: b */
        public final b[] f31764b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f31763a = i10;
            this.f31764b = bVarArr;
        }

        /* renamed from: a */
        public static a m27850a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* renamed from: b */
        public b[] m27851b() {
            return this.f31764b;
        }

        /* renamed from: c */
        public int m27852c() {
            return this.f31763a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/f$b.class
     */
    /* renamed from: l0.f$b */
    /* loaded from: combined.jar:classes1.jar:l0/f$b.class */
    public static class b {

        /* renamed from: a */
        public final Uri f31765a;

        /* renamed from: b */
        public final int f31766b;

        /* renamed from: c */
        public final int f31767c;

        /* renamed from: d */
        public final boolean f31768d;

        /* renamed from: e */
        public final int f31769e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f31765a = (Uri) C6616h.m30527e(uri);
            this.f31766b = i10;
            this.f31767c = i11;
            this.f31768d = z10;
            this.f31769e = i12;
        }

        /* renamed from: a */
        public static b m27853a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* renamed from: b */
        public int m27854b() {
            return this.f31769e;
        }

        /* renamed from: c */
        public int m27855c() {
            return this.f31766b;
        }

        /* renamed from: d */
        public Uri m27856d() {
            return this.f31765a;
        }

        /* renamed from: e */
        public int m27857e() {
            return this.f31767c;
        }

        /* renamed from: f */
        public boolean m27858f() {
            return this.f31768d;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/f$c.class
     */
    /* renamed from: l0.f$c */
    /* loaded from: combined.jar:classes1.jar:l0/f$c.class */
    public static class c {
        /* renamed from: a */
        public void mo24002a(int i10) {
            throw null;
        }

        /* renamed from: b */
        public void mo24003b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m27849a(Context context, C5641d c5641d, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C5638a c5638a = new C5638a(cVar, handler);
        return z10 ? C5642e.m27843e(context, c5641d, c5638a, i10, i11) : C5642e.m27842d(context, c5641d, i10, null, c5638a);
    }
}
