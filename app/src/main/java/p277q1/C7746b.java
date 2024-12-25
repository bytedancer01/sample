package p277q1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;
import p087f0.C4738a;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q1/b.class
 */
/* renamed from: q1.b */
/* loaded from: combined.jar:classes1.jar:q1/b.class */
public final class C7746b {

    /* renamed from: f */
    public static final c f37576f = new a();

    /* renamed from: a */
    public final List<d> f37577a;

    /* renamed from: b */
    public final List<C7747c> f37578b;

    /* renamed from: d */
    public final SparseBooleanArray f37580d = new SparseBooleanArray();

    /* renamed from: c */
    public final Map<C7747c, d> f37579c = new C7928a();

    /* renamed from: e */
    public final d f37581e = m33862a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q1/b$a.class
     */
    /* renamed from: q1.b$a */
    /* loaded from: combined.jar:classes1.jar:q1/b$a.class */
    public static final class a implements c {
        @Override // p277q1.C7746b.c
        /* renamed from: a */
        public boolean mo33869a(int i10, float[] fArr) {
            return (m33872d(fArr) || m33870b(fArr) || m33871c(fArr)) ? false : true;
        }

        /* renamed from: b */
        public final boolean m33870b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        public final boolean m33871c(float[] fArr) {
            float f10 = fArr[0];
            boolean z10 = false;
            if (f10 >= 10.0f) {
                z10 = false;
                if (f10 <= 37.0f) {
                    z10 = false;
                    if (fArr[1] <= 0.82f) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* renamed from: d */
        public final boolean m33872d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q1/b$b.class
     */
    /* renamed from: q1.b$b */
    /* loaded from: combined.jar:classes1.jar:q1/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final List<d> f37582a;

        /* renamed from: b */
        public final Bitmap f37583b;

        /* renamed from: c */
        public final List<C7747c> f37584c;

        /* renamed from: d */
        public int f37585d;

        /* renamed from: e */
        public int f37586e;

        /* renamed from: f */
        public int f37587f;

        /* renamed from: g */
        public final List<c> f37588g;

        /* renamed from: h */
        public Rect f37589h;

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f37584c = arrayList;
            this.f37585d = 16;
            this.f37586e = 12544;
            this.f37587f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f37588g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C7746b.f37576f);
            this.f37583b = bitmap;
            this.f37582a = null;
            arrayList.add(C7747c.f37599e);
            arrayList.add(C7747c.f37600f);
            arrayList.add(C7747c.f37601g);
            arrayList.add(C7747c.f37602h);
            arrayList.add(C7747c.f37603i);
            arrayList.add(C7747c.f37604j);
        }

        /* renamed from: a */
        public C7746b m33873a() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.f37583b;
            if (bitmap != null) {
                Bitmap m33876d = m33876d(bitmap);
                Rect rect = this.f37589h;
                if (m33876d != this.f37583b && rect != null) {
                    double width = m33876d.getWidth() / this.f37583b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), m33876d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), m33876d.getHeight());
                }
                int[] m33874b = m33874b(m33876d);
                int i10 = this.f37585d;
                if (this.f37588g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.f37588g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                C7745a c7745a = new C7745a(m33874b, i10, cVarArr);
                if (m33876d != this.f37583b) {
                    m33876d.recycle();
                }
                list = c7745a.m33847d();
            } else {
                list = this.f37582a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C7746b c7746b = new C7746b(list, this.f37584c);
            c7746b.m33863b();
            return c7746b;
        }

