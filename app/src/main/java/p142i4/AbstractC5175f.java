package p142i4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import p005a4.InterfaceC0065b;
import p142i4.C5181l;
import p363v4.C9235a;
import p363v4.C9237c;
import p363v4.C9240f;
import p363v4.C9242h;
import p396x3.EnumC9644a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/f.class
 */
/* renamed from: i4.f */
/* loaded from: combined.jar:classes1.jar:i4/f.class */
public abstract class AbstractC5175f implements InterfaceC5170a<InputStream> {

    /* renamed from: a */
    public static final Set<C5181l.a> f29553a = EnumSet.of(C5181l.a.JPEG, C5181l.a.PNG_A, C5181l.a.PNG);

    /* renamed from: b */
    public static final Queue<BitmapFactory.Options> f29554b = C9242h.m38965c(0);

    /* renamed from: c */
    public static final AbstractC5175f f29555c = new a();

    /* renamed from: d */
    public static final AbstractC5175f f29556d = new b();

    /* renamed from: e */
    public static final AbstractC5175f f29557e = new c();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/f$a.class
     */
    /* renamed from: i4.f$a */
    /* loaded from: combined.jar:classes1.jar:i4/f$a.class */
    public static final class a extends AbstractC5175f {
        @Override // p142i4.InterfaceC5170a
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // p142i4.AbstractC5175f
        /* renamed from: h */
        public int mo25838h(int i10, int i11, int i12, int i13) {
            return Math.min(i11 / i13, i10 / i12);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/f$b.class
     */
    /* renamed from: i4.f$b */
    /* loaded from: combined.jar:classes1.jar:i4/f$b.class */
    public static final class b extends AbstractC5175f {
        @Override // p142i4.InterfaceC5170a
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // p142i4.AbstractC5175f
        /* renamed from: h */
        public int mo25838h(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return max << i14;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/f$c.class
     */
    /* renamed from: i4.f$c */
    /* loaded from: combined.jar:classes1.jar:i4/f$c.class */
    public static final class c extends AbstractC5175f {
        @Override // p142i4.InterfaceC5170a
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // p142i4.AbstractC5175f
        /* renamed from: h */
        public int mo25838h(int i10, int i11, int i12, int i13) {
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m25827b(C9240f c9240f, C5184o c5184o, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            c9240f.mark(5242880);
        } else {
            c5184o.m25870l();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(c9240f, null, options);
        try {
            if (options.inJustDecodeBounds) {
                c9240f.reset();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 6)) {
                Log.e("Downsampler", "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e10);
            }
        }
        return decodeStream;
    }

    /* renamed from: d */
    public static Bitmap.Config m25828d(InputStream inputStream, EnumC9644a enumC9644a) {
        if (enumC9644a == EnumC9644a.ALWAYS_ARGB_8888 || enumC9644a == EnumC9644a.PREFER_ARGB_8888) {
            return Bitmap.Config.ARGB_8888;
        }
        boolean z10 = false;
        inputStream.mark(1024);
        try {
            try {
                boolean m25857f = new C5181l(inputStream).m25857f();
                try {
                    inputStream.reset();
                    z10 = m25857f;
                } catch (IOException e10) {
                    e = e10;
                    z10 = m25857f;
                    if (Log.isLoggable("Downsampler", 5)) {
                        z10 = m25857f;
                        Log.w("Downsampler", "Cannot reset the input stream", e);
                    }
                }
            } catch (IOException e11) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot determine whether the image has alpha or not from header for format " + enumC9644a, e11);
                }
                try {
                    inputStream.reset();
                } catch (IOException e12) {
                    e = e12;
                    if (Log.isLoggable("Downsampler", 5)) {
                        z10 = false;
                        Log.w("Downsampler", "Cannot reset the input stream", e);
                    }
                }
            }
            return z10 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        } catch (Throwable th2) {
            try {
                inputStream.reset();
            } catch (IOException e13) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot reset the input stream", e13);
                }
            }
            throw th2;
        }
    }

    @TargetApi(11)
    /* renamed from: e */
    public static BitmapFactory.Options m25829e() {
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        synchronized (AbstractC5175f.class) {
            try {
                Queue<BitmapFactory.Options> queue = f29554b;
                synchronized (queue) {
                    poll = queue.poll();
                }
                options = poll;
                if (poll == null) {
                    options = new BitmapFactory.Options();
                    m25831j(options);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return options;
    }

    /* renamed from: i */
    public static void m25830i(BitmapFactory.Options options) {
        m25831j(options);
        Queue<BitmapFactory.Options> queue = f29554b;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    @TargetApi(11)
    /* renamed from: j */
    public static void m25831j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @TargetApi(11)
    /* renamed from: k */
    public static void m25832k(BitmapFactory.Options options, Bitmap bitmap) {
        options.inBitmap = bitmap;
    }

    /* renamed from: l */
    public static boolean m25833l(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public Bitmap m25834a(InputStream inputStream, InterfaceC0065b interfaceC0065b, int i10, int i11, EnumC9644a enumC9644a) {
        int i12;
        C9235a m38942a = C9235a.m38942a();
        byte[] m38943b = m38942a.m38943b();
        byte[] m38943b2 = m38942a.m38943b();
        BitmapFactory.Options m25829e = m25829e();
        C5184o c5184o = new C5184o(inputStream, m38943b2);
        C9237c m38947l = C9237c.m38947l(c5184o);
        C9240f c9240f = new C9240f(m38947l);
        try {
            m38947l.mark(5242880);
            try {
                try {
                    i12 = new C5181l(m38947l).m25855c();
                } finally {
                    try {
                        m38947l.reset();
                    } catch (IOException e10) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", e10);
                        }
                    }
                }
            } catch (IOException e11) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot determine the image orientation from header", e11);
                }
                try {
                    m38947l.reset();
                } catch (IOException e12) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e12);
                    }
                }
                i12 = 0;
            }
            m25829e.inTempStorage = m38943b;
            int[] m25836f = m25836f(c9240f, c5184o, m25829e);
            int i13 = m25836f[0];
            int i14 = m25836f[1];
            Bitmap m25835c = m25835c(c9240f, c5184o, m25829e, interfaceC0065b, i13, i14, m25837g(C5187r.m25874c(i12), i13, i14, i10, i11), enumC9644a);
            IOException m38948f = m38947l.m38948f();
            if (m38948f != null) {
                throw new RuntimeException(m38948f);
            }
            Bitmap bitmap = null;
            if (m25835c != null) {
                Bitmap m25877f = C5187r.m25877f(m25835c, interfaceC0065b, i12);
                bitmap = m25877f;
                if (!m25835c.equals(m25877f)) {
                    bitmap = m25877f;
                    if (!interfaceC0065b.mo231a(m25835c)) {
                        m25835c.recycle();
                        bitmap = m25877f;
                    }
                }
            }
            m38942a.m38944c(m38943b);
            m38942a.m38944c(m38943b2);
            m38947l.m38949o();
            m25830i(m25829e);
            return bitmap;
        } catch (Throwable th2) {
            m38942a.m38944c(m38943b);
            m38942a.m38944c(m38943b2);
            m38947l.m38949o();
            m25830i(m25829e);
            throw th2;
        }
    }

