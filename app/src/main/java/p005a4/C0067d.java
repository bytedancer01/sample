package p005a4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a4/d.class
 */
/* renamed from: a4.d */
/* loaded from: combined.jar:classes1.jar:a4/d.class */
public class C0067d implements InterfaceC0065b {

    /* renamed from: k */
    public static final Bitmap.Config f201k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC0068e f202a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f203b;

    /* renamed from: c */
    public final int f204c;

    /* renamed from: d */
    public final b f205d;

    /* renamed from: e */
    public int f206e;

    /* renamed from: f */
    public int f207f;

    /* renamed from: g */
    public int f208g;

    /* renamed from: h */
    public int f209h;

    /* renamed from: i */
    public int f210i;

    /* renamed from: j */
    public int f211j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a4/d$b.class
     */
    /* renamed from: a4.d$b */
    /* loaded from: combined.jar:classes1.jar:a4/d$b.class */
    public interface b {
        /* renamed from: a */
        void mo253a(Bitmap bitmap);

        /* renamed from: b */
        void mo254b(Bitmap bitmap);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a4/d$c.class
     */
    /* renamed from: a4.d$c */
    /* loaded from: combined.jar:classes1.jar:a4/d$c.class */
    public static class c implements b {
        public c() {
        }

        @Override // p005a4.C0067d.b
        /* renamed from: a */
        public void mo253a(Bitmap bitmap) {
        }

        @Override // p005a4.C0067d.b
        /* renamed from: b */
        public void mo254b(Bitmap bitmap) {
        }
    }

    public C0067d(int i10) {
        this(i10, m248j(), m247i());
    }

    public C0067d(int i10, InterfaceC0068e interfaceC0068e, Set<Bitmap.Config> set) {
        this.f204c = i10;
        this.f206e = i10;
        this.f202a = interfaceC0068e;
        this.f203b = set;
        this.f205d = new c();
    }

    /* renamed from: i */
    public static Set<Bitmap.Config> m247i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: j */
    public static InterfaceC0068e m248j() {
        return new C0070g();
    }

    @Override // p005a4.InterfaceC0065b
    /* renamed from: a */
    public boolean mo231a(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isMutable() && this.f202a.mo259e(bitmap) <= this.f206e && this.f203b.contains(bitmap.getConfig())) {
                int mo259e = this.f202a.mo259e(bitmap);
                this.f202a.mo255a(bitmap);
                this.f205d.mo254b(bitmap);
                this.f210i++;
                this.f207f += mo259e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f202a.mo256b(bitmap));
                }
                m249f();
                m251h();
                return true;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f202a.mo256b(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f203b.contains(bitmap.getConfig()));
            }
            return false;
        }
    }

    @Override // p005a4.InterfaceC0065b
    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public void mo232b(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 60) {
            mo233c();
        } else if (i10 >= 40) {
            m252k(this.f206e / 2);
        }
    }

    @Override // p005a4.InterfaceC0065b
    /* renamed from: c */
    public void mo233c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m252k(0);
    }

    @Override // p005a4.InterfaceC0065b
    /* renamed from: d */
    public Bitmap mo234d(int i10, int i11, Bitmap.Config config) {
        Bitmap mo235e;
        synchronized (this) {
            mo235e = mo235e(i10, i11, config);
            if (mo235e != null) {
                mo235e.eraseColor(0);
            }
        }
        return mo235e;
    }

    @Override // p005a4.InterfaceC0065b
    @TargetApi(12)
    /* renamed from: e */
    public Bitmap mo235e(int i10, int i11, Bitmap.Config config) {
        Bitmap mo258d;
        synchronized (this) {
            mo258d = this.f202a.mo258d(i10, i11, config != null ? config : f201k);
            if (mo258d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f202a.mo257c(i10, i11, config));
                }
                this.f209h++;
            } else {
                this.f208g++;
                this.f207f -= this.f202a.mo259e(mo258d);
                this.f205d.mo253a(mo258d);
                mo258d.setHasAlpha(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f202a.mo257c(i10, i11, config));
            }
            m249f();
        }
        return mo258d;
    }

    /* renamed from: f */
    public final void m249f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m250g();
        }
    }

    /* renamed from: g */
    public final void m250g() {
        Log.v("LruBitmapPool", "Hits=" + this.f208g + ", misses=" + this.f209h + ", puts=" + this.f210i + ", evictions=" + this.f211j + ", currentSize=" + this.f207f + ", maxSize=" + this.f206e + "\nStrategy=" + this.f202a);
    }

    /* renamed from: h */
    public final void m251h() {
        m252k(this.f206e);
    }

    /* renamed from: k */
    public final void m252k(int i10) {
        synchronized (this) {
            while (this.f207f > i10) {
                Bitmap removeLast = this.f202a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m250g();
                    }
                    this.f207f = 0;
                    return;
                }
                this.f205d.mo253a(removeLast);
                this.f207f -= this.f202a.mo259e(removeLast);
                removeLast.recycle();
                this.f211j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f202a.mo256b(removeLast));
                }
                m249f();
            }
        }
    }
}
