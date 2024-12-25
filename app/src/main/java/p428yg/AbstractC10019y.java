package p428yg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.InputStream;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/y.class
 */
/* renamed from: yg.y */
/* loaded from: combined.jar:classes2.jar:yg/y.class */
public abstract class AbstractC10019y {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/y$a.class
     */
    /* renamed from: yg.y$a */
    /* loaded from: combined.jar:classes2.jar:yg/y$a.class */
    public static final class a {

        /* renamed from: a */
        public final C10014t.e f45971a;

        /* renamed from: b */
        public final Bitmap f45972b;

        /* renamed from: c */
        public final InputStream f45973c;

        /* renamed from: d */
        public final int f45974d;

        public a(Bitmap bitmap, InputStream inputStream, C10014t.e eVar, int i10) {
            if (!((inputStream == null ? false : true) ^ (bitmap != null))) {
                throw new AssertionError();
            }
            this.f45972b = bitmap;
            this.f45973c = inputStream;
            this.f45971a = (C10014t.e) C10001g0.m42040d(eVar, "loadedFrom == null");
            this.f45974d = i10;
        }

        public a(Bitmap bitmap, C10014t.e eVar) {
            this((Bitmap) C10001g0.m42040d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public a(InputStream inputStream, C10014t.e eVar) {
            this(null, (InputStream) C10001g0.m42040d(inputStream, "stream == null"), eVar, 0);
        }

        /* renamed from: a */
        public Bitmap m42161a() {
            return this.f45972b;
        }

        /* renamed from: b */
        public int m42162b() {
            return this.f45974d;
        }

        /* renamed from: c */
        public C10014t.e m42163c() {
            return this.f45971a;
        }

        /* renamed from: d */
        public InputStream m42164d() {
            return this.f45973c;
        }
    }

    /* renamed from: a */
    public static void m42157a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, C10017w c10017w) {
        int max;
        double d10;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                d10 = i12 / i10;
            } else if (i10 == 0) {
                d10 = i13 / i11;
            } else {
                int floor = (int) Math.floor(i13 / i11);
                int floor2 = (int) Math.floor(i12 / i10);
                max = c10017w.f45935k ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            max = (int) Math.floor(d10);
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    public static void m42158b(int i10, int i11, BitmapFactory.Options options, C10017w c10017w) {
        m42157a(i10, i11, options.outWidth, options.outHeight, options, c10017w);
    }

    /* renamed from: d */
    public static BitmapFactory.Options m42159d(C10017w c10017w) {
        boolean m42134c = c10017w.m42134c();
        boolean z10 = c10017w.f45941q != null;
        BitmapFactory.Options options = null;
        if (m42134c || z10) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = m42134c;
            options = options2;
            if (z10) {
                options2.inPreferredConfig = c10017w.f45941q;
                options = options2;
            }
        }
        return options;
    }

    /* renamed from: g */
    public static boolean m42160g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo41998c(C10017w c10017w);

    /* renamed from: e */
    public int mo42100e() {
        return 0;
    }

    /* renamed from: f */
    public abstract a mo41999f(C10017w c10017w, int i10);

    /* renamed from: h */
    public boolean mo42101h(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: i */
    public boolean mo42102i() {
        return false;
    }
}
