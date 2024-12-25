package p338te;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8700o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/b.class
 */
/* renamed from: te.b */
/* loaded from: combined.jar:classes2.jar:te/b.class */
public class C8704b {

    /* renamed from: a */
    public C8699n f40487a;

    /* renamed from: b */
    public C8722t f40488b;

    /* renamed from: c */
    public final int f40489c = 2;

    public C8704b(C8699n c8699n, C8722t c8722t) {
        this.f40487a = c8699n;
        this.f40488b = c8722t;
    }

    /* renamed from: e */
    public static List<C8701p> m37225e(List<C8701p> list, C8722t c8722t) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C8701p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c8722t.m37273f(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public EnumC8686a m37226a() {
        return this.f40487a.m37212b();
    }

    /* renamed from: b */
    public Bitmap m37227b() {
        return this.f40488b.m37269b(null, 2);
    }

    /* renamed from: c */
    public byte[] m37228c() {
        return this.f40487a.m37213c();
    }

    /* renamed from: d */
    public Map<EnumC8700o, Object> m37229d() {
        return this.f40487a.m37214d();
    }

    public String toString() {
        return this.f40487a.m37216f();
    }
}