        /* renamed from: b */
        public final int[] m33874b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f37589h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f37589h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i10 = 0; i10 < height2; i10++) {
                Rect rect2 = this.f37589h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * width2, width2);
            }
            return iArr2;
        }

        /* renamed from: c */
        public b m33875c(int i10) {
            this.f37585d = i10;
            return this;
        }

        /* renamed from: d */
        public final Bitmap m33876d(Bitmap bitmap) {
            double d10;
            if (this.f37586e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i10 = this.f37586e;
                d10 = -1.0d;
                if (width > i10) {
                    d10 = Math.sqrt(i10 / width);
                }
            } else {
                d10 = -1.0d;
                if (this.f37587f > 0) {
                    int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                    int i11 = this.f37587f;
                    d10 = -1.0d;
                    if (max > i11) {
                        d10 = i11 / max;
                    }
                }
            }
            return d10 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d10), (int) Math.ceil(bitmap.getHeight() * d10), false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q1/b$c.class
     */
    /* renamed from: q1.b$c */
    /* loaded from: combined.jar:classes1.jar:q1/b$c.class */
    public interface c {
        /* renamed from: a */
        boolean mo33869a(int i10, float[] fArr);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q1/b$d.class
     */
    /* renamed from: q1.b$d */
    /* loaded from: combined.jar:classes1.jar:q1/b$d.class */
    public static final class d {

        /* renamed from: a */
        public final int f37590a;

        /* renamed from: b */
        public final int f37591b;

        /* renamed from: c */
        public final int f37592c;

        /* renamed from: d */
        public final int f37593d;

        /* renamed from: e */
        public final int f37594e;

        /* renamed from: f */
        public boolean f37595f;

        /* renamed from: g */
        public int f37596g;

        /* renamed from: h */
        public int f37597h;

        /* renamed from: i */
        public float[] f37598i;

        public d(int i10, int i11) {
            this.f37590a = Color.red(i10);
            this.f37591b = Color.green(i10);
            this.f37592c = Color.blue(i10);
            this.f37593d = i10;
            this.f37594e = i11;
        }

        /* renamed from: a */
        public final void m33877a() {
            int m23974m;
            if (this.f37595f) {
                return;
            }
            int m23966e = C4738a.m23966e(-1, this.f37593d, 4.5f);
            int m23966e2 = C4738a.m23966e(-1, this.f37593d, 3.0f);
            if (m23966e == -1 || m23966e2 == -1) {
                int m23966e3 = C4738a.m23966e(DefaultRenderer.BACKGROUND_COLOR, this.f37593d, 4.5f);
                int m23966e4 = C4738a.m23966e(DefaultRenderer.BACKGROUND_COLOR, this.f37593d, 3.0f);
                if (m23966e3 == -1 || m23966e4 == -1) {
                    this.f37597h = m23966e != -1 ? C4738a.m23974m(-1, m23966e) : C4738a.m23974m(DefaultRenderer.BACKGROUND_COLOR, m23966e3);
                    this.f37596g = m23966e2 != -1 ? C4738a.m23974m(-1, m23966e2) : C4738a.m23974m(DefaultRenderer.BACKGROUND_COLOR, m23966e4);
                    this.f37595f = true;
                    return;
                }
                this.f37597h = C4738a.m23974m(DefaultRenderer.BACKGROUND_COLOR, m23966e3);
                m23974m = C4738a.m23974m(DefaultRenderer.BACKGROUND_COLOR, m23966e4);
            } else {
                this.f37597h = C4738a.m23974m(-1, m23966e);
                m23974m = C4738a.m23974m(-1, m23966e2);
            }
            this.f37596g = m23974m;
            this.f37595f = true;
        }

        /* renamed from: b */
        public int m33878b() {
            m33877a();
            return this.f37597h;
        }

        /* renamed from: c */
        public float[] m33879c() {
            if (this.f37598i == null) {
                this.f37598i = new float[3];
            }
            C4738a.m23962a(this.f37590a, this.f37591b, this.f37592c, this.f37598i);
            return this.f37598i;
        }

        /* renamed from: d */
        public int m33880d() {
            return this.f37594e;
        }

        /* renamed from: e */
        public int m33881e() {
            return this.f37593d;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f37594e != dVar.f37594e || this.f37593d != dVar.f37593d) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: f */
        public int m33882f() {
            m33877a();
            return this.f37596g;
        }

        public int hashCode() {
            return (this.f37593d * 31) + this.f37594e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m33881e()) + "] [HSL: " + Arrays.toString(m33879c()) + "] [Population: " + this.f37594e + "] [Title Text: #" + Integer.toHexString(m33882f()) + "] [Body Text: #" + Integer.toHexString(m33878b()) + ']';
        }
    }

    public C7746b(List<d> list, List<C7747c> list2) {
        this.f37577a = list;
        this.f37578b = list2;
    }

    /* renamed from: a */
    public final d m33862a() {
        int size = this.f37577a.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        int i11 = 0;
        while (i11 < size) {
            d dVar2 = this.f37577a.get(i11);
            int i12 = i10;
            if (dVar2.m33880d() > i10) {
                i12 = dVar2.m33880d();
                dVar = dVar2;
            }
            i11++;
            i10 = i12;
        }
        return dVar;
    }

    /* renamed from: b */
    public void m33863b() {
        int size = this.f37578b.size();
        for (int i10 = 0; i10 < size; i10++) {
            C7747c c7747c = this.f37578b.get(i10);
            c7747c.m33899k();
            this.f37579c.put(c7747c, m33865d(c7747c));
        }
        this.f37580d.clear();
    }

    /* renamed from: c */
    public final float m33864c(d dVar, C7747c c7747c) {
        float[] m33879c = dVar.m33879c();
        d dVar2 = this.f37581e;
        int m33880d = dVar2 != null ? dVar2.m33880d() : 1;
        float f10 = 0.0f;
        float m33895g = c7747c.m33895g() > 0.0f ? c7747c.m33895g() * (1.0f - Math.abs(m33879c[1] - c7747c.m33897i())) : 0.0f;
        float m33889a = c7747c.m33889a() > 0.0f ? c7747c.m33889a() * (1.0f - Math.abs(m33879c[2] - c7747c.m33896h())) : 0.0f;
        if (c7747c.m33894f() > 0.0f) {
            f10 = c7747c.m33894f() * (dVar.m33880d() / m33880d);
        }
        return m33895g + m33889a + f10;
    }

    /* renamed from: d */
    public final d m33865d(C7747c c7747c) {
        d m33866e = m33866e(c7747c);
        if (m33866e != null && c7747c.m33898j()) {
            this.f37580d.append(m33866e.m33881e(), true);
        }
        return m33866e;
    }

    /* renamed from: e */
    public final d m33866e(C7747c c7747c) {
        int size = this.f37577a.size();
        float f10 = 0.0f;
        d dVar = null;
        int i10 = 0;
        while (i10 < size) {
            d dVar2 = this.f37577a.get(i10);
            float f11 = f10;
            d dVar3 = dVar;
            if (m33868g(dVar2, c7747c)) {
                float m33864c = m33864c(dVar2, c7747c);
                if (dVar != null) {
                    f11 = f10;
                    dVar3 = dVar;
                    if (m33864c <= f10) {
                    }
                }
                dVar3 = dVar2;
                f11 = m33864c;
            }
            i10++;
            f10 = f11;
            dVar = dVar3;
        }
        return dVar;
    }

    /* renamed from: f */
    public List<d> m33867f() {
        return Collections.unmodifiableList(this.f37577a);
    }

    /* renamed from: g */
    public final boolean m33868g(d dVar, C7747c c7747c) {
        float[] m33879c = dVar.m33879c();
        boolean z10 = true;
        if (m33879c[1] < c7747c.m33893e() || m33879c[1] > c7747c.m33891c() || m33879c[2] < c7747c.m33892d() || m33879c[2] > c7747c.m33890b() || this.f37580d.get(dVar.m33881e())) {
            z10 = false;
        }
        return z10;
    }
}