    /* renamed from: c */
    public final Bitmap m25835c(C9240f c9240f, C5184o c5184o, BitmapFactory.Options options, InterfaceC0065b interfaceC0065b, int i10, int i11, int i12, EnumC9644a enumC9644a) {
        Bitmap.Config m25828d = m25828d(c9240f, enumC9644a);
        options.inSampleSize = i12;
        options.inPreferredConfig = m25828d;
        if (m25833l(c9240f)) {
            double d10 = i12;
            m25832k(options, interfaceC0065b.mo235e((int) Math.ceil(i10 / d10), (int) Math.ceil(i11 / d10), m25828d));
        }
        return m25827b(c9240f, c5184o, options);
    }

    /* renamed from: f */
    public int[] m25836f(C9240f c9240f, C5184o c5184o, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        m25827b(c9240f, c5184o, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: g */
    public final int m25837g(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i14;
        if (i14 == Integer.MIN_VALUE) {
            i15 = i12;
        }
        int i16 = i13;
        if (i13 == Integer.MIN_VALUE) {
            i16 = i11;
        }
        int mo25838h = (i10 == 90 || i10 == 270) ? mo25838h(i12, i11, i16, i15) : mo25838h(i11, i12, i16, i15);
        return Math.max(1, mo25838h == 0 ? 0 : Integer.highestOneBit(mo25838h));
    }

    /* renamed from: h */
    public abstract int mo25838h(int i10, int i11, int i12, int i13);
}
