package p428yg;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/m.class
 */
/* renamed from: yg.m */
/* loaded from: combined.jar:classes2.jar:yg/m.class */
public class C10007m implements InterfaceC9994d {

    /* renamed from: a */
    public final LinkedHashMap<String, Bitmap> f45867a;

    /* renamed from: b */
    public final int f45868b;

    /* renamed from: c */
    public int f45869c;

    /* renamed from: d */
    public int f45870d;

    /* renamed from: e */
    public int f45871e;

    /* renamed from: f */
    public int f45872f;

    /* renamed from: g */
    public int f45873g;

    public C10007m(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f45868b = i10;
        this.f45867a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public C10007m(Context context) {
        this(C10001g0.m42038b(context));
    }

    @Override // p428yg.InterfaceC9994d
    /* renamed from: a */
    public final int mo42026a() {
        int i10;
        synchronized (this) {
            i10 = this.f45868b;
        }
        return i10;
    }

    @Override // p428yg.InterfaceC9994d
    /* renamed from: b */
    public void mo42027b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f45870d++;
            this.f45869c += C10001g0.m42047k(bitmap);
            Bitmap put = this.f45867a.put(str, bitmap);
            if (put != null) {
                this.f45869c -= C10001g0.m42047k(put);
            }
        }
        m42093c(this.f45868b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a8, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m42093c(int r5) {
        /*
            r4 = this;
        L0:
            r0 = r4
            monitor-enter(r0)
            r0 = r4
            int r0 = r0.f45869c     // Catch: java.lang.Throwable -> La9
            if (r0 < 0) goto L80
            r0 = r4
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r0.f45867a     // Catch: java.lang.Throwable -> La9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L1a
            r0 = r4
            int r0 = r0.f45869c     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L80
        L1a:
            r0 = r4
            int r0 = r0.f45869c     // Catch: java.lang.Throwable -> La9
            r1 = r5
            if (r0 <= r1) goto L7d
            r0 = r4
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r0.f45867a     // Catch: java.lang.Throwable -> La9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L2f
            goto L7d
        L2f:
            r0 = r4
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r0.f45867a     // Catch: java.lang.Throwable -> La9
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> La9
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La9
            r7 = r0
            r0 = r7
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La9
            r6 = r0
            r0 = r7
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La9
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> La9
            r7 = r0
            r0 = r4
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r0.f45867a     // Catch: java.lang.Throwable -> La9
            r1 = r6
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> La9
            r0 = r4
            r1 = r4
            int r1 = r1.f45869c     // Catch: java.lang.Throwable -> La9
            r2 = r7
            int r2 = p428yg.C10001g0.m42047k(r2)     // Catch: java.lang.Throwable -> La9
            int r1 = r1 - r2
            r0.f45869c = r1     // Catch: java.lang.Throwable -> La9
            r0 = r4
            r1 = r4
            int r1 = r1.f45871e     // Catch: java.lang.Throwable -> La9
            r2 = 1
            int r1 = r1 + r2
            r0.f45871e = r1     // Catch: java.lang.Throwable -> La9
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            goto L0
        L7d:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return
        L80:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La9
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> La9
            r0 = r6
            r1 = r4
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La9
            r0 = r6
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La9
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La9
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> La9
        La9:
            r6 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p428yg.C10007m.m42093c(int):void");
    }

    @Override // p428yg.InterfaceC9994d
    public Bitmap get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap bitmap = this.f45867a.get(str);
            if (bitmap != null) {
                this.f45872f++;
                return bitmap;
            }
            this.f45873g++;
            return null;
        }
    }

    @Override // p428yg.InterfaceC9994d
    public final int size() {
        int i10;
        synchronized (this) {
            i10 = this.f45869c;
        }
        return i10;
    }
}
