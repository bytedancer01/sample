package p087f0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p069e0.C4564c;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/j.class
 */
/* renamed from: f0.j */
/* loaded from: combined.jar:classes1.jar:f0/j.class */
public class C4747j {

    /* renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, C4564c.b> f27994a = new ConcurrentHashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f0/j$a.class
     */
    /* renamed from: f0.j$a */
    /* loaded from: combined.jar:classes1.jar:f0/j$a.class */
    public class a implements b<C5643f.b> {

        /* renamed from: a */
        public final C4747j f27995a;

        public a(C4747j c4747j) {
            this.f27995a = c4747j;
        }

        @Override // p087f0.C4747j.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo24034b(C5643f.b bVar) {
            return bVar.m27857e();
        }

        @Override // p087f0.C4747j.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo24033a(C5643f.b bVar) {
            return bVar.m27858f();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f0/j$b.class
     */
    /* renamed from: f0.j$b */
    /* loaded from: combined.jar:classes1.jar:f0/j$b.class */
    public interface b<T> {
        /* renamed from: a */
        boolean mo24033a(T t10);

        /* renamed from: b */
        int mo24034b(T t10);
    }

    /* renamed from: e */
    public static <T> T m24031e(T[] tArr, int i10, b<T> bVar) {
        int i11;
        int i12 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i13 = Integer.MAX_VALUE;
        int length = tArr.length;
        int i14 = 0;
        while (i14 < length) {
            T t11 = tArr[i14];
            int abs = (Math.abs(bVar.mo24034b(t11) - i12) * 2) + (bVar.mo24033a(t11) == z10 ? 0 : 1);
            if (t10 != null) {
                i11 = i13;
                if (i13 <= abs) {
                    i14++;
                    i13 = i11;
                }
            }
            t10 = t11;
            i11 = abs;
            i14++;
            i13 = i11;
        }
        return t10;
    }

    /* renamed from: a */
    public Typeface mo24008a(Context context, C4564c.b bVar, Resources resources, int i10) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo24009b(Context context, CancellationSignal cancellationSignal, C5643f.b[] bVarArr, int i10) {
        throw null;
    }

    /* renamed from: c */
    public Typeface m24032c(Context context, InputStream inputStream) {
        File m24041e = C4748k.m24041e(context);
        if (m24041e == null) {
            return null;
        }
        try {
            if (!C4748k.m24040d(m24041e, inputStream)) {
                m24041e.delete();
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(m24041e.getPath());
            m24041e.delete();
            return createFromFile;
        } catch (RuntimeException e10) {
            m24041e.delete();
            return null;
        } catch (Throwable th2) {
            m24041e.delete();
            throw th2;
        }
    }

    /* renamed from: d */
    public Typeface mo24016d(Context context, Resources resources, int i10, String str, int i11) {
        File m24041e = C4748k.m24041e(context);
        if (m24041e == null) {
            return null;
        }
        try {
            if (!C4748k.m24039c(m24041e, resources, i10)) {
                m24041e.delete();
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(m24041e.getPath());
            m24041e.delete();
            return createFromFile;
        } catch (RuntimeException e10) {
            m24041e.delete();
            return null;
        } catch (Throwable th2) {
            m24041e.delete();
            throw th2;
        }
    }

    /* renamed from: f */
    public C5643f.b mo24030f(C5643f.b[] bVarArr, int i10) {
        return (C5643f.b) m24031e(bVarArr, i10, new a(this));
    }
}
