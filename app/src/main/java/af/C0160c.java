package af;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:af/c.class
 */
/* renamed from: af.c */
/* loaded from: combined.jar:classes2.jar:af/c.class */
public class C0160c<T> {

    /* renamed from: a */
    public String f1272a;

    /* renamed from: b */
    public String f1273b;

    /* renamed from: c */
    public String f1274c;

    /* renamed from: d */
    public List<T> f1275d = new ArrayList();

    /* renamed from: a */
    public void m713a(T t10) {
        this.f1275d.add(t10);
    }

    /* renamed from: b */
    public List<T> m714b() {
        return this.f1275d;
    }

    /* renamed from: c */
    public String m715c() {
        return this.f1273b;
    }

    /* renamed from: d */
    public String m716d() {
        return this.f1274c;
    }

    /* renamed from: e */
    public void m717e(String str) {
        this.f1272a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0160c) {
            return this.f1274c.equals(((C0160c) obj).f1274c);
        }
        return false;
    }

    /* renamed from: f */
    public void m718f(String str) {
        this.f1273b = str;
    }

    /* renamed from: g */
    public void m719g(String str) {
        this.f1274c = str;
    }

    public int hashCode() {
        return this.f1274c.hashCode();
    }
}
